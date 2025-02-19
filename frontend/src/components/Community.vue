<template>
    <div>
        <Number label="CommunityId" v-model="value.communityId" :editMode="editMode"/>
        <String label="제목" v-model="value.title" :editMode="editMode"/>
        <String label="내용" v-model="value.content" :editMode="editMode"/>
        <File offline label="첨부파일" v-model="value.addedFile" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'Community',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "communities"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
