package pages;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

@Log4j2
public class CalendarPage {

    public static final String CREATE_BUTTON = "//td[@data-day]";
    public static final String QUICK_ADD = "//input[@id='WorkoutTime']";
    public static final String TIME_OF_DAY = "//ul[@class='ui-timepicker-list picktime']";
    public static final String ACTIVITY_TYPE = "//select[@id='ActivityType']";
    public static final String FARTLEK_ACTIVITY_TYPE = "//select[@id='ActivityType']//option[@value='00000001-0001-0001-0001-000000000001|00000001-0001-0001-0001-000000000001']";
    public static final String WORKOUT_NAME = "//input[@id='Name']";
    public static final String WORKOUT_DESCRIPTION = "//textarea[@id='Desc']";
    public static final String SHOW_PLANNED_DISTANCE = "//input[@id='PlannedWorkout']";
    public static final String SHOW_DIST_TYPE = "//input[@id='PDistance']";
    public static final String SHOW_SELECT_DISTANCE = "//select[@id='PDistType']";
    public static final String SHOW_KM_DISTANCE = "//select[@id='PDistType']//option[@value='km']";
    public static final String SHOW_ADD_DATA_DISTANCE = "//input[@id='PDuration']";
    public static final String DISTANCE = "//input[@id='Distance']";
    public static final String SELECT_DISTANCE = "//select[@id='DistType']";
    public static final String KM = "//select[@id='DistType']//option[@value='km']";
    public static final String DURATION = "//input[@id='Duration']";
    public static final String SELECT_PACE = "//select[@id='PaceType']";
    public static final String MIN_KM_PACE = "//select[@id='PaceType']//option[@value='km']";
    public static final String HOVE_I_FELT = "//select[@id='HowFeel']";
    public static final String GOOD = "//select[@id='HowFeel']//option[@value='2']";
    public static final String PERCEIVED_EFFORT = "//select[@id='PerEffort']";
    public static final String MODERATE_2 = "//select[@id='PerEffort']//option[@value='5']";
    public static final String POST_WORKOUT_NOTES_RESULTS = "//textarea[@id='PostDesc']";
    public static final String MARK_AS_RACE = "//input[@id='IsRace']";
    public static final String OVERALL_PLACE = "//input[@id='OverallPlace']";
    public static final String AGE_GROUP_PLACE = "//input[@id='AgeGroupPlace']";
    public static final String SAVE_TO_LIBRARY = "//input[@id='SaveLibrary']";
    public static final String ADD_WORKOUT_BUTTON = "//input[@id='saveButton']";
    public static final String CALENDAR = "//div[@class='fc-event-activity-title']";
    public static final String VIEW = "//a[@class='full-view']";
    public static final String UPDATE_WORKOUT_BUTTON_VIEW = "//span[@class='dropdown-toggle']";
    public static final String DISTANCE_VIEW = "//input[@id='Distance']";
    public static final String SELECT_KM_BASIK_VIEW = "//select[@id='DistType']";
    public static final String KM_BASIK_VIEW = "//select[@id='DistType']//option[@value='km']";
    public static final String DURATION_VIEW = "//input[@id='Duration']";
    public static final String NORMAL_VIEW = "//input[@id='hf_normal']";
    public static final String SELECT_VIEW = "//select[@id='PerEffort']";
    public static final String HARD_1_VIEW = "//select[@id='PerEffort']//option[@value='7']";
    public static final String MIN_HR_VIEW = "//input[@id='MinHR']";
    public static final String AVG_HR_VIEW = "//input[@id='AvgHR']";
    public static final String MAX_HR_VIEW = "//input[@id='MaxHR']";
    public static final String CALORIES_BURNED = "//input[@id='kCal']";
    public static final String SAVE_ON_THE_LIBRARY = "//input[@id='SaveLibrary']";
    public static final String UPDATE_WORKOUT_BUTTON_SAVE_VIEW = "//input[@id='saveButton']";
    public static final String SAVE_TO_LIBRARY_VIEW = "//input[@id='SaveLibrary']";
    public static final String UP_DOWN = "//div[@id='WarmCoolBox']";
    public static final String DISTANCE_UP = "//input[@id='WUDistance']";
    public static final String DISTANCE_SELECT_UP = "//select[@id='WUDistType']";
    public static final String DISTANCE_SELECT_KM_UP = "//select[@id='WUDistType']//option[@value='km']";
    public static final String TIME_UP = "//input[@id='WUDuration']";
    public static final String DISTANCE_DOWN = "//input[@id='CDDistance']";
    public static final String DISTANCE_SELECT_DOWN = "//select[@id='CDDistType']";
    public static final String DISTANCE_SELECT_KM_DOWN = "//select[@id='CDDistType']//option[@value='km']";
    public static final String TIME_DOWN = "//input[@id='CDDuration']";
    public static final String SCROLL = "//a[@class='scrollup']";
    public static final String WEATHER = "//div[@data-label='weather']";
    public static final String PART_SUNNY = "//input[@id='PartSunny']";
    public static final String TEMPERATURE = "//input[@id='Temp']";
    public static final String SELECT_F_C_ = "//select[@id='TempType']";
    public static final String _C_ = "//select[@id='TempType']//option[@value='C']";
    public static final String WEATHER_HUMIDITY = "//input[@id='Humid']";
    public static final String OPEN_CALENDAR = "//a[@href='Calendar.cshtml'][@class='ptip_s']";
    public static final String CLICK_IN_WORKOUT = "//div[@class='fc-event-inner fc-event-skin']";
    public static final String DELETE = "//a[@class='quick-delete']";
    public static final String DELETE_OK = "//a[@data-handler='1']";
    public static final String ERROR = "//div[@class='alert alert-error']";



