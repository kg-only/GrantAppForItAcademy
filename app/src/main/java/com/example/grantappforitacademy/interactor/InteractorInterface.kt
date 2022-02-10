package com.example.grantappforitacademy.interactor

import com.example.grantappforitacademy.responsemodel.*

interface InteractorInterface {
    //blogpost
    suspend fun getBlogpost(): List<BlogPost>
    suspend fun getBlogpostComment(): List<BlogComment>
    suspend fun postBlogCreateComment(blogCreateComment: BlogCreateComment)
    suspend fun getBlogpostDetail(id: Int): List<BlogPost>

    //businessAdverts
    suspend fun getBusinessAdverts(): List<BusinessAdvert>
    suspend fun postBusinessAdverts(businessAdvertPost: BusinessAdvertPost)
    suspend fun getBusinessAdvertsComments(): List<BusinessAdvertComment>
    suspend fun postBusinessAdvertsCreateComment(businessAdvertCommentPost: BusinessAdvertCommentPost)
    suspend fun getBusinessAdvertsDetail(id: Int): List<BusinessAdvert>
    suspend fun putBusinessAdvertsUpdate(id: Int, businessAdvertPost: BusinessAdvertPost)
    suspend fun patchBusinessAdvertsUpdate(id: Int, businessAdvertPost: BusinessAdvertPost)

    //categories
    suspend fun getCategories(): List<AdvertCategory>

    //change_password
    suspend fun putChangePassword(changePassword: ChangePassword)
    suspend fun patchChangePassword(changePassword: ChangePassword)

    //event
    suspend fun getEvent(): List<Event>
    suspend fun getEventComment(): List<EventComment>
    suspend fun postEventCreateComment(eventCommentPost: EventCommentPost)
    suspend fun getEventDetail(id: Int): List<Event>

    //facebook
    suspend fun postFacebook(facebookSocialAuth: FacebookSocialAuth)

    //google
    suspend fun postGoogle(googleSocialAuth: GoogleSocialAuth)

    //grant
    suspend fun getGrant(): List<Grant>
    suspend fun getGrantComments(): List<GrantComment>
    suspend fun postGrantComments(grantComment: GrantComment)
    suspend fun getGrantDetail(id: Int): List<Grant>
    //invests

    //knowledge

    //links
    suspend fun getLinks(): List<Links>

    //login
    suspend fun postLogin(login: Login)
    suspend fun postLoginRefresh(loginRefresh: LoginRefresh)

    //logout
    suspend fun postLogout()

    //method
    suspend fun getMethod(): List<Method>

    //newsletter_list
    suspend fun getNewsletterList(): List<Contacts>

    //password_reset
    suspend fun postPasswordReset(email: Email)
    suspend fun postPasswordResetConfirm(passwordToken: PasswordToken)
    suspend fun postPasswordResetValidateToken(resetToken: ResetToken)
    //poll????

    //provider adverts
    suspend fun getProviderAdverts(): List<ProviderAdvert>
    suspend fun postProviderAdverts(providerAdvert: ProviderAdvert)
    suspend fun getProviderAdvertsComment(): List<ProviderAdvertComment>
    suspend fun postProviderAdvertsCommentCreate(providerAdvertComment: ProviderAdvertComment)
    suspend fun getProviderAdvertsDetail(id: Int): List<ProviderAdvert>
    suspend fun putProviderAdvertsUpdate(id: Int, providerAdvert: ProviderAdvert)
    suspend fun patchProviderAdvertsUpdate(id: Int, providerAdvert: ProviderAdvert)

    //questions and answers
    suspend fun getQuestionAndAnswers(): List<QuestionsAndAnswers>
    suspend fun postQuestionAndAnswers(questionsAndAnswers: QuestionsAndAnswers)
    suspend fun postQuestionAndAnswersCreate(questionsAndAnswers: QuestionsAndAnswers)

    //sector
    suspend fun getSector(): List<Sector>

    //skill
    suspend fun getSkill(): List<Skill>

    //subscribe
    suspend fun postSubscribe(contacts: Contacts)

    // UNsubscribe
    suspend fun deleteSubscribe(email: String)

    //users
    suspend fun getUsersBusiness(): List<UserBusinessProfile>
    suspend fun getUsersBusinessDetail(id: Int): List<UserBusinessProfile>
    suspend fun putUsersBusinessUpdate(id: Int, updateUser: UpdateUser)
    suspend fun patchUsersBusinessUpdate(id: Int, updateUser: UpdateUser)
    suspend fun getUsersProvider(): List<UserProviderProfile>
    suspend fun getUsersProviderDetail(id: Int): List<UserProviderProfile>
    suspend fun putUsersProviderDetail(id: Int, updateUser: UpdateUser)
    suspend fun patchUsersProviderDetail(id: Int, updateUser: UpdateUser)
    suspend fun postUsersRegisterBusiness(userBusinessProfile: UserBusinessProfile)
    suspend fun postUsersRegisterProvider(userProviderProfile: UserProviderProfile)

    //write us
    suspend fun getWriteUs(): List<WriteUs>
    suspend fun postWriteUs(writeUs: WriteUs)
    suspend fun postWriteUsCreateMessage(writeUs: WriteUs)
}