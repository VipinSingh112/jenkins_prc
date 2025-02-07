/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence.impl;

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

import com.nbp.hsra.stage.services.exception.NoSuchHsraApplicationDeskVeriException;
import com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri;
import com.nbp.hsra.stage.services.model.HsraApplicationDeskVeriTable;
import com.nbp.hsra.stage.services.model.impl.HsraApplicationDeskVeriImpl;
import com.nbp.hsra.stage.services.model.impl.HsraApplicationDeskVeriModelImpl;
import com.nbp.hsra.stage.services.service.persistence.HsraApplicationDeskVeriPersistence;
import com.nbp.hsra.stage.services.service.persistence.HsraApplicationDeskVeriUtil;
import com.nbp.hsra.stage.services.service.persistence.impl.constants.HSRA_STAGEPersistenceConstants;

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
 * The persistence implementation for the hsra application desk veri service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HsraApplicationDeskVeriPersistence.class)
public class HsraApplicationDeskVeriPersistenceImpl
	extends BasePersistenceImpl<HsraApplicationDeskVeri>
	implements HsraApplicationDeskVeriPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HsraApplicationDeskVeriUtil</code> to access the hsra application desk veri persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HsraApplicationDeskVeriImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetHsraAppDV_ById;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraAppDV_ById;
	private FinderPath _finderPathCountBygetHsraAppDV_ById;

	/**
	 * Returns all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application desk veris
	 */
	@Override
	public List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId) {

		return findBygetHsraAppDV_ById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @return the range of matching hsra application desk veris
	 */
	@Override
	public List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraAppDV_ById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application desk veris
	 */
	@Override
	public List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator) {

		return findBygetHsraAppDV_ById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application desk veris
	 */
	@Override
	public List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHsraAppDV_ById;
				finderArgs = new Object[] {hsraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraAppDV_ById;
			finderArgs = new Object[] {
				hsraApplicationId, start, end, orderByComparator
			};
		}

		List<HsraApplicationDeskVeri> list = null;

		if (useFinderCache) {
			list = (List<HsraApplicationDeskVeri>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraApplicationDeskVeri hsraApplicationDeskVeri : list) {
					if (hsraApplicationId !=
							hsraApplicationDeskVeri.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_HSRAAPPLICATIONDESKVERI_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRAAPPDV_BYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HsraApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<HsraApplicationDeskVeri>)QueryUtil.list(
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
	 * Returns the first hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a matching hsra application desk veri could not be found
	 */
	@Override
	public HsraApplicationDeskVeri findBygetHsraAppDV_ById_First(
			long hsraApplicationId,
			OrderByComparator<HsraApplicationDeskVeri> orderByComparator)
		throws NoSuchHsraApplicationDeskVeriException {

		HsraApplicationDeskVeri hsraApplicationDeskVeri =
			fetchBygetHsraAppDV_ById_First(
				hsraApplicationId, orderByComparator);

		if (hsraApplicationDeskVeri != null) {
			return hsraApplicationDeskVeri;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchHsraApplicationDeskVeriException(sb.toString());
	}

	/**
	 * Returns the first hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application desk veri, or <code>null</code> if a matching hsra application desk veri could not be found
	 */
	@Override
	public HsraApplicationDeskVeri fetchBygetHsraAppDV_ById_First(
		long hsraApplicationId,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator) {

		List<HsraApplicationDeskVeri> list = findBygetHsraAppDV_ById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a matching hsra application desk veri could not be found
	 */
	@Override
	public HsraApplicationDeskVeri findBygetHsraAppDV_ById_Last(
			long hsraApplicationId,
			OrderByComparator<HsraApplicationDeskVeri> orderByComparator)
		throws NoSuchHsraApplicationDeskVeriException {

		HsraApplicationDeskVeri hsraApplicationDeskVeri =
			fetchBygetHsraAppDV_ById_Last(hsraApplicationId, orderByComparator);

		if (hsraApplicationDeskVeri != null) {
			return hsraApplicationDeskVeri;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchHsraApplicationDeskVeriException(sb.toString());
	}

	/**
	 * Returns the last hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application desk veri, or <code>null</code> if a matching hsra application desk veri could not be found
	 */
	@Override
	public HsraApplicationDeskVeri fetchBygetHsraAppDV_ById_Last(
		long hsraApplicationId,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator) {

		int count = countBygetHsraAppDV_ById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<HsraApplicationDeskVeri> list = findBygetHsraAppDV_ById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra application desk veris before and after the current hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the current hsra application desk veri
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a hsra application desk veri with the primary key could not be found
	 */
	@Override
	public HsraApplicationDeskVeri[] findBygetHsraAppDV_ById_PrevAndNext(
			long hsraApplicationDeskVeriId, long hsraApplicationId,
			OrderByComparator<HsraApplicationDeskVeri> orderByComparator)
		throws NoSuchHsraApplicationDeskVeriException {

		HsraApplicationDeskVeri hsraApplicationDeskVeri = findByPrimaryKey(
			hsraApplicationDeskVeriId);

		Session session = null;

		try {
			session = openSession();

			HsraApplicationDeskVeri[] array =
				new HsraApplicationDeskVeriImpl[3];

			array[0] = getBygetHsraAppDV_ById_PrevAndNext(
				session, hsraApplicationDeskVeri, hsraApplicationId,
				orderByComparator, true);

			array[1] = hsraApplicationDeskVeri;

			array[2] = getBygetHsraAppDV_ById_PrevAndNext(
				session, hsraApplicationDeskVeri, hsraApplicationId,
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

	protected HsraApplicationDeskVeri getBygetHsraAppDV_ById_PrevAndNext(
		Session session, HsraApplicationDeskVeri hsraApplicationDeskVeri,
		long hsraApplicationId,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATIONDESKVERI_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRAAPPDV_BYID_HSRAAPPLICATIONID_2);

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
			sb.append(HsraApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(hsraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						hsraApplicationDeskVeri)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraApplicationDeskVeri> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra application desk veris where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraAppDV_ById(long hsraApplicationId) {
		for (HsraApplicationDeskVeri hsraApplicationDeskVeri :
				findBygetHsraAppDV_ById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(hsraApplicationDeskVeri);
		}
	}

	/**
	 * Returns the number of hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application desk veris
	 */
	@Override
	public int countBygetHsraAppDV_ById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraAppDV_ById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONDESKVERI_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRAAPPDV_BYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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
		_FINDER_COLUMN_GETHSRAAPPDV_BYID_HSRAAPPLICATIONID_2 =
			"hsraApplicationDeskVeri.hsraApplicationId = ?";

	public HsraApplicationDeskVeriPersistenceImpl() {
		setModelClass(HsraApplicationDeskVeri.class);

		setModelImplClass(HsraApplicationDeskVeriImpl.class);
		setModelPKClass(long.class);

		setTable(HsraApplicationDeskVeriTable.INSTANCE);
	}

	/**
	 * Caches the hsra application desk veri in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDeskVeri the hsra application desk veri
	 */
	@Override
	public void cacheResult(HsraApplicationDeskVeri hsraApplicationDeskVeri) {
		entityCache.putResult(
			HsraApplicationDeskVeriImpl.class,
			hsraApplicationDeskVeri.getPrimaryKey(), hsraApplicationDeskVeri);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the hsra application desk veris in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDeskVeris the hsra application desk veris
	 */
	@Override
	public void cacheResult(
		List<HsraApplicationDeskVeri> hsraApplicationDeskVeris) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (hsraApplicationDeskVeris.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HsraApplicationDeskVeri hsraApplicationDeskVeri :
				hsraApplicationDeskVeris) {

			if (entityCache.getResult(
					HsraApplicationDeskVeriImpl.class,
					hsraApplicationDeskVeri.getPrimaryKey()) == null) {

				cacheResult(hsraApplicationDeskVeri);
			}
		}
	}

	/**
	 * Clears the cache for all hsra application desk veris.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HsraApplicationDeskVeriImpl.class);

		finderCache.clearCache(HsraApplicationDeskVeriImpl.class);
	}

	/**
	 * Clears the cache for the hsra application desk veri.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HsraApplicationDeskVeri hsraApplicationDeskVeri) {
		entityCache.removeResult(
			HsraApplicationDeskVeriImpl.class, hsraApplicationDeskVeri);
	}

	@Override
	public void clearCache(
		List<HsraApplicationDeskVeri> hsraApplicationDeskVeris) {

		for (HsraApplicationDeskVeri hsraApplicationDeskVeri :
				hsraApplicationDeskVeris) {

			entityCache.removeResult(
				HsraApplicationDeskVeriImpl.class, hsraApplicationDeskVeri);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HsraApplicationDeskVeriImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HsraApplicationDeskVeriImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new hsra application desk veri with the primary key. Does not add the hsra application desk veri to the database.
	 *
	 * @param hsraApplicationDeskVeriId the primary key for the new hsra application desk veri
	 * @return the new hsra application desk veri
	 */
	@Override
	public HsraApplicationDeskVeri create(long hsraApplicationDeskVeriId) {
		HsraApplicationDeskVeri hsraApplicationDeskVeri =
			new HsraApplicationDeskVeriImpl();

		hsraApplicationDeskVeri.setNew(true);
		hsraApplicationDeskVeri.setPrimaryKey(hsraApplicationDeskVeriId);

		hsraApplicationDeskVeri.setCompanyId(CompanyThreadLocal.getCompanyId());

		return hsraApplicationDeskVeri;
	}

	/**
	 * Removes the hsra application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri that was removed
	 * @throws NoSuchHsraApplicationDeskVeriException if a hsra application desk veri with the primary key could not be found
	 */
	@Override
	public HsraApplicationDeskVeri remove(long hsraApplicationDeskVeriId)
		throws NoSuchHsraApplicationDeskVeriException {

		return remove((Serializable)hsraApplicationDeskVeriId);
	}

	/**
	 * Removes the hsra application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hsra application desk veri
	 * @return the hsra application desk veri that was removed
	 * @throws NoSuchHsraApplicationDeskVeriException if a hsra application desk veri with the primary key could not be found
	 */
	@Override
	public HsraApplicationDeskVeri remove(Serializable primaryKey)
		throws NoSuchHsraApplicationDeskVeriException {

		Session session = null;

		try {
			session = openSession();

			HsraApplicationDeskVeri hsraApplicationDeskVeri =
				(HsraApplicationDeskVeri)session.get(
					HsraApplicationDeskVeriImpl.class, primaryKey);

			if (hsraApplicationDeskVeri == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHsraApplicationDeskVeriException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(hsraApplicationDeskVeri);
		}
		catch (NoSuchHsraApplicationDeskVeriException noSuchEntityException) {
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
	protected HsraApplicationDeskVeri removeImpl(
		HsraApplicationDeskVeri hsraApplicationDeskVeri) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hsraApplicationDeskVeri)) {
				hsraApplicationDeskVeri = (HsraApplicationDeskVeri)session.get(
					HsraApplicationDeskVeriImpl.class,
					hsraApplicationDeskVeri.getPrimaryKeyObj());
			}

			if (hsraApplicationDeskVeri != null) {
				session.delete(hsraApplicationDeskVeri);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (hsraApplicationDeskVeri != null) {
			clearCache(hsraApplicationDeskVeri);
		}

		return hsraApplicationDeskVeri;
	}

	@Override
	public HsraApplicationDeskVeri updateImpl(
		HsraApplicationDeskVeri hsraApplicationDeskVeri) {

		boolean isNew = hsraApplicationDeskVeri.isNew();

		if (!(hsraApplicationDeskVeri instanceof
				HsraApplicationDeskVeriModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(hsraApplicationDeskVeri.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					hsraApplicationDeskVeri);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in hsraApplicationDeskVeri proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HsraApplicationDeskVeri implementation " +
					hsraApplicationDeskVeri.getClass());
		}

		HsraApplicationDeskVeriModelImpl hsraApplicationDeskVeriModelImpl =
			(HsraApplicationDeskVeriModelImpl)hsraApplicationDeskVeri;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (hsraApplicationDeskVeri.getCreateDate() == null)) {
			if (serviceContext == null) {
				hsraApplicationDeskVeri.setCreateDate(date);
			}
			else {
				hsraApplicationDeskVeri.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!hsraApplicationDeskVeriModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				hsraApplicationDeskVeri.setModifiedDate(date);
			}
			else {
				hsraApplicationDeskVeri.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(hsraApplicationDeskVeri);
			}
			else {
				hsraApplicationDeskVeri =
					(HsraApplicationDeskVeri)session.merge(
						hsraApplicationDeskVeri);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HsraApplicationDeskVeriImpl.class, hsraApplicationDeskVeriModelImpl,
			false, true);

		if (isNew) {
			hsraApplicationDeskVeri.setNew(false);
		}

		hsraApplicationDeskVeri.resetOriginalValues();

		return hsraApplicationDeskVeri;
	}

	/**
	 * Returns the hsra application desk veri with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hsra application desk veri
	 * @return the hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a hsra application desk veri with the primary key could not be found
	 */
	@Override
	public HsraApplicationDeskVeri findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHsraApplicationDeskVeriException {

		HsraApplicationDeskVeri hsraApplicationDeskVeri = fetchByPrimaryKey(
			primaryKey);

		if (hsraApplicationDeskVeri == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHsraApplicationDeskVeriException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return hsraApplicationDeskVeri;
	}

	/**
	 * Returns the hsra application desk veri with the primary key or throws a <code>NoSuchHsraApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a hsra application desk veri with the primary key could not be found
	 */
	@Override
	public HsraApplicationDeskVeri findByPrimaryKey(
			long hsraApplicationDeskVeriId)
		throws NoSuchHsraApplicationDeskVeriException {

		return findByPrimaryKey((Serializable)hsraApplicationDeskVeriId);
	}

	/**
	 * Returns the hsra application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri, or <code>null</code> if a hsra application desk veri with the primary key could not be found
	 */
	@Override
	public HsraApplicationDeskVeri fetchByPrimaryKey(
		long hsraApplicationDeskVeriId) {

		return fetchByPrimaryKey((Serializable)hsraApplicationDeskVeriId);
	}

	/**
	 * Returns all the hsra application desk veris.
	 *
	 * @return the hsra application desk veris
	 */
	@Override
	public List<HsraApplicationDeskVeri> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @return the range of hsra application desk veris
	 */
	@Override
	public List<HsraApplicationDeskVeri> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application desk veris
	 */
	@Override
	public List<HsraApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application desk veris
	 */
	@Override
	public List<HsraApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator,
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

		List<HsraApplicationDeskVeri> list = null;

		if (useFinderCache) {
			list = (List<HsraApplicationDeskVeri>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HSRAAPPLICATIONDESKVERI);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HSRAAPPLICATIONDESKVERI;

				sql = sql.concat(
					HsraApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HsraApplicationDeskVeri>)QueryUtil.list(
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
	 * Removes all the hsra application desk veris from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HsraApplicationDeskVeri hsraApplicationDeskVeri : findAll()) {
			remove(hsraApplicationDeskVeri);
		}
	}

	/**
	 * Returns the number of hsra application desk veris.
	 *
	 * @return the number of hsra application desk veris
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
					_SQL_COUNT_HSRAAPPLICATIONDESKVERI);

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
		return "hsraApplicationDeskVeriId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HSRAAPPLICATIONDESKVERI;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HsraApplicationDeskVeriModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hsra application desk veri persistence.
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

		_finderPathWithPaginationFindBygetHsraAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraAppDV_ById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"hsraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHsraAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetHsraAppDV_ById", new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsraAppDV_ById", new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		HsraApplicationDeskVeriUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HsraApplicationDeskVeriUtil.setPersistence(null);

		entityCache.removeCache(HsraApplicationDeskVeriImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HSRAAPPLICATIONDESKVERI =
		"SELECT hsraApplicationDeskVeri FROM HsraApplicationDeskVeri hsraApplicationDeskVeri";

	private static final String _SQL_SELECT_HSRAAPPLICATIONDESKVERI_WHERE =
		"SELECT hsraApplicationDeskVeri FROM HsraApplicationDeskVeri hsraApplicationDeskVeri WHERE ";

	private static final String _SQL_COUNT_HSRAAPPLICATIONDESKVERI =
		"SELECT COUNT(hsraApplicationDeskVeri) FROM HsraApplicationDeskVeri hsraApplicationDeskVeri";

	private static final String _SQL_COUNT_HSRAAPPLICATIONDESKVERI_WHERE =
		"SELECT COUNT(hsraApplicationDeskVeri) FROM HsraApplicationDeskVeri hsraApplicationDeskVeri WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"hsraApplicationDeskVeri.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HsraApplicationDeskVeri exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HsraApplicationDeskVeri exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HsraApplicationDeskVeriPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}