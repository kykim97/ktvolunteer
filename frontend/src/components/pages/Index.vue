<template>
  <v-container fluid>
    <v-row>
      <v-card
          v-for="(card, index) in cards"
          :key="index"
          class="mx-auto"
          style="height:300px; width:300px; margin-bottom:20px;"
          outlined
      >
        <v-list-item>
          <v-icon style="margin-top: 30%; margin-left: 37.5%;" color="primary" size="64">mdi-apps</v-icon>
        </v-list-item>
        <v-card-actions>
          <v-btn
              class="mx-auto"
              outlined
              rounded
              :to="card.link"
              style="font-weight:500; font-size:20px; border:solid 2px; max-width:250px; overflow:hidden; margin-top: 10%;"
          >
              {{ card.text }}
          </v-btn>
        </v-card-actions>
      </v-card>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: 'Index',
  data: () => ({
    cards: [
      {
          text: "봉사자정보",
          link: "/volunteers/volunteerInfos",
      },
      {
          text: "매칭정보",
          link: "/매칭시스템/matchingInfos",
      },
      {
          text: "봉사활동",
          link: "/volunteerings/volunteerings",
      },
      {
          text: "봉사활동신청내역확인",
          link: "/volunteerings/checkVolunteeringApplicationHistories",
      },
      {
          text: "수혜기관정보",
          link: "/수혜기관/associationInfos",
      },
      {
          text: "봉사활동정보",
          link: "/수혜기관/봉사활동정보",
      },
      {
          text: "봉사활동일정조회",
          link: "/수혜기관/봉사활동일정조회",
      },
      {
          text: "커뮤니티",
          link: "/communities/communities",
      },
      {
          text: "마이페이지",
          link: "/mypages/myPages",
      },
    ],
  }),
};
</script>
