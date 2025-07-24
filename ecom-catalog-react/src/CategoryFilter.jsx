const CategoryFilter= ({categories,onselect})=>
{
    return(
    <>
    <select id="categoryselect" className="form-control" onChange={(e)=> onselect(e.target.value)}>
        <option value="">All categories</option>
        {categories.map(category=>(
            <option key={category.id} value={category.id}>{category.name}</option>
        ))}
    </select>
    </>
    )
}
export default CategoryFilter;