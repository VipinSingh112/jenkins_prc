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

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabCalibraStrucReqSecException;
import com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec;
import com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSecTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabCalibraStrucReqSecImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabCalibraStrucReqSecModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabCalibraStrucReqSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabCalibraStrucReqSecUtil;
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
 * The persistence implementation for the add lab calibra struc req sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabCalibraStrucReqSecPersistence.class)
public class AddLabCalibraStrucReqSecPersistenceImpl
	extends BasePersistenceImpl<AddLabCalibraStrucReqSec>
	implements AddLabCalibraStrucReqSecPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabCalibraStrucReqSecUtil</code> to access the add lab calibra struc req sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabCalibraStrucReqSecImpl.class.getName();

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
	 * Returns all the add lab calibra struc req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab calibra struc req secs
	 */
	@Override
	public List<AddLabCalibraStrucReqSec> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab calibra struc req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabCalibraStrucReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab calibra struc req secs
	 * @param end the upper bound of the range of add lab calibra struc req secs (not inclusive)
	 * @return the range of matching add lab calibra struc req secs
	 */
	@Override
	public List<AddLabCalibraStrucReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab calibra struc req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabCalibraStrucReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab calibra struc req secs
	 * @param end the upper bound of the range of add lab calibra struc req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab calibra struc req secs
	 */
	@Override
	public List<AddLabCalibraStrucReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabCalibraStrucReqSec> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab calibra struc req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabCalibraStrucReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab calibra struc req secs
	 * @param end the upper bound of the range of add lab calibra struc req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab calibra struc req secs
	 */
	@Override
	public List<AddLabCalibraStrucReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabCalibraStrucReqSec> orderByComparator,
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

		List<AddLabCalibraStrucReqSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabCalibraStrucReqSec>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabCalibraStrucReqSec addLabCalibraStrucReqSec : list) {
					if (janaacApplicationId !=
							addLabCalibraStrucReqSec.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABCALIBRASTRUCREQSEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabCalibraStrucReqSecModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabCalibraStrucReqSec>)QueryUtil.list(
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
	 * Returns the first add lab calibra struc req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab calibra struc req sec
	 * @throws NoSuchAddLabCalibraStrucReqSecException if a matching add lab calibra struc req sec could not be found
	 */
	@Override
	public AddLabCalibraStrucReqSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabCalibraStrucReqSec> orderByComparator)
		throws NoSuchAddLabCalibraStrucReqSecException {

		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addLabCalibraStrucReqSec != null) {
			return addLabCalibraStrucReqSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabCalibraStrucReqSecException(sb.toString());
	}

	/**
	 * Returns the first add lab calibra struc req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab calibra struc req sec, or <code>null</code> if a matching add lab calibra struc req sec could not be found
	 */
	@Override
	public AddLabCalibraStrucReqSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabCalibraStrucReqSec> orderByComparator) {

		List<AddLabCalibraStrucReqSec> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab calibra struc req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab calibra struc req sec
	 * @throws NoSuchAddLabCalibraStrucReqSecException if a matching add lab calibra struc req sec could not be found
	 */
	@Override
	public AddLabCalibraStrucReqSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabCalibraStrucReqSec> orderByComparator)
		throws NoSuchAddLabCalibraStrucReqSecException {

		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec =
			fetchBygetJanaacById_Last(janaacApplicationId, orderByComparator);

		if (addLabCalibraStrucReqSec != null) {
			return addLabCalibraStrucReqSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabCalibraStrucReqSecException(sb.toString());
	}

	/**
	 * Returns the last add lab calibra struc req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab calibra struc req sec, or <code>null</code> if a matching add lab calibra struc req sec could not be found
	 */
	@Override
	public AddLabCalibraStrucReqSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabCalibraStrucReqSec> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabCalibraStrucReqSec> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab calibra struc req secs before and after the current add lab calibra struc req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabCalibraStrucReqSecId the primary key of the current add lab calibra struc req sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab calibra struc req sec
	 * @throws NoSuchAddLabCalibraStrucReqSecException if a add lab calibra struc req sec with the primary key could not be found
	 */
	@Override
	public AddLabCalibraStrucReqSec[] findBygetJanaacById_PrevAndNext(
			long addLabCalibraStrucReqSecId, long janaacApplicationId,
			OrderByComparator<AddLabCalibraStrucReqSec> orderByComparator)
		throws NoSuchAddLabCalibraStrucReqSecException {

		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec = findByPrimaryKey(
			addLabCalibraStrucReqSecId);

		Session session = null;

		try {
			session = openSession();

			AddLabCalibraStrucReqSec[] array =
				new AddLabCalibraStrucReqSecImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabCalibraStrucReqSec, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabCalibraStrucReqSec;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabCalibraStrucReqSec, janaacApplicationId,
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

	protected AddLabCalibraStrucReqSec getBygetJanaacById_PrevAndNext(
		Session session, AddLabCalibraStrucReqSec addLabCalibraStrucReqSec,
		long janaacApplicationId,
		OrderByComparator<AddLabCalibraStrucReqSec> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABCALIBRASTRUCREQSEC_WHERE);

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
			sb.append(AddLabCalibraStrucReqSecModelImpl.ORDER_BY_JPQL);
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
						addLabCalibraStrucReqSec)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabCalibraStrucReqSec> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab calibra struc req secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabCalibraStrucReqSec addLabCalibraStrucReqSec :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabCalibraStrucReqSec);
		}
	}

	/**
	 * Returns the number of add lab calibra struc req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab calibra struc req secs
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABCALIBRASTRUCREQSEC_WHERE);

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
			"addLabCalibraStrucReqSec.janaacApplicationId = ?";

	public AddLabCalibraStrucReqSecPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("number", "number_");
		dbColumnNames.put("range", "range_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AddLabCalibraStrucReqSec.class);

		setModelImplClass(AddLabCalibraStrucReqSecImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabCalibraStrucReqSecTable.INSTANCE);
	}

	/**
	 * Caches the add lab calibra struc req sec in the entity cache if it is enabled.
	 *
	 * @param addLabCalibraStrucReqSec the add lab calibra struc req sec
	 */
	@Override
	public void cacheResult(AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {
		entityCache.putResult(
			AddLabCalibraStrucReqSecImpl.class,
			addLabCalibraStrucReqSec.getPrimaryKey(), addLabCalibraStrucReqSec);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab calibra struc req secs in the entity cache if it is enabled.
	 *
	 * @param addLabCalibraStrucReqSecs the add lab calibra struc req secs
	 */
	@Override
	public void cacheResult(
		List<AddLabCalibraStrucReqSec> addLabCalibraStrucReqSecs) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabCalibraStrucReqSecs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabCalibraStrucReqSec addLabCalibraStrucReqSec :
				addLabCalibraStrucReqSecs) {

			if (entityCache.getResult(
					AddLabCalibraStrucReqSecImpl.class,
					addLabCalibraStrucReqSec.getPrimaryKey()) == null) {

				cacheResult(addLabCalibraStrucReqSec);
			}
		}
	}

	/**
	 * Clears the cache for all add lab calibra struc req secs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabCalibraStrucReqSecImpl.class);

		finderCache.clearCache(AddLabCalibraStrucReqSecImpl.class);
	}

	/**
	 * Clears the cache for the add lab calibra struc req sec.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {
		entityCache.removeResult(
			AddLabCalibraStrucReqSecImpl.class, addLabCalibraStrucReqSec);
	}

	@Override
	public void clearCache(
		List<AddLabCalibraStrucReqSec> addLabCalibraStrucReqSecs) {

		for (AddLabCalibraStrucReqSec addLabCalibraStrucReqSec :
				addLabCalibraStrucReqSecs) {

			entityCache.removeResult(
				AddLabCalibraStrucReqSecImpl.class, addLabCalibraStrucReqSec);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabCalibraStrucReqSecImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLabCalibraStrucReqSecImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab calibra struc req sec with the primary key. Does not add the add lab calibra struc req sec to the database.
	 *
	 * @param addLabCalibraStrucReqSecId the primary key for the new add lab calibra struc req sec
	 * @return the new add lab calibra struc req sec
	 */
	@Override
	public AddLabCalibraStrucReqSec create(long addLabCalibraStrucReqSecId) {
		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec =
			new AddLabCalibraStrucReqSecImpl();

		addLabCalibraStrucReqSec.setNew(true);
		addLabCalibraStrucReqSec.setPrimaryKey(addLabCalibraStrucReqSecId);

		addLabCalibraStrucReqSec.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return addLabCalibraStrucReqSec;
	}

	/**
	 * Removes the add lab calibra struc req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabCalibraStrucReqSecId the primary key of the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec that was removed
	 * @throws NoSuchAddLabCalibraStrucReqSecException if a add lab calibra struc req sec with the primary key could not be found
	 */
	@Override
	public AddLabCalibraStrucReqSec remove(long addLabCalibraStrucReqSecId)
		throws NoSuchAddLabCalibraStrucReqSecException {

		return remove((Serializable)addLabCalibraStrucReqSecId);
	}

	/**
	 * Removes the add lab calibra struc req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec that was removed
	 * @throws NoSuchAddLabCalibraStrucReqSecException if a add lab calibra struc req sec with the primary key could not be found
	 */
	@Override
	public AddLabCalibraStrucReqSec remove(Serializable primaryKey)
		throws NoSuchAddLabCalibraStrucReqSecException {

		Session session = null;

		try {
			session = openSession();

			AddLabCalibraStrucReqSec addLabCalibraStrucReqSec =
				(AddLabCalibraStrucReqSec)session.get(
					AddLabCalibraStrucReqSecImpl.class, primaryKey);

			if (addLabCalibraStrucReqSec == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabCalibraStrucReqSecException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabCalibraStrucReqSec);
		}
		catch (NoSuchAddLabCalibraStrucReqSecException noSuchEntityException) {
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
	protected AddLabCalibraStrucReqSec removeImpl(
		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabCalibraStrucReqSec)) {
				addLabCalibraStrucReqSec =
					(AddLabCalibraStrucReqSec)session.get(
						AddLabCalibraStrucReqSecImpl.class,
						addLabCalibraStrucReqSec.getPrimaryKeyObj());
			}

			if (addLabCalibraStrucReqSec != null) {
				session.delete(addLabCalibraStrucReqSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabCalibraStrucReqSec != null) {
			clearCache(addLabCalibraStrucReqSec);
		}

		return addLabCalibraStrucReqSec;
	}

	@Override
	public AddLabCalibraStrucReqSec updateImpl(
		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {

		boolean isNew = addLabCalibraStrucReqSec.isNew();

		if (!(addLabCalibraStrucReqSec instanceof
				AddLabCalibraStrucReqSecModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLabCalibraStrucReqSec.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabCalibraStrucReqSec);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabCalibraStrucReqSec proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabCalibraStrucReqSec implementation " +
					addLabCalibraStrucReqSec.getClass());
		}

		AddLabCalibraStrucReqSecModelImpl addLabCalibraStrucReqSecModelImpl =
			(AddLabCalibraStrucReqSecModelImpl)addLabCalibraStrucReqSec;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabCalibraStrucReqSec.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabCalibraStrucReqSec.setCreateDate(date);
			}
			else {
				addLabCalibraStrucReqSec.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabCalibraStrucReqSecModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabCalibraStrucReqSec.setModifiedDate(date);
			}
			else {
				addLabCalibraStrucReqSec.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabCalibraStrucReqSec);
			}
			else {
				addLabCalibraStrucReqSec =
					(AddLabCalibraStrucReqSec)session.merge(
						addLabCalibraStrucReqSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabCalibraStrucReqSecImpl.class,
			addLabCalibraStrucReqSecModelImpl, false, true);

		if (isNew) {
			addLabCalibraStrucReqSec.setNew(false);
		}

		addLabCalibraStrucReqSec.resetOriginalValues();

		return addLabCalibraStrucReqSec;
	}

	/**
	 * Returns the add lab calibra struc req sec with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec
	 * @throws NoSuchAddLabCalibraStrucReqSecException if a add lab calibra struc req sec with the primary key could not be found
	 */
	@Override
	public AddLabCalibraStrucReqSec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabCalibraStrucReqSecException {

		AddLabCalibraStrucReqSec addLabCalibraStrucReqSec = fetchByPrimaryKey(
			primaryKey);

		if (addLabCalibraStrucReqSec == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabCalibraStrucReqSecException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabCalibraStrucReqSec;
	}

	/**
	 * Returns the add lab calibra struc req sec with the primary key or throws a <code>NoSuchAddLabCalibraStrucReqSecException</code> if it could not be found.
	 *
	 * @param addLabCalibraStrucReqSecId the primary key of the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec
	 * @throws NoSuchAddLabCalibraStrucReqSecException if a add lab calibra struc req sec with the primary key could not be found
	 */
	@Override
	public AddLabCalibraStrucReqSec findByPrimaryKey(
			long addLabCalibraStrucReqSecId)
		throws NoSuchAddLabCalibraStrucReqSecException {

		return findByPrimaryKey((Serializable)addLabCalibraStrucReqSecId);
	}

	/**
	 * Returns the add lab calibra struc req sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabCalibraStrucReqSecId the primary key of the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec, or <code>null</code> if a add lab calibra struc req sec with the primary key could not be found
	 */
	@Override
	public AddLabCalibraStrucReqSec fetchByPrimaryKey(
		long addLabCalibraStrucReqSecId) {

		return fetchByPrimaryKey((Serializable)addLabCalibraStrucReqSecId);
	}

	/**
	 * Returns all the add lab calibra struc req secs.
	 *
	 * @return the add lab calibra struc req secs
	 */
	@Override
	public List<AddLabCalibraStrucReqSec> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab calibra struc req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabCalibraStrucReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab calibra struc req secs
	 * @param end the upper bound of the range of add lab calibra struc req secs (not inclusive)
	 * @return the range of add lab calibra struc req secs
	 */
	@Override
	public List<AddLabCalibraStrucReqSec> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab calibra struc req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabCalibraStrucReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab calibra struc req secs
	 * @param end the upper bound of the range of add lab calibra struc req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab calibra struc req secs
	 */
	@Override
	public List<AddLabCalibraStrucReqSec> findAll(
		int start, int end,
		OrderByComparator<AddLabCalibraStrucReqSec> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab calibra struc req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabCalibraStrucReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab calibra struc req secs
	 * @param end the upper bound of the range of add lab calibra struc req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab calibra struc req secs
	 */
	@Override
	public List<AddLabCalibraStrucReqSec> findAll(
		int start, int end,
		OrderByComparator<AddLabCalibraStrucReqSec> orderByComparator,
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

		List<AddLabCalibraStrucReqSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabCalibraStrucReqSec>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABCALIBRASTRUCREQSEC);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABCALIBRASTRUCREQSEC;

				sql = sql.concat(
					AddLabCalibraStrucReqSecModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabCalibraStrucReqSec>)QueryUtil.list(
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
	 * Removes all the add lab calibra struc req secs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabCalibraStrucReqSec addLabCalibraStrucReqSec : findAll()) {
			remove(addLabCalibraStrucReqSec);
		}
	}

	/**
	 * Returns the number of add lab calibra struc req secs.
	 *
	 * @return the number of add lab calibra struc req secs
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
					_SQL_COUNT_ADDLABCALIBRASTRUCREQSEC);

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
		return "addLabCalibraStrucReqSecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABCALIBRASTRUCREQSEC;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabCalibraStrucReqSecModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab calibra struc req sec persistence.
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

		AddLabCalibraStrucReqSecUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabCalibraStrucReqSecUtil.setPersistence(null);

		entityCache.removeCache(AddLabCalibraStrucReqSecImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDLABCALIBRASTRUCREQSEC =
		"SELECT addLabCalibraStrucReqSec FROM AddLabCalibraStrucReqSec addLabCalibraStrucReqSec";

	private static final String _SQL_SELECT_ADDLABCALIBRASTRUCREQSEC_WHERE =
		"SELECT addLabCalibraStrucReqSec FROM AddLabCalibraStrucReqSec addLabCalibraStrucReqSec WHERE ";

	private static final String _SQL_COUNT_ADDLABCALIBRASTRUCREQSEC =
		"SELECT COUNT(addLabCalibraStrucReqSec) FROM AddLabCalibraStrucReqSec addLabCalibraStrucReqSec";

	private static final String _SQL_COUNT_ADDLABCALIBRASTRUCREQSEC_WHERE =
		"SELECT COUNT(addLabCalibraStrucReqSec) FROM AddLabCalibraStrucReqSec addLabCalibraStrucReqSec WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLabCalibraStrucReqSec.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabCalibraStrucReqSec exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabCalibraStrucReqSec exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabCalibraStrucReqSecPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"number", "range"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}