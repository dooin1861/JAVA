delete from dupes
where id not in (select min (id)
                    from dupes
                    group by name)