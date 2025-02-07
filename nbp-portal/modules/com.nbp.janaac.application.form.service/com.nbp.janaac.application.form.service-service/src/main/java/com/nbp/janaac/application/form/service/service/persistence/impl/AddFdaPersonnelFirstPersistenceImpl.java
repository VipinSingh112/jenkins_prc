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

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaPersonnelFirstException;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirstTable;
import com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFirstImpl;
import com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFirstModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelFirstUtil;
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
 * The persistence implementation for the add fda personnel first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddFdaPersonnelFirstPersistence.class)
public class AddFdaPersonnelFirstPersistenceImpl
	extends BasePersistenceImpl<AddFdaPersonnelFirst>
	implements AddFdaPersonnelFirstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddFdaPersonnelFirstUtil</code> to access the add fda personnel first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddFdaPersonnelFirstImpl.class.getName();

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
	 * Returns all the add fda personnel firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda personnel firsts
	 */
	@Override
	public List<AddFdaPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @return the range of matching add fda personnel firsts
	 */
	@Override
	public List<AddFdaPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda personnel firsts
	 */
	@Override
	public List<AddFdaPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelFirst> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda personnel firsts
	 */
	@Override
	public List<AddFdaPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelFirst> orderByComparator,
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

		List<AddFdaPersonnelFirst> list = null;

		if (useFinderCache) {
			list = (List<AddFdaPersonnelFirst>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddFdaPersonnelFirst addFdaPersonnelFirst : list) {
					if (janaacApplicationId !=
							addFdaPersonnelFirst.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDFDAPERSONNELFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddFdaPersonnelFirstModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddFdaPersonnelFirst>)QueryUtil.list(
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
	 * Returns the first add fda personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel first
	 * @throws NoSuchAddFdaPersonnelFirstException if a matching add fda personnel first could not be found
	 */
	@Override
	public AddFdaPersonnelFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelFirst> orderByComparator)
		throws NoSuchAddFdaPersonnelFirstException {

		AddFdaPersonnelFirst addFdaPersonnelFirst = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addFdaPersonnelFirst != null) {
			return addFdaPersonnelFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaPersonnelFirstException(sb.toString());
	}

	/**
	 * Returns the first add fda personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel first, or <code>null</code> if a matching add fda personnel first could not be found
	 */
	@Override
	public AddFdaPersonnelFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelFirst> orderByComparator) {

		List<AddFdaPersonnelFirst> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add fda personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel first
	 * @throws NoSuchAddFdaPersonnelFirstException if a matching add fda personnel first could not be found
	 */
	@Override
	public AddFdaPersonnelFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelFirst> orderByComparator)
		throws NoSuchAddFdaPersonnelFirstException {

		AddFdaPersonnelFirst addFdaPersonnelFirst = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addFdaPersonnelFirst != null) {
			return addFdaPersonnelFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaPersonnelFirstException(sb.toString());
	}

	/**
	 * Returns the last add fda personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel first, or <code>null</code> if a matching add fda personnel first could not be found
	 */
	@Override
	public AddFdaPersonnelFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelFirst> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddFdaPersonnelFirst> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add fda personnel firsts before and after the current add fda personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaPersonnelFirstId the primary key of the current add fda personnel first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda personnel first
	 * @throws NoSuchAddFdaPersonnelFirstException if a add fda personnel first with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFirst[] findBygetJanaacById_PrevAndNext(
			long addFdaPersonnelFirstId, long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelFirst> orderByComparator)
		throws NoSuchAddFdaPersonnelFirstException {

		AddFdaPersonnelFirst addFdaPersonnelFirst = findByPrimaryKey(
			addFdaPersonnelFirstId);

		Session session = null;

		try {
			session = openSession();

			AddFdaPersonnelFirst[] array = new AddFdaPersonnelFirstImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addFdaPersonnelFirst, janaacApplicationId,
				orderByComparator, true);

			array[1] = addFdaPersonnelFirst;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addFdaPersonnelFirst, janaacApplicationId,
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

	protected AddFdaPersonnelFirst getBygetJanaacById_PrevAndNext(
		Session session, AddFdaPersonnelFirst addFdaPersonnelFirst,
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelFirst> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDFDAPERSONNELFIRST_WHERE);

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
			sb.append(AddFdaPersonnelFirstModelImpl.ORDER_BY_JPQL);
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
						addFdaPersonnelFirst)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddFdaPersonnelFirst> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add fda personnel firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddFdaPersonnelFirst addFdaPersonnelFirst :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addFdaPersonnelFirst);
		}
	}

	/**
	 * Returns the number of add fda personnel firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda personnel firsts
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDFDAPERSONNELFIRST_WHERE);

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
			"addFdaPersonnelFirst.janaacApplicationId = ?";

	public AddFdaPersonnelFirstPersistenceImpl() {
		setModelClass(AddFdaPersonnelFirst.class);

		setModelImplClass(AddFdaPersonnelFirstImpl.class);
		setModelPKClass(long.class);

		setTable(AddFdaPersonnelFirstTable.INSTANCE);
	}

	/**
	 * Caches the add fda personnel first in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelFirst the add fda personnel first
	 */
	@Override
	public void cacheResult(AddFdaPersonnelFirst addFdaPersonnelFirst) {
		entityCache.putResult(
			AddFdaPersonnelFirstImpl.class,
			addFdaPersonnelFirst.getPrimaryKey(), addFdaPersonnelFirst);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add fda personnel firsts in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelFirsts the add fda personnel firsts
	 */
	@Override
	public void cacheResult(List<AddFdaPersonnelFirst> addFdaPersonnelFirsts) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addFdaPersonnelFirsts.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddFdaPersonnelFirst addFdaPersonnelFirst :
				addFdaPersonnelFirsts) {

			if (entityCache.getResult(
					AddFdaPersonnelFirstImpl.class,
					addFdaPersonnelFirst.getPrimaryKey()) == null) {

				cacheResult(addFdaPersonnelFirst);
			}
		}
	}

	/**
	 * Clears the cache for all add fda personnel firsts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddFdaPersonnelFirstImpl.class);

		finderCache.clearCache(AddFdaPersonnelFirstImpl.class);
	}

	/**
	 * Clears the cache for the add fda personnel first.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddFdaPersonnelFirst addFdaPersonnelFirst) {
		entityCache.removeResult(
			AddFdaPersonnelFirstImpl.class, addFdaPersonnelFirst);
	}

	@Override
	public void clearCache(List<AddFdaPersonnelFirst> addFdaPersonnelFirsts) {
		for (AddFdaPersonnelFirst addFdaPersonnelFirst :
				addFdaPersonnelFirsts) {

			entityCache.removeResult(
				AddFdaPersonnelFirstImpl.class, addFdaPersonnelFirst);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddFdaPersonnelFirstImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddFdaPersonnelFirstImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add fda personnel first with the primary key. Does not add the add fda personnel first to the database.
	 *
	 * @param addFdaPersonnelFirstId the primary key for the new add fda personnel first
	 * @return the new add fda personnel first
	 */
	@Override
	public AddFdaPersonnelFirst create(long addFdaPersonnelFirstId) {
		AddFdaPersonnelFirst addFdaPersonnelFirst =
			new AddFdaPersonnelFirstImpl();

		addFdaPersonnelFirst.setNew(true);
		addFdaPersonnelFirst.setPrimaryKey(addFdaPersonnelFirstId);

		addFdaPersonnelFirst.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addFdaPersonnelFirst;
	}

	/**
	 * Removes the add fda personnel first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaPersonnelFirstId the primary key of the add fda personnel first
	 * @return the add fda personnel first that was removed
	 * @throws NoSuchAddFdaPersonnelFirstException if a add fda personnel first with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFirst remove(long addFdaPersonnelFirstId)
		throws NoSuchAddFdaPersonnelFirstException {

		return remove((Serializable)addFdaPersonnelFirstId);
	}

	/**
	 * Removes the add fda personnel first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add fda personnel first
	 * @return the add fda personnel first that was removed
	 * @throws NoSuchAddFdaPersonnelFirstException if a add fda personnel first with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFirst remove(Serializable primaryKey)
		throws NoSuchAddFdaPersonnelFirstException {

		Session session = null;

		try {
			session = openSession();

			AddFdaPersonnelFirst addFdaPersonnelFirst =
				(AddFdaPersonnelFirst)session.get(
					AddFdaPersonnelFirstImpl.class, primaryKey);

			if (addFdaPersonnelFirst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddFdaPersonnelFirstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addFdaPersonnelFirst);
		}
		catch (NoSuchAddFdaPersonnelFirstException noSuchEntityException) {
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
	protected AddFdaPersonnelFirst removeImpl(
		AddFdaPersonnelFirst addFdaPersonnelFirst) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addFdaPersonnelFirst)) {
				addFdaPersonnelFirst = (AddFdaPersonnelFirst)session.get(
					AddFdaPersonnelFirstImpl.class,
					addFdaPersonnelFirst.getPrimaryKeyObj());
			}

			if (addFdaPersonnelFirst != null) {
				session.delete(addFdaPersonnelFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addFdaPersonnelFirst != null) {
			clearCache(addFdaPersonnelFirst);
		}

		return addFdaPersonnelFirst;
	}

	@Override
	public AddFdaPersonnelFirst updateImpl(
		AddFdaPersonnelFirst addFdaPersonnelFirst) {

		boolean isNew = addFdaPersonnelFirst.isNew();

		if (!(addFdaPersonnelFirst instanceof AddFdaPersonnelFirstModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addFdaPersonnelFirst.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addFdaPersonnelFirst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addFdaPersonnelFirst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddFdaPersonnelFirst implementation " +
					addFdaPersonnelFirst.getClass());
		}

		AddFdaPersonnelFirstModelImpl addFdaPersonnelFirstModelImpl =
			(AddFdaPersonnelFirstModelImpl)addFdaPersonnelFirst;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addFdaPersonnelFirst.getCreateDate() == null)) {
			if (serviceContext == null) {
				addFdaPersonnelFirst.setCreateDate(date);
			}
			else {
				addFdaPersonnelFirst.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addFdaPersonnelFirstModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addFdaPersonnelFirst.setModifiedDate(date);
			}
			else {
				addFdaPersonnelFirst.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addFdaPersonnelFirst);
			}
			else {
				addFdaPersonnelFirst = (AddFdaPersonnelFirst)session.merge(
					addFdaPersonnelFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddFdaPersonnelFirstImpl.class, addFdaPersonnelFirstModelImpl,
			false, true);

		if (isNew) {
			addFdaPersonnelFirst.setNew(false);
		}

		addFdaPersonnelFirst.resetOriginalValues();

		return addFdaPersonnelFirst;
	}

	/**
	 * Returns the add fda personnel first with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add fda personnel first
	 * @return the add fda personnel first
	 * @throws NoSuchAddFdaPersonnelFirstException if a add fda personnel first with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFirst findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddFdaPersonnelFirstException {

		AddFdaPersonnelFirst addFdaPersonnelFirst = fetchByPrimaryKey(
			primaryKey);

		if (addFdaPersonnelFirst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddFdaPersonnelFirstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addFdaPersonnelFirst;
	}

	/**
	 * Returns the add fda personnel first with the primary key or throws a <code>NoSuchAddFdaPersonnelFirstException</code> if it could not be found.
	 *
	 * @param addFdaPersonnelFirstId the primary key of the add fda personnel first
	 * @return the add fda personnel first
	 * @throws NoSuchAddFdaPersonnelFirstException if a add fda personnel first with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFirst findByPrimaryKey(long addFdaPersonnelFirstId)
		throws NoSuchAddFdaPersonnelFirstException {

		return findByPrimaryKey((Serializable)addFdaPersonnelFirstId);
	}

	/**
	 * Returns the add fda personnel first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaPersonnelFirstId the primary key of the add fda personnel first
	 * @return the add fda personnel first, or <code>null</code> if a add fda personnel first with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFirst fetchByPrimaryKey(long addFdaPersonnelFirstId) {
		return fetchByPrimaryKey((Serializable)addFdaPersonnelFirstId);
	}

	/**
	 * Returns all the add fda personnel firsts.
	 *
	 * @return the add fda personnel firsts
	 */
	@Override
	public List<AddFdaPersonnelFirst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @return the range of add fda personnel firsts
	 */
	@Override
	public List<AddFdaPersonnelFirst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda personnel firsts
	 */
	@Override
	public List<AddFdaPersonnelFirst> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelFirst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda personnel firsts
	 */
	@Override
	public List<AddFdaPersonnelFirst> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelFirst> orderByComparator,
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

		List<AddFdaPersonnelFirst> list = null;

		if (useFinderCache) {
			list = (List<AddFdaPersonnelFirst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDFDAPERSONNELFIRST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDFDAPERSONNELFIRST;

				sql = sql.concat(AddFdaPersonnelFirstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddFdaPersonnelFirst>)QueryUtil.list(
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
	 * Removes all the add fda personnel firsts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddFdaPersonnelFirst addFdaPersonnelFirst : findAll()) {
			remove(addFdaPersonnelFirst);
		}
	}

	/**
	 * Returns the number of add fda personnel firsts.
	 *
	 * @return the number of add fda personnel firsts
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
					_SQL_COUNT_ADDFDAPERSONNELFIRST);

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
		return "addFdaPersonnelFirstId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDFDAPERSONNELFIRST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddFdaPersonnelFirstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add fda personnel first persistence.
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

		AddFdaPersonnelFirstUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddFdaPersonnelFirstUtil.setPersistence(null);

		entityCache.removeCache(AddFdaPersonnelFirstImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDFDAPERSONNELFIRST =
		"SELECT addFdaPersonnelFirst FROM AddFdaPersonnelFirst addFdaPersonnelFirst";

	private static final String _SQL_SELECT_ADDFDAPERSONNELFIRST_WHERE =
		"SELECT addFdaPersonnelFirst FROM AddFdaPersonnelFirst addFdaPersonnelFirst WHERE ";

	private static final String _SQL_COUNT_ADDFDAPERSONNELFIRST =
		"SELECT COUNT(addFdaPersonnelFirst) FROM AddFdaPersonnelFirst addFdaPersonnelFirst";

	private static final String _SQL_COUNT_ADDFDAPERSONNELFIRST_WHERE =
		"SELECT COUNT(addFdaPersonnelFirst) FROM AddFdaPersonnelFirst addFdaPersonnelFirst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addFdaPersonnelFirst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddFdaPersonnelFirst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddFdaPersonnelFirst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddFdaPersonnelFirstPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}