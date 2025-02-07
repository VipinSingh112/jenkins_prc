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

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabResourceReqFirstException;
import com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst;
import com.nbp.janaac.application.form.service.model.AddLabResourceReqFirstTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqFirstImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqFirstModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabResourceReqFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabResourceReqFirstUtil;
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
 * The persistence implementation for the add lab resource req first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabResourceReqFirstPersistence.class)
public class AddLabResourceReqFirstPersistenceImpl
	extends BasePersistenceImpl<AddLabResourceReqFirst>
	implements AddLabResourceReqFirstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabResourceReqFirstUtil</code> to access the add lab resource req first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabResourceReqFirstImpl.class.getName();

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
	 * Returns all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab resource req firsts
	 */
	@Override
	public List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @return the range of matching add lab resource req firsts
	 */
	@Override
	public List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab resource req firsts
	 */
	@Override
	public List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab resource req firsts
	 */
	@Override
	public List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator,
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

		List<AddLabResourceReqFirst> list = null;

		if (useFinderCache) {
			list = (List<AddLabResourceReqFirst>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabResourceReqFirst addLabResourceReqFirst : list) {
					if (janaacApplicationId !=
							addLabResourceReqFirst.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABRESOURCEREQFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabResourceReqFirstModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabResourceReqFirst>)QueryUtil.list(
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
	 * Returns the first add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a matching add lab resource req first could not be found
	 */
	@Override
	public AddLabResourceReqFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabResourceReqFirst> orderByComparator)
		throws NoSuchAddLabResourceReqFirstException {

		AddLabResourceReqFirst addLabResourceReqFirst =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addLabResourceReqFirst != null) {
			return addLabResourceReqFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabResourceReqFirstException(sb.toString());
	}

	/**
	 * Returns the first add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req first, or <code>null</code> if a matching add lab resource req first could not be found
	 */
	@Override
	public AddLabResourceReqFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator) {

		List<AddLabResourceReqFirst> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a matching add lab resource req first could not be found
	 */
	@Override
	public AddLabResourceReqFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabResourceReqFirst> orderByComparator)
		throws NoSuchAddLabResourceReqFirstException {

		AddLabResourceReqFirst addLabResourceReqFirst =
			fetchBygetJanaacById_Last(janaacApplicationId, orderByComparator);

		if (addLabResourceReqFirst != null) {
			return addLabResourceReqFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabResourceReqFirstException(sb.toString());
	}

	/**
	 * Returns the last add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req first, or <code>null</code> if a matching add lab resource req first could not be found
	 */
	@Override
	public AddLabResourceReqFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabResourceReqFirst> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab resource req firsts before and after the current add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabResourceReqFirstId the primary key of the current add lab resource req first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a add lab resource req first with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqFirst[] findBygetJanaacById_PrevAndNext(
			long addLabResourceReqFirstId, long janaacApplicationId,
			OrderByComparator<AddLabResourceReqFirst> orderByComparator)
		throws NoSuchAddLabResourceReqFirstException {

		AddLabResourceReqFirst addLabResourceReqFirst = findByPrimaryKey(
			addLabResourceReqFirstId);

		Session session = null;

		try {
			session = openSession();

			AddLabResourceReqFirst[] array = new AddLabResourceReqFirstImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabResourceReqFirst, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabResourceReqFirst;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabResourceReqFirst, janaacApplicationId,
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

	protected AddLabResourceReqFirst getBygetJanaacById_PrevAndNext(
		Session session, AddLabResourceReqFirst addLabResourceReqFirst,
		long janaacApplicationId,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABRESOURCEREQFIRST_WHERE);

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
			sb.append(AddLabResourceReqFirstModelImpl.ORDER_BY_JPQL);
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
						addLabResourceReqFirst)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabResourceReqFirst> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab resource req firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabResourceReqFirst addLabResourceReqFirst :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabResourceReqFirst);
		}
	}

	/**
	 * Returns the number of add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab resource req firsts
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABRESOURCEREQFIRST_WHERE);

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
			"addLabResourceReqFirst.janaacApplicationId = ?";

	public AddLabResourceReqFirstPersistenceImpl() {
		setModelClass(AddLabResourceReqFirst.class);

		setModelImplClass(AddLabResourceReqFirstImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabResourceReqFirstTable.INSTANCE);
	}

	/**
	 * Caches the add lab resource req first in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqFirst the add lab resource req first
	 */
	@Override
	public void cacheResult(AddLabResourceReqFirst addLabResourceReqFirst) {
		entityCache.putResult(
			AddLabResourceReqFirstImpl.class,
			addLabResourceReqFirst.getPrimaryKey(), addLabResourceReqFirst);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab resource req firsts in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqFirsts the add lab resource req firsts
	 */
	@Override
	public void cacheResult(
		List<AddLabResourceReqFirst> addLabResourceReqFirsts) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabResourceReqFirsts.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabResourceReqFirst addLabResourceReqFirst :
				addLabResourceReqFirsts) {

			if (entityCache.getResult(
					AddLabResourceReqFirstImpl.class,
					addLabResourceReqFirst.getPrimaryKey()) == null) {

				cacheResult(addLabResourceReqFirst);
			}
		}
	}

	/**
	 * Clears the cache for all add lab resource req firsts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabResourceReqFirstImpl.class);

		finderCache.clearCache(AddLabResourceReqFirstImpl.class);
	}

	/**
	 * Clears the cache for the add lab resource req first.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddLabResourceReqFirst addLabResourceReqFirst) {
		entityCache.removeResult(
			AddLabResourceReqFirstImpl.class, addLabResourceReqFirst);
	}

	@Override
	public void clearCache(
		List<AddLabResourceReqFirst> addLabResourceReqFirsts) {

		for (AddLabResourceReqFirst addLabResourceReqFirst :
				addLabResourceReqFirsts) {

			entityCache.removeResult(
				AddLabResourceReqFirstImpl.class, addLabResourceReqFirst);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabResourceReqFirstImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLabResourceReqFirstImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab resource req first with the primary key. Does not add the add lab resource req first to the database.
	 *
	 * @param addLabResourceReqFirstId the primary key for the new add lab resource req first
	 * @return the new add lab resource req first
	 */
	@Override
	public AddLabResourceReqFirst create(long addLabResourceReqFirstId) {
		AddLabResourceReqFirst addLabResourceReqFirst =
			new AddLabResourceReqFirstImpl();

		addLabResourceReqFirst.setNew(true);
		addLabResourceReqFirst.setPrimaryKey(addLabResourceReqFirstId);

		addLabResourceReqFirst.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addLabResourceReqFirst;
	}

	/**
	 * Removes the add lab resource req first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabResourceReqFirstId the primary key of the add lab resource req first
	 * @return the add lab resource req first that was removed
	 * @throws NoSuchAddLabResourceReqFirstException if a add lab resource req first with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqFirst remove(long addLabResourceReqFirstId)
		throws NoSuchAddLabResourceReqFirstException {

		return remove((Serializable)addLabResourceReqFirstId);
	}

	/**
	 * Removes the add lab resource req first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab resource req first
	 * @return the add lab resource req first that was removed
	 * @throws NoSuchAddLabResourceReqFirstException if a add lab resource req first with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqFirst remove(Serializable primaryKey)
		throws NoSuchAddLabResourceReqFirstException {

		Session session = null;

		try {
			session = openSession();

			AddLabResourceReqFirst addLabResourceReqFirst =
				(AddLabResourceReqFirst)session.get(
					AddLabResourceReqFirstImpl.class, primaryKey);

			if (addLabResourceReqFirst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabResourceReqFirstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabResourceReqFirst);
		}
		catch (NoSuchAddLabResourceReqFirstException noSuchEntityException) {
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
	protected AddLabResourceReqFirst removeImpl(
		AddLabResourceReqFirst addLabResourceReqFirst) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabResourceReqFirst)) {
				addLabResourceReqFirst = (AddLabResourceReqFirst)session.get(
					AddLabResourceReqFirstImpl.class,
					addLabResourceReqFirst.getPrimaryKeyObj());
			}

			if (addLabResourceReqFirst != null) {
				session.delete(addLabResourceReqFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabResourceReqFirst != null) {
			clearCache(addLabResourceReqFirst);
		}

		return addLabResourceReqFirst;
	}

	@Override
	public AddLabResourceReqFirst updateImpl(
		AddLabResourceReqFirst addLabResourceReqFirst) {

		boolean isNew = addLabResourceReqFirst.isNew();

		if (!(addLabResourceReqFirst instanceof
				AddLabResourceReqFirstModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLabResourceReqFirst.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabResourceReqFirst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabResourceReqFirst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabResourceReqFirst implementation " +
					addLabResourceReqFirst.getClass());
		}

		AddLabResourceReqFirstModelImpl addLabResourceReqFirstModelImpl =
			(AddLabResourceReqFirstModelImpl)addLabResourceReqFirst;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabResourceReqFirst.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabResourceReqFirst.setCreateDate(date);
			}
			else {
				addLabResourceReqFirst.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabResourceReqFirstModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabResourceReqFirst.setModifiedDate(date);
			}
			else {
				addLabResourceReqFirst.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabResourceReqFirst);
			}
			else {
				addLabResourceReqFirst = (AddLabResourceReqFirst)session.merge(
					addLabResourceReqFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabResourceReqFirstImpl.class, addLabResourceReqFirstModelImpl,
			false, true);

		if (isNew) {
			addLabResourceReqFirst.setNew(false);
		}

		addLabResourceReqFirst.resetOriginalValues();

		return addLabResourceReqFirst;
	}

	/**
	 * Returns the add lab resource req first with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab resource req first
	 * @return the add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a add lab resource req first with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqFirst findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabResourceReqFirstException {

		AddLabResourceReqFirst addLabResourceReqFirst = fetchByPrimaryKey(
			primaryKey);

		if (addLabResourceReqFirst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabResourceReqFirstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabResourceReqFirst;
	}

	/**
	 * Returns the add lab resource req first with the primary key or throws a <code>NoSuchAddLabResourceReqFirstException</code> if it could not be found.
	 *
	 * @param addLabResourceReqFirstId the primary key of the add lab resource req first
	 * @return the add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a add lab resource req first with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqFirst findByPrimaryKey(
			long addLabResourceReqFirstId)
		throws NoSuchAddLabResourceReqFirstException {

		return findByPrimaryKey((Serializable)addLabResourceReqFirstId);
	}

	/**
	 * Returns the add lab resource req first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabResourceReqFirstId the primary key of the add lab resource req first
	 * @return the add lab resource req first, or <code>null</code> if a add lab resource req first with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqFirst fetchByPrimaryKey(
		long addLabResourceReqFirstId) {

		return fetchByPrimaryKey((Serializable)addLabResourceReqFirstId);
	}

	/**
	 * Returns all the add lab resource req firsts.
	 *
	 * @return the add lab resource req firsts
	 */
	@Override
	public List<AddLabResourceReqFirst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab resource req firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @return the range of add lab resource req firsts
	 */
	@Override
	public List<AddLabResourceReqFirst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab resource req firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab resource req firsts
	 */
	@Override
	public List<AddLabResourceReqFirst> findAll(
		int start, int end,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab resource req firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab resource req firsts
	 */
	@Override
	public List<AddLabResourceReqFirst> findAll(
		int start, int end,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator,
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

		List<AddLabResourceReqFirst> list = null;

		if (useFinderCache) {
			list = (List<AddLabResourceReqFirst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABRESOURCEREQFIRST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABRESOURCEREQFIRST;

				sql = sql.concat(AddLabResourceReqFirstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabResourceReqFirst>)QueryUtil.list(
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
	 * Removes all the add lab resource req firsts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabResourceReqFirst addLabResourceReqFirst : findAll()) {
			remove(addLabResourceReqFirst);
		}
	}

	/**
	 * Returns the number of add lab resource req firsts.
	 *
	 * @return the number of add lab resource req firsts
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
					_SQL_COUNT_ADDLABRESOURCEREQFIRST);

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
		return "addLabResourceReqFirstId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABRESOURCEREQFIRST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabResourceReqFirstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab resource req first persistence.
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

		AddLabResourceReqFirstUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabResourceReqFirstUtil.setPersistence(null);

		entityCache.removeCache(AddLabResourceReqFirstImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDLABRESOURCEREQFIRST =
		"SELECT addLabResourceReqFirst FROM AddLabResourceReqFirst addLabResourceReqFirst";

	private static final String _SQL_SELECT_ADDLABRESOURCEREQFIRST_WHERE =
		"SELECT addLabResourceReqFirst FROM AddLabResourceReqFirst addLabResourceReqFirst WHERE ";

	private static final String _SQL_COUNT_ADDLABRESOURCEREQFIRST =
		"SELECT COUNT(addLabResourceReqFirst) FROM AddLabResourceReqFirst addLabResourceReqFirst";

	private static final String _SQL_COUNT_ADDLABRESOURCEREQFIRST_WHERE =
		"SELECT COUNT(addLabResourceReqFirst) FROM AddLabResourceReqFirst addLabResourceReqFirst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLabResourceReqFirst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabResourceReqFirst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabResourceReqFirst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabResourceReqFirstPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}