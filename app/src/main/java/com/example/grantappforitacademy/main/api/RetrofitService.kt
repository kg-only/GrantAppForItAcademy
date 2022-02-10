package com.example.grantappforitacademy.main.api

import com.example.grantappforitacademy.responsemodel.*
import retrofit2.http.*

interface RetrofitService {
    ///blogpost
    @GET("blogposts")
    suspend fun getBlogpost(): List<BlogPost>

    @GET("blogposts/comments")
    suspend fun getBlogpostComments(): List<BlogComment>

    @POST("blogposts/comments/create_comment")
    suspend fun postBlogPostCreateComment(@Body blogCreateComment: BlogCreateComment)

    @GET("blogposts/detail/{id}")
    suspend fun getBlogpostDetail(@Path("id") id: Int): List<BlogPost>

    ////businessAdvert
    @GET("businessadverts")
    suspend fun getBusinessAdverts(): List<BusinessAdvert>

    @POST("businessadverts")
    suspend fun postBusinessAdverts(@Body businessAdvertPost: BusinessAdvertPost)

    @GET("businessadverts/comments")
    suspend fun getBusinessAdvertsComments(): List<BusinessAdvertComment>

    @POST("businessadverts/comments/create_comment")
    suspend fun postBusinessAdvertsCreateComment(@Body businessAdvertCommentPost: BusinessAdvertCommentPost)

    @GET("businessadverts/detail/{id}")
    suspend fun getBusinessAdvertsDetail(@Path("id") id: Int): List<BusinessAdvert>

    @PUT("businessadverts/update/{id}")
    suspend fun putBusinessAdvertsUpdate(
        @Path("id") id: Int,
        @Body businessAdvertPost: BusinessAdvertPost,
    )

    @PATCH("businessadverts/update/{id}")
    suspend fun patchBusinessAdvertsUpdate(
        @Path("id") id: Int,
        @Body businessAdvertPost: BusinessAdvertPost,
    )

    //categories
    @GET("categories")
    suspend fun getCategories(): List<AdvertCategory>

    //change_password
    @PUT("change-password")
    suspend fun putChangePassword(@Body changePassword: ChangePassword)

    @PATCH("change-password")
    suspend fun patchChangePassword(@Body changePassword: ChangePassword)

    //events
    @GET("events")
    suspend fun getEvent(): List<Event>

    @POST("events/comments/create_comment")
    suspend fun postEventCreateComment(@Body eventCommentPost: EventCommentPost)

    @GET("events/comments")
    suspend fun getEventComment(): List<EventComment>

    @GET("events/detail/{id}")
    suspend fun getEventDetail(@Path("id") id: Int): List<Event>

    //facebook
    @POST("facebook")
    suspend fun postFacebook(@Body facebookSocialAuth: FacebookSocialAuth)

    //google
    @POST("google")
    suspend fun postGoogle(@Body googleSocialAuth: GoogleSocialAuth)

    //grants
    @GET("grants")
    suspend fun getGrant(): List<Grant>

    @GET("grants")
    suspend fun getGrantComments(): List<GrantComment>

    @POST("grants")
    suspend fun postGrantComments(grantComment: GrantComment)

    @GET("grants/detail/{id}")
    suspend fun getGrantDetail(@Path("id") id: Int): List<Grant>

    //invests

    //knowledge

    //links
    @GET("links")
    suspend fun getLinks(): List<Links>

    //login
    @POST("login")
    suspend fun postLogin(@Body login: Login)

    @POST("login/refresh")
    suspend fun postLoginRefresh(@Body loginRefresh: LoginRefresh)

    //logout
    @POST("logout")
    suspend fun postLogout()

    //method
    @GET("method")
    suspend fun getMethod(): List<Method>

    //newsletter_list
    @GET("newsletter_list/")
    suspend fun getNewsletterList(): List<Contacts>

    //password_reset
    @POST("password_reset/")
    suspend fun postPasswordReset(@Body email: Email)

