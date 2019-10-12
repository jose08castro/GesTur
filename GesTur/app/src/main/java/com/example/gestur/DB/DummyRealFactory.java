package com.example.gestur.DB;

import com.example.gestur.DB.DB;
import com.example.gestur.DB.definitionCheckListClasses.CheckListDef;
import com.example.gestur.DB.definitionCheckListClasses.CheckListQuestionDef;
import com.example.gestur.DB.definitionFormClasses.ChapterDefBinary;
import com.example.gestur.DB.definitionFormClasses.ChapterDefHotel;
import com.example.gestur.DB.definitionFormClasses.ChapterDefScore;
import com.example.gestur.DB.definitionFormClasses.ChapterDefSpa;
import com.example.gestur.DB.definitionFormClasses.FormDefBinary;
import com.example.gestur.DB.definitionFormClasses.FormDefCafeteriaFondaSoda;
import com.example.gestur.DB.definitionFormClasses.FormDefConCenters;
import com.example.gestur.DB.definitionFormClasses.FormDefHotel;
import com.example.gestur.DB.definitionFormClasses.FormDefRestaurant;
import com.example.gestur.DB.definitionFormClasses.FormDefSpa;
import com.example.gestur.DB.definitionFormClasses.QuestionDefBinary;
import com.example.gestur.DB.definitionFormClasses.QuestionDefHotel;
import com.example.gestur.DB.definitionFormClasses.QuestionDefScore;
import com.example.gestur.DB.definitionFormClasses.QuestionDefScoreObs;
import com.example.gestur.logic.Activity;
import com.example.gestur.logic.Address;
import com.example.gestur.logic.User;
import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.chapters.ScoreChapter;
import com.example.gestur.logic.checkList.CheckListQuestion;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.logic.forms.CafeteriaFondaSodaForm;
import com.example.gestur.logic.forms.ConCentersBinaryForm;
import com.example.gestur.logic.forms.Form;
import com.example.gestur.logic.forms.RestaurantBinaryForm;
import com.example.gestur.logic.forms.ScoreForm;
import com.example.gestur.logic.forms.SpaForm;
import com.example.gestur.logic.questions.BinaryQuestion;
import com.example.gestur.logic.questions.HotelQuestion;
import com.example.gestur.logic.questions.ScoreObsQuestion;
import com.example.gestur.logic.questions.ScoreQuestion;

import java.util.ArrayList;

public class DummyRealFactory {

    public static void getForm(int type){
        switch (type){
            case 1:
                DB.getInstance().requestForm("FormTematics",type);
                break;
            case 2:
                DB.getInstance().requestForm("FormHotels",type);
                break;
            case 3:
                DB.getInstance().requestForm("FormTravelAgencies",type);
                break;
            case 4:
                DB.getInstance().requestForm("FormRentVehicles",type);
                break;
            case 5:
                DB.getInstance().requestForm("FormAirLines",type);
                break;
            case 6:
                DB.getInstance().requestForm("FormWaterTransport",type);
                break;
            case 7:
                DB.getInstance().requestForm("FormConCenters",type);
                break;
            case 8:
                DB.getInstance().requestForm("FormEnterprise",type);
                break;
            case 9:
                DB.getInstance().requestForm("FormRestaurant",type);
                break;
            case 10:
                DB.getInstance().requestForm("FormFondaSoda",type);
                break;
            case 11:
                DB.getInstance().requestForm("FormCafeteria",type);
                break;
            case 12:
                DB.getInstance().requestForm("FormWaterActivities",type);
                break;
            case 13:
                DB.getInstance().requestForm("FormAirActivities",type);
                break;
            case 14:
                DB.getInstance().requestForm("FormSpa",type);
                break;
            default:
                return;
        }
    }
    public static void getCheckList(int type){
        switch (type) {
            case 1:
                DB.getInstance().requestCheckList("CheckListTematics_Hotel");
                break;
            case 2:
                DB.getInstance().requestCheckList("CheckListTematics_Hotel_IndianZone");
                break;
            case 3:
                DB.getInstance().requestCheckList("CheckListTravelAgency");
                break;
            case 4:
                DB.getInstance().requestCheckList("CheckListVehicleLease");
                break;
            case 5:
                DB.getInstance().requestCheckList("CheckListAirLine");
                break;
            case 6:
                DB.getInstance().requestCheckList("CheckListWaterTransport");
                break;
            case 7:
                DB.getInstance().requestCheckList("CheckListConCenters");
                break;
            case 8:
                DB.getInstance().requestCheckList("CheckListGastronomicEnterprise");
                break;
            case 9:
                DB.getInstance().requestCheckList("CheckListWaterActivity");
                break;
            case 10:
                DB.getInstance().requestCheckList("CheckListAirActivity");
                break;
            case 11:
                DB.getInstance().requestCheckList("CheckListSpa");
                break;
            default:
                return;
        }
    }

