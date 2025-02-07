/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence.impl;

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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisConsentBySoleOwnerException;
import com.nbp.cannabis.application.form.services.model.CannabisConsentBySoleOwner;
import com.nbp.cannabis.application.form.services.model.CannabisConsentBySoleOwnerTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisConsentBySoleOwnerImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisConsentBySoleOwnerModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisConsentBySoleOwnerPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisConsentBySoleOwnerUtil;
import com.nbp.cannabis.application.form.services.service.persistence.impl.constants.CANNABISPersistenceConstants;

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
 * The persistence implementation for the cannabis consent by sole owner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisConsentBySoleOwnerPersistence.class)
public class CannabisConsentBySoleOwnerPersistenceImpl
	extends BasePersistenceImpl<CannabisConsentBySoleOwner>
	implements CannabisConsentBySoleOwnerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisConsentBySoleOwnerUtil</code> to access the cannabis consent by sole owner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisConsentBySoleOwnerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetCA_CSO_BY_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCA_CSO_BY_CAI;
	private FinderPath _finderPathCountBygetCA_CSO_BY_CAI;

	/**
	 * Returns all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis consent by sole owners
	 */
	@Override
	public List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId) {

		return findBygetCA_CSO_BY_CAI(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @return the range of matching cannabis consent by sole owners
	 */
	@Override
	public List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId, int start, int end) {

		return findBygetCA_CSO_BY_CAI(cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis consent by sole owners
	 */
	@Override
	public List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator) {

		return findBygetCA_CSO_BY_CAI(
			cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis consent by sole owners
	 */
	@Override
	public List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCA_CSO_BY_CAI;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCA_CSO_BY_CAI;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisConsentBySoleOwner> list = null;

		if (useFinderCache) {
			list = (List<CannabisConsentBySoleOwner>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisConsentBySoleOwner cannabisConsentBySoleOwner :
						list) {

					if (cannabisApplicationId !=
							cannabisConsentBySoleOwner.
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

			sb.append(_SQL_SELECT_CANNABISCONSENTBYSOLEOWNER_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CSO_BY_CAI_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisConsentBySoleOwnerModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list = (List<CannabisConsentBySoleOwner>)QueryUtil.list(
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
	 * Returns the first cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a matching cannabis consent by sole owner could not be found
	 */
	@Override
	public CannabisConsentBySoleOwner findBygetCA_CSO_BY_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisConsentBySoleOwner> orderByComparator)
		throws NoSuchCannabisConsentBySoleOwnerException {

		CannabisConsentBySoleOwner cannabisConsentBySoleOwner =
			fetchBygetCA_CSO_BY_CAI_First(
				cannabisApplicationId, orderByComparator);

		if (cannabisConsentBySoleOwner != null) {
			return cannabisConsentBySoleOwner;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisConsentBySoleOwnerException(sb.toString());
	}

	/**
	 * Returns the first cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by sole owner, or <code>null</code> if a matching cannabis consent by sole owner could not be found
	 */
	@Override
	public CannabisConsentBySoleOwner fetchBygetCA_CSO_BY_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator) {

		List<CannabisConsentBySoleOwner> list = findBygetCA_CSO_BY_CAI(
			cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a matching cannabis consent by sole owner could not be found
	 */
	@Override
	public CannabisConsentBySoleOwner findBygetCA_CSO_BY_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisConsentBySoleOwner> orderByComparator)
		throws NoSuchCannabisConsentBySoleOwnerException {

		CannabisConsentBySoleOwner cannabisConsentBySoleOwner =
			fetchBygetCA_CSO_BY_CAI_Last(
				cannabisApplicationId, orderByComparator);

		if (cannabisConsentBySoleOwner != null) {
			return cannabisConsentBySoleOwner;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisConsentBySoleOwnerException(sb.toString());
	}

	/**
	 * Returns the last cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by sole owner, or <code>null</code> if a matching cannabis consent by sole owner could not be found
	 */
	@Override
	public CannabisConsentBySoleOwner fetchBygetCA_CSO_BY_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator) {

		int count = countBygetCA_CSO_BY_CAI(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisConsentBySoleOwner> list = findBygetCA_CSO_BY_CAI(
			cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis consent by sole owners before and after the current cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the current cannabis consent by sole owner
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a cannabis consent by sole owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentBySoleOwner[] findBygetCA_CSO_BY_CAI_PrevAndNext(
			long cannabisConsentBySoleOwnerId, long cannabisApplicationId,
			OrderByComparator<CannabisConsentBySoleOwner> orderByComparator)
		throws NoSuchCannabisConsentBySoleOwnerException {

		CannabisConsentBySoleOwner cannabisConsentBySoleOwner =
			findByPrimaryKey(cannabisConsentBySoleOwnerId);

		Session session = null;

		try {
			session = openSession();

			CannabisConsentBySoleOwner[] array =
				new CannabisConsentBySoleOwnerImpl[3];

			array[0] = getBygetCA_CSO_BY_CAI_PrevAndNext(
				session, cannabisConsentBySoleOwner, cannabisApplicationId,
				orderByComparator, true);

			array[1] = cannabisConsentBySoleOwner;

			array[2] = getBygetCA_CSO_BY_CAI_PrevAndNext(
				session, cannabisConsentBySoleOwner, cannabisApplicationId,
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

	protected CannabisConsentBySoleOwner getBygetCA_CSO_BY_CAI_PrevAndNext(
		Session session, CannabisConsentBySoleOwner cannabisConsentBySoleOwner,
		long cannabisApplicationId,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISCONSENTBYSOLEOWNER_WHERE);

		sb.append(_FINDER_COLUMN_GETCA_CSO_BY_CAI_CANNABISAPPLICATIONID_2);

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
			sb.append(CannabisConsentBySoleOwnerModelImpl.ORDER_BY_JPQL);
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
						cannabisConsentBySoleOwner)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisConsentBySoleOwner> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis consent by sole owners where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCA_CSO_BY_CAI(long cannabisApplicationId) {
		for (CannabisConsentBySoleOwner cannabisConsentBySoleOwner :
				findBygetCA_CSO_BY_CAI(
					cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisConsentBySoleOwner);
		}
	}

	/**
	 * Returns the number of cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis consent by sole owners
	 */
	@Override
	public int countBygetCA_CSO_BY_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_CSO_BY_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISCONSENTBYSOLEOWNER_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CSO_BY_CAI_CANNABISAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETCA_CSO_BY_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisConsentBySoleOwner.cannabisApplicationId = ?";

	public CannabisConsentBySoleOwnerPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("date", "date_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisConsentBySoleOwner.class);

		setModelImplClass(CannabisConsentBySoleOwnerImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisConsentBySoleOwnerTable.INSTANCE);
	}

	/**
	 * Caches the cannabis consent by sole owner in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentBySoleOwner the cannabis consent by sole owner
	 */
	@Override
	public void cacheResult(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		entityCache.putResult(
			CannabisConsentBySoleOwnerImpl.class,
			cannabisConsentBySoleOwner.getPrimaryKey(),
			cannabisConsentBySoleOwner);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis consent by sole owners in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentBySoleOwners the cannabis consent by sole owners
	 */
	@Override
	public void cacheResult(
		List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisConsentBySoleOwners.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisConsentBySoleOwner cannabisConsentBySoleOwner :
				cannabisConsentBySoleOwners) {

			if (entityCache.getResult(
					CannabisConsentBySoleOwnerImpl.class,
					cannabisConsentBySoleOwner.getPrimaryKey()) == null) {

				cacheResult(cannabisConsentBySoleOwner);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis consent by sole owners.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisConsentBySoleOwnerImpl.class);

		finderCache.clearCache(CannabisConsentBySoleOwnerImpl.class);
	}

	/**
	 * Clears the cache for the cannabis consent by sole owner.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		entityCache.removeResult(
			CannabisConsentBySoleOwnerImpl.class, cannabisConsentBySoleOwner);
	}

	@Override
	public void clearCache(
		List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners) {

		for (CannabisConsentBySoleOwner cannabisConsentBySoleOwner :
				cannabisConsentBySoleOwners) {

			entityCache.removeResult(
				CannabisConsentBySoleOwnerImpl.class,
				cannabisConsentBySoleOwner);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisConsentBySoleOwnerImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisConsentBySoleOwnerImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new cannabis consent by sole owner with the primary key. Does not add the cannabis consent by sole owner to the database.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key for the new cannabis consent by sole owner
	 * @return the new cannabis consent by sole owner
	 */
	@Override
	public CannabisConsentBySoleOwner create(
		long cannabisConsentBySoleOwnerId) {

		CannabisConsentBySoleOwner cannabisConsentBySoleOwner =
			new CannabisConsentBySoleOwnerImpl();

		cannabisConsentBySoleOwner.setNew(true);
		cannabisConsentBySoleOwner.setPrimaryKey(cannabisConsentBySoleOwnerId);

		cannabisConsentBySoleOwner.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisConsentBySoleOwner;
	}

	/**
	 * Removes the cannabis consent by sole owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was removed
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a cannabis consent by sole owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentBySoleOwner remove(long cannabisConsentBySoleOwnerId)
		throws NoSuchCannabisConsentBySoleOwnerException {

		return remove((Serializable)cannabisConsentBySoleOwnerId);
	}

	/**
	 * Removes the cannabis consent by sole owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was removed
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a cannabis consent by sole owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentBySoleOwner remove(Serializable primaryKey)
		throws NoSuchCannabisConsentBySoleOwnerException {

		Session session = null;

		try {
			session = openSession();

			CannabisConsentBySoleOwner cannabisConsentBySoleOwner =
				(CannabisConsentBySoleOwner)session.get(
					CannabisConsentBySoleOwnerImpl.class, primaryKey);

			if (cannabisConsentBySoleOwner == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisConsentBySoleOwnerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisConsentBySoleOwner);
		}
		catch (NoSuchCannabisConsentBySoleOwnerException
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
	protected CannabisConsentBySoleOwner removeImpl(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisConsentBySoleOwner)) {
				cannabisConsentBySoleOwner =
					(CannabisConsentBySoleOwner)session.get(
						CannabisConsentBySoleOwnerImpl.class,
						cannabisConsentBySoleOwner.getPrimaryKeyObj());
			}

			if (cannabisConsentBySoleOwner != null) {
				session.delete(cannabisConsentBySoleOwner);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisConsentBySoleOwner != null) {
			clearCache(cannabisConsentBySoleOwner);
		}

		return cannabisConsentBySoleOwner;
	}

	@Override
	public CannabisConsentBySoleOwner updateImpl(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		boolean isNew = cannabisConsentBySoleOwner.isNew();

		if (!(cannabisConsentBySoleOwner instanceof
				CannabisConsentBySoleOwnerModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisConsentBySoleOwner.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisConsentBySoleOwner);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisConsentBySoleOwner proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisConsentBySoleOwner implementation " +
					cannabisConsentBySoleOwner.getClass());
		}

		CannabisConsentBySoleOwnerModelImpl
			cannabisConsentBySoleOwnerModelImpl =
				(CannabisConsentBySoleOwnerModelImpl)cannabisConsentBySoleOwner;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisConsentBySoleOwner.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisConsentBySoleOwner.setCreateDate(date);
			}
			else {
				cannabisConsentBySoleOwner.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisConsentBySoleOwnerModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisConsentBySoleOwner.setModifiedDate(date);
			}
			else {
				cannabisConsentBySoleOwner.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisConsentBySoleOwner);
			}
			else {
				cannabisConsentBySoleOwner =
					(CannabisConsentBySoleOwner)session.merge(
						cannabisConsentBySoleOwner);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisConsentBySoleOwnerImpl.class,
			cannabisConsentBySoleOwnerModelImpl, false, true);

		if (isNew) {
			cannabisConsentBySoleOwner.setNew(false);
		}

		cannabisConsentBySoleOwner.resetOriginalValues();

		return cannabisConsentBySoleOwner;
	}

	/**
	 * Returns the cannabis consent by sole owner with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a cannabis consent by sole owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentBySoleOwner findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisConsentBySoleOwnerException {

		CannabisConsentBySoleOwner cannabisConsentBySoleOwner =
			fetchByPrimaryKey(primaryKey);

		if (cannabisConsentBySoleOwner == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisConsentBySoleOwnerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisConsentBySoleOwner;
	}

	/**
	 * Returns the cannabis consent by sole owner with the primary key or throws a <code>NoSuchCannabisConsentBySoleOwnerException</code> if it could not be found.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a cannabis consent by sole owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentBySoleOwner findByPrimaryKey(
			long cannabisConsentBySoleOwnerId)
		throws NoSuchCannabisConsentBySoleOwnerException {

		return findByPrimaryKey((Serializable)cannabisConsentBySoleOwnerId);
	}

	/**
	 * Returns the cannabis consent by sole owner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner, or <code>null</code> if a cannabis consent by sole owner with the primary key could not be found
	 */
	@Override
	public CannabisConsentBySoleOwner fetchByPrimaryKey(
		long cannabisConsentBySoleOwnerId) {

		return fetchByPrimaryKey((Serializable)cannabisConsentBySoleOwnerId);
	}

	/**
	 * Returns all the cannabis consent by sole owners.
	 *
	 * @return the cannabis consent by sole owners
	 */
	@Override
	public List<CannabisConsentBySoleOwner> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis consent by sole owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @return the range of cannabis consent by sole owners
	 */
	@Override
	public List<CannabisConsentBySoleOwner> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis consent by sole owners
	 */
	@Override
	public List<CannabisConsentBySoleOwner> findAll(
		int start, int end,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis consent by sole owners
	 */
	@Override
	public List<CannabisConsentBySoleOwner> findAll(
		int start, int end,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator,
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

		List<CannabisConsentBySoleOwner> list = null;

		if (useFinderCache) {
			list = (List<CannabisConsentBySoleOwner>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISCONSENTBYSOLEOWNER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISCONSENTBYSOLEOWNER;

				sql = sql.concat(
					CannabisConsentBySoleOwnerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisConsentBySoleOwner>)QueryUtil.list(
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
	 * Removes all the cannabis consent by sole owners from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisConsentBySoleOwner cannabisConsentBySoleOwner :
				findAll()) {

			remove(cannabisConsentBySoleOwner);
		}
	}

	/**
	 * Returns the number of cannabis consent by sole owners.
	 *
	 * @return the number of cannabis consent by sole owners
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
					_SQL_COUNT_CANNABISCONSENTBYSOLEOWNER);

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
		return "cannabisConsentBySoleOwnerId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISCONSENTBYSOLEOWNER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisConsentBySoleOwnerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis consent by sole owner persistence.
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

		_finderPathWithPaginationFindBygetCA_CSO_BY_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCA_CSO_BY_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCA_CSO_BY_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCA_CSO_BY_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCA_CSO_BY_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCA_CSO_BY_CAI", new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		CannabisConsentBySoleOwnerUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisConsentBySoleOwnerUtil.setPersistence(null);

		entityCache.removeCache(CannabisConsentBySoleOwnerImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISCONSENTBYSOLEOWNER =
		"SELECT cannabisConsentBySoleOwner FROM CannabisConsentBySoleOwner cannabisConsentBySoleOwner";

	private static final String _SQL_SELECT_CANNABISCONSENTBYSOLEOWNER_WHERE =
		"SELECT cannabisConsentBySoleOwner FROM CannabisConsentBySoleOwner cannabisConsentBySoleOwner WHERE ";

	private static final String _SQL_COUNT_CANNABISCONSENTBYSOLEOWNER =
		"SELECT COUNT(cannabisConsentBySoleOwner) FROM CannabisConsentBySoleOwner cannabisConsentBySoleOwner";

	private static final String _SQL_COUNT_CANNABISCONSENTBYSOLEOWNER_WHERE =
		"SELECT COUNT(cannabisConsentBySoleOwner) FROM CannabisConsentBySoleOwner cannabisConsentBySoleOwner WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisConsentBySoleOwner.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisConsentBySoleOwner exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisConsentBySoleOwner exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisConsentBySoleOwnerPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"date"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}