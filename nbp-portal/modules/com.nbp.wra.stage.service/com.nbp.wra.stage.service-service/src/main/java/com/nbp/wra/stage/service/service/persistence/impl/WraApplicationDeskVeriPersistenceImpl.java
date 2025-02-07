/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence.impl;

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

import com.nbp.wra.stage.service.exception.NoSuchWraApplicationDeskVeriException;
import com.nbp.wra.stage.service.model.WraApplicationDeskVeri;
import com.nbp.wra.stage.service.model.WraApplicationDeskVeriTable;
import com.nbp.wra.stage.service.model.impl.WraApplicationDeskVeriImpl;
import com.nbp.wra.stage.service.model.impl.WraApplicationDeskVeriModelImpl;
import com.nbp.wra.stage.service.service.persistence.WraApplicationDeskVeriPersistence;
import com.nbp.wra.stage.service.service.persistence.WraApplicationDeskVeriUtil;
import com.nbp.wra.stage.service.service.persistence.impl.constants.WRA_STAGESPersistenceConstants;

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
 * The persistence implementation for the wra application desk veri service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = WraApplicationDeskVeriPersistence.class)
public class WraApplicationDeskVeriPersistenceImpl
	extends BasePersistenceImpl<WraApplicationDeskVeri>
	implements WraApplicationDeskVeriPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>WraApplicationDeskVeriUtil</code> to access the wra application desk veri persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		WraApplicationDeskVeriImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetWraAppDV_ById;
	private FinderPath _finderPathWithoutPaginationFindBygetWraAppDV_ById;
	private FinderPath _finderPathCountBygetWraAppDV_ById;

	/**
	 * Returns all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application desk veris
	 */
	@Override
	public List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId) {

		return findBygetWraAppDV_ById(
			wraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @return the range of matching wra application desk veris
	 */
	@Override
	public List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId, int start, int end) {

		return findBygetWraAppDV_ById(wraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application desk veris
	 */
	@Override
	public List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId, int start, int end,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator) {

		return findBygetWraAppDV_ById(
			wraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application desk veris
	 */
	@Override
	public List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId, int start, int end,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetWraAppDV_ById;
				finderArgs = new Object[] {wraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWraAppDV_ById;
			finderArgs = new Object[] {
				wraApplicationId, start, end, orderByComparator
			};
		}

		List<WraApplicationDeskVeri> list = null;

		if (useFinderCache) {
			list = (List<WraApplicationDeskVeri>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WraApplicationDeskVeri wraApplicationDeskVeri : list) {
					if (wraApplicationId !=
							wraApplicationDeskVeri.getWraApplicationId()) {

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

			sb.append(_SQL_SELECT_WRAAPPLICATIONDESKVERI_WHERE);

			sb.append(_FINDER_COLUMN_GETWRAAPPDV_BYID_WRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WraApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				list = (List<WraApplicationDeskVeri>)QueryUtil.list(
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
	 * Returns the first wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a matching wra application desk veri could not be found
	 */
	@Override
	public WraApplicationDeskVeri findBygetWraAppDV_ById_First(
			long wraApplicationId,
			OrderByComparator<WraApplicationDeskVeri> orderByComparator)
		throws NoSuchWraApplicationDeskVeriException {

		WraApplicationDeskVeri wraApplicationDeskVeri =
			fetchBygetWraAppDV_ById_First(wraApplicationId, orderByComparator);

		if (wraApplicationDeskVeri != null) {
			return wraApplicationDeskVeri;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("wraApplicationId=");
		sb.append(wraApplicationId);

		sb.append("}");

		throw new NoSuchWraApplicationDeskVeriException(sb.toString());
	}

	/**
	 * Returns the first wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application desk veri, or <code>null</code> if a matching wra application desk veri could not be found
	 */
	@Override
	public WraApplicationDeskVeri fetchBygetWraAppDV_ById_First(
		long wraApplicationId,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator) {

		List<WraApplicationDeskVeri> list = findBygetWraAppDV_ById(
			wraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a matching wra application desk veri could not be found
	 */
	@Override
	public WraApplicationDeskVeri findBygetWraAppDV_ById_Last(
			long wraApplicationId,
			OrderByComparator<WraApplicationDeskVeri> orderByComparator)
		throws NoSuchWraApplicationDeskVeriException {

		WraApplicationDeskVeri wraApplicationDeskVeri =
			fetchBygetWraAppDV_ById_Last(wraApplicationId, orderByComparator);

		if (wraApplicationDeskVeri != null) {
			return wraApplicationDeskVeri;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("wraApplicationId=");
		sb.append(wraApplicationId);

		sb.append("}");

		throw new NoSuchWraApplicationDeskVeriException(sb.toString());
	}

	/**
	 * Returns the last wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application desk veri, or <code>null</code> if a matching wra application desk veri could not be found
	 */
	@Override
	public WraApplicationDeskVeri fetchBygetWraAppDV_ById_Last(
		long wraApplicationId,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator) {

		int count = countBygetWraAppDV_ById(wraApplicationId);

		if (count == 0) {
			return null;
		}

		List<WraApplicationDeskVeri> list = findBygetWraAppDV_ById(
			wraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra application desk veris before and after the current wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the current wra application desk veri
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a wra application desk veri with the primary key could not be found
	 */
	@Override
	public WraApplicationDeskVeri[] findBygetWraAppDV_ById_PrevAndNext(
			long wraApplicationDeskVeriId, long wraApplicationId,
			OrderByComparator<WraApplicationDeskVeri> orderByComparator)
		throws NoSuchWraApplicationDeskVeriException {

		WraApplicationDeskVeri wraApplicationDeskVeri = findByPrimaryKey(
			wraApplicationDeskVeriId);

		Session session = null;

		try {
			session = openSession();

			WraApplicationDeskVeri[] array = new WraApplicationDeskVeriImpl[3];

			array[0] = getBygetWraAppDV_ById_PrevAndNext(
				session, wraApplicationDeskVeri, wraApplicationId,
				orderByComparator, true);

			array[1] = wraApplicationDeskVeri;

			array[2] = getBygetWraAppDV_ById_PrevAndNext(
				session, wraApplicationDeskVeri, wraApplicationId,
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

	protected WraApplicationDeskVeri getBygetWraAppDV_ById_PrevAndNext(
		Session session, WraApplicationDeskVeri wraApplicationDeskVeri,
		long wraApplicationId,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAAPPLICATIONDESKVERI_WHERE);

		sb.append(_FINDER_COLUMN_GETWRAAPPDV_BYID_WRAAPPLICATIONID_2);

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
			sb.append(WraApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(wraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						wraApplicationDeskVeri)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WraApplicationDeskVeri> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra application desk veris where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	@Override
	public void removeBygetWraAppDV_ById(long wraApplicationId) {
		for (WraApplicationDeskVeri wraApplicationDeskVeri :
				findBygetWraAppDV_ById(
					wraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(wraApplicationDeskVeri);
		}
	}

	/**
	 * Returns the number of wra application desk veris where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra application desk veris
	 */
	@Override
	public int countBygetWraAppDV_ById(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWraAppDV_ById;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATIONDESKVERI_WHERE);

			sb.append(_FINDER_COLUMN_GETWRAAPPDV_BYID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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
		_FINDER_COLUMN_GETWRAAPPDV_BYID_WRAAPPLICATIONID_2 =
			"wraApplicationDeskVeri.wraApplicationId = ?";

	public WraApplicationDeskVeriPersistenceImpl() {
		setModelClass(WraApplicationDeskVeri.class);

		setModelImplClass(WraApplicationDeskVeriImpl.class);
		setModelPKClass(long.class);

		setTable(WraApplicationDeskVeriTable.INSTANCE);
	}

	/**
	 * Caches the wra application desk veri in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDeskVeri the wra application desk veri
	 */
	@Override
	public void cacheResult(WraApplicationDeskVeri wraApplicationDeskVeri) {
		entityCache.putResult(
			WraApplicationDeskVeriImpl.class,
			wraApplicationDeskVeri.getPrimaryKey(), wraApplicationDeskVeri);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the wra application desk veris in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDeskVeris the wra application desk veris
	 */
	@Override
	public void cacheResult(
		List<WraApplicationDeskVeri> wraApplicationDeskVeris) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (wraApplicationDeskVeris.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (WraApplicationDeskVeri wraApplicationDeskVeri :
				wraApplicationDeskVeris) {

			if (entityCache.getResult(
					WraApplicationDeskVeriImpl.class,
					wraApplicationDeskVeri.getPrimaryKey()) == null) {

				cacheResult(wraApplicationDeskVeri);
			}
		}
	}

	/**
	 * Clears the cache for all wra application desk veris.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(WraApplicationDeskVeriImpl.class);

		finderCache.clearCache(WraApplicationDeskVeriImpl.class);
	}

	/**
	 * Clears the cache for the wra application desk veri.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WraApplicationDeskVeri wraApplicationDeskVeri) {
		entityCache.removeResult(
			WraApplicationDeskVeriImpl.class, wraApplicationDeskVeri);
	}

	@Override
	public void clearCache(
		List<WraApplicationDeskVeri> wraApplicationDeskVeris) {

		for (WraApplicationDeskVeri wraApplicationDeskVeri :
				wraApplicationDeskVeris) {

			entityCache.removeResult(
				WraApplicationDeskVeriImpl.class, wraApplicationDeskVeri);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(WraApplicationDeskVeriImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				WraApplicationDeskVeriImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new wra application desk veri with the primary key. Does not add the wra application desk veri to the database.
	 *
	 * @param wraApplicationDeskVeriId the primary key for the new wra application desk veri
	 * @return the new wra application desk veri
	 */
	@Override
	public WraApplicationDeskVeri create(long wraApplicationDeskVeriId) {
		WraApplicationDeskVeri wraApplicationDeskVeri =
			new WraApplicationDeskVeriImpl();

		wraApplicationDeskVeri.setNew(true);
		wraApplicationDeskVeri.setPrimaryKey(wraApplicationDeskVeriId);

		wraApplicationDeskVeri.setCompanyId(CompanyThreadLocal.getCompanyId());

		return wraApplicationDeskVeri;
	}

	/**
	 * Removes the wra application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the wra application desk veri
	 * @return the wra application desk veri that was removed
	 * @throws NoSuchWraApplicationDeskVeriException if a wra application desk veri with the primary key could not be found
	 */
	@Override
	public WraApplicationDeskVeri remove(long wraApplicationDeskVeriId)
		throws NoSuchWraApplicationDeskVeriException {

		return remove((Serializable)wraApplicationDeskVeriId);
	}

	/**
	 * Removes the wra application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wra application desk veri
	 * @return the wra application desk veri that was removed
	 * @throws NoSuchWraApplicationDeskVeriException if a wra application desk veri with the primary key could not be found
	 */
	@Override
	public WraApplicationDeskVeri remove(Serializable primaryKey)
		throws NoSuchWraApplicationDeskVeriException {

		Session session = null;

		try {
			session = openSession();

			WraApplicationDeskVeri wraApplicationDeskVeri =
				(WraApplicationDeskVeri)session.get(
					WraApplicationDeskVeriImpl.class, primaryKey);

			if (wraApplicationDeskVeri == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWraApplicationDeskVeriException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(wraApplicationDeskVeri);
		}
		catch (NoSuchWraApplicationDeskVeriException noSuchEntityException) {
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
	protected WraApplicationDeskVeri removeImpl(
		WraApplicationDeskVeri wraApplicationDeskVeri) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wraApplicationDeskVeri)) {
				wraApplicationDeskVeri = (WraApplicationDeskVeri)session.get(
					WraApplicationDeskVeriImpl.class,
					wraApplicationDeskVeri.getPrimaryKeyObj());
			}

			if (wraApplicationDeskVeri != null) {
				session.delete(wraApplicationDeskVeri);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (wraApplicationDeskVeri != null) {
			clearCache(wraApplicationDeskVeri);
		}

		return wraApplicationDeskVeri;
	}

	@Override
	public WraApplicationDeskVeri updateImpl(
		WraApplicationDeskVeri wraApplicationDeskVeri) {

		boolean isNew = wraApplicationDeskVeri.isNew();

		if (!(wraApplicationDeskVeri instanceof
				WraApplicationDeskVeriModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(wraApplicationDeskVeri.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					wraApplicationDeskVeri);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in wraApplicationDeskVeri proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom WraApplicationDeskVeri implementation " +
					wraApplicationDeskVeri.getClass());
		}

		WraApplicationDeskVeriModelImpl wraApplicationDeskVeriModelImpl =
			(WraApplicationDeskVeriModelImpl)wraApplicationDeskVeri;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (wraApplicationDeskVeri.getCreateDate() == null)) {
			if (serviceContext == null) {
				wraApplicationDeskVeri.setCreateDate(date);
			}
			else {
				wraApplicationDeskVeri.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!wraApplicationDeskVeriModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				wraApplicationDeskVeri.setModifiedDate(date);
			}
			else {
				wraApplicationDeskVeri.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(wraApplicationDeskVeri);
			}
			else {
				wraApplicationDeskVeri = (WraApplicationDeskVeri)session.merge(
					wraApplicationDeskVeri);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			WraApplicationDeskVeriImpl.class, wraApplicationDeskVeriModelImpl,
			false, true);

		if (isNew) {
			wraApplicationDeskVeri.setNew(false);
		}

		wraApplicationDeskVeri.resetOriginalValues();

		return wraApplicationDeskVeri;
	}

	/**
	 * Returns the wra application desk veri with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wra application desk veri
	 * @return the wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a wra application desk veri with the primary key could not be found
	 */
	@Override
	public WraApplicationDeskVeri findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWraApplicationDeskVeriException {

		WraApplicationDeskVeri wraApplicationDeskVeri = fetchByPrimaryKey(
			primaryKey);

		if (wraApplicationDeskVeri == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWraApplicationDeskVeriException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return wraApplicationDeskVeri;
	}

	/**
	 * Returns the wra application desk veri with the primary key or throws a <code>NoSuchWraApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the wra application desk veri
	 * @return the wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a wra application desk veri with the primary key could not be found
	 */
	@Override
	public WraApplicationDeskVeri findByPrimaryKey(
			long wraApplicationDeskVeriId)
		throws NoSuchWraApplicationDeskVeriException {

		return findByPrimaryKey((Serializable)wraApplicationDeskVeriId);
	}

	/**
	 * Returns the wra application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the wra application desk veri
	 * @return the wra application desk veri, or <code>null</code> if a wra application desk veri with the primary key could not be found
	 */
	@Override
	public WraApplicationDeskVeri fetchByPrimaryKey(
		long wraApplicationDeskVeriId) {

		return fetchByPrimaryKey((Serializable)wraApplicationDeskVeriId);
	}

	/**
	 * Returns all the wra application desk veris.
	 *
	 * @return the wra application desk veris
	 */
	@Override
	public List<WraApplicationDeskVeri> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @return the range of wra application desk veris
	 */
	@Override
	public List<WraApplicationDeskVeri> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra application desk veris
	 */
	@Override
	public List<WraApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra application desk veris
	 */
	@Override
	public List<WraApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator,
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

		List<WraApplicationDeskVeri> list = null;

		if (useFinderCache) {
			list = (List<WraApplicationDeskVeri>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_WRAAPPLICATIONDESKVERI);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_WRAAPPLICATIONDESKVERI;

				sql = sql.concat(WraApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<WraApplicationDeskVeri>)QueryUtil.list(
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
	 * Removes all the wra application desk veris from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (WraApplicationDeskVeri wraApplicationDeskVeri : findAll()) {
			remove(wraApplicationDeskVeri);
		}
	}

	/**
	 * Returns the number of wra application desk veris.
	 *
	 * @return the number of wra application desk veris
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
					_SQL_COUNT_WRAAPPLICATIONDESKVERI);

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
		return "wraApplicationDeskVeriId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_WRAAPPLICATIONDESKVERI;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return WraApplicationDeskVeriModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wra application desk veri persistence.
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

		_finderPathWithPaginationFindBygetWraAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWraAppDV_ById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"wraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetWraAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetWraAppDV_ById",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWraAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWraAppDV_ById", new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		WraApplicationDeskVeriUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		WraApplicationDeskVeriUtil.setPersistence(null);

		entityCache.removeCache(WraApplicationDeskVeriImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_WRAAPPLICATIONDESKVERI =
		"SELECT wraApplicationDeskVeri FROM WraApplicationDeskVeri wraApplicationDeskVeri";

	private static final String _SQL_SELECT_WRAAPPLICATIONDESKVERI_WHERE =
		"SELECT wraApplicationDeskVeri FROM WraApplicationDeskVeri wraApplicationDeskVeri WHERE ";

	private static final String _SQL_COUNT_WRAAPPLICATIONDESKVERI =
		"SELECT COUNT(wraApplicationDeskVeri) FROM WraApplicationDeskVeri wraApplicationDeskVeri";

	private static final String _SQL_COUNT_WRAAPPLICATIONDESKVERI_WHERE =
		"SELECT COUNT(wraApplicationDeskVeri) FROM WraApplicationDeskVeri wraApplicationDeskVeri WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"wraApplicationDeskVeri.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No WraApplicationDeskVeri exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No WraApplicationDeskVeri exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		WraApplicationDeskVeriPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}