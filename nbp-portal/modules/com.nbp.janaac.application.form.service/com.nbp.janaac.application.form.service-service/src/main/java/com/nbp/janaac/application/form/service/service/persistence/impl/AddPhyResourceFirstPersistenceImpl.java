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

import com.nbp.janaac.application.form.service.exception.NoSuchAddPhyResourceFirstException;
import com.nbp.janaac.application.form.service.model.AddPhyResourceFirst;
import com.nbp.janaac.application.form.service.model.AddPhyResourceFirstTable;
import com.nbp.janaac.application.form.service.model.impl.AddPhyResourceFirstImpl;
import com.nbp.janaac.application.form.service.model.impl.AddPhyResourceFirstModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddPhyResourceFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddPhyResourceFirstUtil;
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
 * The persistence implementation for the add phy resource first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddPhyResourceFirstPersistence.class)
public class AddPhyResourceFirstPersistenceImpl
	extends BasePersistenceImpl<AddPhyResourceFirst>
	implements AddPhyResourceFirstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddPhyResourceFirstUtil</code> to access the add phy resource first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddPhyResourceFirstImpl.class.getName();

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
	 * Returns all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add phy resource firsts
	 */
	@Override
	public List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @return the range of matching add phy resource firsts
	 */
	@Override
	public List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add phy resource firsts
	 */
	@Override
	public List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddPhyResourceFirst> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add phy resource firsts
	 */
	@Override
	public List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddPhyResourceFirst> orderByComparator,
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

		List<AddPhyResourceFirst> list = null;

		if (useFinderCache) {
			list = (List<AddPhyResourceFirst>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddPhyResourceFirst addPhyResourceFirst : list) {
					if (janaacApplicationId !=
							addPhyResourceFirst.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDPHYRESOURCEFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddPhyResourceFirstModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddPhyResourceFirst>)QueryUtil.list(
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
	 * Returns the first add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a matching add phy resource first could not be found
	 */
	@Override
	public AddPhyResourceFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddPhyResourceFirst> orderByComparator)
		throws NoSuchAddPhyResourceFirstException {

		AddPhyResourceFirst addPhyResourceFirst = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addPhyResourceFirst != null) {
			return addPhyResourceFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddPhyResourceFirstException(sb.toString());
	}

	/**
	 * Returns the first add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource first, or <code>null</code> if a matching add phy resource first could not be found
	 */
	@Override
	public AddPhyResourceFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddPhyResourceFirst> orderByComparator) {

		List<AddPhyResourceFirst> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a matching add phy resource first could not be found
	 */
	@Override
	public AddPhyResourceFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddPhyResourceFirst> orderByComparator)
		throws NoSuchAddPhyResourceFirstException {

		AddPhyResourceFirst addPhyResourceFirst = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addPhyResourceFirst != null) {
			return addPhyResourceFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddPhyResourceFirstException(sb.toString());
	}

	/**
	 * Returns the last add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource first, or <code>null</code> if a matching add phy resource first could not be found
	 */
	@Override
	public AddPhyResourceFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddPhyResourceFirst> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddPhyResourceFirst> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add phy resource firsts before and after the current add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addPhyResourceFirstId the primary key of the current add phy resource first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a add phy resource first with the primary key could not be found
	 */
	@Override
	public AddPhyResourceFirst[] findBygetJanaacById_PrevAndNext(
			long addPhyResourceFirstId, long janaacApplicationId,
			OrderByComparator<AddPhyResourceFirst> orderByComparator)
		throws NoSuchAddPhyResourceFirstException {

		AddPhyResourceFirst addPhyResourceFirst = findByPrimaryKey(
			addPhyResourceFirstId);

		Session session = null;

		try {
			session = openSession();

			AddPhyResourceFirst[] array = new AddPhyResourceFirstImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addPhyResourceFirst, janaacApplicationId,
				orderByComparator, true);

			array[1] = addPhyResourceFirst;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addPhyResourceFirst, janaacApplicationId,
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

	protected AddPhyResourceFirst getBygetJanaacById_PrevAndNext(
		Session session, AddPhyResourceFirst addPhyResourceFirst,
		long janaacApplicationId,
		OrderByComparator<AddPhyResourceFirst> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDPHYRESOURCEFIRST_WHERE);

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
			sb.append(AddPhyResourceFirstModelImpl.ORDER_BY_JPQL);
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
						addPhyResourceFirst)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddPhyResourceFirst> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add phy resource firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddPhyResourceFirst addPhyResourceFirst :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addPhyResourceFirst);
		}
	}

	/**
	 * Returns the number of add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add phy resource firsts
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDPHYRESOURCEFIRST_WHERE);

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
			"addPhyResourceFirst.janaacApplicationId = ?";

	public AddPhyResourceFirstPersistenceImpl() {
		setModelClass(AddPhyResourceFirst.class);

		setModelImplClass(AddPhyResourceFirstImpl.class);
		setModelPKClass(long.class);

		setTable(AddPhyResourceFirstTable.INSTANCE);
	}

	/**
	 * Caches the add phy resource first in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceFirst the add phy resource first
	 */
	@Override
	public void cacheResult(AddPhyResourceFirst addPhyResourceFirst) {
		entityCache.putResult(
			AddPhyResourceFirstImpl.class, addPhyResourceFirst.getPrimaryKey(),
			addPhyResourceFirst);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add phy resource firsts in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceFirsts the add phy resource firsts
	 */
	@Override
	public void cacheResult(List<AddPhyResourceFirst> addPhyResourceFirsts) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addPhyResourceFirsts.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddPhyResourceFirst addPhyResourceFirst : addPhyResourceFirsts) {
			if (entityCache.getResult(
					AddPhyResourceFirstImpl.class,
					addPhyResourceFirst.getPrimaryKey()) == null) {

				cacheResult(addPhyResourceFirst);
			}
		}
	}

	/**
	 * Clears the cache for all add phy resource firsts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddPhyResourceFirstImpl.class);

		finderCache.clearCache(AddPhyResourceFirstImpl.class);
	}

	/**
	 * Clears the cache for the add phy resource first.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddPhyResourceFirst addPhyResourceFirst) {
		entityCache.removeResult(
			AddPhyResourceFirstImpl.class, addPhyResourceFirst);
	}

	@Override
	public void clearCache(List<AddPhyResourceFirst> addPhyResourceFirsts) {
		for (AddPhyResourceFirst addPhyResourceFirst : addPhyResourceFirsts) {
			entityCache.removeResult(
				AddPhyResourceFirstImpl.class, addPhyResourceFirst);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddPhyResourceFirstImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AddPhyResourceFirstImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add phy resource first with the primary key. Does not add the add phy resource first to the database.
	 *
	 * @param addPhyResourceFirstId the primary key for the new add phy resource first
	 * @return the new add phy resource first
	 */
	@Override
	public AddPhyResourceFirst create(long addPhyResourceFirstId) {
		AddPhyResourceFirst addPhyResourceFirst = new AddPhyResourceFirstImpl();

		addPhyResourceFirst.setNew(true);
		addPhyResourceFirst.setPrimaryKey(addPhyResourceFirstId);

		addPhyResourceFirst.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addPhyResourceFirst;
	}

	/**
	 * Removes the add phy resource first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addPhyResourceFirstId the primary key of the add phy resource first
	 * @return the add phy resource first that was removed
	 * @throws NoSuchAddPhyResourceFirstException if a add phy resource first with the primary key could not be found
	 */
	@Override
	public AddPhyResourceFirst remove(long addPhyResourceFirstId)
		throws NoSuchAddPhyResourceFirstException {

		return remove((Serializable)addPhyResourceFirstId);
	}

	/**
	 * Removes the add phy resource first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add phy resource first
	 * @return the add phy resource first that was removed
	 * @throws NoSuchAddPhyResourceFirstException if a add phy resource first with the primary key could not be found
	 */
	@Override
	public AddPhyResourceFirst remove(Serializable primaryKey)
		throws NoSuchAddPhyResourceFirstException {

		Session session = null;

		try {
			session = openSession();

			AddPhyResourceFirst addPhyResourceFirst =
				(AddPhyResourceFirst)session.get(
					AddPhyResourceFirstImpl.class, primaryKey);

			if (addPhyResourceFirst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddPhyResourceFirstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addPhyResourceFirst);
		}
		catch (NoSuchAddPhyResourceFirstException noSuchEntityException) {
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
	protected AddPhyResourceFirst removeImpl(
		AddPhyResourceFirst addPhyResourceFirst) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addPhyResourceFirst)) {
				addPhyResourceFirst = (AddPhyResourceFirst)session.get(
					AddPhyResourceFirstImpl.class,
					addPhyResourceFirst.getPrimaryKeyObj());
			}

			if (addPhyResourceFirst != null) {
				session.delete(addPhyResourceFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addPhyResourceFirst != null) {
			clearCache(addPhyResourceFirst);
		}

		return addPhyResourceFirst;
	}

	@Override
	public AddPhyResourceFirst updateImpl(
		AddPhyResourceFirst addPhyResourceFirst) {

		boolean isNew = addPhyResourceFirst.isNew();

		if (!(addPhyResourceFirst instanceof AddPhyResourceFirstModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addPhyResourceFirst.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addPhyResourceFirst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addPhyResourceFirst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddPhyResourceFirst implementation " +
					addPhyResourceFirst.getClass());
		}

		AddPhyResourceFirstModelImpl addPhyResourceFirstModelImpl =
			(AddPhyResourceFirstModelImpl)addPhyResourceFirst;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addPhyResourceFirst.getCreateDate() == null)) {
			if (serviceContext == null) {
				addPhyResourceFirst.setCreateDate(date);
			}
			else {
				addPhyResourceFirst.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addPhyResourceFirstModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addPhyResourceFirst.setModifiedDate(date);
			}
			else {
				addPhyResourceFirst.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addPhyResourceFirst);
			}
			else {
				addPhyResourceFirst = (AddPhyResourceFirst)session.merge(
					addPhyResourceFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddPhyResourceFirstImpl.class, addPhyResourceFirstModelImpl, false,
			true);

		if (isNew) {
			addPhyResourceFirst.setNew(false);
		}

		addPhyResourceFirst.resetOriginalValues();

		return addPhyResourceFirst;
	}

	/**
	 * Returns the add phy resource first with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add phy resource first
	 * @return the add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a add phy resource first with the primary key could not be found
	 */
	@Override
	public AddPhyResourceFirst findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddPhyResourceFirstException {

		AddPhyResourceFirst addPhyResourceFirst = fetchByPrimaryKey(primaryKey);

		if (addPhyResourceFirst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddPhyResourceFirstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addPhyResourceFirst;
	}

	/**
	 * Returns the add phy resource first with the primary key or throws a <code>NoSuchAddPhyResourceFirstException</code> if it could not be found.
	 *
	 * @param addPhyResourceFirstId the primary key of the add phy resource first
	 * @return the add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a add phy resource first with the primary key could not be found
	 */
	@Override
	public AddPhyResourceFirst findByPrimaryKey(long addPhyResourceFirstId)
		throws NoSuchAddPhyResourceFirstException {

		return findByPrimaryKey((Serializable)addPhyResourceFirstId);
	}

	/**
	 * Returns the add phy resource first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addPhyResourceFirstId the primary key of the add phy resource first
	 * @return the add phy resource first, or <code>null</code> if a add phy resource first with the primary key could not be found
	 */
	@Override
	public AddPhyResourceFirst fetchByPrimaryKey(long addPhyResourceFirstId) {
		return fetchByPrimaryKey((Serializable)addPhyResourceFirstId);
	}

	/**
	 * Returns all the add phy resource firsts.
	 *
	 * @return the add phy resource firsts
	 */
	@Override
	public List<AddPhyResourceFirst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add phy resource firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @return the range of add phy resource firsts
	 */
	@Override
	public List<AddPhyResourceFirst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add phy resource firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add phy resource firsts
	 */
	@Override
	public List<AddPhyResourceFirst> findAll(
		int start, int end,
		OrderByComparator<AddPhyResourceFirst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add phy resource firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add phy resource firsts
	 */
	@Override
	public List<AddPhyResourceFirst> findAll(
		int start, int end,
		OrderByComparator<AddPhyResourceFirst> orderByComparator,
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

		List<AddPhyResourceFirst> list = null;

		if (useFinderCache) {
			list = (List<AddPhyResourceFirst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDPHYRESOURCEFIRST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDPHYRESOURCEFIRST;

				sql = sql.concat(AddPhyResourceFirstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddPhyResourceFirst>)QueryUtil.list(
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
	 * Removes all the add phy resource firsts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddPhyResourceFirst addPhyResourceFirst : findAll()) {
			remove(addPhyResourceFirst);
		}
	}

	/**
	 * Returns the number of add phy resource firsts.
	 *
	 * @return the number of add phy resource firsts
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
					_SQL_COUNT_ADDPHYRESOURCEFIRST);

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
		return "addPhyResourceFirstId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDPHYRESOURCEFIRST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddPhyResourceFirstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add phy resource first persistence.
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

		AddPhyResourceFirstUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddPhyResourceFirstUtil.setPersistence(null);

		entityCache.removeCache(AddPhyResourceFirstImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDPHYRESOURCEFIRST =
		"SELECT addPhyResourceFirst FROM AddPhyResourceFirst addPhyResourceFirst";

	private static final String _SQL_SELECT_ADDPHYRESOURCEFIRST_WHERE =
		"SELECT addPhyResourceFirst FROM AddPhyResourceFirst addPhyResourceFirst WHERE ";

	private static final String _SQL_COUNT_ADDPHYRESOURCEFIRST =
		"SELECT COUNT(addPhyResourceFirst) FROM AddPhyResourceFirst addPhyResourceFirst";

	private static final String _SQL_COUNT_ADDPHYRESOURCEFIRST_WHERE =
		"SELECT COUNT(addPhyResourceFirst) FROM AddPhyResourceFirst addPhyResourceFirst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "addPhyResourceFirst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddPhyResourceFirst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddPhyResourceFirst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddPhyResourceFirstPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}