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

import com.nbp.janaac.application.form.service.exception.NoSuchAddInsOrgInfoSecondException;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecondTable;
import com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoSecondImpl;
import com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoSecondModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddInsOrgInfoSecondPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddInsOrgInfoSecondUtil;
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
 * The persistence implementation for the add ins org info second service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddInsOrgInfoSecondPersistence.class)
public class AddInsOrgInfoSecondPersistenceImpl
	extends BasePersistenceImpl<AddInsOrgInfoSecond>
	implements AddInsOrgInfoSecondPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddInsOrgInfoSecondUtil</code> to access the add ins org info second persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddInsOrgInfoSecondImpl.class.getName();

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
	 * Returns all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins org info seconds
	 */
	@Override
	public List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @return the range of matching add ins org info seconds
	 */
	@Override
	public List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins org info seconds
	 */
	@Override
	public List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins org info seconds
	 */
	@Override
	public List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator,
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

		List<AddInsOrgInfoSecond> list = null;

		if (useFinderCache) {
			list = (List<AddInsOrgInfoSecond>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddInsOrgInfoSecond addInsOrgInfoSecond : list) {
					if (janaacApplicationId !=
							addInsOrgInfoSecond.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDINSORGINFOSECOND_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddInsOrgInfoSecondModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddInsOrgInfoSecond>)QueryUtil.list(
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
	 * Returns the first add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a matching add ins org info second could not be found
	 */
	@Override
	public AddInsOrgInfoSecond findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoSecond> orderByComparator)
		throws NoSuchAddInsOrgInfoSecondException {

		AddInsOrgInfoSecond addInsOrgInfoSecond = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addInsOrgInfoSecond != null) {
			return addInsOrgInfoSecond;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddInsOrgInfoSecondException(sb.toString());
	}

	/**
	 * Returns the first add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info second, or <code>null</code> if a matching add ins org info second could not be found
	 */
	@Override
	public AddInsOrgInfoSecond fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator) {

		List<AddInsOrgInfoSecond> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a matching add ins org info second could not be found
	 */
	@Override
	public AddInsOrgInfoSecond findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoSecond> orderByComparator)
		throws NoSuchAddInsOrgInfoSecondException {

		AddInsOrgInfoSecond addInsOrgInfoSecond = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addInsOrgInfoSecond != null) {
			return addInsOrgInfoSecond;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddInsOrgInfoSecondException(sb.toString());
	}

	/**
	 * Returns the last add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info second, or <code>null</code> if a matching add ins org info second could not be found
	 */
	@Override
	public AddInsOrgInfoSecond fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddInsOrgInfoSecond> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add ins org info seconds before and after the current add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the current add ins org info second
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a add ins org info second with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoSecond[] findBygetJanaacById_PrevAndNext(
			long addInsOrgInfoSecondId, long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoSecond> orderByComparator)
		throws NoSuchAddInsOrgInfoSecondException {

		AddInsOrgInfoSecond addInsOrgInfoSecond = findByPrimaryKey(
			addInsOrgInfoSecondId);

		Session session = null;

		try {
			session = openSession();

			AddInsOrgInfoSecond[] array = new AddInsOrgInfoSecondImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addInsOrgInfoSecond, janaacApplicationId,
				orderByComparator, true);

			array[1] = addInsOrgInfoSecond;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addInsOrgInfoSecond, janaacApplicationId,
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

	protected AddInsOrgInfoSecond getBygetJanaacById_PrevAndNext(
		Session session, AddInsOrgInfoSecond addInsOrgInfoSecond,
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDINSORGINFOSECOND_WHERE);

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
			sb.append(AddInsOrgInfoSecondModelImpl.ORDER_BY_JPQL);
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
						addInsOrgInfoSecond)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddInsOrgInfoSecond> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add ins org info seconds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddInsOrgInfoSecond addInsOrgInfoSecond :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addInsOrgInfoSecond);
		}
	}

	/**
	 * Returns the number of add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins org info seconds
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDINSORGINFOSECOND_WHERE);

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
			"addInsOrgInfoSecond.janaacApplicationId = ?";

	public AddInsOrgInfoSecondPersistenceImpl() {
		setModelClass(AddInsOrgInfoSecond.class);

		setModelImplClass(AddInsOrgInfoSecondImpl.class);
		setModelPKClass(long.class);

		setTable(AddInsOrgInfoSecondTable.INSTANCE);
	}

	/**
	 * Caches the add ins org info second in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoSecond the add ins org info second
	 */
	@Override
	public void cacheResult(AddInsOrgInfoSecond addInsOrgInfoSecond) {
		entityCache.putResult(
			AddInsOrgInfoSecondImpl.class, addInsOrgInfoSecond.getPrimaryKey(),
			addInsOrgInfoSecond);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add ins org info seconds in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoSeconds the add ins org info seconds
	 */
	@Override
	public void cacheResult(List<AddInsOrgInfoSecond> addInsOrgInfoSeconds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addInsOrgInfoSeconds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddInsOrgInfoSecond addInsOrgInfoSecond : addInsOrgInfoSeconds) {
			if (entityCache.getResult(
					AddInsOrgInfoSecondImpl.class,
					addInsOrgInfoSecond.getPrimaryKey()) == null) {

				cacheResult(addInsOrgInfoSecond);
			}
		}
	}

	/**
	 * Clears the cache for all add ins org info seconds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddInsOrgInfoSecondImpl.class);

		finderCache.clearCache(AddInsOrgInfoSecondImpl.class);
	}

	/**
	 * Clears the cache for the add ins org info second.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddInsOrgInfoSecond addInsOrgInfoSecond) {
		entityCache.removeResult(
			AddInsOrgInfoSecondImpl.class, addInsOrgInfoSecond);
	}

	@Override
	public void clearCache(List<AddInsOrgInfoSecond> addInsOrgInfoSeconds) {
		for (AddInsOrgInfoSecond addInsOrgInfoSecond : addInsOrgInfoSeconds) {
			entityCache.removeResult(
				AddInsOrgInfoSecondImpl.class, addInsOrgInfoSecond);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddInsOrgInfoSecondImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AddInsOrgInfoSecondImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add ins org info second with the primary key. Does not add the add ins org info second to the database.
	 *
	 * @param addInsOrgInfoSecondId the primary key for the new add ins org info second
	 * @return the new add ins org info second
	 */
	@Override
	public AddInsOrgInfoSecond create(long addInsOrgInfoSecondId) {
		AddInsOrgInfoSecond addInsOrgInfoSecond = new AddInsOrgInfoSecondImpl();

		addInsOrgInfoSecond.setNew(true);
		addInsOrgInfoSecond.setPrimaryKey(addInsOrgInfoSecondId);

		addInsOrgInfoSecond.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addInsOrgInfoSecond;
	}

	/**
	 * Removes the add ins org info second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the add ins org info second
	 * @return the add ins org info second that was removed
	 * @throws NoSuchAddInsOrgInfoSecondException if a add ins org info second with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoSecond remove(long addInsOrgInfoSecondId)
		throws NoSuchAddInsOrgInfoSecondException {

		return remove((Serializable)addInsOrgInfoSecondId);
	}

	/**
	 * Removes the add ins org info second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add ins org info second
	 * @return the add ins org info second that was removed
	 * @throws NoSuchAddInsOrgInfoSecondException if a add ins org info second with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoSecond remove(Serializable primaryKey)
		throws NoSuchAddInsOrgInfoSecondException {

		Session session = null;

		try {
			session = openSession();

			AddInsOrgInfoSecond addInsOrgInfoSecond =
				(AddInsOrgInfoSecond)session.get(
					AddInsOrgInfoSecondImpl.class, primaryKey);

			if (addInsOrgInfoSecond == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddInsOrgInfoSecondException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addInsOrgInfoSecond);
		}
		catch (NoSuchAddInsOrgInfoSecondException noSuchEntityException) {
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
	protected AddInsOrgInfoSecond removeImpl(
		AddInsOrgInfoSecond addInsOrgInfoSecond) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addInsOrgInfoSecond)) {
				addInsOrgInfoSecond = (AddInsOrgInfoSecond)session.get(
					AddInsOrgInfoSecondImpl.class,
					addInsOrgInfoSecond.getPrimaryKeyObj());
			}

			if (addInsOrgInfoSecond != null) {
				session.delete(addInsOrgInfoSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addInsOrgInfoSecond != null) {
			clearCache(addInsOrgInfoSecond);
		}

		return addInsOrgInfoSecond;
	}

	@Override
	public AddInsOrgInfoSecond updateImpl(
		AddInsOrgInfoSecond addInsOrgInfoSecond) {

		boolean isNew = addInsOrgInfoSecond.isNew();

		if (!(addInsOrgInfoSecond instanceof AddInsOrgInfoSecondModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addInsOrgInfoSecond.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addInsOrgInfoSecond);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addInsOrgInfoSecond proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddInsOrgInfoSecond implementation " +
					addInsOrgInfoSecond.getClass());
		}

		AddInsOrgInfoSecondModelImpl addInsOrgInfoSecondModelImpl =
			(AddInsOrgInfoSecondModelImpl)addInsOrgInfoSecond;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addInsOrgInfoSecond.getCreateDate() == null)) {
			if (serviceContext == null) {
				addInsOrgInfoSecond.setCreateDate(date);
			}
			else {
				addInsOrgInfoSecond.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addInsOrgInfoSecondModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addInsOrgInfoSecond.setModifiedDate(date);
			}
			else {
				addInsOrgInfoSecond.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addInsOrgInfoSecond);
			}
			else {
				addInsOrgInfoSecond = (AddInsOrgInfoSecond)session.merge(
					addInsOrgInfoSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddInsOrgInfoSecondImpl.class, addInsOrgInfoSecondModelImpl, false,
			true);

		if (isNew) {
			addInsOrgInfoSecond.setNew(false);
		}

		addInsOrgInfoSecond.resetOriginalValues();

		return addInsOrgInfoSecond;
	}

	/**
	 * Returns the add ins org info second with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add ins org info second
	 * @return the add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a add ins org info second with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoSecond findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddInsOrgInfoSecondException {

		AddInsOrgInfoSecond addInsOrgInfoSecond = fetchByPrimaryKey(primaryKey);

		if (addInsOrgInfoSecond == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddInsOrgInfoSecondException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addInsOrgInfoSecond;
	}

	/**
	 * Returns the add ins org info second with the primary key or throws a <code>NoSuchAddInsOrgInfoSecondException</code> if it could not be found.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the add ins org info second
	 * @return the add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a add ins org info second with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoSecond findByPrimaryKey(long addInsOrgInfoSecondId)
		throws NoSuchAddInsOrgInfoSecondException {

		return findByPrimaryKey((Serializable)addInsOrgInfoSecondId);
	}

	/**
	 * Returns the add ins org info second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the add ins org info second
	 * @return the add ins org info second, or <code>null</code> if a add ins org info second with the primary key could not be found
	 */
	@Override
	public AddInsOrgInfoSecond fetchByPrimaryKey(long addInsOrgInfoSecondId) {
		return fetchByPrimaryKey((Serializable)addInsOrgInfoSecondId);
	}

	/**
	 * Returns all the add ins org info seconds.
	 *
	 * @return the add ins org info seconds
	 */
	@Override
	public List<AddInsOrgInfoSecond> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add ins org info seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @return the range of add ins org info seconds
	 */
	@Override
	public List<AddInsOrgInfoSecond> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add ins org info seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins org info seconds
	 */
	@Override
	public List<AddInsOrgInfoSecond> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add ins org info seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins org info seconds
	 */
	@Override
	public List<AddInsOrgInfoSecond> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator,
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

		List<AddInsOrgInfoSecond> list = null;

		if (useFinderCache) {
			list = (List<AddInsOrgInfoSecond>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDINSORGINFOSECOND);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDINSORGINFOSECOND;

				sql = sql.concat(AddInsOrgInfoSecondModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddInsOrgInfoSecond>)QueryUtil.list(
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
	 * Removes all the add ins org info seconds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddInsOrgInfoSecond addInsOrgInfoSecond : findAll()) {
			remove(addInsOrgInfoSecond);
		}
	}

	/**
	 * Returns the number of add ins org info seconds.
	 *
	 * @return the number of add ins org info seconds
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
					_SQL_COUNT_ADDINSORGINFOSECOND);

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
		return "addInsOrgInfoSecondId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDINSORGINFOSECOND;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddInsOrgInfoSecondModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add ins org info second persistence.
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

		AddInsOrgInfoSecondUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddInsOrgInfoSecondUtil.setPersistence(null);

		entityCache.removeCache(AddInsOrgInfoSecondImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDINSORGINFOSECOND =
		"SELECT addInsOrgInfoSecond FROM AddInsOrgInfoSecond addInsOrgInfoSecond";

	private static final String _SQL_SELECT_ADDINSORGINFOSECOND_WHERE =
		"SELECT addInsOrgInfoSecond FROM AddInsOrgInfoSecond addInsOrgInfoSecond WHERE ";

	private static final String _SQL_COUNT_ADDINSORGINFOSECOND =
		"SELECT COUNT(addInsOrgInfoSecond) FROM AddInsOrgInfoSecond addInsOrgInfoSecond";

	private static final String _SQL_COUNT_ADDINSORGINFOSECOND_WHERE =
		"SELECT COUNT(addInsOrgInfoSecond) FROM AddInsOrgInfoSecond addInsOrgInfoSecond WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "addInsOrgInfoSecond.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddInsOrgInfoSecond exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddInsOrgInfoSecond exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddInsOrgInfoSecondPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}