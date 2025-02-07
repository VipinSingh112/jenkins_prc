/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence.impl;

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

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisApplicationDeskVeriException;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationDeskVeri;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationDeskVeriTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDeskVeriImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDeskVeriModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationDeskVeriPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationDeskVeriUtil;
import com.npm.cannabis.application.stages.services.service.persistence.impl.constants.CANNABIS_STAGESPersistenceConstants;

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
 * The persistence implementation for the cannabis application desk veri service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisApplicationDeskVeriPersistence.class)
public class CannabisApplicationDeskVeriPersistenceImpl
	extends BasePersistenceImpl<CannabisApplicationDeskVeri>
	implements CannabisApplicationDeskVeriPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisApplicationDeskVeriUtil</code> to access the cannabis application desk veri persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisApplicationDeskVeriImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetCannabisAppDV_ById;
	private FinderPath _finderPathWithoutPaginationFindBygetCannabisAppDV_ById;
	private FinderPath _finderPathCountBygetCannabisAppDV_ById;

	/**
	 * Returns all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application desk veris
	 */
	@Override
	public List<CannabisApplicationDeskVeri> findBygetCannabisAppDV_ById(
		long cannabisApplicationId) {

		return findBygetCannabisAppDV_ById(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @return the range of matching cannabis application desk veris
	 */
	@Override
	public List<CannabisApplicationDeskVeri> findBygetCannabisAppDV_ById(
		long cannabisApplicationId, int start, int end) {

		return findBygetCannabisAppDV_ById(
			cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application desk veris
	 */
	@Override
	public List<CannabisApplicationDeskVeri> findBygetCannabisAppDV_ById(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator) {

		return findBygetCannabisAppDV_ById(
			cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application desk veris
	 */
	@Override
	public List<CannabisApplicationDeskVeri> findBygetCannabisAppDV_ById(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCannabisAppDV_ById;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCannabisAppDV_ById;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisApplicationDeskVeri> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationDeskVeri>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationDeskVeri cannabisApplicationDeskVeri :
						list) {

					if (cannabisApplicationId !=
							cannabisApplicationDeskVeri.
								getCannabisApplicationId()) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONDESKVERI_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPDV_BYID_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list = (List<CannabisApplicationDeskVeri>)QueryUtil.list(
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
	 * Returns the first cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a matching cannabis application desk veri could not be found
	 */
	@Override
	public CannabisApplicationDeskVeri findBygetCannabisAppDV_ById_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisApplicationDeskVeri> orderByComparator)
		throws NoSuchCannabisApplicationDeskVeriException {

		CannabisApplicationDeskVeri cannabisApplicationDeskVeri =
			fetchBygetCannabisAppDV_ById_First(
				cannabisApplicationId, orderByComparator);

		if (cannabisApplicationDeskVeri != null) {
			return cannabisApplicationDeskVeri;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisApplicationDeskVeriException(sb.toString());
	}

	/**
	 * Returns the first cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application desk veri, or <code>null</code> if a matching cannabis application desk veri could not be found
	 */
	@Override
	public CannabisApplicationDeskVeri fetchBygetCannabisAppDV_ById_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator) {

		List<CannabisApplicationDeskVeri> list = findBygetCannabisAppDV_ById(
			cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a matching cannabis application desk veri could not be found
	 */
	@Override
	public CannabisApplicationDeskVeri findBygetCannabisAppDV_ById_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisApplicationDeskVeri> orderByComparator)
		throws NoSuchCannabisApplicationDeskVeriException {

		CannabisApplicationDeskVeri cannabisApplicationDeskVeri =
			fetchBygetCannabisAppDV_ById_Last(
				cannabisApplicationId, orderByComparator);

		if (cannabisApplicationDeskVeri != null) {
			return cannabisApplicationDeskVeri;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisApplicationDeskVeriException(sb.toString());
	}

	/**
	 * Returns the last cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application desk veri, or <code>null</code> if a matching cannabis application desk veri could not be found
	 */
	@Override
	public CannabisApplicationDeskVeri fetchBygetCannabisAppDV_ById_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator) {

		int count = countBygetCannabisAppDV_ById(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationDeskVeri> list = findBygetCannabisAppDV_ById(
			cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application desk veris before and after the current cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDeskVeriId the primary key of the current cannabis application desk veri
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a cannabis application desk veri with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDeskVeri[]
			findBygetCannabisAppDV_ById_PrevAndNext(
				long cannabisDeskVeriId, long cannabisApplicationId,
				OrderByComparator<CannabisApplicationDeskVeri>
					orderByComparator)
		throws NoSuchCannabisApplicationDeskVeriException {

		CannabisApplicationDeskVeri cannabisApplicationDeskVeri =
			findByPrimaryKey(cannabisDeskVeriId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationDeskVeri[] array =
				new CannabisApplicationDeskVeriImpl[3];

			array[0] = getBygetCannabisAppDV_ById_PrevAndNext(
				session, cannabisApplicationDeskVeri, cannabisApplicationId,
				orderByComparator, true);

			array[1] = cannabisApplicationDeskVeri;

			array[2] = getBygetCannabisAppDV_ById_PrevAndNext(
				session, cannabisApplicationDeskVeri, cannabisApplicationId,
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

	protected CannabisApplicationDeskVeri
		getBygetCannabisAppDV_ById_PrevAndNext(
			Session session,
			CannabisApplicationDeskVeri cannabisApplicationDeskVeri,
			long cannabisApplicationId,
			OrderByComparator<CannabisApplicationDeskVeri> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONDESKVERI_WHERE);

		sb.append(_FINDER_COLUMN_GETCANNABISAPPDV_BYID_CANNABISAPPLICATIONID_2);

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
			sb.append(CannabisApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(cannabisApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplicationDeskVeri)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationDeskVeri> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application desk veris where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCannabisAppDV_ById(long cannabisApplicationId) {
		for (CannabisApplicationDeskVeri cannabisApplicationDeskVeri :
				findBygetCannabisAppDV_ById(
					cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisApplicationDeskVeri);
		}
	}

	/**
	 * Returns the number of cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application desk veris
	 */
	@Override
	public int countBygetCannabisAppDV_ById(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCannabisAppDV_ById;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONDESKVERI_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPDV_BYID_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

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
		_FINDER_COLUMN_GETCANNABISAPPDV_BYID_CANNABISAPPLICATIONID_2 =
			"cannabisApplicationDeskVeri.cannabisApplicationId = ?";

	public CannabisApplicationDeskVeriPersistenceImpl() {
		setModelClass(CannabisApplicationDeskVeri.class);

		setModelImplClass(CannabisApplicationDeskVeriImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisApplicationDeskVeriTable.INSTANCE);
	}

	/**
	 * Caches the cannabis application desk veri in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDeskVeri the cannabis application desk veri
	 */
	@Override
	public void cacheResult(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		entityCache.putResult(
			CannabisApplicationDeskVeriImpl.class,
			cannabisApplicationDeskVeri.getPrimaryKey(),
			cannabisApplicationDeskVeri);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis application desk veris in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDeskVeris the cannabis application desk veris
	 */
	@Override
	public void cacheResult(
		List<CannabisApplicationDeskVeri> cannabisApplicationDeskVeris) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisApplicationDeskVeris.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisApplicationDeskVeri cannabisApplicationDeskVeri :
				cannabisApplicationDeskVeris) {

			if (entityCache.getResult(
					CannabisApplicationDeskVeriImpl.class,
					cannabisApplicationDeskVeri.getPrimaryKey()) == null) {

				cacheResult(cannabisApplicationDeskVeri);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis application desk veris.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisApplicationDeskVeriImpl.class);

		finderCache.clearCache(CannabisApplicationDeskVeriImpl.class);
	}

	/**
	 * Clears the cache for the cannabis application desk veri.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		entityCache.removeResult(
			CannabisApplicationDeskVeriImpl.class, cannabisApplicationDeskVeri);
	}

	@Override
	public void clearCache(
		List<CannabisApplicationDeskVeri> cannabisApplicationDeskVeris) {

		for (CannabisApplicationDeskVeri cannabisApplicationDeskVeri :
				cannabisApplicationDeskVeris) {

			entityCache.removeResult(
				CannabisApplicationDeskVeriImpl.class,
				cannabisApplicationDeskVeri);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisApplicationDeskVeriImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisApplicationDeskVeriImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new cannabis application desk veri with the primary key. Does not add the cannabis application desk veri to the database.
	 *
	 * @param cannabisDeskVeriId the primary key for the new cannabis application desk veri
	 * @return the new cannabis application desk veri
	 */
	@Override
	public CannabisApplicationDeskVeri create(long cannabisDeskVeriId) {
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri =
			new CannabisApplicationDeskVeriImpl();

		cannabisApplicationDeskVeri.setNew(true);
		cannabisApplicationDeskVeri.setPrimaryKey(cannabisDeskVeriId);

		cannabisApplicationDeskVeri.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisApplicationDeskVeri;
	}

	/**
	 * Removes the cannabis application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri that was removed
	 * @throws NoSuchCannabisApplicationDeskVeriException if a cannabis application desk veri with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDeskVeri remove(long cannabisDeskVeriId)
		throws NoSuchCannabisApplicationDeskVeriException {

		return remove((Serializable)cannabisDeskVeriId);
	}

	/**
	 * Removes the cannabis application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri that was removed
	 * @throws NoSuchCannabisApplicationDeskVeriException if a cannabis application desk veri with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDeskVeri remove(Serializable primaryKey)
		throws NoSuchCannabisApplicationDeskVeriException {

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationDeskVeri cannabisApplicationDeskVeri =
				(CannabisApplicationDeskVeri)session.get(
					CannabisApplicationDeskVeriImpl.class, primaryKey);

			if (cannabisApplicationDeskVeri == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisApplicationDeskVeriException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisApplicationDeskVeri);
		}
		catch (NoSuchCannabisApplicationDeskVeriException
					noSuchEntityException) {

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
	protected CannabisApplicationDeskVeri removeImpl(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisApplicationDeskVeri)) {
				cannabisApplicationDeskVeri =
					(CannabisApplicationDeskVeri)session.get(
						CannabisApplicationDeskVeriImpl.class,
						cannabisApplicationDeskVeri.getPrimaryKeyObj());
			}

			if (cannabisApplicationDeskVeri != null) {
				session.delete(cannabisApplicationDeskVeri);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisApplicationDeskVeri != null) {
			clearCache(cannabisApplicationDeskVeri);
		}

		return cannabisApplicationDeskVeri;
	}

	@Override
	public CannabisApplicationDeskVeri updateImpl(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		boolean isNew = cannabisApplicationDeskVeri.isNew();

		if (!(cannabisApplicationDeskVeri instanceof
				CannabisApplicationDeskVeriModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisApplicationDeskVeri.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisApplicationDeskVeri);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisApplicationDeskVeri proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisApplicationDeskVeri implementation " +
					cannabisApplicationDeskVeri.getClass());
		}

		CannabisApplicationDeskVeriModelImpl
			cannabisApplicationDeskVeriModelImpl =
				(CannabisApplicationDeskVeriModelImpl)
					cannabisApplicationDeskVeri;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisApplicationDeskVeri.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisApplicationDeskVeri.setCreateDate(date);
			}
			else {
				cannabisApplicationDeskVeri.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisApplicationDeskVeriModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisApplicationDeskVeri.setModifiedDate(date);
			}
			else {
				cannabisApplicationDeskVeri.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisApplicationDeskVeri);
			}
			else {
				cannabisApplicationDeskVeri =
					(CannabisApplicationDeskVeri)session.merge(
						cannabisApplicationDeskVeri);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisApplicationDeskVeriImpl.class,
			cannabisApplicationDeskVeriModelImpl, false, true);

		if (isNew) {
			cannabisApplicationDeskVeri.setNew(false);
		}

		cannabisApplicationDeskVeri.resetOriginalValues();

		return cannabisApplicationDeskVeri;
	}

	/**
	 * Returns the cannabis application desk veri with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a cannabis application desk veri with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDeskVeri findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisApplicationDeskVeriException {

		CannabisApplicationDeskVeri cannabisApplicationDeskVeri =
			fetchByPrimaryKey(primaryKey);

		if (cannabisApplicationDeskVeri == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisApplicationDeskVeriException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisApplicationDeskVeri;
	}

	/**
	 * Returns the cannabis application desk veri with the primary key or throws a <code>NoSuchCannabisApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a cannabis application desk veri with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDeskVeri findByPrimaryKey(long cannabisDeskVeriId)
		throws NoSuchCannabisApplicationDeskVeriException {

		return findByPrimaryKey((Serializable)cannabisDeskVeriId);
	}

	/**
	 * Returns the cannabis application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri, or <code>null</code> if a cannabis application desk veri with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDeskVeri fetchByPrimaryKey(
		long cannabisDeskVeriId) {

		return fetchByPrimaryKey((Serializable)cannabisDeskVeriId);
	}

	/**
	 * Returns all the cannabis application desk veris.
	 *
	 * @return the cannabis application desk veris
	 */
	@Override
	public List<CannabisApplicationDeskVeri> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @return the range of cannabis application desk veris
	 */
	@Override
	public List<CannabisApplicationDeskVeri> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application desk veris
	 */
	@Override
	public List<CannabisApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application desk veris
	 */
	@Override
	public List<CannabisApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator,
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

		List<CannabisApplicationDeskVeri> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationDeskVeri>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISAPPLICATIONDESKVERI);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISAPPLICATIONDESKVERI;

				sql = sql.concat(
					CannabisApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisApplicationDeskVeri>)QueryUtil.list(
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
	 * Removes all the cannabis application desk veris from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisApplicationDeskVeri cannabisApplicationDeskVeri :
				findAll()) {

			remove(cannabisApplicationDeskVeri);
		}
	}

	/**
	 * Returns the number of cannabis application desk veris.
	 *
	 * @return the number of cannabis application desk veris
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
					_SQL_COUNT_CANNABISAPPLICATIONDESKVERI);

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
		return "cannabisDeskVeriId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISAPPLICATIONDESKVERI;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisApplicationDeskVeriModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis application desk veri persistence.
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

		_finderPathWithPaginationFindBygetCannabisAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetCannabisAppDV_ById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCannabisAppDV_ById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCannabisAppDV_ById",
				new String[] {Long.class.getName()},
				new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCannabisAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCannabisAppDV_ById", new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		CannabisApplicationDeskVeriUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisApplicationDeskVeriUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisApplicationDeskVeriImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISAPPLICATIONDESKVERI =
		"SELECT cannabisApplicationDeskVeri FROM CannabisApplicationDeskVeri cannabisApplicationDeskVeri";

	private static final String _SQL_SELECT_CANNABISAPPLICATIONDESKVERI_WHERE =
		"SELECT cannabisApplicationDeskVeri FROM CannabisApplicationDeskVeri cannabisApplicationDeskVeri WHERE ";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONDESKVERI =
		"SELECT COUNT(cannabisApplicationDeskVeri) FROM CannabisApplicationDeskVeri cannabisApplicationDeskVeri";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONDESKVERI_WHERE =
		"SELECT COUNT(cannabisApplicationDeskVeri) FROM CannabisApplicationDeskVeri cannabisApplicationDeskVeri WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisApplicationDeskVeri.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisApplicationDeskVeri exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisApplicationDeskVeri exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisApplicationDeskVeriPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}