    public static ScoreObsQuestion getRealClass(QuestionDefScoreObs question){
        return new ScoreObsQuestion(question.number,
                question.minScore,
                question.maxScore,
                question.question,question.NA,
                question.score,
                question.observation);
    }
    public static ScoreQuestion getRealClass(QuestionDefScore question){
        return new ScoreQuestion(question.number,
                question.minScore,
                question.maxScore,
                question.question,
                question.NA,
                question.score);
    }
    public static BinaryQuestion getRealClass(QuestionDefBinary question){
        return new BinaryQuestion(question.question,
                question.number,
                question.yes,
                question.no,
                question.NA);
    }
    public static HotelQuestion getRealClass(QuestionDefHotel question){
        return new HotelQuestion(question.number,
                question.question,
                question.NA,
                question.question1Star,
                question.question2Star,
                question.question3Star,
                question.question4Star,
                question.question5Star,
                question.selectedQuestion);
    }
    public static ScoreChapter getRealClass(ChapterDefSpa chapter){
        ArrayList<ScoreQuestion> questions = new ArrayList<>();
        for(QuestionDefScoreObs q:chapter.questionsScore){
            questions.add(getRealClass(q));
        }
        return new ScoreChapter(chapter.number,
                chapter.name,
                questions,
                chapter.totalPercentage);
    }
    public static BinaryChapter getRealClass(ChapterDefBinary chapter){
        ArrayList<BinaryQuestion> questions2 = new ArrayList<>();
        for(QuestionDefBinary q:chapter.questions){
            questions2.add(getRealClass(q));
        }
        return new BinaryChapter(chapter.name,
                chapter.number,
                questions2,
                chapter.totalPercentage);
    }
    public static ScoreChapter getRealClass(ChapterDefHotel chapter){
        ArrayList<ScoreQuestion> questions2 = new ArrayList<>();
        for(QuestionDefHotel q:chapter.questionsScore){
            questions2.add(getRealClass(q));
        }
        return new ScoreChapter(chapter.name,
                chapter.number,
                questions2,
                chapter.totalPercentage);
    }
    public static ScoreChapter getRealClass(ChapterDefScore chapter){
        ArrayList<ScoreQuestion> questions2 = new ArrayList<>();
        for(QuestionDefScore q:chapter.questionsScore){
            questions2.add(getRealClass(q));
        }
        return new ScoreChapter(chapter.number,
                chapter.name,
                questions2,
                chapter.totalPercentage);
    }
    public static BinaryForm getRealClass(FormDefBinary form){
        ArrayList<BinaryChapter> chapters2 = new ArrayList<>();
        for(ChapterDefBinary c:form.chapters){
            chapters2.add(getRealClass(c));
        }
        return new BinaryForm(form.name,form.type,chapters2);
    }
    public static SpaForm getRealClass(FormDefSpa form){
        ArrayList<ScoreChapter> chapters2 = new ArrayList<>();
        for(ChapterDefSpa c:form.chapters){
            chapters2.add(getRealClass(c));
        }
        return new SpaForm(form.establishmentName,
                form.collaborators,
                form.typology,
                form.rooms,
                form.name,
                form.type,chapters2);
    }
    public static ScoreForm getRealClass(FormDefHotel form){
        ArrayList<ScoreChapter> chapters2 = new ArrayList<>();
        for(ChapterDefHotel c:form.chapters){
            chapters2.add(getRealClass(c));
        }
        return new ScoreForm(form.name,form.type,chapters2);
    }
    public static CafeteriaFondaSodaForm getRealClass(FormDefCafeteriaFondaSoda form){
        ArrayList<ScoreChapter> chapters2 = new ArrayList<>();
        for(ChapterDefScore c:form.chapters){
            chapters2.add(getRealClass(c));
        }
        return new CafeteriaFondaSodaForm(form.establishmentName,
                form.tables,
                form.places,
                form.collaborators,
                form.name,
                form.type,
                chapters2,
                form.placeType);
    }
    public static ConCentersBinaryForm getRealClass(FormDefConCenters form){
        ArrayList<BinaryChapter> chapters2 = new ArrayList<>();
        for(ChapterDefBinary c:form.chapters){
            chapters2.add(getRealClass(c));
        }
        return new ConCentersBinaryForm(form.name,
                form.type,
                form.establishmentName,
                form.eventRooms,
                form.places,
                form.collaborators,
                chapters2,
                form.chapterNames);
    }
    public static RestaurantBinaryForm getRealClass(FormDefRestaurant form){
        ArrayList<BinaryChapter> chapters2 = new ArrayList<>();
        for(ChapterDefBinary c:form.chapters){
            chapters2.add(getRealClass(c));
        }
        return new RestaurantBinaryForm(form.name,
                form.type,
                form.establishmentName,
                form.specialty,
                form.tables,
                form.places,
                form.collaborators,chapters2);
    }
    public static CheckListQuestion getRealClass(CheckListQuestionDef question){
        return new CheckListQuestion(question.question,
                question.yes,
                question.no);
    }
    public static CheckListForm getRealClass(CheckListDef form){
        ArrayList<CheckListQuestion> questionsLegal2 = new ArrayList<>();
        ArrayList<CheckListQuestion> questionsTech2 = new ArrayList<>();
        for(CheckListQuestionDef c:form.questionsLegal){
            questionsLegal2.add(getRealClass(c));
        }
        for(CheckListQuestionDef c:form.questionsTech){
            questionsTech2.add(getRealClass(c));
        }
        return new CheckListForm(form.name,
                form.enterprise,
                form.emailAddress,
                form.date,
                form.phoneNumber,questionsLegal2,questionsTech2);
    }
    public static User getRealClass(UserDummy user){
        return new User(user.id,user.fullName,user.userName,user.emailAddress,user.password,
                user.bornDate,user.phoneNumbers);
    }


