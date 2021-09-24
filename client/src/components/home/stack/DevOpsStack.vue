<template>
  <v-row>
    <StackDetail
      v-for="(name, idx) in names"
      :key="idx"
      :img="imgs[idx]"
      :name="name"
      :rating="ratings[idx]"
    />
  </v-row>
</template>

<script>
import StackDetail from "@/components/home/stack/StackDetail.vue";

export default {
  name: "DevOpsStack",
  data() {
    return {
      names: [
        "Docker",
        "Kubernetes",
        "Linux",
        "Jenkins",
        "Nginx",
        "AWS EC2",
        "GCP GKE",
      ],
      ratings: [3.5, 1.5, 3, 2.5, 2, 2, 1.5],
      imgs: [
        "docker.jpg",
        "kubernetes.svg",
        "linux.svg",
        "jenkins.jpg",
        "nginx.svg",
        "ec2.svg",
        "gke.jpg",
      ],
    };
  },
  components: {
    StackDetail,
  },
};
</script>

<style scoped></style>
