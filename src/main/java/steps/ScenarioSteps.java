package steps;

import cucumber.api.java.ru.Когда;

import java.util.List;

/**
 * Created by m.baykova on 13.09.2017.
 */
public class ScenarioSteps {

    SearchSteps searchSteps = new SearchSteps();
    FilterSteps filterSteps = new FilterSteps();
    ReportSteps reportSteps = new ReportSteps();

    @Когда("^выбран раздел \"(.+)\"$")
    public void selectSect(String nameElement){ searchSteps.selectSect(nameElement);
    }
    @Когда("^выбрана категория \"(.+)\"$")
    public void selectCategory(String nameElement){
        searchSteps.selectCategory(nameElement);
    }

    @Когда("^выбран раздел электроники: \"(.+)\"$")
    public void selectEletronic(String nameElement){ searchSteps.selectEletronic(nameElement); }

    @Когда("^заголовок страницы - \"(.+)\"$")
    public void checkTitleDMSPage(String title){
        searchSteps.checkPageTitle(title);
    }

    @Когда("^выполнено нажатие на кнопку фильтры$")
    public void selectFilter(){ filterSteps.selectFilter(); }

    @Когда("^введено значение цены до: \"(.+)\"$")
    public void setInputPriceTo(String price){ filterSteps.setInputPriceTo(price); }

    @Когда("^выбраны производители \"(.+)\"$")
    public void selectManufacturer(List<String> price){
        filterSteps.selectManufacturer(price);
    }

    @Когда("^выполнено нажатие на кнопку показать подходящие$")
    public void showList(){ filterSteps.showList(); }

    @Когда("^выполнено нажатие на кнопку показать по 12, если существует кнопка и проверяем кол-во элментов$")
    public void searchButton12(){reportSteps.searchButton12();}

    @Когда("^проверяем есть ли элемент в результате поиска$")
    public void check (){ reportSteps.check();
    }
}