    public static QuestionDefBinary getDummyBinaryQuestion(BinaryQuestion q){
        QuestionDefBinary questionDefBinary = new QuestionDefBinary();
        questionDefBinary.number = q.getNumber();
        questionDefBinary.question = q.getQuestion();
        questionDefBinary.NA = q.isNA();
        questionDefBinary.yes = q.isYes();
        questionDefBinary.no = q.isNo();
        return questionDefBinary;
    }
    public static QuestionDefHotel getDummyHotelQuestion(HotelQuestion q2){
        QuestionDefHotel q = new QuestionDefHotel();
        q.number = q2.getNumber();
        q.question = q2.getQuestion();
        q.NA = q2.isNA();
        q.minScore = q2.getMinScore();
        q.maxScore = q2.getMaxScore();
        q.score = q2.getScore();
        q.question1Star = q2.getQuestion1Star();
        q.question2Star = q2.getQuestion2Star();
        q.question3Star = q2.getQuestion3Star();
        q.question4Star = q2.getQuestion4Star();
        q.question5Star = q2.getQuestion5Star();
        q.selectedQuestion = q2.getSelectedQuestion();
        return q;
    }
    public static QuestionDefScore getDummyScoreQuestion(ScoreQuestion q2){
        QuestionDefScore q = new QuestionDefScore();
        q.number = q2.getNumber();
        q.question = q2.getQuestion();
        q.NA = q2.isNA();
        q.minScore = q2.getMinScore();
        q.maxScore = q2.getMaxScore();
        q.score = q2.getScore();
        return q;
    }
    public static QuestionDefScoreObs getDummyScoreObsQuestion(ScoreObsQuestion q2){
        QuestionDefScoreObs q = new QuestionDefScoreObs();
        q.number = q2.getNumber();
        q.question = q2.getQuestion();
        q.NA = q2.isNA();
        q.minScore = q2.getMinScore();
        q.maxScore = q2.getMaxScore();
        q.score = q2.getScore();
        q.observation = q2.getObservation();
        return q;
    }