    public CalendarPage clickInButtonForCreateNewWorkout() {
        log.info("Click in button for create new workout");
        $x(CREATE_BUTTON).submit();
        return this;
    }

    public CalendarPage clickInQuickAddButton() {
        log.info("Click in quick add button");
        $x(QUICK_ADD).click();
        return this;
    }

    public CalendarPage selectionTimeAndDay() {
        log.info("Selection time and day");
        $x(TIME_OF_DAY).click();
        return this;
    }

    public CalendarPage selectionActivityType() {
        log.info("Selection activity type");
        $x(ACTIVITY_TYPE).click();
        return this;
    }
    public CalendarPage selectionFartlekActivityType() {
        log.info("Selection fartlek activity type");
        $x(FARTLEK_ACTIVITY_TYPE).click();
        return this;
    }

    public CalendarPage enterInInputWorkoutName(String name) {
        log.info("Enter in input workout name");
        $x(WORKOUT_NAME).sendKeys(name);
        return this;
    }

    public CalendarPage enterInformationInMenuWorkDescription(String description) {
        log.info("Enter information in menu work description");
        $x(WORKOUT_DESCRIPTION).sendKeys(description);
        return this;
    }

    public CalendarPage showDistanceAndDuration() {
        log.info("Show distance and duration");
        $x(SHOW_PLANNED_DISTANCE).click();
        return this;
    }

    public CalendarPage enterDistanceInInputShow(String distance) {
        log.info("Enter distance in input show");
        $x(SHOW_DIST_TYPE).sendKeys(distance);
        return this;
    }

    public CalendarPage selectShowDistance() {
        log.info("Select show distance");
        $x(SHOW_SELECT_DISTANCE).click();
        return this;
    }

    public CalendarPage selectKmShowDistance() {
        log.info("Select KM show distance");
        $x(SHOW_KM_DISTANCE).click();
        return this;
    }

    public CalendarPage enterDataInInputDistance(String HH, String MM, String SS) {
        log.info("Enter data in input distance");
        $x(SHOW_ADD_DATA_DISTANCE).sendKeys(HH, MM, SS);
        return this;
    }

    public CalendarPage clickDistancePlan(String distance) {
        log.info("Distance plan");
        $x(DISTANCE).sendKeys(distance);
        return this;
    }

    public CalendarPage selectDistance() {
        log.info("Select Distance");
        $x(SELECT_DISTANCE).click();
        return this;
    }

    public CalendarPage selectKmDistance() {
        log.info("Select KM distance");
        $x(KM).click();
        return this;
    }

    public CalendarPage planTime(String HH, String MM, String SS) {
        log.info("Plan time");
        $x(DURATION).sendKeys(HH, MM, SS);
        return this;
    }

    public CalendarPage selectSpeed() {
        log.info("Select speed");
        $x(SELECT_PACE).click();
        return this;
    }

    public CalendarPage selectKmSpeed() {
        log.info("Select KM speed");
        $x(MIN_KM_PACE).click();
        return this;
    }

