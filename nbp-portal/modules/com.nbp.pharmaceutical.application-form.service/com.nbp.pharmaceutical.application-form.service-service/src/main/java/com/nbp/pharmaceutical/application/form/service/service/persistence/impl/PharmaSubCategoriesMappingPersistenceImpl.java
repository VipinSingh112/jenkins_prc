/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaSubCategoriesMappingException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaSubCategoriesMapping;
import com.nbp.pharmaceutical.application.form.service.model.PharmaSubCategoriesMappingTable;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaSubCategoriesMappingImpl;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaSubCategoriesMappingModelImpl;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaSubCategoriesMappingPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaSubCategoriesMappingUtil;
import com.nbp.pharmaceutical.application.form.service.service.persistence.impl.constants.PHARMACEUTICALPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the pharma sub categories mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PharmaSubCategoriesMappingPersistence.class)
public class PharmaSubCategoriesMappingPersistenceImpl
	extends BasePersistenceImpl<PharmaSubCategoriesMapping>
	implements PharmaSubCategoriesMappingPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaSubCategoriesMappingUtil</code> to access the pharma sub categories mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaSubCategoriesMappingImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetPharmSubCategory;
	private FinderPath _finderPathWithoutPaginationFindBygetPharmSubCategory;
	private FinderPath _finderPathCountBygetPharmSubCategory;

	/**
	 * Returns all the pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @return the matching pharma sub categories mappings
	 */
	@Override
	public List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory) {

		return findBygetPharmSubCategory(
			pharmaSubCategory, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @return the range of matching pharma sub categories mappings
	 */
	@Override
	public List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory, int start, int end) {

		return findBygetPharmSubCategory(pharmaSubCategory, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma sub categories mappings
	 */
	@Override
	public List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory, int start, int end,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator) {

		return findBygetPharmSubCategory(
			pharmaSubCategory, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma sub categories mappings
	 */
	@Override
	public List<PharmaSubCategoriesMapping> findBygetPharmSubCategory(
		String pharmaSubCategory, int start, int end,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator,
		boolean useFinderCache) {

		pharmaSubCategory = Objects.toString(pharmaSubCategory, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPharmSubCategory;
				finderArgs = new Object[] {pharmaSubCategory};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPharmSubCategory;
			finderArgs = new Object[] {
				pharmaSubCategory, start, end, orderByComparator
			};
		}

		List<PharmaSubCategoriesMapping> list = null;

		if (useFinderCache) {
			list = (List<PharmaSubCategoriesMapping>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaSubCategoriesMapping pharmaSubCategoriesMapping :
						list) {

					if (!pharmaSubCategory.equals(
							pharmaSubCategoriesMapping.
								getPharmaSubCategory())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PHARMASUBCATEGORIESMAPPING_WHERE);

			boolean bindPharmaSubCategory = false;

			if (pharmaSubCategory.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPHARMSUBCATEGORY_PHARMASUBCATEGORY_3);
			}
			else {
				bindPharmaSubCategory = true;

				sb.append(
					_FINDER_COLUMN_GETPHARMSUBCATEGORY_PHARMASUBCATEGORY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaSubCategoriesMappingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPharmaSubCategory) {
					queryPos.add(pharmaSubCategory);
				}

				list = (List<PharmaSubCategoriesMapping>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a matching pharma sub categories mapping could not be found
	 */
	@Override
	public PharmaSubCategoriesMapping findBygetPharmSubCategory_First(
			String pharmaSubCategory,
			OrderByComparator<PharmaSubCategoriesMapping> orderByComparator)
		throws NoSuchPharmaSubCategoriesMappingException {

		PharmaSubCategoriesMapping pharmaSubCategoriesMapping =
			fetchBygetPharmSubCategory_First(
				pharmaSubCategory, orderByComparator);

		if (pharmaSubCategoriesMapping != null) {
			return pharmaSubCategoriesMapping;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaSubCategory=");
		sb.append(pharmaSubCategory);

		sb.append("}");

		throw new NoSuchPharmaSubCategoriesMappingException(sb.toString());
	}

	/**
	 * Returns the first pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma sub categories mapping, or <code>null</code> if a matching pharma sub categories mapping could not be found
	 */
	@Override
	public PharmaSubCategoriesMapping fetchBygetPharmSubCategory_First(
		String pharmaSubCategory,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator) {

		List<PharmaSubCategoriesMapping> list = findBygetPharmSubCategory(
			pharmaSubCategory, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a matching pharma sub categories mapping could not be found
	 */
	@Override
	public PharmaSubCategoriesMapping findBygetPharmSubCategory_Last(
			String pharmaSubCategory,
			OrderByComparator<PharmaSubCategoriesMapping> orderByComparator)
		throws NoSuchPharmaSubCategoriesMappingException {

		PharmaSubCategoriesMapping pharmaSubCategoriesMapping =
			fetchBygetPharmSubCategory_Last(
				pharmaSubCategory, orderByComparator);

		if (pharmaSubCategoriesMapping != null) {
			return pharmaSubCategoriesMapping;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaSubCategory=");
		sb.append(pharmaSubCategory);

		sb.append("}");

		throw new NoSuchPharmaSubCategoriesMappingException(sb.toString());
	}

	/**
	 * Returns the last pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma sub categories mapping, or <code>null</code> if a matching pharma sub categories mapping could not be found
	 */
	@Override
	public PharmaSubCategoriesMapping fetchBygetPharmSubCategory_Last(
		String pharmaSubCategory,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator) {

		int count = countBygetPharmSubCategory(pharmaSubCategory);

		if (count == 0) {
			return null;
		}

		List<PharmaSubCategoriesMapping> list = findBygetPharmSubCategory(
			pharmaSubCategory, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma sub categories mappings before and after the current pharma sub categories mapping in the ordered set where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the current pharma sub categories mapping
	 * @param pharmaSubCategory the pharma sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a pharma sub categories mapping with the primary key could not be found
	 */
	@Override
	public PharmaSubCategoriesMapping[] findBygetPharmSubCategory_PrevAndNext(
			long pharmaSubCategoriesMappingId, String pharmaSubCategory,
			OrderByComparator<PharmaSubCategoriesMapping> orderByComparator)
		throws NoSuchPharmaSubCategoriesMappingException {

		pharmaSubCategory = Objects.toString(pharmaSubCategory, "");

		PharmaSubCategoriesMapping pharmaSubCategoriesMapping =
			findByPrimaryKey(pharmaSubCategoriesMappingId);

		Session session = null;

		try {
			session = openSession();

			PharmaSubCategoriesMapping[] array =
				new PharmaSubCategoriesMappingImpl[3];

			array[0] = getBygetPharmSubCategory_PrevAndNext(
				session, pharmaSubCategoriesMapping, pharmaSubCategory,
				orderByComparator, true);

			array[1] = pharmaSubCategoriesMapping;

			array[2] = getBygetPharmSubCategory_PrevAndNext(
				session, pharmaSubCategoriesMapping, pharmaSubCategory,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PharmaSubCategoriesMapping getBygetPharmSubCategory_PrevAndNext(
		Session session, PharmaSubCategoriesMapping pharmaSubCategoriesMapping,
		String pharmaSubCategory,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PHARMASUBCATEGORIESMAPPING_WHERE);

		boolean bindPharmaSubCategory = false;

		if (pharmaSubCategory.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPHARMSUBCATEGORY_PHARMASUBCATEGORY_3);
		}
		else {
			bindPharmaSubCategory = true;

			sb.append(_FINDER_COLUMN_GETPHARMSUBCATEGORY_PHARMASUBCATEGORY_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PharmaSubCategoriesMappingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindPharmaSubCategory) {
			queryPos.add(pharmaSubCategory);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						pharmaSubCategoriesMapping)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaSubCategoriesMapping> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma sub categories mappings where pharmaSubCategory = &#63; from the database.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 */
	@Override
	public void removeBygetPharmSubCategory(String pharmaSubCategory) {
		for (PharmaSubCategoriesMapping pharmaSubCategoriesMapping :
				findBygetPharmSubCategory(
					pharmaSubCategory, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(pharmaSubCategoriesMapping);
		}
	}

	/**
	 * Returns the number of pharma sub categories mappings where pharmaSubCategory = &#63;.
	 *
	 * @param pharmaSubCategory the pharma sub category
	 * @return the number of matching pharma sub categories mappings
	 */
	@Override
	public int countBygetPharmSubCategory(String pharmaSubCategory) {
		pharmaSubCategory = Objects.toString(pharmaSubCategory, "");

		FinderPath finderPath = _finderPathCountBygetPharmSubCategory;

		Object[] finderArgs = new Object[] {pharmaSubCategory};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMASUBCATEGORIESMAPPING_WHERE);

			boolean bindPharmaSubCategory = false;

			if (pharmaSubCategory.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPHARMSUBCATEGORY_PHARMASUBCATEGORY_3);
			}
			else {
				bindPharmaSubCategory = true;

				sb.append(
					_FINDER_COLUMN_GETPHARMSUBCATEGORY_PHARMASUBCATEGORY_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPharmaSubCategory) {
					queryPos.add(pharmaSubCategory);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETPHARMSUBCATEGORY_PHARMASUBCATEGORY_2 =
			"pharmaSubCategoriesMapping.pharmaSubCategory = ?";

	private static final String
		_FINDER_COLUMN_GETPHARMSUBCATEGORY_PHARMASUBCATEGORY_3 =
			"(pharmaSubCategoriesMapping.pharmaSubCategory IS NULL OR pharmaSubCategoriesMapping.pharmaSubCategory = '')";

	public PharmaSubCategoriesMappingPersistenceImpl() {
		setModelClass(PharmaSubCategoriesMapping.class);

		setModelImplClass(PharmaSubCategoriesMappingImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaSubCategoriesMappingTable.INSTANCE);
	}

	/**
	 * Caches the pharma sub categories mapping in the entity cache if it is enabled.
	 *
	 * @param pharmaSubCategoriesMapping the pharma sub categories mapping
	 */
	@Override
	public void cacheResult(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		entityCache.putResult(
			PharmaSubCategoriesMappingImpl.class,
			pharmaSubCategoriesMapping.getPrimaryKey(),
			pharmaSubCategoriesMapping);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma sub categories mappings in the entity cache if it is enabled.
	 *
	 * @param pharmaSubCategoriesMappings the pharma sub categories mappings
	 */
	@Override
	public void cacheResult(
		List<PharmaSubCategoriesMapping> pharmaSubCategoriesMappings) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaSubCategoriesMappings.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaSubCategoriesMapping pharmaSubCategoriesMapping :
				pharmaSubCategoriesMappings) {

			if (entityCache.getResult(
					PharmaSubCategoriesMappingImpl.class,
					pharmaSubCategoriesMapping.getPrimaryKey()) == null) {

				cacheResult(pharmaSubCategoriesMapping);
			}
		}
	}

	/**
	 * Clears the cache for all pharma sub categories mappings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaSubCategoriesMappingImpl.class);

		finderCache.clearCache(PharmaSubCategoriesMappingImpl.class);
	}

	/**
	 * Clears the cache for the pharma sub categories mapping.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		entityCache.removeResult(
			PharmaSubCategoriesMappingImpl.class, pharmaSubCategoriesMapping);
	}

	@Override
	public void clearCache(
		List<PharmaSubCategoriesMapping> pharmaSubCategoriesMappings) {

		for (PharmaSubCategoriesMapping pharmaSubCategoriesMapping :
				pharmaSubCategoriesMappings) {

			entityCache.removeResult(
				PharmaSubCategoriesMappingImpl.class,
				pharmaSubCategoriesMapping);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaSubCategoriesMappingImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PharmaSubCategoriesMappingImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new pharma sub categories mapping with the primary key. Does not add the pharma sub categories mapping to the database.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key for the new pharma sub categories mapping
	 * @return the new pharma sub categories mapping
	 */
	@Override
	public PharmaSubCategoriesMapping create(
		long pharmaSubCategoriesMappingId) {

		PharmaSubCategoriesMapping pharmaSubCategoriesMapping =
			new PharmaSubCategoriesMappingImpl();

		pharmaSubCategoriesMapping.setNew(true);
		pharmaSubCategoriesMapping.setPrimaryKey(pharmaSubCategoriesMappingId);

		return pharmaSubCategoriesMapping;
	}

	/**
	 * Removes the pharma sub categories mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping that was removed
	 * @throws NoSuchPharmaSubCategoriesMappingException if a pharma sub categories mapping with the primary key could not be found
	 */
	@Override
	public PharmaSubCategoriesMapping remove(long pharmaSubCategoriesMappingId)
		throws NoSuchPharmaSubCategoriesMappingException {

		return remove((Serializable)pharmaSubCategoriesMappingId);
	}

	/**
	 * Removes the pharma sub categories mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping that was removed
	 * @throws NoSuchPharmaSubCategoriesMappingException if a pharma sub categories mapping with the primary key could not be found
	 */
	@Override
	public PharmaSubCategoriesMapping remove(Serializable primaryKey)
		throws NoSuchPharmaSubCategoriesMappingException {

		Session session = null;

		try {
			session = openSession();

			PharmaSubCategoriesMapping pharmaSubCategoriesMapping =
				(PharmaSubCategoriesMapping)session.get(
					PharmaSubCategoriesMappingImpl.class, primaryKey);

			if (pharmaSubCategoriesMapping == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaSubCategoriesMappingException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaSubCategoriesMapping);
		}
		catch (NoSuchPharmaSubCategoriesMappingException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected PharmaSubCategoriesMapping removeImpl(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaSubCategoriesMapping)) {
				pharmaSubCategoriesMapping =
					(PharmaSubCategoriesMapping)session.get(
						PharmaSubCategoriesMappingImpl.class,
						pharmaSubCategoriesMapping.getPrimaryKeyObj());
			}

			if (pharmaSubCategoriesMapping != null) {
				session.delete(pharmaSubCategoriesMapping);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaSubCategoriesMapping != null) {
			clearCache(pharmaSubCategoriesMapping);
		}

		return pharmaSubCategoriesMapping;
	}

	@Override
	public PharmaSubCategoriesMapping updateImpl(
		PharmaSubCategoriesMapping pharmaSubCategoriesMapping) {

		boolean isNew = pharmaSubCategoriesMapping.isNew();

		if (!(pharmaSubCategoriesMapping instanceof
				PharmaSubCategoriesMappingModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaSubCategoriesMapping.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaSubCategoriesMapping);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaSubCategoriesMapping proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaSubCategoriesMapping implementation " +
					pharmaSubCategoriesMapping.getClass());
		}

		PharmaSubCategoriesMappingModelImpl
			pharmaSubCategoriesMappingModelImpl =
				(PharmaSubCategoriesMappingModelImpl)pharmaSubCategoriesMapping;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaSubCategoriesMapping);
			}
			else {
				pharmaSubCategoriesMapping =
					(PharmaSubCategoriesMapping)session.merge(
						pharmaSubCategoriesMapping);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaSubCategoriesMappingImpl.class,
			pharmaSubCategoriesMappingModelImpl, false, true);

		if (isNew) {
			pharmaSubCategoriesMapping.setNew(false);
		}

		pharmaSubCategoriesMapping.resetOriginalValues();

		return pharmaSubCategoriesMapping;
	}

	/**
	 * Returns the pharma sub categories mapping with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a pharma sub categories mapping with the primary key could not be found
	 */
	@Override
	public PharmaSubCategoriesMapping findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaSubCategoriesMappingException {

		PharmaSubCategoriesMapping pharmaSubCategoriesMapping =
			fetchByPrimaryKey(primaryKey);

		if (pharmaSubCategoriesMapping == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaSubCategoriesMappingException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaSubCategoriesMapping;
	}

	/**
	 * Returns the pharma sub categories mapping with the primary key or throws a <code>NoSuchPharmaSubCategoriesMappingException</code> if it could not be found.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping
	 * @throws NoSuchPharmaSubCategoriesMappingException if a pharma sub categories mapping with the primary key could not be found
	 */
	@Override
	public PharmaSubCategoriesMapping findByPrimaryKey(
			long pharmaSubCategoriesMappingId)
		throws NoSuchPharmaSubCategoriesMappingException {

		return findByPrimaryKey((Serializable)pharmaSubCategoriesMappingId);
	}

	/**
	 * Returns the pharma sub categories mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaSubCategoriesMappingId the primary key of the pharma sub categories mapping
	 * @return the pharma sub categories mapping, or <code>null</code> if a pharma sub categories mapping with the primary key could not be found
	 */
	@Override
	public PharmaSubCategoriesMapping fetchByPrimaryKey(
		long pharmaSubCategoriesMappingId) {

		return fetchByPrimaryKey((Serializable)pharmaSubCategoriesMappingId);
	}

	/**
	 * Returns all the pharma sub categories mappings.
	 *
	 * @return the pharma sub categories mappings
	 */
	@Override
	public List<PharmaSubCategoriesMapping> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma sub categories mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @return the range of pharma sub categories mappings
	 */
	@Override
	public List<PharmaSubCategoriesMapping> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma sub categories mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma sub categories mappings
	 */
	@Override
	public List<PharmaSubCategoriesMapping> findAll(
		int start, int end,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma sub categories mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaSubCategoriesMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma sub categories mappings
	 * @param end the upper bound of the range of pharma sub categories mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma sub categories mappings
	 */
	@Override
	public List<PharmaSubCategoriesMapping> findAll(
		int start, int end,
		OrderByComparator<PharmaSubCategoriesMapping> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<PharmaSubCategoriesMapping> list = null;

		if (useFinderCache) {
			list = (List<PharmaSubCategoriesMapping>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMASUBCATEGORIESMAPPING);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMASUBCATEGORIESMAPPING;

				sql = sql.concat(
					PharmaSubCategoriesMappingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaSubCategoriesMapping>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the pharma sub categories mappings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaSubCategoriesMapping pharmaSubCategoriesMapping :
				findAll()) {

			remove(pharmaSubCategoriesMapping);
		}
	}

	/**
	 * Returns the number of pharma sub categories mappings.
	 *
	 * @return the number of pharma sub categories mappings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_PHARMASUBCATEGORIESMAPPING);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "pharmaSubCategoriesMappingId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMASUBCATEGORIESMAPPING;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaSubCategoriesMappingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma sub categories mapping persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindBygetPharmSubCategory = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetPharmSubCategory",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"pharmaSubCategory"}, true);

		_finderPathWithoutPaginationFindBygetPharmSubCategory = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetPharmSubCategory", new String[] {String.class.getName()},
			new String[] {"pharmaSubCategory"}, true);

		_finderPathCountBygetPharmSubCategory = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPharmSubCategory", new String[] {String.class.getName()},
			new String[] {"pharmaSubCategory"}, false);

		PharmaSubCategoriesMappingUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PharmaSubCategoriesMappingUtil.setPersistence(null);

		entityCache.removeCache(PharmaSubCategoriesMappingImpl.class.getName());
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PHARMASUBCATEGORIESMAPPING =
		"SELECT pharmaSubCategoriesMapping FROM PharmaSubCategoriesMapping pharmaSubCategoriesMapping";

	private static final String _SQL_SELECT_PHARMASUBCATEGORIESMAPPING_WHERE =
		"SELECT pharmaSubCategoriesMapping FROM PharmaSubCategoriesMapping pharmaSubCategoriesMapping WHERE ";

	private static final String _SQL_COUNT_PHARMASUBCATEGORIESMAPPING =
		"SELECT COUNT(pharmaSubCategoriesMapping) FROM PharmaSubCategoriesMapping pharmaSubCategoriesMapping";

	private static final String _SQL_COUNT_PHARMASUBCATEGORIESMAPPING_WHERE =
		"SELECT COUNT(pharmaSubCategoriesMapping) FROM PharmaSubCategoriesMapping pharmaSubCategoriesMapping WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pharmaSubCategoriesMapping.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaSubCategoriesMapping exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaSubCategoriesMapping exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaSubCategoriesMappingPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}