    public static ChapterDefSpa getDummySpaChapter(ScoreChapter c){
        ChapterDefSpa chapter = new ChapterDefSpa();
        chapter.name = c.getName();
        chapter.number = c.getNumber();
        chapter.totalPercentage = c.getTotalPercentage();
        chapter.achievedChapterPercentage = c.getAchievedChapterPercentage();
        chapter.achievedFormPercentage = c.getAchievedFormPercentage();
        chapter.achievedPoints = c.getAchievedChapterPoints();
        chapter.totalPoints = c.getTotalPoints();
        chapter.applicablePoints = c.getApplicablePoints();
        chapter.naPoints = c.getNaPoints();

        ArrayList<QuestionDefScoreObs> questions = new ArrayList<>();
        for(ScoreQuestion question: c.getQuestions()){
            questions.add(getDummyScoreObsQuestion((ScoreObsQuestion) question));
        }
        chapter.questionsScore = questions;
        return chapter;
    }
    public static ChapterDefScore getDummyScoreChapter(ScoreChapter c){
        ChapterDefScore chapter = new ChapterDefScore();
        chapter.name = c.getName();
        chapter.number = c.getNumber();
        chapter.totalPercentage = c.getTotalPercentage();
        chapter.achievedChapterPercentage = c.getAchievedChapterPercentage();
        chapter.achievedFormPercentage = c.getAchievedFormPercentage();
        chapter.achievedPoints = c.getAchievedChapterPoints();
        chapter.totalPoints = c.getTotalPoints();
        chapter.applicablePoints = c.getApplicablePoints();
        chapter.naPoints = c.getNaPoints();

        ArrayList<QuestionDefScore> questions = new ArrayList<>();
        for(ScoreQuestion question: c.getQuestions()){
            questions.add(getDummyScoreQuestion(question));
        }
        chapter.questionsScore = questions;
        return chapter;
    }
    public static ChapterDefHotel getDummyHotelChapter(ScoreChapter c){
        ChapterDefHotel chapter = new ChapterDefHotel();
        chapter.name = c.getName();
        chapter.number = c.getNumber();
        chapter.totalPercentage = c.getTotalPercentage();
        chapter.achievedChapterPercentage = c.getAchievedChapterPercentage();
        chapter.achievedFormPercentage = c.getAchievedFormPercentage();
        chapter.achievedPoints = c.getAchievedChapterPoints();
        chapter.totalPoints = c.getTotalPoints();
        chapter.applicablePoints = c.getApplicablePoints();
        chapter.naPoints = c.getNaPoints();

        ArrayList<QuestionDefHotel> questions = new ArrayList<>();
        for(ScoreQuestion question: c.getQuestions()){
            questions.add(getDummyHotelQuestion((HotelQuestion) question));
        }
        chapter.questionsScore = questions;
        return chapter;
    }
    public static ChapterDefBinary getDummyBinaryChapter(BinaryChapter c){
        ChapterDefBinary chapter = new ChapterDefBinary();
        chapter.name = c.getName();
        chapter.number = c.getNumber();
        chapter.totalPercentage = c.getTotalPercentage();
        chapter.achievedChapterPercentage = c.getAchievedChapterPercentage();
        chapter.achievedFormPercentage = c.getAchievedFormPercentage();

        ArrayList<QuestionDefBinary> questions = new ArrayList<>();
        for(BinaryQuestion question: c.getQuestions()){
            questions.add(getDummyBinaryQuestion(question));
        }
        chapter.questions = questions;
        return chapter;
    }

