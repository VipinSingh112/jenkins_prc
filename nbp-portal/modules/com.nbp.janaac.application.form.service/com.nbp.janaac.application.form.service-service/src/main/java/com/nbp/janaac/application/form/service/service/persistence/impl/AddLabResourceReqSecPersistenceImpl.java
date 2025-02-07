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

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabResourceReqSecException;
import com.nbp.janaac.application.form.service.model.AddLabResourceReqSec;
import com.nbp.janaac.application.form.service.model.AddLabResourceReqSecTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqSecImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqSecModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabResourceReqSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabResourceReqSecUtil;
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
 * The persistence implementation for the add lab resource req sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabResourceReqSecPersistence.class)
public class AddLabResourceReqSecPersistenceImpl
	extends BasePersistenceImpl<AddLabResourceReqSec>
	implements AddLabResourceReqSecPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabResourceReqSecUtil</code> to access the add lab resource req sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabResourceReqSecImpl.class.getName();

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
	 * Returns all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab resource req secs
	 */
	@Override
	public List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @return the range of matching add lab resource req secs
	 */
	@Override
	public List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab resource req secs
	 */
	@Override
	public List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabResourceReqSec> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab resource req secs
	 */
	@Override
	public List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabResourceReqSec> orderByComparator,
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

		List<AddLabResourceReqSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabResourceReqSec>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabResourceReqSec addLabResourceReqSec : list) {
					if (janaacApplicationId !=
							addLabResourceReqSec.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABRESOURCEREQSEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabResourceReqSecModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabResourceReqSec>)QueryUtil.list(
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
	 * Returns the first add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a matching add lab resource req sec could not be found
	 */
	@Override
	public AddLabResourceReqSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabResourceReqSec> orderByComparator)
		throws NoSuchAddLabResourceReqSecException {

		AddLabResourceReqSec addLabResourceReqSec = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addLabResourceReqSec != null) {
			return addLabResourceReqSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabResourceReqSecException(sb.toString());
	}

	/**
	 * Returns the first add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req sec, or <code>null</code> if a matching add lab resource req sec could not be found
	 */
	@Override
	public AddLabResourceReqSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabResourceReqSec> orderByComparator) {

		List<AddLabResourceReqSec> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a matching add lab resource req sec could not be found
	 */
	@Override
	public AddLabResourceReqSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabResourceReqSec> orderByComparator)
		throws NoSuchAddLabResourceReqSecException {

		AddLabResourceReqSec addLabResourceReqSec = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addLabResourceReqSec != null) {
			return addLabResourceReqSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabResourceReqSecException(sb.toString());
	}

	/**
	 * Returns the last add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req sec, or <code>null</code> if a matching add lab resource req sec could not be found
	 */
	@Override
	public AddLabResourceReqSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabResourceReqSec> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabResourceReqSec> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab resource req secs before and after the current add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabResourceReqSecId the primary key of the current add lab resource req sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a add lab resource req sec with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqSec[] findBygetJanaacById_PrevAndNext(
			long addLabResourceReqSecId, long janaacApplicationId,
			OrderByComparator<AddLabResourceReqSec> orderByComparator)
		throws NoSuchAddLabResourceReqSecException {

		AddLabResourceReqSec addLabResourceReqSec = findByPrimaryKey(
			addLabResourceReqSecId);

		Session session = null;

		try {
			session = openSession();

			AddLabResourceReqSec[] array = new AddLabResourceReqSecImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabResourceReqSec, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabResourceReqSec;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabResourceReqSec, janaacApplicationId,
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

	protected AddLabResourceReqSec getBygetJanaacById_PrevAndNext(
		Session session, AddLabResourceReqSec addLabResourceReqSec,
		long janaacApplicationId,
		OrderByComparator<AddLabResourceReqSec> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABRESOURCEREQSEC_WHERE);

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
			sb.append(AddLabResourceReqSecModelImpl.ORDER_BY_JPQL);
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
						addLabResourceReqSec)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabResourceReqSec> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab resource req secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabResourceReqSec addLabResourceReqSec :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabResourceReqSec);
		}
	}

	/**
	 * Returns the number of add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab resource req secs
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABRESOURCEREQSEC_WHERE);

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
			"addLabResourceReqSec.janaacApplicationId = ?";

	public AddLabResourceReqSecPersistenceImpl() {
		setModelClass(AddLabResourceReqSec.class);

		setModelImplClass(AddLabResourceReqSecImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabResourceReqSecTable.INSTANCE);
	}

	/**
	 * Caches the add lab resource req sec in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqSec the add lab resource req sec
	 */
	@Override
	public void cacheResult(AddLabResourceReqSec addLabResourceReqSec) {
		entityCache.putResult(
			AddLabResourceReqSecImpl.class,
			addLabResourceReqSec.getPrimaryKey(), addLabResourceReqSec);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab resource req secs in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqSecs the add lab resource req secs
	 */
	@Override
	public void cacheResult(List<AddLabResourceReqSec> addLabResourceReqSecs) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabResourceReqSecs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabResourceReqSec addLabResourceReqSec :
				addLabResourceReqSecs) {

			if (entityCache.getResult(
					AddLabResourceReqSecImpl.class,
					addLabResourceReqSec.getPrimaryKey()) == null) {

				cacheResult(addLabResourceReqSec);
			}
		}
	}

	/**
	 * Clears the cache for all add lab resource req secs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabResourceReqSecImpl.class);

		finderCache.clearCache(AddLabResourceReqSecImpl.class);
	}

	/**
	 * Clears the cache for the add lab resource req sec.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddLabResourceReqSec addLabResourceReqSec) {
		entityCache.removeResult(
			AddLabResourceReqSecImpl.class, addLabResourceReqSec);
	}

	@Override
	public void clearCache(List<AddLabResourceReqSec> addLabResourceReqSecs) {
		for (AddLabResourceReqSec addLabResourceReqSec :
				addLabResourceReqSecs) {

			entityCache.removeResult(
				AddLabResourceReqSecImpl.class, addLabResourceReqSec);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabResourceReqSecImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLabResourceReqSecImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab resource req sec with the primary key. Does not add the add lab resource req sec to the database.
	 *
	 * @param addLabResourceReqSecId the primary key for the new add lab resource req sec
	 * @return the new add lab resource req sec
	 */
	@Override
	public AddLabResourceReqSec create(long addLabResourceReqSecId) {
		AddLabResourceReqSec addLabResourceReqSec =
			new AddLabResourceReqSecImpl();

		addLabResourceReqSec.setNew(true);
		addLabResourceReqSec.setPrimaryKey(addLabResourceReqSecId);

		addLabResourceReqSec.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addLabResourceReqSec;
	}

	/**
	 * Removes the add lab resource req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabResourceReqSecId the primary key of the add lab resource req sec
	 * @return the add lab resource req sec that was removed
	 * @throws NoSuchAddLabResourceReqSecException if a add lab resource req sec with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqSec remove(long addLabResourceReqSecId)
		throws NoSuchAddLabResourceReqSecException {

		return remove((Serializable)addLabResourceReqSecId);
	}

	/**
	 * Removes the add lab resource req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab resource req sec
	 * @return the add lab resource req sec that was removed
	 * @throws NoSuchAddLabResourceReqSecException if a add lab resource req sec with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqSec remove(Serializable primaryKey)
		throws NoSuchAddLabResourceReqSecException {

		Session session = null;

		try {
			session = openSession();

			AddLabResourceReqSec addLabResourceReqSec =
				(AddLabResourceReqSec)session.get(
					AddLabResourceReqSecImpl.class, primaryKey);

			if (addLabResourceReqSec == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabResourceReqSecException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabResourceReqSec);
		}
		catch (NoSuchAddLabResourceReqSecException noSuchEntityException) {
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
	protected AddLabResourceReqSec removeImpl(
		AddLabResourceReqSec addLabResourceReqSec) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabResourceReqSec)) {
				addLabResourceReqSec = (AddLabResourceReqSec)session.get(
					AddLabResourceReqSecImpl.class,
					addLabResourceReqSec.getPrimaryKeyObj());
			}

			if (addLabResourceReqSec != null) {
				session.delete(addLabResourceReqSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabResourceReqSec != null) {
			clearCache(addLabResourceReqSec);
		}

		return addLabResourceReqSec;
	}

	@Override
	public AddLabResourceReqSec updateImpl(
		AddLabResourceReqSec addLabResourceReqSec) {

		boolean isNew = addLabResourceReqSec.isNew();

		if (!(addLabResourceReqSec instanceof AddLabResourceReqSecModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLabResourceReqSec.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabResourceReqSec);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabResourceReqSec proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabResourceReqSec implementation " +
					addLabResourceReqSec.getClass());
		}

		AddLabResourceReqSecModelImpl addLabResourceReqSecModelImpl =
			(AddLabResourceReqSecModelImpl)addLabResourceReqSec;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabResourceReqSec.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabResourceReqSec.setCreateDate(date);
			}
			else {
				addLabResourceReqSec.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabResourceReqSecModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabResourceReqSec.setModifiedDate(date);
			}
			else {
				addLabResourceReqSec.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabResourceReqSec);
			}
			else {
				addLabResourceReqSec = (AddLabResourceReqSec)session.merge(
					addLabResourceReqSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabResourceReqSecImpl.class, addLabResourceReqSecModelImpl,
			false, true);

		if (isNew) {
			addLabResourceReqSec.setNew(false);
		}

		addLabResourceReqSec.resetOriginalValues();

		return addLabResourceReqSec;
	}

	/**
	 * Returns the add lab resource req sec with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab resource req sec
	 * @return the add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a add lab resource req sec with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqSec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabResourceReqSecException {

		AddLabResourceReqSec addLabResourceReqSec = fetchByPrimaryKey(
			primaryKey);

		if (addLabResourceReqSec == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabResourceReqSecException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabResourceReqSec;
	}

	/**
	 * Returns the add lab resource req sec with the primary key or throws a <code>NoSuchAddLabResourceReqSecException</code> if it could not be found.
	 *
	 * @param addLabResourceReqSecId the primary key of the add lab resource req sec
	 * @return the add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a add lab resource req sec with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqSec findByPrimaryKey(long addLabResourceReqSecId)
		throws NoSuchAddLabResourceReqSecException {

		return findByPrimaryKey((Serializable)addLabResourceReqSecId);
	}

	/**
	 * Returns the add lab resource req sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabResourceReqSecId the primary key of the add lab resource req sec
	 * @return the add lab resource req sec, or <code>null</code> if a add lab resource req sec with the primary key could not be found
	 */
	@Override
	public AddLabResourceReqSec fetchByPrimaryKey(long addLabResourceReqSecId) {
		return fetchByPrimaryKey((Serializable)addLabResourceReqSecId);
	}

	/**
	 * Returns all the add lab resource req secs.
	 *
	 * @return the add lab resource req secs
	 */
	@Override
	public List<AddLabResourceReqSec> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab resource req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @return the range of add lab resource req secs
	 */
	@Override
	public List<AddLabResourceReqSec> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab resource req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab resource req secs
	 */
	@Override
	public List<AddLabResourceReqSec> findAll(
		int start, int end,
		OrderByComparator<AddLabResourceReqSec> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab resource req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab resource req secs
	 */
	@Override
	public List<AddLabResourceReqSec> findAll(
		int start, int end,
		OrderByComparator<AddLabResourceReqSec> orderByComparator,
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

		List<AddLabResourceReqSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabResourceReqSec>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABRESOURCEREQSEC);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABRESOURCEREQSEC;

				sql = sql.concat(AddLabResourceReqSecModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabResourceReqSec>)QueryUtil.list(
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
	 * Removes all the add lab resource req secs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabResourceReqSec addLabResourceReqSec : findAll()) {
			remove(addLabResourceReqSec);
		}
	}

	/**
	 * Returns the number of add lab resource req secs.
	 *
	 * @return the number of add lab resource req secs
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
					_SQL_COUNT_ADDLABRESOURCEREQSEC);

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
		return "addLabResourceReqSecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABRESOURCEREQSEC;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabResourceReqSecModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab resource req sec persistence.
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

		AddLabResourceReqSecUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabResourceReqSecUtil.setPersistence(null);

		entityCache.removeCache(AddLabResourceReqSecImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDLABRESOURCEREQSEC =
		"SELECT addLabResourceReqSec FROM AddLabResourceReqSec addLabResourceReqSec";

	private static final String _SQL_SELECT_ADDLABRESOURCEREQSEC_WHERE =
		"SELECT addLabResourceReqSec FROM AddLabResourceReqSec addLabResourceReqSec WHERE ";

	private static final String _SQL_COUNT_ADDLABRESOURCEREQSEC =
		"SELECT COUNT(addLabResourceReqSec) FROM AddLabResourceReqSec addLabResourceReqSec";

	private static final String _SQL_COUNT_ADDLABRESOURCEREQSEC_WHERE =
		"SELECT COUNT(addLabResourceReqSec) FROM AddLabResourceReqSec addLabResourceReqSec WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLabResourceReqSec.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabResourceReqSec exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabResourceReqSec exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabResourceReqSecPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}