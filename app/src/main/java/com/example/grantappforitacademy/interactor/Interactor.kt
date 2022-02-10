package com.example.grantappforitacademy.interactor

import com.example.grantappforitacademy.main.api.RetrofitService
import com.example.grantappforitacademy.responsemodel.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Interactor(private val api: RetrofitService) : InteractorInterface {

    //blogpost
    override suspend fun getBlogpost(): List<BlogPost> =
        withContext(Dispatchers.IO) {
            return@withContext api.getBlogpost()
        }

    override suspend fun getBlogpostComment(): List<BlogComment> =
        withContext(Dispatchers.IO) {
            return@withContext api.getBlogpostComments()
        }

    override suspend fun postBlogCreateComment(blogCreateComment: BlogCreateComment) =
        withContext(Dispatchers.IO) {
            return@withContext api.postBlogPostCreateComment(blogCreateComment)
        }

    override suspend fun getBlogpostDetail(id: Int): List<BlogPost> =
        withContext(Dispatchers.IO) {
            return@withContext api.getBlogpostDetail(id)
        }

    //businessAdvert
    override suspend fun getBusinessAdverts(): List<BusinessAdvert> =
        withContext(Dispatchers.IO) {
            return@withContext api.getBusinessAdverts()
        }

    override suspend fun postBusinessAdverts(businessAdvertPost: BusinessAdvertPost) =
        withContext(Dispatchers.IO) {
            return@withContext api.postBusinessAdverts(businessAdvertPost)
        }

    override suspend fun getBusinessAdvertsComments(): List<BusinessAdvertComment> =
        withContext(Dispatchers.IO) {
            return@withContext api.getBusinessAdvertsComments()
        }

    override suspend fun postBusinessAdvertsCreateComment(businessAdvertCommentPost: BusinessAdvertCommentPost) =
        withContext(Dispatchers.IO) {
            return@withContext api.postBusinessAdvertsCreateComment(businessAdvertCommentPost)
        }

    override suspend fun getBusinessAdvertsDetail(id: Int): List<BusinessAdvert> =
        withContext(Dispatchers.IO) {
            return@withContext api.getBusinessAdvertsDetail(id)
        }

    override suspend fun putBusinessAdvertsUpdate(id: Int, businessAdvertPost: BusinessAdvertPost) =
        withContext(Dispatchers.IO) {
            return@withContext api.putBusinessAdvertsUpdate(id, businessAdvertPost)
        }

    override suspend fun patchBusinessAdvertsUpdate(
        id: Int,
        businessAdvertPost: BusinessAdvertPost,
    ) =
        withContext(Dispatchers.IO) {
            return@withContext api.patchBusinessAdvertsUpdate(id, businessAdvertPost)
        }

    //categories
    override suspend fun getCategories(): List<AdvertCategory> =
        withContext(Dispatchers.IO) {
            return@withContext api.getCategories()
        }

    override suspend fun putChangePassword(changePassword: ChangePassword) =
        withContext(Dispatchers.IO) {
            return@withContext api.putChangePassword(changePassword)
        }

    override suspend fun patchChangePassword(changePassword: ChangePassword) =
        withContext(Dispatchers.IO) {
            return@withContext api.patchChangePassword(changePassword)
        }

    //events
    override suspend fun getEvent(): List<Event> =
        withContext(Dispatchers.IO) {
            return@withContext api.getEvent()
        }

    override suspend fun getEventComment(): List<EventComment> =
        withContext(Dispatchers.IO) {
            return@withContext api.getEventComment()
        }

    override suspend fun postEventCreateComment(eventCommentPost: EventCommentPost) =
        withContext(Dispatchers.IO) {
            return@withContext api.postEventCreateComment(eventCommentPost)
        }

    override suspend fun getEventDetail(id: Int): List<Event> =
        withContext(Dispatchers.IO) {
            return@withContext api.getEventDetail(id)
        }

    //facebook
    override suspend fun postFacebook(facebookSocialAuth: FacebookSocialAuth) =
        withContext(Dispatchers.IO) {
            return@withContext api.postFacebook(facebookSocialAuth)
        }

    //google
    override suspend fun postGoogle(googleSocialAuth: GoogleSocialAuth) =
        withContext(Dispatchers.IO) {
            return@withContext api.postGoogle(googleSocialAuth)
        }

    //grant
    override suspend fun getGrant(): List<Grant> =
        withContext(Dispatchers.IO) {
            return@withContext api.getGrant()
        }

    override suspend fun getGrantComments(): List<GrantComment> =
        withContext(Dispatchers.IO) {
            return@withContext api.getGrantComments()
        }

    override suspend fun postGrantComments(grantComment: GrantComment) =
        withContext(Dispatchers.IO) {
            return@withContext api.postGrantComments(grantComment)
        }

    override suspend fun getGrantDetail(id: Int): List<Grant> =
        withContext(Dispatchers.IO) {
            return@withContext api.getGrantDetail(id)
        }

    //links
    override suspend fun getLinks(): List<Links> =
        withContext(Dispatchers.IO) {
            return@withContext api.getLinks()
        }

    //login
    override suspend fun postLogin(login: Login) =
        withContext(Dispatchers.IO) {
            return@withContext api.postLogin(login)
        }

    override suspend fun postLoginRefresh(loginRefresh: LoginRefresh) =
        withContext(Dispatchers.IO) {
            return@withContext api.postLoginRefresh(loginRefresh)
        }

    //logout
    override suspend fun postLogout() =
        withContext(Dispatchers.IO) {
            return@withContext api.postLogout()
        }

    //method
    override suspend fun getMethod(): List<Method> =
        withContext(Dispatchers.IO) {
            return@withContext api.getMethod()
        }

    //newsletter_list
    override suspend fun getNewsletterList(): List<Contacts> =
        withContext(Dispatchers.IO) {
            return@withContext api.getNewsletterList()
        }

    //password reset
    override suspend fun postPasswordReset(email: Email) =
        withContext(Dispatchers.IO) {
            return@withContext api.postPasswordReset(email)
        }

    override suspend fun postPasswordResetConfirm(passwordToken: PasswordToken) =
        withContext(Dispatchers.IO) {
            return@withContext api.postPasswordResetConfirm(passwordToken)
        }

    override suspend fun postPasswordResetValidateToken(resetToken: ResetToken) =
        withContext(Dispatchers.IO) {
            return@withContext api.postPasswordResetValidateToken(resetToken)
        }

    //provider adverts
    override suspend fun getProviderAdverts(): List<ProviderAdvert> =
        withContext(Dispatchers.IO) {
            return@withContext api.getProviderAdverts()
        }

    override suspend fun postProviderAdverts(providerAdvert: ProviderAdvert) =
        withContext(Dispatchers.IO) {
            return@withContext api.postProviderAdverts(providerAdvert)
        }

    override suspend fun getProviderAdvertsComment(): List<ProviderAdvertComment> =
        withContext(Dispatchers.IO) {
            return@withContext api.getProviderAdvertsComment()
        }

    override suspend fun postProviderAdvertsCommentCreate(providerAdvertComment: ProviderAdvertComment) =
        withContext(Dispatchers.IO) {
            return@withContext api.postProviderAdvertsCommentCreate(providerAdvertComment)
        }

    override suspend fun getProviderAdvertsDetail(id: Int): List<ProviderAdvert> =
        withContext(Dispatchers.IO) {
            return@withContext api.getProviderAdvertsDetail(id)
        }

    override suspend fun putProviderAdvertsUpdate(id: Int, providerAdvert: ProviderAdvert) =
        withContext(Dispatchers.IO) {
            return@withContext api.putProviderAdvertsUpdate(id, providerAdvert)
        }

    override suspend fun patchProviderAdvertsUpdate(id: Int, providerAdvert: ProviderAdvert) =
        withContext(Dispatchers.IO) {
            return@withContext api.patchProviderAdvertsUpdate(id, providerAdvert)
        }

    //question and answers
    override suspend fun getQuestionAndAnswers(): List<QuestionsAndAnswers> =
        withContext(Dispatchers.IO) {
            return@withContext api.getQuestionAndAnswers()
        }

    override suspend fun postQuestionAndAnswers(questionsAndAnswers: QuestionsAndAnswers) =
        withContext(Dispatchers.IO) {
            return@withContext api.postQuestionAndAnswers(questionsAndAnswers)
        }

    override suspend fun postQuestionAndAnswersCreate(questionsAndAnswers: QuestionsAndAnswers) =
        withContext(Dispatchers.IO) {
            return@withContext api.postQuestionAndAnswersCreate(questionsAndAnswers)
        }

    //sector
    override suspend fun getSector(): List<Sector> =
        withContext(Dispatchers.IO) {
            return@withContext api.getSector()
        }

    //skill
    override suspend fun getSkill(): List<Skill> =
        withContext(Dispatchers.IO) {
            return@withContext api.getSkill()
        }


    //subscribe
    override suspend fun postSubscribe(contacts: Contacts) =
        withContext(Dispatchers.IO) {
            return@withContext api.postSubscribe(contacts)
        }

    // UNsubscribe
    override suspend fun deleteSubscribe(email: String) =
        withContext(Dispatchers.IO) {
            return@withContext api.deleteSubscribe(email)
        }

    //users
    override suspend fun getUsersBusiness(): List<UserBusinessProfile> =
        withContext(Dispatchers.IO) {
            return@withContext api.getUsersBusiness()
        }

    override suspend fun getUsersBusinessDetail(id: Int): List<UserBusinessProfile> =
        withContext(Dispatchers.IO) {
            return@withContext api.getUsersBusinessDetail(id)
        }

    override suspend fun putUsersBusinessUpdate(id: Int, updateUser: UpdateUser) =
        withContext(Dispatchers.IO) {
            return@withContext api.putUsersBusinessUpdate(id, updateUser)
        }

    override suspend fun patchUsersBusinessUpdate(id: Int, updateUser: UpdateUser) =
        withContext(Dispatchers.IO) {
            return@withContext api.patchUsersBusinessUpdate(id, updateUser)
        }

    override suspend fun getUsersProvider(): List<UserProviderProfile> =
        withContext(Dispatchers.IO) {
            return@withContext api.getUsersProvider()
        }

    override suspend fun getUsersProviderDetail(id: Int): List<UserProviderProfile> =
        withContext(Dispatchers.IO) {
            return@withContext api.getUsersProviderDetail(id)
        }

    override suspend fun putUsersProviderDetail(id: Int, updateUser: UpdateUser) =
        withContext(Dispatchers.IO) {
            return@withContext api.putUsersProviderDetail(id, updateUser)
        }

    override suspend fun patchUsersProviderDetail(id: Int, updateUser: UpdateUser) =
        withContext(Dispatchers.IO) {
            return@withContext api.patchUsersProviderDetail(id, updateUser)
        }

    override suspend fun postUsersRegisterBusiness(userBusinessProfile: UserBusinessProfile) =
        withContext(Dispatchers.IO) {
            return@withContext api.postUsersRegisterBusiness(userBusinessProfile)
        }

    override suspend fun postUsersRegisterProvider(userProviderProfile: UserProviderProfile) =
        withContext(Dispatchers.IO) {
            return@withContext api.postUsersRegisterProvider(userProviderProfile)
        }

    //write us
    override suspend fun getWriteUs(): List<WriteUs> =
        withContext(Dispatchers.IO) {
            return@withContext api.getWriteUs()
        }

    override suspend fun postWriteUs(writeUs: WriteUs) =
        withContext(Dispatchers.IO) {
            return@withContext api.postWriteUs(writeUs)
        }

    override suspend fun postWriteUsCreateMessage(writeUs: WriteUs) =
        withContext(Dispatchers.IO) {
            return@withContext api.postWriteUsCreateMessage(writeUs)
        }
}