    public static FormDefBinary getDummyBinaryForm(BinaryForm f){
        FormDefBinary form = new FormDefBinary();
        form.name = f.getName();
        form.type = f.getType();
        form.totalPoints = f.getTotalPoints();
        form.achievedPoints = f.getAchievedPoints();
        form.achievedPercentage = f.getAchievedPercentage();

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        for(BinaryChapter chapter:f.getChapters()){
            chapters.add(getDummyBinaryChapter(chapter));
        }
        form.chapters = chapters;
        return form;
    }
    public static FormDefSpa getDummySpaForm(SpaForm f){
        FormDefSpa form = new FormDefSpa();
        form.name = f.getName();
        form.type = f.getType();
        form.totalPoints = f.getTotalPoints();
        form.achievedPoints = f.getAchievedPoints();
        form.achievedPercentage = f.getAchievedPercentage();
        form.applicablePoints = f.getApplicablePoints();
        form.NApoints = f.getNApoints();

        form.establishmentName = f.getEstablishmentName();
        form.collaborators = f.getCollaborators();
        form.typology = f.getTypology();
        form.rooms = f.getRooms();

        ArrayList<ChapterDefSpa> chapters = new ArrayList<>();
        for(ScoreChapter chapter:f.getChapters()){
            chapters.add(getDummySpaChapter(chapter));
        }
        form.chapters = chapters;
        return form;
    }
    public static FormDefRestaurant getDummyRestaurantForm(RestaurantBinaryForm f){
        FormDefRestaurant form = new FormDefRestaurant();
        form.name = f.getName();
        form.type = f.getType();
        form.totalPoints = f.getTotalPoints();
        form.achievedPoints = f.getAchievedPoints();
        form.achievedPercentage = f.getAchievedPercentage();

        form.establishmentName = f.getEstablishmentName();
        form.specialty = f.getSpecialty();
        form.tables = f.getTables();
        form.places = f.getPlaces();
        form.collaborators = f.getCollaborators();
        form.schedule = f.getSchedule();

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        for(BinaryChapter chapter:f.getChapters()){
            chapters.add(getDummyBinaryChapter(chapter));
        }
        form.chapters = chapters;
        return form;
    }
    public static FormDefHotel getDummyHotelForm(ScoreForm f){
        FormDefHotel form = new FormDefHotel();
        form.name = f.getName();
        form.type = f.getType();
        form.totalPoints = f.getTotalPoints();
        form.achievedPoints = f.getAchievedPoints();
        form.achievedPercentage = f.getAchievedPercentage();
        form.applicablePoints = f.getApplicablePoints();
        form.NApoints = f.getNApoints();
        ArrayList<ChapterDefHotel> chapters = new ArrayList<>();
        for(ScoreChapter chapter:f.getChapters()){
            chapters.add(getDummyHotelChapter(chapter));
        }
        form.chapters = chapters;
        return form;
    }
    public static FormDefConCenters getDummyConCentersForm(ConCentersBinaryForm f){
        FormDefConCenters form = new FormDefConCenters();
        form.name = f.getName();
        form.type = f.getType();
        form.totalPoints = f.getTotalPoints();
        form.achievedPoints = f.getAchievedPoints();
        form.achievedPercentage = f.getAchievedPercentage();

        form.establishmentName = f.getEstablishmentName();
        form.eventRooms = f.getEventRooms();
        form.places = f.getPlaces();
        form.collaborators = f.getCollaborators();

        ArrayList<ChapterDefBinary> chapters = new ArrayList<>();
        for(BinaryChapter chapter:f.getChapters()){
            chapters.add(getDummyBinaryChapter(chapter));
        }
        form.chapters = chapters;
        return form;
    }
    public static FormDefCafeteriaFondaSoda getDummyCafeteriaForm(CafeteriaFondaSodaForm f){
        FormDefCafeteriaFondaSoda form = new FormDefCafeteriaFondaSoda();
        form.name = f.getName();
        form.type = f.getType();
        form.totalPoints = f.getTotalPoints();
        form.achievedPoints = f.getAchievedPoints();
        form.achievedPercentage = f.getAchievedPercentage();

        form.applicablePoints = f.getApplicablePoints();
        form.NApoints = f.getNApoints();

        form.establishmentName = f.getEstablishmentName();
        form.tables = f.getTables();
        form.places = f.getPlaces();
        form.collaborators = f.getCollaborators();
        form.placeType = f.getPlaceType();

        ArrayList<ChapterDefScore> chapters = new ArrayList<>();
        for(ScoreChapter chapter:f.getChapters()){
            chapters.add(getDummyScoreChapter(chapter));
        }
        form.chapters = chapters;
        return form;
    }


