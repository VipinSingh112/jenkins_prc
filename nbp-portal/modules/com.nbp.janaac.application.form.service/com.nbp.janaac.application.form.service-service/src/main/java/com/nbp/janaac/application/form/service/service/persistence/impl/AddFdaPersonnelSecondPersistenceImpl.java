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
import com.liferay.portal.kernel.util.SetUtil;

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaPersonnelSecondException;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecondTable;
import com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelSecondImpl;
import com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelSecondModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelSecondPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelSecondUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add fda personnel second service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddFdaPersonnelSecondPersistence.class)
public class AddFdaPersonnelSecondPersistenceImpl
	extends BasePersistenceImpl<AddFdaPersonnelSecond>
	implements AddFdaPersonnelSecondPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddFdaPersonnelSecondUtil</code> to access the add fda personnel second persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddFdaPersonnelSecondImpl.class.getName();

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
	 * Returns all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda personnel seconds
	 */
	@Override
	public List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @return the range of matching add fda personnel seconds
	 */
	@Override
	public List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda personnel seconds
	 */
	@Override
	public List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda personnel seconds
	 */
	@Override
	public List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator,
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

		List<AddFdaPersonnelSecond> list = null;

		if (useFinderCache) {
			list = (List<AddFdaPersonnelSecond>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddFdaPersonnelSecond addFdaPersonnelSecond : list) {
					if (janaacApplicationId !=
							addFdaPersonnelSecond.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDFDAPERSONNELSECOND_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddFdaPersonnelSecondModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddFdaPersonnelSecond>)QueryUtil.list(
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
	 * Returns the first add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a matching add fda personnel second could not be found
	 */
	@Override
	public AddFdaPersonnelSecond findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelSecond> orderByComparator)
		throws NoSuchAddFdaPersonnelSecondException {

		AddFdaPersonnelSecond addFdaPersonnelSecond =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addFdaPersonnelSecond != null) {
			return addFdaPersonnelSecond;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaPersonnelSecondException(sb.toString());
	}

	/**
	 * Returns the first add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel second, or <code>null</code> if a matching add fda personnel second could not be found
	 */
	@Override
	public AddFdaPersonnelSecond fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator) {

		List<AddFdaPersonnelSecond> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a matching add fda personnel second could not be found
	 */
	@Override
	public AddFdaPersonnelSecond findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelSecond> orderByComparator)
		throws NoSuchAddFdaPersonnelSecondException {

		AddFdaPersonnelSecond addFdaPersonnelSecond = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addFdaPersonnelSecond != null) {
			return addFdaPersonnelSecond;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaPersonnelSecondException(sb.toString());
	}

	/**
	 * Returns the last add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel second, or <code>null</code> if a matching add fda personnel second could not be found
	 */
	@Override
	public AddFdaPersonnelSecond fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddFdaPersonnelSecond> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add fda personnel seconds before and after the current add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the current add fda personnel second
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a add fda personnel second with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelSecond[] findBygetJanaacById_PrevAndNext(
			long addFdaPersonnelSecondId, long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelSecond> orderByComparator)
		throws NoSuchAddFdaPersonnelSecondException {

		AddFdaPersonnelSecond addFdaPersonnelSecond = findByPrimaryKey(
			addFdaPersonnelSecondId);

		Session session = null;

		try {
			session = openSession();

			AddFdaPersonnelSecond[] array = new AddFdaPersonnelSecondImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addFdaPersonnelSecond, janaacApplicationId,
				orderByComparator, true);

			array[1] = addFdaPersonnelSecond;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addFdaPersonnelSecond, janaacApplicationId,
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

	protected AddFdaPersonnelSecond getBygetJanaacById_PrevAndNext(
		Session session, AddFdaPersonnelSecond addFdaPersonnelSecond,
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDFDAPERSONNELSECOND_WHERE);

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
			sb.append(AddFdaPersonnelSecondModelImpl.ORDER_BY_JPQL);
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
						addFdaPersonnelSecond)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddFdaPersonnelSecond> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add fda personnel seconds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddFdaPersonnelSecond addFdaPersonnelSecond :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addFdaPersonnelSecond);
		}
	}

	/**
	 * Returns the number of add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda personnel seconds
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDFDAPERSONNELSECOND_WHERE);

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
			"addFdaPersonnelSecond.janaacApplicationId = ?";

	public AddFdaPersonnelSecondPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("role", "role_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AddFdaPersonnelSecond.class);

		setModelImplClass(AddFdaPersonnelSecondImpl.class);
		setModelPKClass(long.class);

		setTable(AddFdaPersonnelSecondTable.INSTANCE);
	}

	/**
	 * Caches the add fda personnel second in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelSecond the add fda personnel second
	 */
	@Override
	public void cacheResult(AddFdaPersonnelSecond addFdaPersonnelSecond) {
		entityCache.putResult(
			AddFdaPersonnelSecondImpl.class,
			addFdaPersonnelSecond.getPrimaryKey(), addFdaPersonnelSecond);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add fda personnel seconds in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelSeconds the add fda personnel seconds
	 */
	@Override
	public void cacheResult(
		List<AddFdaPersonnelSecond> addFdaPersonnelSeconds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addFdaPersonnelSeconds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddFdaPersonnelSecond addFdaPersonnelSecond :
				addFdaPersonnelSeconds) {

			if (entityCache.getResult(
					AddFdaPersonnelSecondImpl.class,
					addFdaPersonnelSecond.getPrimaryKey()) == null) {

				cacheResult(addFdaPersonnelSecond);
			}
		}
	}

	/**
	 * Clears the cache for all add fda personnel seconds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddFdaPersonnelSecondImpl.class);

		finderCache.clearCache(AddFdaPersonnelSecondImpl.class);
	}

	/**
	 * Clears the cache for the add fda personnel second.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddFdaPersonnelSecond addFdaPersonnelSecond) {
		entityCache.removeResult(
			AddFdaPersonnelSecondImpl.class, addFdaPersonnelSecond);
	}

	@Override
	public void clearCache(List<AddFdaPersonnelSecond> addFdaPersonnelSeconds) {
		for (AddFdaPersonnelSecond addFdaPersonnelSecond :
				addFdaPersonnelSeconds) {

			entityCache.removeResult(
				AddFdaPersonnelSecondImpl.class, addFdaPersonnelSecond);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddFdaPersonnelSecondImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddFdaPersonnelSecondImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add fda personnel second with the primary key. Does not add the add fda personnel second to the database.
	 *
	 * @param addFdaPersonnelSecondId the primary key for the new add fda personnel second
	 * @return the new add fda personnel second
	 */
	@Override
	public AddFdaPersonnelSecond create(long addFdaPersonnelSecondId) {
		AddFdaPersonnelSecond addFdaPersonnelSecond =
			new AddFdaPersonnelSecondImpl();

		addFdaPersonnelSecond.setNew(true);
		addFdaPersonnelSecond.setPrimaryKey(addFdaPersonnelSecondId);

		addFdaPersonnelSecond.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addFdaPersonnelSecond;
	}

	/**
	 * Removes the add fda personnel second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the add fda personnel second
	 * @return the add fda personnel second that was removed
	 * @throws NoSuchAddFdaPersonnelSecondException if a add fda personnel second with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelSecond remove(long addFdaPersonnelSecondId)
		throws NoSuchAddFdaPersonnelSecondException {

		return remove((Serializable)addFdaPersonnelSecondId);
	}

	/**
	 * Removes the add fda personnel second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add fda personnel second
	 * @return the add fda personnel second that was removed
	 * @throws NoSuchAddFdaPersonnelSecondException if a add fda personnel second with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelSecond remove(Serializable primaryKey)
		throws NoSuchAddFdaPersonnelSecondException {

		Session session = null;

		try {
			session = openSession();

			AddFdaPersonnelSecond addFdaPersonnelSecond =
				(AddFdaPersonnelSecond)session.get(
					AddFdaPersonnelSecondImpl.class, primaryKey);

			if (addFdaPersonnelSecond == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddFdaPersonnelSecondException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addFdaPersonnelSecond);
		}
		catch (NoSuchAddFdaPersonnelSecondException noSuchEntityException) {
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
	protected AddFdaPersonnelSecond removeImpl(
		AddFdaPersonnelSecond addFdaPersonnelSecond) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addFdaPersonnelSecond)) {
				addFdaPersonnelSecond = (AddFdaPersonnelSecond)session.get(
					AddFdaPersonnelSecondImpl.class,
					addFdaPersonnelSecond.getPrimaryKeyObj());
			}

			if (addFdaPersonnelSecond != null) {
				session.delete(addFdaPersonnelSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addFdaPersonnelSecond != null) {
			clearCache(addFdaPersonnelSecond);
		}

		return addFdaPersonnelSecond;
	}

	@Override
	public AddFdaPersonnelSecond updateImpl(
		AddFdaPersonnelSecond addFdaPersonnelSecond) {

		boolean isNew = addFdaPersonnelSecond.isNew();

		if (!(addFdaPersonnelSecond instanceof
				AddFdaPersonnelSecondModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addFdaPersonnelSecond.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addFdaPersonnelSecond);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addFdaPersonnelSecond proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddFdaPersonnelSecond implementation " +
					addFdaPersonnelSecond.getClass());
		}

		AddFdaPersonnelSecondModelImpl addFdaPersonnelSecondModelImpl =
			(AddFdaPersonnelSecondModelImpl)addFdaPersonnelSecond;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addFdaPersonnelSecond.getCreateDate() == null)) {
			if (serviceContext == null) {
				addFdaPersonnelSecond.setCreateDate(date);
			}
			else {
				addFdaPersonnelSecond.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addFdaPersonnelSecondModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addFdaPersonnelSecond.setModifiedDate(date);
			}
			else {
				addFdaPersonnelSecond.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addFdaPersonnelSecond);
			}
			else {
				addFdaPersonnelSecond = (AddFdaPersonnelSecond)session.merge(
					addFdaPersonnelSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddFdaPersonnelSecondImpl.class, addFdaPersonnelSecondModelImpl,
			false, true);

		if (isNew) {
			addFdaPersonnelSecond.setNew(false);
		}

		addFdaPersonnelSecond.resetOriginalValues();

		return addFdaPersonnelSecond;
	}

	/**
	 * Returns the add fda personnel second with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add fda personnel second
	 * @return the add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a add fda personnel second with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelSecond findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddFdaPersonnelSecondException {

		AddFdaPersonnelSecond addFdaPersonnelSecond = fetchByPrimaryKey(
			primaryKey);

		if (addFdaPersonnelSecond == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddFdaPersonnelSecondException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addFdaPersonnelSecond;
	}

	/**
	 * Returns the add fda personnel second with the primary key or throws a <code>NoSuchAddFdaPersonnelSecondException</code> if it could not be found.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the add fda personnel second
	 * @return the add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a add fda personnel second with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelSecond findByPrimaryKey(long addFdaPersonnelSecondId)
		throws NoSuchAddFdaPersonnelSecondException {

		return findByPrimaryKey((Serializable)addFdaPersonnelSecondId);
	}

	/**
	 * Returns the add fda personnel second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the add fda personnel second
	 * @return the add fda personnel second, or <code>null</code> if a add fda personnel second with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelSecond fetchByPrimaryKey(
		long addFdaPersonnelSecondId) {

		return fetchByPrimaryKey((Serializable)addFdaPersonnelSecondId);
	}

	/**
	 * Returns all the add fda personnel seconds.
	 *
	 * @return the add fda personnel seconds
	 */
	@Override
	public List<AddFdaPersonnelSecond> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @return the range of add fda personnel seconds
	 */
	@Override
	public List<AddFdaPersonnelSecond> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda personnel seconds
	 */
	@Override
	public List<AddFdaPersonnelSecond> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda personnel seconds
	 */
	@Override
	public List<AddFdaPersonnelSecond> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator,
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

		List<AddFdaPersonnelSecond> list = null;

		if (useFinderCache) {
			list = (List<AddFdaPersonnelSecond>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDFDAPERSONNELSECOND);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDFDAPERSONNELSECOND;

				sql = sql.concat(AddFdaPersonnelSecondModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddFdaPersonnelSecond>)QueryUtil.list(
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
	 * Removes all the add fda personnel seconds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddFdaPersonnelSecond addFdaPersonnelSecond : findAll()) {
			remove(addFdaPersonnelSecond);
		}
	}

	/**
	 * Returns the number of add fda personnel seconds.
	 *
	 * @return the number of add fda personnel seconds
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
					_SQL_COUNT_ADDFDAPERSONNELSECOND);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "addFdaPersonnelSecondId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDFDAPERSONNELSECOND;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddFdaPersonnelSecondModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add fda personnel second persistence.
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

		AddFdaPersonnelSecondUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddFdaPersonnelSecondUtil.setPersistence(null);

		entityCache.removeCache(AddFdaPersonnelSecondImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDFDAPERSONNELSECOND =
		"SELECT addFdaPersonnelSecond FROM AddFdaPersonnelSecond addFdaPersonnelSecond";

	private static final String _SQL_SELECT_ADDFDAPERSONNELSECOND_WHERE =
		"SELECT addFdaPersonnelSecond FROM AddFdaPersonnelSecond addFdaPersonnelSecond WHERE ";

	private static final String _SQL_COUNT_ADDFDAPERSONNELSECOND =
		"SELECT COUNT(addFdaPersonnelSecond) FROM AddFdaPersonnelSecond addFdaPersonnelSecond";

	private static final String _SQL_COUNT_ADDFDAPERSONNELSECOND_WHERE =
		"SELECT COUNT(addFdaPersonnelSecond) FROM AddFdaPersonnelSecond addFdaPersonnelSecond WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addFdaPersonnelSecond.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddFdaPersonnelSecond exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddFdaPersonnelSecond exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddFdaPersonnelSecondPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"role"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}