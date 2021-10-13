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
  name: "BackEndStack",
  data() {
    return {
      names: [
        "Python",
        "FastAPI",
        "Django",
        "SQLAlchemy",
        "Uvicorn",
        "Java",
        "Spring MVC",
        "Spring Boot",
        "Spring JDBC",
        "Spring JPA",
        "Node.js",
        "Nest.js",
        "Express.js",
        "GraphQL",
        "MySQL",
        "PostgreSQL",
        "Firebase RDBMS",
      ],
      ratings: [4, 3.5, 3, 3, 2, 3, 3, 2.5, 2.5, 2, 2.5, 1.5, 2, 2, 3.5, 3, 2],
      imgs: [
        "python.jpg",
        "fastapi.jpg",
        "django.jpg",
        "sqlalchemy.jpg",
        "uvicorn.png",
        "java.jpg",
        "springmvc.jpg",
        "springboot.jpg",
        "springjdbc.jpg",
        "jpa.jpg",
        "nodejs.jpg",
        "nestjs.svg",
        "expressjs.png",
        "graphql.png",
        "mysql.jpg",
        "postgresql.png",
        "firebaserdbms.jpg",
      ],
    };
  },
  components: {
    StackDetail,
  },
};
</script>

<style scoped></style>