    @POST("/password_reset/confirm")
    suspend fun postPasswordResetConfirm(@Body passwordToken: PasswordToken)

    @POST("password_reset/validate_token/")
    suspend fun postPasswordResetValidateToken(@Body resetToken: ResetToken)

    //poll????

    //provider adverts
    @GET("provideradverts")
    suspend fun getProviderAdverts(): List<ProviderAdvert>

    @POST("provideradverts")
    suspend fun postProviderAdverts(@Body providerAdvert: ProviderAdvert)

    @GET("provideradverts/comments")
    suspend fun getProviderAdvertsComment(): List<ProviderAdvertComment>

    @POST("provideradverts/comments/create_comment")
    suspend fun postProviderAdvertsCommentCreate(@Body providerAdvertComment: ProviderAdvertComment)

    @GET("/provideradverts/detail/{id}")
    suspend fun getProviderAdvertsDetail(@Path("id") id: Int): List<ProviderAdvert>

    @PUT("/provideradverts/update/{id}")
    suspend fun putProviderAdvertsUpdate(
        @Path("id") id: Int,
        @Body providerAdvert: ProviderAdvert,
    )

    @PATCH("/provideradverts/update/{id}")
    suspend fun patchProviderAdvertsUpdate(
        @Path("id") id: Int,
        @Body providerAdvert: ProviderAdvert,
    )

    //questions and answers
    @GET("questions_and_answers")
    suspend fun getQuestionAndAnswers(): List<QuestionsAndAnswers>

    @POST("questions_and_answers")
    suspend fun postQuestionAndAnswers(@Body questionsAndAnswers: QuestionsAndAnswers)

    @POST("questions_and_answers/create")
    suspend fun postQuestionAndAnswersCreate(@Body questionsAndAnswers: QuestionsAndAnswers)

    //sector
    @GET("sector")
    suspend fun getSector(): List<Sector>

    //skill
    @GET("skill")
    suspend fun getSkill(): List<Skill>

    //subscribe
    @POST("subscribe/")
    suspend fun postSubscribe(@Body contacts: Contacts)

    // UNsubscribe
    @DELETE("/unsubscribe/{email}")
    suspend fun deleteSubscribe(@Path("email") email: String)

    //users
    @GET("users/business")
    suspend fun getUsersBusiness(): List<UserBusinessProfile>

    @GET("users/business/detail/{id}")
    suspend fun getUsersBusinessDetail(@Path("id") id: Int): List<UserBusinessProfile>

    @PUT("users/business/update/{id}")
    suspend fun putUsersBusinessUpdate(@Path("id") id: Int, @Body updateUser: UpdateUser)

    @PATCH("users/business/update/{id}")
    suspend fun patchUsersBusinessUpdate(@Path("id") id: Int, @Body updateUser: UpdateUser)

    @GET("users/provider")
    suspend fun getUsersProvider(): List<UserProviderProfile>

    @GET("users/provider/detail/{id}")
    suspend fun getUsersProviderDetail(@Path("id") id: Int): List<UserProviderProfile>

    @PUT("users/provider/update/{id}")
    suspend fun putUsersProviderDetail(@Path("id") id: Int, @Body updateUser: UpdateUser)

    @PATCH("users/provider/update/{id}")
    suspend fun patchUsersProviderDetail(@Path("id") id: Int, @Body updateUser: UpdateUser)

    @POST("users/register/business")
    suspend fun postUsersRegisterBusiness(@Body userBusinessProfile: UserBusinessProfile)

    @POST("users/register/provider")
    suspend fun postUsersRegisterProvider(@Body userProviderProfile: UserProviderProfile)

    //write us
    @GET("write_us")
    suspend fun getWriteUs(): List<WriteUs>

    @POST("write_us")
    suspend fun postWriteUs(@Body writeUs: WriteUs)

    @POST("write_us/create_message")
    suspend fun postWriteUsCreateMessage(@Body writeUs: WriteUs)


}