    public CalendarPage needSelectHealth() {
        log.info("Need selection health");
        $x(HOVE_I_FELT).click();
        return this;
    }

    public CalendarPage selectTheGoodButton() {
        log.info("Select the good button");
        $x(GOOD).click();
        return this;
    }

    public CalendarPage needSelectPerceivedEffort() {
        log.info("Need select perceived effort");
        $x(PERCEIVED_EFFORT).click();
        return this;
    }

    public CalendarPage resultPerceivedEffort() {
        log.info("Result perceived effort");
        $x(MODERATE_2).click();
        return this;
    }

    public CalendarPage enterResultInWorkoutNotes(String data) {
        log.info("Enter result in workout notes");
        $x(POST_WORKOUT_NOTES_RESULTS).sendKeys(data);
        return this;
    }

    public CalendarPage clickInButtonRace() {
        log.info("Click in button race");
        $x(MARK_AS_RACE).click();
        return this;
    }

    public CalendarPage enterDataInInputOverallPlace(String data) {
        log.info("Enter data in input overall place");
        $x(OVERALL_PLACE).sendKeys(data);
        return this;
    }

    public CalendarPage enterDataInInputGroupPlace(String age){
        log.info("Enter data in input group place");
        $x(AGE_GROUP_PLACE).sendKeys(age);
        return this;
    }

    public CalendarPage saveToLibraryWorkout() {
        log.info("Save to library workout");
        $x(SAVE_TO_LIBRARY).click();
        return this;
    }

    public CalendarPage addWorkout() {
        log.info("Add workout");
        $x(ADD_WORKOUT_BUTTON).click();
        return this;
    }

    public CalendarPage openCalendar() {
        log.info("Open calendar");
        $x(CALENDAR).click();
        return this;
    }

    public CalendarPage openView() {
        log.info("Open view");
        $x(VIEW).click();
        return this;
    }

    public CalendarPage clickButtonView() {
        log.info("Click button view");
        $x(UPDATE_WORKOUT_BUTTON_VIEW).click();
        return this;
    }

    public CalendarPage updateDistance(String basic_distance) {
        log.info("Update distance");
        $x(DISTANCE_VIEW).sendKeys(basic_distance);
        return this;
    }

    public CalendarPage selectUpdateDistance() {
        log.info("Select update distance");
        $x(SELECT_KM_BASIK_VIEW).click();
        return this;
    }

    public CalendarPage selectUpdateKmDistance() {
        log.info("Select update KM distance");
        $x(KM_BASIK_VIEW).click();
        return this;
    }

    public CalendarPage updateTime() {
        log.info("Update time");
        $x(DURATION_VIEW).click();
        return this;
    }

    public CalendarPage updateNormalView() {
        log.info("Update normal View");
        $x(NORMAL_VIEW).click();
        return this;
    }

    public CalendarPage updateSelectView() {
        log.info("Update select view");
        $x(SELECT_VIEW).click();
        return this;
    }

    public CalendarPage updateHardView() {
        log.info("Update hard view");
        $x(HARD_1_VIEW).click();
        return this;
    }

    public CalendarPage minNumberOfHeartBeatsPerMinute(String amount) {
        log.info("Min number of heart beats per minute");
        $x(MIN_HR_VIEW).sendKeys(amount);
        return this;
    }

    public CalendarPage avgNumberOfHeartBeatsPerMinutey(String amount) {
        log.info("Avg number of heart beats per minutey");
        $x(AVG_HR_VIEW).sendKeys(amount);
        return this;
    }

    public CalendarPage maxNumberOfHeartBeatsPerMinute(String amount) {
        log.info("Max number of heart beats per minute");
        $x(MAX_HR_VIEW).sendKeys(amount);
        return this;
    }

    public CalendarPage caloriesUpdate(String amount) {
        log.info("Calories update");
        $x(CALORIES_BURNED).sendKeys(amount);
        return this;
    }

    public CalendarPage updateLibraryView() {
        log.info("Update library view");
        $x(SAVE_TO_LIBRARY_VIEW).click();
        return this;
    }


    public CalendarPage scroll() {
        log.info("Scroll");
        $x(SCROLL).click();
        return this;
    }

    public CalendarPage updateWeather() {
        log.info("Update weathe");
        $x(WEATHER).click();
        return this;
    }

