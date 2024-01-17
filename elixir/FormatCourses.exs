defmodule CourseFormatter do
  def format_course(course) do
    %{
      client: Map.get(course, "client"),
      id: Map.get(course, "course_id"),
      course: %{name: Map.get(course, "course_name")},
      environment: %{name: Map.get(course, "environment_name")},
      enrolled: Map.get(course, "enrolled"),
      accessed: Map.get(course, "accessed"),
      not_accessed: Map.get(course, "notAccessed"),
      percent_accessed: Map.get(course, "percentAccessed"),
      percent_not_accessed: Map.get(course, "percentNotAccessed")
    }
  end

  def format_courses(courses, page_params) do
    formatted_courses = Enum.map(courses, &format_course/1)
    %{
      courses: formatted_courses,
      item_count: length(formatted_courses),
      total_count: length(formatted_courses),
      page_params: page_params
    }
  end
end