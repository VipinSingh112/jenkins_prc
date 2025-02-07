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

import com.nbp.janaac.application.form.service.exception.NoSuchAddPhyResourceSecException;
import com.nbp.janaac.application.form.service.model.AddPhyResourceSec;
import com.nbp.janaac.application.form.service.model.AddPhyResourceSecTable;
import com.nbp.janaac.application.form.service.model.impl.AddPhyResourceSecImpl;
import com.nbp.janaac.application.form.service.model.impl.AddPhyResourceSecModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddPhyResourceSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddPhyResourceSecUtil;
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
 * The persistence implementation for the add phy resource sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddPhyResourceSecPersistence.class)
public class AddPhyResourceSecPersistenceImpl
	extends BasePersistenceImpl<AddPhyResourceSec>
	implements AddPhyResourceSecPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddPhyResourceSecUtil</code> to access the add phy resource sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddPhyResourceSecImpl.class.getName();

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
	 * Returns all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add phy resource secs
	 */
	@Override
	public List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @return the range of matching add phy resource secs
	 */
	@Override
	public List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add phy resource secs
	 */
	@Override
	public List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddPhyResourceSec> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add phy resource secs
	 */
	@Override
	public List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddPhyResourceSec> orderByComparator,
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

		List<AddPhyResourceSec> list = null;

		if (useFinderCache) {
			list = (List<AddPhyResourceSec>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddPhyResourceSec addPhyResourceSec : list) {
					if (janaacApplicationId !=
							addPhyResourceSec.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDPHYRESOURCESEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddPhyResourceSecModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddPhyResourceSec>)QueryUtil.list(
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
	 * Returns the first add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a matching add phy resource sec could not be found
	 */
	@Override
	public AddPhyResourceSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddPhyResourceSec> orderByComparator)
		throws NoSuchAddPhyResourceSecException {

		AddPhyResourceSec addPhyResourceSec = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addPhyResourceSec != null) {
			return addPhyResourceSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddPhyResourceSecException(sb.toString());
	}

	/**
	 * Returns the first add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource sec, or <code>null</code> if a matching add phy resource sec could not be found
	 */
	@Override
	public AddPhyResourceSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddPhyResourceSec> orderByComparator) {

		List<AddPhyResourceSec> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a matching add phy resource sec could not be found
	 */
	@Override
	public AddPhyResourceSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddPhyResourceSec> orderByComparator)
		throws NoSuchAddPhyResourceSecException {

		AddPhyResourceSec addPhyResourceSec = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addPhyResourceSec != null) {
			return addPhyResourceSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddPhyResourceSecException(sb.toString());
	}

	/**
	 * Returns the last add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource sec, or <code>null</code> if a matching add phy resource sec could not be found
	 */
	@Override
	public AddPhyResourceSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddPhyResourceSec> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddPhyResourceSec> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add phy resource secs before and after the current add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addPhyResourceSecId the primary key of the current add phy resource sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a add phy resource sec with the primary key could not be found
	 */
	@Override
	public AddPhyResourceSec[] findBygetJanaacById_PrevAndNext(
			long addPhyResourceSecId, long janaacApplicationId,
			OrderByComparator<AddPhyResourceSec> orderByComparator)
		throws NoSuchAddPhyResourceSecException {

		AddPhyResourceSec addPhyResourceSec = findByPrimaryKey(
			addPhyResourceSecId);

		Session session = null;

		try {
			session = openSession();

			AddPhyResourceSec[] array = new AddPhyResourceSecImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addPhyResourceSec, janaacApplicationId,
				orderByComparator, true);

			array[1] = addPhyResourceSec;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addPhyResourceSec, janaacApplicationId,
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

	protected AddPhyResourceSec getBygetJanaacById_PrevAndNext(
		Session session, AddPhyResourceSec addPhyResourceSec,
		long janaacApplicationId,
		OrderByComparator<AddPhyResourceSec> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDPHYRESOURCESEC_WHERE);

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
			sb.append(AddPhyResourceSecModelImpl.ORDER_BY_JPQL);
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
						addPhyResourceSec)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddPhyResourceSec> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add phy resource secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddPhyResourceSec addPhyResourceSec :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addPhyResourceSec);
		}
	}

	/**
	 * Returns the number of add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add phy resource secs
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDPHYRESOURCESEC_WHERE);

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
			"addPhyResourceSec.janaacApplicationId = ?";

	public AddPhyResourceSecPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("number", "number_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AddPhyResourceSec.class);

		setModelImplClass(AddPhyResourceSecImpl.class);
		setModelPKClass(long.class);

		setTable(AddPhyResourceSecTable.INSTANCE);
	}

	/**
	 * Caches the add phy resource sec in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceSec the add phy resource sec
	 */
	@Override
	public void cacheResult(AddPhyResourceSec addPhyResourceSec) {
		entityCache.putResult(
			AddPhyResourceSecImpl.class, addPhyResourceSec.getPrimaryKey(),
			addPhyResourceSec);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add phy resource secs in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceSecs the add phy resource secs
	 */
	@Override
	public void cacheResult(List<AddPhyResourceSec> addPhyResourceSecs) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addPhyResourceSecs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddPhyResourceSec addPhyResourceSec : addPhyResourceSecs) {
			if (entityCache.getResult(
					AddPhyResourceSecImpl.class,
					addPhyResourceSec.getPrimaryKey()) == null) {

				cacheResult(addPhyResourceSec);
			}
		}
	}

	/**
	 * Clears the cache for all add phy resource secs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddPhyResourceSecImpl.class);

		finderCache.clearCache(AddPhyResourceSecImpl.class);
	}

	/**
	 * Clears the cache for the add phy resource sec.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddPhyResourceSec addPhyResourceSec) {
		entityCache.removeResult(
			AddPhyResourceSecImpl.class, addPhyResourceSec);
	}

	@Override
	public void clearCache(List<AddPhyResourceSec> addPhyResourceSecs) {
		for (AddPhyResourceSec addPhyResourceSec : addPhyResourceSecs) {
			entityCache.removeResult(
				AddPhyResourceSecImpl.class, addPhyResourceSec);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddPhyResourceSecImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AddPhyResourceSecImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add phy resource sec with the primary key. Does not add the add phy resource sec to the database.
	 *
	 * @param addPhyResourceSecId the primary key for the new add phy resource sec
	 * @return the new add phy resource sec
	 */
	@Override
	public AddPhyResourceSec create(long addPhyResourceSecId) {
		AddPhyResourceSec addPhyResourceSec = new AddPhyResourceSecImpl();

		addPhyResourceSec.setNew(true);
		addPhyResourceSec.setPrimaryKey(addPhyResourceSecId);

		addPhyResourceSec.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addPhyResourceSec;
	}

	/**
	 * Removes the add phy resource sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec that was removed
	 * @throws NoSuchAddPhyResourceSecException if a add phy resource sec with the primary key could not be found
	 */
	@Override
	public AddPhyResourceSec remove(long addPhyResourceSecId)
		throws NoSuchAddPhyResourceSecException {

		return remove((Serializable)addPhyResourceSecId);
	}

	/**
	 * Removes the add phy resource sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add phy resource sec
	 * @return the add phy resource sec that was removed
	 * @throws NoSuchAddPhyResourceSecException if a add phy resource sec with the primary key could not be found
	 */
	@Override
	public AddPhyResourceSec remove(Serializable primaryKey)
		throws NoSuchAddPhyResourceSecException {

		Session session = null;

		try {
			session = openSession();

			AddPhyResourceSec addPhyResourceSec =
				(AddPhyResourceSec)session.get(
					AddPhyResourceSecImpl.class, primaryKey);

			if (addPhyResourceSec == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddPhyResourceSecException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addPhyResourceSec);
		}
		catch (NoSuchAddPhyResourceSecException noSuchEntityException) {
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
	protected AddPhyResourceSec removeImpl(
		AddPhyResourceSec addPhyResourceSec) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addPhyResourceSec)) {
				addPhyResourceSec = (AddPhyResourceSec)session.get(
					AddPhyResourceSecImpl.class,
					addPhyResourceSec.getPrimaryKeyObj());
			}

			if (addPhyResourceSec != null) {
				session.delete(addPhyResourceSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addPhyResourceSec != null) {
			clearCache(addPhyResourceSec);
		}

		return addPhyResourceSec;
	}

	@Override
	public AddPhyResourceSec updateImpl(AddPhyResourceSec addPhyResourceSec) {
		boolean isNew = addPhyResourceSec.isNew();

		if (!(addPhyResourceSec instanceof AddPhyResourceSecModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addPhyResourceSec.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addPhyResourceSec);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addPhyResourceSec proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddPhyResourceSec implementation " +
					addPhyResourceSec.getClass());
		}

		AddPhyResourceSecModelImpl addPhyResourceSecModelImpl =
			(AddPhyResourceSecModelImpl)addPhyResourceSec;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addPhyResourceSec.getCreateDate() == null)) {
			if (serviceContext == null) {
				addPhyResourceSec.setCreateDate(date);
			}
			else {
				addPhyResourceSec.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addPhyResourceSecModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addPhyResourceSec.setModifiedDate(date);
			}
			else {
				addPhyResourceSec.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addPhyResourceSec);
			}
			else {
				addPhyResourceSec = (AddPhyResourceSec)session.merge(
					addPhyResourceSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddPhyResourceSecImpl.class, addPhyResourceSecModelImpl, false,
			true);

		if (isNew) {
			addPhyResourceSec.setNew(false);
		}

		addPhyResourceSec.resetOriginalValues();

		return addPhyResourceSec;
	}

	/**
	 * Returns the add phy resource sec with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add phy resource sec
	 * @return the add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a add phy resource sec with the primary key could not be found
	 */
	@Override
	public AddPhyResourceSec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddPhyResourceSecException {

		AddPhyResourceSec addPhyResourceSec = fetchByPrimaryKey(primaryKey);

		if (addPhyResourceSec == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddPhyResourceSecException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addPhyResourceSec;
	}

	/**
	 * Returns the add phy resource sec with the primary key or throws a <code>NoSuchAddPhyResourceSecException</code> if it could not be found.
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a add phy resource sec with the primary key could not be found
	 */
	@Override
	public AddPhyResourceSec findByPrimaryKey(long addPhyResourceSecId)
		throws NoSuchAddPhyResourceSecException {

		return findByPrimaryKey((Serializable)addPhyResourceSecId);
	}

	/**
	 * Returns the add phy resource sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec, or <code>null</code> if a add phy resource sec with the primary key could not be found
	 */
	@Override
	public AddPhyResourceSec fetchByPrimaryKey(long addPhyResourceSecId) {
		return fetchByPrimaryKey((Serializable)addPhyResourceSecId);
	}

	/**
	 * Returns all the add phy resource secs.
	 *
	 * @return the add phy resource secs
	 */
	@Override
	public List<AddPhyResourceSec> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add phy resource secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @return the range of add phy resource secs
	 */
	@Override
	public List<AddPhyResourceSec> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add phy resource secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add phy resource secs
	 */
	@Override
	public List<AddPhyResourceSec> findAll(
		int start, int end,
		OrderByComparator<AddPhyResourceSec> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add phy resource secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add phy resource secs
	 */
	@Override
	public List<AddPhyResourceSec> findAll(
		int start, int end,
		OrderByComparator<AddPhyResourceSec> orderByComparator,
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

		List<AddPhyResourceSec> list = null;

		if (useFinderCache) {
			list = (List<AddPhyResourceSec>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDPHYRESOURCESEC);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDPHYRESOURCESEC;

				sql = sql.concat(AddPhyResourceSecModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddPhyResourceSec>)QueryUtil.list(
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
	 * Removes all the add phy resource secs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddPhyResourceSec addPhyResourceSec : findAll()) {
			remove(addPhyResourceSec);
		}
	}

	/**
	 * Returns the number of add phy resource secs.
	 *
	 * @return the number of add phy resource secs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ADDPHYRESOURCESEC);

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
		return "addPhyResourceSecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDPHYRESOURCESEC;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddPhyResourceSecModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add phy resource sec persistence.
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

		AddPhyResourceSecUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddPhyResourceSecUtil.setPersistence(null);

		entityCache.removeCache(AddPhyResourceSecImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDPHYRESOURCESEC =
		"SELECT addPhyResourceSec FROM AddPhyResourceSec addPhyResourceSec";

	private static final String _SQL_SELECT_ADDPHYRESOURCESEC_WHERE =
		"SELECT addPhyResourceSec FROM AddPhyResourceSec addPhyResourceSec WHERE ";

	private static final String _SQL_COUNT_ADDPHYRESOURCESEC =
		"SELECT COUNT(addPhyResourceSec) FROM AddPhyResourceSec addPhyResourceSec";

	private static final String _SQL_COUNT_ADDPHYRESOURCESEC_WHERE =
		"SELECT COUNT(addPhyResourceSec) FROM AddPhyResourceSec addPhyResourceSec WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "addPhyResourceSec.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddPhyResourceSec exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddPhyResourceSec exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddPhyResourceSecPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"number"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}