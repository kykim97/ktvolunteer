import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/volunteers/volunteerInfos',
      component: () => import('../components/ui/VolunteerInfoGrid.vue'),
    },
    {
      path: '/매칭시스템/matchingInfos',
      component: () => import('../components/ui/MatchingInfoGrid.vue'),
    },
    {
      path: '/volunteerings/volunteerings',
      component: () => import('../components/ui/VolunteeringGrid.vue'),
    },
    {
      path: '/수혜기관/associationInfos',
      component: () => import('../components/ui/AssociationInfoGrid.vue'),
    },
    {
      path: '/수혜기관/봉사활동정보',
      component: () => import('../components/ui/봉사활동정보Grid.vue'),
    },
    {
      path: '/communities/communities',
      component: () => import('../components/ui/CommunityGrid.vue'),
    },
    {
      path: '/mypages/myPages',
      component: () => import('../components/MyPageView.vue'),
    },
  ],
})

export default router;
