package starter.JSONplaceholder;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class newUserFlowSteps {

    @Steps
    placeholderAPI placeholderAPI;

    @When("user creates an account")
    public void createNewUserAccountAndVerify(){
        placeholderAPI.postNewUser();
    }

    @When("user creates a post")
    public void createNewPost(){placeholderAPI.postNewPost();}

    @When("user comments on their new post")
    public void commentOnPost(){ placeholderAPI.addComment();}

    @When("user posts an album")
    public void crateAnAlbum(){ placeholderAPI.createAlbum();}

    @When("user uploads a picture")
    public void uploadPhototoAlbum(){ placeholderAPI.uploadPhoto();}

    @When("updates their post")
    public void updateUserPost(){ placeholderAPI.updatePost();}

    @Then("user has created their account")
    public void checkAccountDetails(){ placeholderAPI.getAccount();}

    @Then("user has uploaded a picture")
    public void checkPhotoDetails(){ placeholderAPI.getUserPhoto();}

    @Then("user has deleted their account")
    public void deleteUserAccount(){ placeholderAPI.deleteAccount();}
}