    public CalendarPage updatePartSunny() {
        log.info("Update parts sunny");
        $x(PART_SUNNY).click();
        return this;
    }

    public CalendarPage updateTemperature(String degrees) {
        log.info("Update temperature");
        $x(TEMPERATURE).sendKeys(degrees);
        return this;
    }

    public CalendarPage updateSelectTemperature() {
        log.info("Update select temperature");
        $x(SELECT_F_C_).click();
        return this;
    }

    public CalendarPage updateSelectCTemperature() {
        log.info("Update select C temperature");
        $x(_C_).click();
        return this;
    }

    public CalendarPage updateHumidity(String percent) {
        log.info("Update humidity");
        $x(WEATHER_HUMIDITY).sendKeys(percent);
        return this;
    }

    public CalendarPage updateWarmUp() {
        log.info("Update warm up");
        $x(UP_DOWN).click();
        return this;
    }

    public CalendarPage updateWarmUpDistance(String distance) {
        log.info("Update warm up distance");
        $x(DISTANCE_UP).sendKeys(distance);
        return this;
    }

    public CalendarPage updateWarmUpSelect() {
        log.info("Update warm up select");
        $x(DISTANCE_SELECT_UP).click();
        return this;
    }

    public CalendarPage updateWarmUpSelectKm() {
        log.info("Update warm up select");
        $x(DISTANCE_SELECT_KM_UP).click();
        return this;
    }

    public CalendarPage updateWarmUpTime(String HH, String MM, String SS) {
        log.info("Update warm up time");
        $x(TIME_UP).sendKeys(HH, MM, SS);
        return this;
    }

    public CalendarPage updateCoolDownDistance(String km) {
        log.info("Update cool down distance");
        $x(DISTANCE_DOWN).sendKeys(km);
        return this;
    }

    public CalendarPage updateCoolDownDistanceSelect() {
        log.info("Update cool down distance select");
        $x(DISTANCE_SELECT_DOWN).click();
        return this;
    }

    public CalendarPage updateCoolDownDistanceSelectKm() {
        log.info("Update cool down distance select KM");
        $x(DISTANCE_SELECT_KM_DOWN).click();
        return this;
    }

    public CalendarPage updateCoolDownTime(String HH, String MM, String SS) {
        log.info("Update cool down time");
        $x(TIME_DOWN).sendKeys(HH, MM, SS);
        return this;
    }

    public CalendarPage updateLibrary() {
        log.info("Update library");
        $x(SAVE_ON_THE_LIBRARY).click();
        return this;
    }

    public CalendarPage updateWorkout(){
        log.info("Update workout");
        $x(UPDATE_WORKOUT_BUTTON_SAVE_VIEW).click();
        return this;
    }

    public CalendarPage openCalendarResult() {
        log.info("Open calendar result");
        $x(OPEN_CALENDAR).click();
        return this;
    }

    public CalendarPage clickInWorkout() {
        log.info("Click in Workout");
        $x(CLICK_IN_WORKOUT).click();
        return this;
    }

    public CalendarPage deleteResultWorkout() {
        log.info("Delete result workout");
        $x(DELETE).click();
        return this;
    }

    public CalendarPage deleteResultWorkoutOK() {
        log.info("Delete result workout OK");
        $x(DELETE_OK).click();
        return this;
    }

    public String getErrorText () {
        log.info("getErrorText");
        return  $x(ERROR).getText();
    }

    public CalendarPage validateErrorTextMinHH (String errorText) {
        log.info("Validate error text min HH");
        Assert.assertEquals(getErrorText(),errorText, "??\n" +
                "Please fix the following errors:\n" +
                "*Maximum Heartrate cannot be greater than 300.");
        return this;
    }

    public CalendarPage validateErrorTextMaxHH (String errorText) {
        log.info("Validate error text max HH");
        Assert.assertEquals(getErrorText(),errorText, "??\n" +
                "Please fix the following errors:\n" +
                "*Minimum Heartrate cannot be greater than 300.");
        switchTo().defaultContent();
        return this;
    }

    public CalendarPage validateErrorTextAvgHH (String errorText) {
        log.info("Validate error text avg HH");
        Assert.assertEquals(getErrorText(),errorText, "??\n" +
                "Please fix the following errors:\n" +
                "*Average Heartrate cannot be greater than 300.");
        switchTo().defaultContent();
        return this;
    }
}