    public static CheckListDef getDummyCheckList(CheckListForm f){
        CheckListDef checkListDef = new CheckListDef();
        checkListDef.name = f.getTitleForm();
        checkListDef.enterprise = f.getEnterpriseName();
        checkListDef.emailAddress = f.getEmailAddress();
        checkListDef.date = f.getDate();
        checkListDef.phoneNumber = f.getPhoneNumber();
        checkListDef.achievedPercentage = f.getAchievedPercentage();

        ArrayList<CheckListQuestionDef> questionsLegalDef = new ArrayList<>();
        ArrayList<CheckListQuestionDef> questionsTechDef = new ArrayList<>();
        for(CheckListQuestion q:f.getQuestionsLegal()){
            questionsLegalDef.add(getDummyCheckListQuestion(q));
        }
        for(CheckListQuestion q:f.getQuestionsTech()){
            questionsTechDef.add(getDummyCheckListQuestion(q));
        }
        checkListDef.questionsLegal = questionsLegalDef;
        checkListDef.questionsTech = questionsLegalDef;
        return checkListDef;
    }
    public static CheckListQuestionDef getDummyCheckListQuestion(CheckListQuestion q){
        CheckListQuestionDef questionDef = new CheckListQuestionDef();
        questionDef.question = q.getQuestion();
        questionDef.yes = q.isYes();
        questionDef.no = q.isNo();
        return questionDef;
    }

    public static ActivityDummy getDummyActivity(Activity activity){
        ActivityDummy act = new ActivityDummy();
        act.name = activity.getName();
        act.province = activity.getLocation().getProvince();
        act.canton = activity.getLocation().getCanton();
        act.district = activity.getLocation().getDistrict();
        act.address = activity.getLocation().getLocation();
        act.type = activity.getType();
        act.isOperative = activity.isOperative();

        act.checkListDef = getDummyCheckList(activity.getCheckListForm());

        Form form = activity.getForm();
        int t = form.getType();
        if(t == 1 | t == 3 | t == 4 | t == 5 | t == 6 | t == 8 | t == 12 | t == 13){
            act.formDefBinary = getDummyBinaryForm((BinaryForm) form);
        }else if(t==2){
            act.formDefHotel = getDummyHotelForm((ScoreForm)form);
        }else if(t == 7){
            act.formDefConCenters = getDummyConCentersForm((ConCentersBinaryForm) form);
        }else if(t == 9){
            act.formDefRestaurant = getDummyRestaurantForm((RestaurantBinaryForm) form);
        }else if(t == 10 | t == 11){
            act.formDefCafeteriaFondaSoda = getDummyCafeteriaForm((CafeteriaFondaSodaForm)form);
        }else if(t == 14){
            act.formDefSpa = getDummySpaForm((SpaForm)form);
        }
        return act;
    }
    public static Activity getRealActivity(ActivityDummy activity){
        Form form = null;
        CheckListForm checkListForm = getRealClass(activity.checkListDef);
        int t = activity.type;
        if(t == 1 | t == 3 | t == 4 | t == 5 | t == 6 | t == 8 | t == 12 | t == 13){
            form = getRealClass(activity.formDefBinary);
        }else if(t==2){
            form = getRealClass(activity.formDefHotel);
        }else if(t == 7){
            form = getRealClass(activity.formDefConCenters);
        }else if(t == 9){
            form = getRealClass(activity.formDefRestaurant);
        }else if(t == 10 | t == 11){
            form = getRealClass(activity.formDefCafeteriaFondaSoda);
        }else if(t == 14){
            form = getRealClass(activity.formDefSpa);
        }
        Address address = new Address(activity.province,activity.canton,activity.district,activity.address);
        return new Activity(activity.name,address,activity.isOperative,activity.type,form,checkListForm);
    }

    public static UserDummy getDummyUser(User user){
        UserDummy userDummy = new UserDummy();
        userDummy.fullName = user.getFullName();
        userDummy.userName = user.getUserName();
        userDummy.emailAddress = user.getEmailAddress();
        userDummy.password = user.getPassword();
        userDummy.bornDate = user.getBornDate();
        userDummy.phoneNumbers =user.getPhoneNumbers();

        ArrayList<ActivityDummy> activityDummies = new ArrayList<>();
        for(Activity activity:user.getActivities()){
            activityDummies.add(getDummyActivity(activity));
        }
        userDummy.activities = activityDummies;
        return userDummy;
    }
    public static User getRealUser(UserDummy userDummy){
        ArrayList<Activity> activities = new ArrayList<>();
        for(ActivityDummy actDummy:userDummy.activities){
            activities.add(getRealActivity(actDummy));
        }
        return new User(userDummy.id,
                userDummy.fullName,
                userDummy.userName,
                userDummy.emailAddress,
                userDummy.password,
                userDummy.bornDate,
                userDummy.phoneNumbers,
                activities);
    }
}
