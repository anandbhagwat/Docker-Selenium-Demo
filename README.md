# Docker-Selenium-Demo



1. First, You must be having docker understanding as well I also have already published a begineer guide for Windows use here: https://www.linkedin.com/pulse/beginner-guide-start-docker-running-vnc-enabled-ubuntu-anand-bhagwat/

2. So you'll need to pull down the latest images*:
docker pull selenium/hub:latest
docker pull selenium/node-chrome-debug:latest


3 .Start the selenium grid:
docker run -d -p 4444:4444 --name selenium-hub selenium/hub:latest
Then add selenium nodes. I like to use the chrome-debug and firefox-debug versions to VNC to watch the tests.

docker run -d -p 5900:5900 --link selenium-hub:hub selenium/node-chrome-debug:latest
After linking your selenium grid, this should be enough to run your Protractor test using the seleniumAddress: 'http://localhost:4444/wd/hub'.

4. For debugging, find the VNC port for the container with:
docker port <container-name or container-id> 5900
and access it via VNC Viewer.



5. I used chrome-debug node so that I can view the container using VNC.
by MY_DOCKER_HOST_IP:PORT_which is 5530 here, you can see the image of the VM like ubuntu logo

4. Last I created  one script using Webdriver :
public static void main(String[] args) throws MalformedURLException {
// TODO Auto-generated method stub
DesiredCapabilities dc = new DesiredCapabilities();
//System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
dc.setBrowserName("firefox");
dc.setPlatform(Platform.LINUX);
WebDriver driver = new RemoteWebDriver(new URL("http://10.192.71.19:5555/wd/hub"), dc);
driver.get("https://www.google.co.in");
driver.findElement(By.id("lst-ib")).sendKeys("Selenium Software");
System.out.println("COmpleted");
driver.close();


-Anand Bhagwat
https://www.linkedin.com/in/anand-bhagwat/


