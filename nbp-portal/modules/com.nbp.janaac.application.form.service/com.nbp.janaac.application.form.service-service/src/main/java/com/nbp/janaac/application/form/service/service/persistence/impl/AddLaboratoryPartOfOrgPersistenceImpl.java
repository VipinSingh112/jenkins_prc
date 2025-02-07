/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLaboratoryPartOfOrgException;
import com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg;
import com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrgTable;
import com.nbp.janaac.application.form.service.model.impl.AddLaboratoryPartOfOrgImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLaboratoryPartOfOrgModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLaboratoryPartOfOrgPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLaboratoryPartOfOrgUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add laboratory part of org service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLaboratoryPartOfOrgPersistence.class)
public class AddLaboratoryPartOfOrgPersistenceImpl
	extends BasePersistenceImpl<AddLaboratoryPartOfOrg>
	implements AddLaboratoryPartOfOrgPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLaboratoryPartOfOrgUtil</code> to access the add laboratory part of org persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLaboratoryPartOfOrgImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacByAppId;
	private FinderPath _finderPathCountBygetJanaacByAppId;

	/**
	 * Returns all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add laboratory part of orgs
	 */
	@Override
	public List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId) {

		return findBygetJanaacByAppId(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @return the range of matching add laboratory part of orgs
	 */
	@Override
	public List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacByAppId(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add laboratory part of orgs
	 */
	@Override
	public List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator) {

		return findBygetJanaacByAppId(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add laboratory part of orgs
	 */
	@Override
	public List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacByAppId;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacByAppId;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddLaboratoryPartOfOrg> list = null;

		if (useFinderCache) {
			list = (List<AddLaboratoryPartOfOrg>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLaboratoryPartOfOrg addLaboratoryPartOfOrg : list) {
					if (janaacApplicationId !=
							addLaboratoryPartOfOrg.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABORATORYPARTOFORG_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYAPPID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLaboratoryPartOfOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLaboratoryPartOfOrg>)QueryUtil.list(
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
	 * Returns the first add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a matching add laboratory part of org could not be found
	 */
	@Override
	public AddLaboratoryPartOfOrg findBygetJanaacByAppId_First(
			long janaacApplicationId,
			OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator)
		throws NoSuchAddLaboratoryPartOfOrgException {

		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg =
			fetchBygetJanaacByAppId_First(
				janaacApplicationId, orderByComparator);

		if (addLaboratoryPartOfOrg != null) {
			return addLaboratoryPartOfOrg;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLaboratoryPartOfOrgException(sb.toString());
	}

	/**
	 * Returns the first add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add laboratory part of org, or <code>null</code> if a matching add laboratory part of org could not be found
	 */
	@Override
	public AddLaboratoryPartOfOrg fetchBygetJanaacByAppId_First(
		long janaacApplicationId,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator) {

		List<AddLaboratoryPartOfOrg> list = findBygetJanaacByAppId(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a matching add laboratory part of org could not be found
	 */
	@Override
	public AddLaboratoryPartOfOrg findBygetJanaacByAppId_Last(
			long janaacApplicationId,
			OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator)
		throws NoSuchAddLaboratoryPartOfOrgException {

		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg =
			fetchBygetJanaacByAppId_Last(
				janaacApplicationId, orderByComparator);

		if (addLaboratoryPartOfOrg != null) {
			return addLaboratoryPartOfOrg;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLaboratoryPartOfOrgException(sb.toString());
	}

	/**
	 * Returns the last add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add laboratory part of org, or <code>null</code> if a matching add laboratory part of org could not be found
	 */
	@Override
	public AddLaboratoryPartOfOrg fetchBygetJanaacByAppId_Last(
		long janaacApplicationId,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator) {

		int count = countBygetJanaacByAppId(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLaboratoryPartOfOrg> list = findBygetJanaacByAppId(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add laboratory part of orgs before and after the current add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the current add laboratory part of org
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a add laboratory part of org with the primary key could not be found
	 */
	@Override
	public AddLaboratoryPartOfOrg[] findBygetJanaacByAppId_PrevAndNext(
			long addLaboratoryPartOfOrgId, long janaacApplicationId,
			OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator)
		throws NoSuchAddLaboratoryPartOfOrgException {

		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg = findByPrimaryKey(
			addLaboratoryPartOfOrgId);

		Session session = null;

		try {
			session = openSession();

			AddLaboratoryPartOfOrg[] array = new AddLaboratoryPartOfOrgImpl[3];

			array[0] = getBygetJanaacByAppId_PrevAndNext(
				session, addLaboratoryPartOfOrg, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLaboratoryPartOfOrg;

			array[2] = getBygetJanaacByAppId_PrevAndNext(
				session, addLaboratoryPartOfOrg, janaacApplicationId,
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

	protected AddLaboratoryPartOfOrg getBygetJanaacByAppId_PrevAndNext(
		Session session, AddLaboratoryPartOfOrg addLaboratoryPartOfOrg,
		long janaacApplicationId,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABORATORYPARTOFORG_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYAPPID_JANAACAPPLICATIONID_2);

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
			sb.append(AddLaboratoryPartOfOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addLaboratoryPartOfOrg)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLaboratoryPartOfOrg> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add laboratory part of orgs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacByAppId(long janaacApplicationId) {
		for (AddLaboratoryPartOfOrg addLaboratoryPartOfOrg :
				findBygetJanaacByAppId(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLaboratoryPartOfOrg);
		}
	}

	/**
	 * Returns the number of add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add laboratory part of orgs
	 */
	@Override
	public int countBygetJanaacByAppId(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacByAppId;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABORATORYPARTOFORG_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYAPPID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAACBYAPPID_JANAACAPPLICATIONID_2 =
			"addLaboratoryPartOfOrg.janaacApplicationId = ?";

	public AddLaboratoryPartOfOrgPersistenceImpl() {
		setModelClass(AddLaboratoryPartOfOrg.class);

		setModelImplClass(AddLaboratoryPartOfOrgImpl.class);
		setModelPKClass(long.class);

		setTable(AddLaboratoryPartOfOrgTable.INSTANCE);
	}

	/**
	 * Caches the add laboratory part of org in the entity cache if it is enabled.
	 *
	 * @param addLaboratoryPartOfOrg the add laboratory part of org
	 */
	@Override
	public void cacheResult(AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {
		entityCache.putResult(
			AddLaboratoryPartOfOrgImpl.class,
			addLaboratoryPartOfOrg.getPrimaryKey(), addLaboratoryPartOfOrg);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add laboratory part of orgs in the entity cache if it is enabled.
	 *
	 * @param addLaboratoryPartOfOrgs the add laboratory part of orgs
	 */
	@Override
	public void cacheResult(
		List<AddLaboratoryPartOfOrg> addLaboratoryPartOfOrgs) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLaboratoryPartOfOrgs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLaboratoryPartOfOrg addLaboratoryPartOfOrg :
				addLaboratoryPartOfOrgs) {

			if (entityCache.getResult(
					AddLaboratoryPartOfOrgImpl.class,
					addLaboratoryPartOfOrg.getPrimaryKey()) == null) {

				cacheResult(addLaboratoryPartOfOrg);
			}
		}
	}

	/**
	 * Clears the cache for all add laboratory part of orgs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLaboratoryPartOfOrgImpl.class);

		finderCache.clearCache(AddLaboratoryPartOfOrgImpl.class);
	}

	/**
	 * Clears the cache for the add laboratory part of org.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {
		entityCache.removeResult(
			AddLaboratoryPartOfOrgImpl.class, addLaboratoryPartOfOrg);
	}

	@Override
	public void clearCache(
		List<AddLaboratoryPartOfOrg> addLaboratoryPartOfOrgs) {

		for (AddLaboratoryPartOfOrg addLaboratoryPartOfOrg :
				addLaboratoryPartOfOrgs) {

			entityCache.removeResult(
				AddLaboratoryPartOfOrgImpl.class, addLaboratoryPartOfOrg);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLaboratoryPartOfOrgImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLaboratoryPartOfOrgImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add laboratory part of org with the primary key. Does not add the add laboratory part of org to the database.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key for the new add laboratory part of org
	 * @return the new add laboratory part of org
	 */
	@Override
	public AddLaboratoryPartOfOrg create(long addLaboratoryPartOfOrgId) {
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg =
			new AddLaboratoryPartOfOrgImpl();

		addLaboratoryPartOfOrg.setNew(true);
		addLaboratoryPartOfOrg.setPrimaryKey(addLaboratoryPartOfOrgId);

		addLaboratoryPartOfOrg.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addLaboratoryPartOfOrg;
	}

	/**
	 * Removes the add laboratory part of org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org that was removed
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a add laboratory part of org with the primary key could not be found
	 */
	@Override
	public AddLaboratoryPartOfOrg remove(long addLaboratoryPartOfOrgId)
		throws NoSuchAddLaboratoryPartOfOrgException {

		return remove((Serializable)addLaboratoryPartOfOrgId);
	}

	/**
	 * Removes the add laboratory part of org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add laboratory part of org
	 * @return the add laboratory part of org that was removed
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a add laboratory part of org with the primary key could not be found
	 */
	@Override
	public AddLaboratoryPartOfOrg remove(Serializable primaryKey)
		throws NoSuchAddLaboratoryPartOfOrgException {

		Session session = null;

		try {
			session = openSession();

			AddLaboratoryPartOfOrg addLaboratoryPartOfOrg =
				(AddLaboratoryPartOfOrg)session.get(
					AddLaboratoryPartOfOrgImpl.class, primaryKey);

			if (addLaboratoryPartOfOrg == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLaboratoryPartOfOrgException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLaboratoryPartOfOrg);
		}
		catch (NoSuchAddLaboratoryPartOfOrgException noSuchEntityException) {
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
	protected AddLaboratoryPartOfOrg removeImpl(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLaboratoryPartOfOrg)) {
				addLaboratoryPartOfOrg = (AddLaboratoryPartOfOrg)session.get(
					AddLaboratoryPartOfOrgImpl.class,
					addLaboratoryPartOfOrg.getPrimaryKeyObj());
			}

			if (addLaboratoryPartOfOrg != null) {
				session.delete(addLaboratoryPartOfOrg);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLaboratoryPartOfOrg != null) {
			clearCache(addLaboratoryPartOfOrg);
		}

		return addLaboratoryPartOfOrg;
	}

	@Override
	public AddLaboratoryPartOfOrg updateImpl(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {

		boolean isNew = addLaboratoryPartOfOrg.isNew();

		if (!(addLaboratoryPartOfOrg instanceof
				AddLaboratoryPartOfOrgModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLaboratoryPartOfOrg.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLaboratoryPartOfOrg);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLaboratoryPartOfOrg proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLaboratoryPartOfOrg implementation " +
					addLaboratoryPartOfOrg.getClass());
		}

		AddLaboratoryPartOfOrgModelImpl addLaboratoryPartOfOrgModelImpl =
			(AddLaboratoryPartOfOrgModelImpl)addLaboratoryPartOfOrg;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLaboratoryPartOfOrg.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLaboratoryPartOfOrg.setCreateDate(date);
			}
			else {
				addLaboratoryPartOfOrg.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLaboratoryPartOfOrgModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLaboratoryPartOfOrg.setModifiedDate(date);
			}
			else {
				addLaboratoryPartOfOrg.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLaboratoryPartOfOrg);
			}
			else {
				addLaboratoryPartOfOrg = (AddLaboratoryPartOfOrg)session.merge(
					addLaboratoryPartOfOrg);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLaboratoryPartOfOrgImpl.class, addLaboratoryPartOfOrgModelImpl,
			false, true);

		if (isNew) {
			addLaboratoryPartOfOrg.setNew(false);
		}

		addLaboratoryPartOfOrg.resetOriginalValues();

		return addLaboratoryPartOfOrg;
	}

	/**
	 * Returns the add laboratory part of org with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add laboratory part of org
	 * @return the add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a add laboratory part of org with the primary key could not be found
	 */
	@Override
	public AddLaboratoryPartOfOrg findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLaboratoryPartOfOrgException {

		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg = fetchByPrimaryKey(
			primaryKey);

		if (addLaboratoryPartOfOrg == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLaboratoryPartOfOrgException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLaboratoryPartOfOrg;
	}

	/**
	 * Returns the add laboratory part of org with the primary key or throws a <code>NoSuchAddLaboratoryPartOfOrgException</code> if it could not be found.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a add laboratory part of org with the primary key could not be found
	 */
	@Override
	public AddLaboratoryPartOfOrg findByPrimaryKey(
			long addLaboratoryPartOfOrgId)
		throws NoSuchAddLaboratoryPartOfOrgException {

		return findByPrimaryKey((Serializable)addLaboratoryPartOfOrgId);
	}

	/**
	 * Returns the add laboratory part of org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org, or <code>null</code> if a add laboratory part of org with the primary key could not be found
	 */
	@Override
	public AddLaboratoryPartOfOrg fetchByPrimaryKey(
		long addLaboratoryPartOfOrgId) {

		return fetchByPrimaryKey((Serializable)addLaboratoryPartOfOrgId);
	}

	/**
	 * Returns all the add laboratory part of orgs.
	 *
	 * @return the add laboratory part of orgs
	 */
	@Override
	public List<AddLaboratoryPartOfOrg> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add laboratory part of orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @return the range of add laboratory part of orgs
	 */
	@Override
	public List<AddLaboratoryPartOfOrg> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add laboratory part of orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add laboratory part of orgs
	 */
	@Override
	public List<AddLaboratoryPartOfOrg> findAll(
		int start, int end,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add laboratory part of orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add laboratory part of orgs
	 */
	@Override
	public List<AddLaboratoryPartOfOrg> findAll(
		int start, int end,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator,
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

		List<AddLaboratoryPartOfOrg> list = null;

		if (useFinderCache) {
			list = (List<AddLaboratoryPartOfOrg>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABORATORYPARTOFORG);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABORATORYPARTOFORG;

				sql = sql.concat(AddLaboratoryPartOfOrgModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLaboratoryPartOfOrg>)QueryUtil.list(
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
	 * Removes all the add laboratory part of orgs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLaboratoryPartOfOrg addLaboratoryPartOfOrg : findAll()) {
			remove(addLaboratoryPartOfOrg);
		}
	}

	/**
	 * Returns the number of add laboratory part of orgs.
	 *
	 * @return the number of add laboratory part of orgs
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
					_SQL_COUNT_ADDLABORATORYPARTOFORG);

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
		return "addLaboratoryPartOfOrgId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABORATORYPARTOFORG;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLaboratoryPartOfOrgModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add laboratory part of org persistence.
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

		_finderPathWithPaginationFindBygetJanaacByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacByAppId",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaacByAppId", new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddLaboratoryPartOfOrgUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLaboratoryPartOfOrgUtil.setPersistence(null);

		entityCache.removeCache(AddLaboratoryPartOfOrgImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ADDLABORATORYPARTOFORG =
		"SELECT addLaboratoryPartOfOrg FROM AddLaboratoryPartOfOrg addLaboratoryPartOfOrg";

	private static final String _SQL_SELECT_ADDLABORATORYPARTOFORG_WHERE =
		"SELECT addLaboratoryPartOfOrg FROM AddLaboratoryPartOfOrg addLaboratoryPartOfOrg WHERE ";

	private static final String _SQL_COUNT_ADDLABORATORYPARTOFORG =
		"SELECT COUNT(addLaboratoryPartOfOrg) FROM AddLaboratoryPartOfOrg addLaboratoryPartOfOrg";

	private static final String _SQL_COUNT_ADDLABORATORYPARTOFORG_WHERE =
		"SELECT COUNT(addLaboratoryPartOfOrg) FROM AddLaboratoryPartOfOrg addLaboratoryPartOfOrg WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLaboratoryPartOfOrg.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLaboratoryPartOfOrg exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLaboratoryPartOfOrg exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLaboratoryPartOfOrgPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}