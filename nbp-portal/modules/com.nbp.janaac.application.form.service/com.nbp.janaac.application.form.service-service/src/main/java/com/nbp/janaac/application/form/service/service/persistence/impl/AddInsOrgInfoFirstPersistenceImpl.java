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

import com.nbp.janaac.application.form.service.exception.NoSuchAddInsOrgInfoFirstException;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirstTable;
import com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoFirstImpl;
import com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoFirstModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddInsOrgInfoFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddInsOrgInfoFirstUtil;
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
 * The persistence implementation for the add ins org info first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddInsOrgInfoFirstPersistence.class)
public class AddInsOrgInfoFirstPersistenceImpl
	extends BasePersistenceImpl<AddInsOrgInfoFirst>
	implements AddInsOrgInfoFirstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddInsOrgInfoFirstUtil</code> to access the add ins org info first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddInsOrgInfoFirstImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacById;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins org info firsts
	 */
	@Override
	public List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @return the range of matching add ins org info firsts
	 */
	@Override
	public List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins org info firsts
	 */
	@Override
	public List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins org info firsts
	 */
	@Override
	public List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacById;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacById;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddInsOrgInfoFirst> list = null;

		if (useFinderCache) {
			list = (List<AddInsOrgInfoFirst>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddInsOrgInfoFirst addInsOrgInfoFirst : list) {
					if (janaacApplicationId !=
							addInsOrgInfoFirst.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDINSORGINFOFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddInsOrgInfoFirstModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddInsOrgInfoFirst>)QueryUtil.list(
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
	 * Returns the first add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a matching add ins org info first could not be found
	 */
	@Override
	public AddInsOrgInfoFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoFirst> orderByComparator)
		throws NoSuchAddInsOrgInfoFirstException {

		AddInsOrgInfoFirst addInsOrgInfoFirst = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addInsOrgInfoFirst != null) {
			return addInsOrgInfoFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddInsOrgInfoFirstException(sb.toString());
	}

	/**
	 * Returns the first add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info first, or <code>null</code> if a matching add ins org info first could not be found
	 */
	@Override
	public AddInsOrgInfoFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator) {

		List<AddInsOrgInfoFirst> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a matching add ins org info first could not be found
	 */
	@Override
	public AddInsOrgInfoFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoFirst> orderByComparator)
		throws NoSuchAddInsOrgInfoFirstException {

		AddInsOrgInfoFirst addInsOrgInfoFirst = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addInsOrgInfoFirst != null) {
			return addInsOrgInfoFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddInsOrgInfoFirstException(sb.toString());
	}

	/**
	 * Returns the last add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info first, or <code>null</code> if a matching add ins org info first could not be found
	 */
	@Override
	public AddInsOrgInfoFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddInsOrgInfoFirst> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add ins org info firsts before and after the current add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the current add ins org info first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a add ins org info first with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoFirst[] findBygetJanaacById_PrevAndNext(
			long addInsOrgInfoFirstId, long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoFirst> orderByComparator)
		throws NoSuchAddInsOrgInfoFirstException {

		AddInsOrgInfoFirst addInsOrgInfoFirst = findByPrimaryKey(
			addInsOrgInfoFirstId);

		Session session = null;

		try {
			session = openSession();

			AddInsOrgInfoFirst[] array = new AddInsOrgInfoFirstImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addInsOrgInfoFirst, janaacApplicationId,
				orderByComparator, true);

			array[1] = addInsOrgInfoFirst;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addInsOrgInfoFirst, janaacApplicationId,
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

	protected AddInsOrgInfoFirst getBygetJanaacById_PrevAndNext(
		Session session, AddInsOrgInfoFirst addInsOrgInfoFirst,
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDINSORGINFOFIRST_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
			sb.append(AddInsOrgInfoFirstModelImpl.ORDER_BY_JPQL);
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
						addInsOrgInfoFirst)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddInsOrgInfoFirst> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add ins org info firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddInsOrgInfoFirst addInsOrgInfoFirst :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addInsOrgInfoFirst);
		}
	}

	/**
	 * Returns the number of add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins org info firsts
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDINSORGINFOFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"addInsOrgInfoFirst.janaacApplicationId = ?";

	public AddInsOrgInfoFirstPersistenceImpl() {
		setModelClass(AddInsOrgInfoFirst.class);

		setModelImplClass(AddInsOrgInfoFirstImpl.class);
		setModelPKClass(long.class);

		setTable(AddInsOrgInfoFirstTable.INSTANCE);
	}

	/**
	 * Caches the add ins org info first in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoFirst the add ins org info first
	 */
	@Override
	public void cacheResult(AddInsOrgInfoFirst addInsOrgInfoFirst) {
		entityCache.putResult(
			AddInsOrgInfoFirstImpl.class, addInsOrgInfoFirst.getPrimaryKey(),
			addInsOrgInfoFirst);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add ins org info firsts in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoFirsts the add ins org info firsts
	 */
	@Override
	public void cacheResult(List<AddInsOrgInfoFirst> addInsOrgInfoFirsts) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addInsOrgInfoFirsts.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddInsOrgInfoFirst addInsOrgInfoFirst : addInsOrgInfoFirsts) {
			if (entityCache.getResult(
					AddInsOrgInfoFirstImpl.class,
					addInsOrgInfoFirst.getPrimaryKey()) == null) {

				cacheResult(addInsOrgInfoFirst);
			}
		}
	}

	/**
	 * Clears the cache for all add ins org info firsts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddInsOrgInfoFirstImpl.class);

		finderCache.clearCache(AddInsOrgInfoFirstImpl.class);
	}

	/**
	 * Clears the cache for the add ins org info first.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddInsOrgInfoFirst addInsOrgInfoFirst) {
		entityCache.removeResult(
			AddInsOrgInfoFirstImpl.class, addInsOrgInfoFirst);
	}

	@Override
	public void clearCache(List<AddInsOrgInfoFirst> addInsOrgInfoFirsts) {
		for (AddInsOrgInfoFirst addInsOrgInfoFirst : addInsOrgInfoFirsts) {
			entityCache.removeResult(
				AddInsOrgInfoFirstImpl.class, addInsOrgInfoFirst);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddInsOrgInfoFirstImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AddInsOrgInfoFirstImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add ins org info first with the primary key. Does not add the add ins org info first to the database.
	 *
	 * @param addInsOrgInfoFirstId the primary key for the new add ins org info first
	 * @return the new add ins org info first
	 */
	@Override
	public AddInsOrgInfoFirst create(long addInsOrgInfoFirstId) {
		AddInsOrgInfoFirst addInsOrgInfoFirst = new AddInsOrgInfoFirstImpl();

		addInsOrgInfoFirst.setNew(true);
		addInsOrgInfoFirst.setPrimaryKey(addInsOrgInfoFirstId);

		addInsOrgInfoFirst.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addInsOrgInfoFirst;
	}

	/**
	 * Removes the add ins org info first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the add ins org info first
	 * @return the add ins org info first that was removed
	 * @throws NoSuchAddInsOrgInfoFirstException if a add ins org info first with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoFirst remove(long addInsOrgInfoFirstId)
		throws NoSuchAddInsOrgInfoFirstException {

		return remove((Serializable)addInsOrgInfoFirstId);
	}

	/**
	 * Removes the add ins org info first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add ins org info first
	 * @return the add ins org info first that was removed
	 * @throws NoSuchAddInsOrgInfoFirstException if a add ins org info first with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoFirst remove(Serializable primaryKey)
		throws NoSuchAddInsOrgInfoFirstException {

		Session session = null;

		try {
			session = openSession();

			AddInsOrgInfoFirst addInsOrgInfoFirst =
				(AddInsOrgInfoFirst)session.get(
					AddInsOrgInfoFirstImpl.class, primaryKey);

			if (addInsOrgInfoFirst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddInsOrgInfoFirstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addInsOrgInfoFirst);
		}
		catch (NoSuchAddInsOrgInfoFirstException noSuchEntityException) {
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
	protected AddInsOrgInfoFirst removeImpl(
		AddInsOrgInfoFirst addInsOrgInfoFirst) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addInsOrgInfoFirst)) {
				addInsOrgInfoFirst = (AddInsOrgInfoFirst)session.get(
					AddInsOrgInfoFirstImpl.class,
					addInsOrgInfoFirst.getPrimaryKeyObj());
			}

			if (addInsOrgInfoFirst != null) {
				session.delete(addInsOrgInfoFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addInsOrgInfoFirst != null) {
			clearCache(addInsOrgInfoFirst);
		}

		return addInsOrgInfoFirst;
	}

	@Override
	public AddInsOrgInfoFirst updateImpl(
		AddInsOrgInfoFirst addInsOrgInfoFirst) {

		boolean isNew = addInsOrgInfoFirst.isNew();

		if (!(addInsOrgInfoFirst instanceof AddInsOrgInfoFirstModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addInsOrgInfoFirst.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addInsOrgInfoFirst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addInsOrgInfoFirst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddInsOrgInfoFirst implementation " +
					addInsOrgInfoFirst.getClass());
		}

		AddInsOrgInfoFirstModelImpl addInsOrgInfoFirstModelImpl =
			(AddInsOrgInfoFirstModelImpl)addInsOrgInfoFirst;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addInsOrgInfoFirst.getCreateDate() == null)) {
			if (serviceContext == null) {
				addInsOrgInfoFirst.setCreateDate(date);
			}
			else {
				addInsOrgInfoFirst.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addInsOrgInfoFirstModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addInsOrgInfoFirst.setModifiedDate(date);
			}
			else {
				addInsOrgInfoFirst.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addInsOrgInfoFirst);
			}
			else {
				addInsOrgInfoFirst = (AddInsOrgInfoFirst)session.merge(
					addInsOrgInfoFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddInsOrgInfoFirstImpl.class, addInsOrgInfoFirstModelImpl, false,
			true);

		if (isNew) {
			addInsOrgInfoFirst.setNew(false);
		}

		addInsOrgInfoFirst.resetOriginalValues();

		return addInsOrgInfoFirst;
	}

	/**
	 * Returns the add ins org info first with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add ins org info first
	 * @return the add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a add ins org info first with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoFirst findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddInsOrgInfoFirstException {

		AddInsOrgInfoFirst addInsOrgInfoFirst = fetchByPrimaryKey(primaryKey);

		if (addInsOrgInfoFirst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddInsOrgInfoFirstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addInsOrgInfoFirst;
	}

	/**
	 * Returns the add ins org info first with the primary key or throws a <code>NoSuchAddInsOrgInfoFirstException</code> if it could not be found.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the add ins org info first
	 * @return the add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a add ins org info first with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoFirst findByPrimaryKey(long addInsOrgInfoFirstId)
		throws NoSuchAddInsOrgInfoFirstException {

		return findByPrimaryKey((Serializable)addInsOrgInfoFirstId);
	}

	/**
	 * Returns the add ins org info first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the add ins org info first
	 * @return the add ins org info first, or <code>null</code> if a add ins org info first with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoFirst fetchByPrimaryKey(long addInsOrgInfoFirstId) {
		return fetchByPrimaryKey((Serializable)addInsOrgInfoFirstId);
	}

	/**
	 * Returns all the add ins org info firsts.
	 *
	 * @return the add ins org info firsts
	 */
	@Override
	public List<AddInsOrgInfoFirst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add ins org info firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @return the range of add ins org info firsts
	 */
	@Override
	public List<AddInsOrgInfoFirst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add ins org info firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins org info firsts
	 */
	@Override
	public List<AddInsOrgInfoFirst> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add ins org info firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins org info firsts
	 */
	@Override
	public List<AddInsOrgInfoFirst> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator,
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

		List<AddInsOrgInfoFirst> list = null;

		if (useFinderCache) {
			list = (List<AddInsOrgInfoFirst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDINSORGINFOFIRST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDINSORGINFOFIRST;

				sql = sql.concat(AddInsOrgInfoFirstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddInsOrgInfoFirst>)QueryUtil.list(
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
	 * Removes all the add ins org info firsts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddInsOrgInfoFirst addInsOrgInfoFirst : findAll()) {
			remove(addInsOrgInfoFirst);
		}
	}

	/**
	 * Returns the number of add ins org info firsts.
	 *
	 * @return the number of add ins org info firsts
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
					_SQL_COUNT_ADDINSORGINFOFIRST);

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
		return "addInsOrgInfoFirstId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDINSORGINFOFIRST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddInsOrgInfoFirstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add ins org info first persistence.
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

		_finderPathWithPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddInsOrgInfoFirstUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddInsOrgInfoFirstUtil.setPersistence(null);

		entityCache.removeCache(AddInsOrgInfoFirstImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDINSORGINFOFIRST =
		"SELECT addInsOrgInfoFirst FROM AddInsOrgInfoFirst addInsOrgInfoFirst";

	private static final String _SQL_SELECT_ADDINSORGINFOFIRST_WHERE =
		"SELECT addInsOrgInfoFirst FROM AddInsOrgInfoFirst addInsOrgInfoFirst WHERE ";

	private static final String _SQL_COUNT_ADDINSORGINFOFIRST =
		"SELECT COUNT(addInsOrgInfoFirst) FROM AddInsOrgInfoFirst addInsOrgInfoFirst";

	private static final String _SQL_COUNT_ADDINSORGINFOFIRST_WHERE =
		"SELECT COUNT(addInsOrgInfoFirst) FROM AddInsOrgInfoFirst addInsOrgInfoFirst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "addInsOrgInfoFirst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddInsOrgInfoFirst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddInsOrgInfoFirst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddInsOrgInfoFirstPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}