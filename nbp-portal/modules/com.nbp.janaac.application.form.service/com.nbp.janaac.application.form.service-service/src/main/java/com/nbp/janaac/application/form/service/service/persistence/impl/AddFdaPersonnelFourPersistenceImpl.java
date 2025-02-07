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

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaPersonnelFourException;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFourTable;
import com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFourImpl;
import com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFourModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelFourPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelFourUtil;
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
 * The persistence implementation for the add fda personnel four service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddFdaPersonnelFourPersistence.class)
public class AddFdaPersonnelFourPersistenceImpl
	extends BasePersistenceImpl<AddFdaPersonnelFour>
	implements AddFdaPersonnelFourPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddFdaPersonnelFourUtil</code> to access the add fda personnel four persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddFdaPersonnelFourImpl.class.getName();

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
	 * Returns all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda personnel fours
	 */
	@Override
	public List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @return the range of matching add fda personnel fours
	 */
	@Override
	public List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda personnel fours
	 */
	@Override
	public List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda personnel fours
	 */
	@Override
	public List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator,
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

		List<AddFdaPersonnelFour> list = null;

		if (useFinderCache) {
			list = (List<AddFdaPersonnelFour>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddFdaPersonnelFour addFdaPersonnelFour : list) {
					if (janaacApplicationId !=
							addFdaPersonnelFour.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDFDAPERSONNELFOUR_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddFdaPersonnelFourModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddFdaPersonnelFour>)QueryUtil.list(
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
	 * Returns the first add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a matching add fda personnel four could not be found
	 */
	@Override
	public AddFdaPersonnelFour findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelFour> orderByComparator)
		throws NoSuchAddFdaPersonnelFourException {

		AddFdaPersonnelFour addFdaPersonnelFour = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addFdaPersonnelFour != null) {
			return addFdaPersonnelFour;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaPersonnelFourException(sb.toString());
	}

	/**
	 * Returns the first add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel four, or <code>null</code> if a matching add fda personnel four could not be found
	 */
	@Override
	public AddFdaPersonnelFour fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator) {

		List<AddFdaPersonnelFour> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a matching add fda personnel four could not be found
	 */
	@Override
	public AddFdaPersonnelFour findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelFour> orderByComparator)
		throws NoSuchAddFdaPersonnelFourException {

		AddFdaPersonnelFour addFdaPersonnelFour = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addFdaPersonnelFour != null) {
			return addFdaPersonnelFour;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaPersonnelFourException(sb.toString());
	}

	/**
	 * Returns the last add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel four, or <code>null</code> if a matching add fda personnel four could not be found
	 */
	@Override
	public AddFdaPersonnelFour fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddFdaPersonnelFour> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add fda personnel fours before and after the current add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaPersonnelFourId the primary key of the current add fda personnel four
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a add fda personnel four with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFour[] findBygetJanaacById_PrevAndNext(
			long addFdaPersonnelFourId, long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelFour> orderByComparator)
		throws NoSuchAddFdaPersonnelFourException {

		AddFdaPersonnelFour addFdaPersonnelFour = findByPrimaryKey(
			addFdaPersonnelFourId);

		Session session = null;

		try {
			session = openSession();

			AddFdaPersonnelFour[] array = new AddFdaPersonnelFourImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addFdaPersonnelFour, janaacApplicationId,
				orderByComparator, true);

			array[1] = addFdaPersonnelFour;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addFdaPersonnelFour, janaacApplicationId,
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

	protected AddFdaPersonnelFour getBygetJanaacById_PrevAndNext(
		Session session, AddFdaPersonnelFour addFdaPersonnelFour,
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDFDAPERSONNELFOUR_WHERE);

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
			sb.append(AddFdaPersonnelFourModelImpl.ORDER_BY_JPQL);
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
						addFdaPersonnelFour)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddFdaPersonnelFour> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add fda personnel fours where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddFdaPersonnelFour addFdaPersonnelFour :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addFdaPersonnelFour);
		}
	}

	/**
	 * Returns the number of add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda personnel fours
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDFDAPERSONNELFOUR_WHERE);

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
			"addFdaPersonnelFour.janaacApplicationId = ?";

	public AddFdaPersonnelFourPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("number", "number_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AddFdaPersonnelFour.class);

		setModelImplClass(AddFdaPersonnelFourImpl.class);
		setModelPKClass(long.class);

		setTable(AddFdaPersonnelFourTable.INSTANCE);
	}

	/**
	 * Caches the add fda personnel four in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelFour the add fda personnel four
	 */
	@Override
	public void cacheResult(AddFdaPersonnelFour addFdaPersonnelFour) {
		entityCache.putResult(
			AddFdaPersonnelFourImpl.class, addFdaPersonnelFour.getPrimaryKey(),
			addFdaPersonnelFour);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add fda personnel fours in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelFours the add fda personnel fours
	 */
	@Override
	public void cacheResult(List<AddFdaPersonnelFour> addFdaPersonnelFours) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addFdaPersonnelFours.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddFdaPersonnelFour addFdaPersonnelFour : addFdaPersonnelFours) {
			if (entityCache.getResult(
					AddFdaPersonnelFourImpl.class,
					addFdaPersonnelFour.getPrimaryKey()) == null) {

				cacheResult(addFdaPersonnelFour);
			}
		}
	}

	/**
	 * Clears the cache for all add fda personnel fours.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddFdaPersonnelFourImpl.class);

		finderCache.clearCache(AddFdaPersonnelFourImpl.class);
	}

	/**
	 * Clears the cache for the add fda personnel four.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddFdaPersonnelFour addFdaPersonnelFour) {
		entityCache.removeResult(
			AddFdaPersonnelFourImpl.class, addFdaPersonnelFour);
	}

	@Override
	public void clearCache(List<AddFdaPersonnelFour> addFdaPersonnelFours) {
		for (AddFdaPersonnelFour addFdaPersonnelFour : addFdaPersonnelFours) {
			entityCache.removeResult(
				AddFdaPersonnelFourImpl.class, addFdaPersonnelFour);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddFdaPersonnelFourImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AddFdaPersonnelFourImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add fda personnel four with the primary key. Does not add the add fda personnel four to the database.
	 *
	 * @param addFdaPersonnelFourId the primary key for the new add fda personnel four
	 * @return the new add fda personnel four
	 */
	@Override
	public AddFdaPersonnelFour create(long addFdaPersonnelFourId) {
		AddFdaPersonnelFour addFdaPersonnelFour = new AddFdaPersonnelFourImpl();

		addFdaPersonnelFour.setNew(true);
		addFdaPersonnelFour.setPrimaryKey(addFdaPersonnelFourId);

		addFdaPersonnelFour.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addFdaPersonnelFour;
	}

	/**
	 * Removes the add fda personnel four with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaPersonnelFourId the primary key of the add fda personnel four
	 * @return the add fda personnel four that was removed
	 * @throws NoSuchAddFdaPersonnelFourException if a add fda personnel four with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFour remove(long addFdaPersonnelFourId)
		throws NoSuchAddFdaPersonnelFourException {

		return remove((Serializable)addFdaPersonnelFourId);
	}

	/**
	 * Removes the add fda personnel four with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add fda personnel four
	 * @return the add fda personnel four that was removed
	 * @throws NoSuchAddFdaPersonnelFourException if a add fda personnel four with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFour remove(Serializable primaryKey)
		throws NoSuchAddFdaPersonnelFourException {

		Session session = null;

		try {
			session = openSession();

			AddFdaPersonnelFour addFdaPersonnelFour =
				(AddFdaPersonnelFour)session.get(
					AddFdaPersonnelFourImpl.class, primaryKey);

			if (addFdaPersonnelFour == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddFdaPersonnelFourException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addFdaPersonnelFour);
		}
		catch (NoSuchAddFdaPersonnelFourException noSuchEntityException) {
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
	protected AddFdaPersonnelFour removeImpl(
		AddFdaPersonnelFour addFdaPersonnelFour) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addFdaPersonnelFour)) {
				addFdaPersonnelFour = (AddFdaPersonnelFour)session.get(
					AddFdaPersonnelFourImpl.class,
					addFdaPersonnelFour.getPrimaryKeyObj());
			}

			if (addFdaPersonnelFour != null) {
				session.delete(addFdaPersonnelFour);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addFdaPersonnelFour != null) {
			clearCache(addFdaPersonnelFour);
		}

		return addFdaPersonnelFour;
	}

	@Override
	public AddFdaPersonnelFour updateImpl(
		AddFdaPersonnelFour addFdaPersonnelFour) {

		boolean isNew = addFdaPersonnelFour.isNew();

		if (!(addFdaPersonnelFour instanceof AddFdaPersonnelFourModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addFdaPersonnelFour.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addFdaPersonnelFour);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addFdaPersonnelFour proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddFdaPersonnelFour implementation " +
					addFdaPersonnelFour.getClass());
		}

		AddFdaPersonnelFourModelImpl addFdaPersonnelFourModelImpl =
			(AddFdaPersonnelFourModelImpl)addFdaPersonnelFour;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addFdaPersonnelFour.getCreateDate() == null)) {
			if (serviceContext == null) {
				addFdaPersonnelFour.setCreateDate(date);
			}
			else {
				addFdaPersonnelFour.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addFdaPersonnelFourModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addFdaPersonnelFour.setModifiedDate(date);
			}
			else {
				addFdaPersonnelFour.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addFdaPersonnelFour);
			}
			else {
				addFdaPersonnelFour = (AddFdaPersonnelFour)session.merge(
					addFdaPersonnelFour);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddFdaPersonnelFourImpl.class, addFdaPersonnelFourModelImpl, false,
			true);

		if (isNew) {
			addFdaPersonnelFour.setNew(false);
		}

		addFdaPersonnelFour.resetOriginalValues();

		return addFdaPersonnelFour;
	}

	/**
	 * Returns the add fda personnel four with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add fda personnel four
	 * @return the add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a add fda personnel four with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFour findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddFdaPersonnelFourException {

		AddFdaPersonnelFour addFdaPersonnelFour = fetchByPrimaryKey(primaryKey);

		if (addFdaPersonnelFour == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddFdaPersonnelFourException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addFdaPersonnelFour;
	}

	/**
	 * Returns the add fda personnel four with the primary key or throws a <code>NoSuchAddFdaPersonnelFourException</code> if it could not be found.
	 *
	 * @param addFdaPersonnelFourId the primary key of the add fda personnel four
	 * @return the add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a add fda personnel four with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFour findByPrimaryKey(long addFdaPersonnelFourId)
		throws NoSuchAddFdaPersonnelFourException {

		return findByPrimaryKey((Serializable)addFdaPersonnelFourId);
	}

	/**
	 * Returns the add fda personnel four with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaPersonnelFourId the primary key of the add fda personnel four
	 * @return the add fda personnel four, or <code>null</code> if a add fda personnel four with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelFour fetchByPrimaryKey(long addFdaPersonnelFourId) {
		return fetchByPrimaryKey((Serializable)addFdaPersonnelFourId);
	}

	/**
	 * Returns all the add fda personnel fours.
	 *
	 * @return the add fda personnel fours
	 */
	@Override
	public List<AddFdaPersonnelFour> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda personnel fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @return the range of add fda personnel fours
	 */
	@Override
	public List<AddFdaPersonnelFour> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda personnel fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda personnel fours
	 */
	@Override
	public List<AddFdaPersonnelFour> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda personnel fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda personnel fours
	 */
	@Override
	public List<AddFdaPersonnelFour> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator,
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

		List<AddFdaPersonnelFour> list = null;

		if (useFinderCache) {
			list = (List<AddFdaPersonnelFour>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDFDAPERSONNELFOUR);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDFDAPERSONNELFOUR;

				sql = sql.concat(AddFdaPersonnelFourModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddFdaPersonnelFour>)QueryUtil.list(
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
	 * Removes all the add fda personnel fours from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddFdaPersonnelFour addFdaPersonnelFour : findAll()) {
			remove(addFdaPersonnelFour);
		}
	}

	/**
	 * Returns the number of add fda personnel fours.
	 *
	 * @return the number of add fda personnel fours
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
					_SQL_COUNT_ADDFDAPERSONNELFOUR);

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
		return "addFdaPersonnelFourId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDFDAPERSONNELFOUR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddFdaPersonnelFourModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add fda personnel four persistence.
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

		AddFdaPersonnelFourUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddFdaPersonnelFourUtil.setPersistence(null);

		entityCache.removeCache(AddFdaPersonnelFourImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDFDAPERSONNELFOUR =
		"SELECT addFdaPersonnelFour FROM AddFdaPersonnelFour addFdaPersonnelFour";

	private static final String _SQL_SELECT_ADDFDAPERSONNELFOUR_WHERE =
		"SELECT addFdaPersonnelFour FROM AddFdaPersonnelFour addFdaPersonnelFour WHERE ";

	private static final String _SQL_COUNT_ADDFDAPERSONNELFOUR =
		"SELECT COUNT(addFdaPersonnelFour) FROM AddFdaPersonnelFour addFdaPersonnelFour";

	private static final String _SQL_COUNT_ADDFDAPERSONNELFOUR_WHERE =
		"SELECT COUNT(addFdaPersonnelFour) FROM AddFdaPersonnelFour addFdaPersonnelFour WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "addFdaPersonnelFour.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddFdaPersonnelFour exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddFdaPersonnelFour exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddFdaPersonnelFourPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"number"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}