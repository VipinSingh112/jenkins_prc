/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantPrincipleOfficerException;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleOfficer;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleOfficerTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleOfficerImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleOfficerModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantPrincipleOfficerPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantPrincipleOfficerUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez occupant principle officer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccupantPrincipleOfficerPersistence.class)
public class SezOccupantPrincipleOfficerPersistenceImpl
	extends BasePersistenceImpl<SezOccupantPrincipleOfficer>
	implements SezOccupantPrincipleOfficerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupantPrincipleOfficerUtil</code> to access the sez occupant principle officer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupantPrincipleOfficerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns all the sez occupant principle officers where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant principle officers
	 */
	@Override
	public List<SezOccupantPrincipleOfficer> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant principle officers where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @return the range of matching sez occupant principle officers
	 */
	@Override
	public List<SezOccupantPrincipleOfficer> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle officers where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant principle officers
	 */
	@Override
	public List<SezOccupantPrincipleOfficer> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle officers where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant principle officers
	 */
	@Override
	public List<SezOccupantPrincipleOfficer> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSezStatusByAppId;
				finderArgs = new Object[] {sezStatusApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSezStatusByAppId;
			finderArgs = new Object[] {
				sezStatusApplicationId, start, end, orderByComparator
			};
		}

		List<SezOccupantPrincipleOfficer> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantPrincipleOfficer>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer :
						list) {

					if (sezStatusApplicationId !=
							sezOccupantPrincipleOfficer.
								getSezStatusApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZOCCUPANTPRINCIPLEOFFICER_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezOccupantPrincipleOfficerModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezOccupantPrincipleOfficer>)QueryUtil.list(
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
	 * Returns the first sez occupant principle officer in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant principle officer
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a matching sez occupant principle officer could not be found
	 */
	@Override
	public SezOccupantPrincipleOfficer findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator)
		throws NoSuchSezOccupantPrincipleOfficerException {

		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezOccupantPrincipleOfficer != null) {
			return sezOccupantPrincipleOfficer;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantPrincipleOfficerException(sb.toString());
	}

	/**
	 * Returns the first sez occupant principle officer in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant principle officer, or <code>null</code> if a matching sez occupant principle officer could not be found
	 */
	@Override
	public SezOccupantPrincipleOfficer fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator) {

		List<SezOccupantPrincipleOfficer> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez occupant principle officer in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant principle officer
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a matching sez occupant principle officer could not be found
	 */
	@Override
	public SezOccupantPrincipleOfficer findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator)
		throws NoSuchSezOccupantPrincipleOfficerException {

		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezOccupantPrincipleOfficer != null) {
			return sezOccupantPrincipleOfficer;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantPrincipleOfficerException(sb.toString());
	}

	/**
	 * Returns the last sez occupant principle officer in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant principle officer, or <code>null</code> if a matching sez occupant principle officer could not be found
	 */
	@Override
	public SezOccupantPrincipleOfficer fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezOccupantPrincipleOfficer> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez occupant principle officers before and after the current sez occupant principle officer in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccPrincOffId the primary key of the current sez occupant principle officer
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant principle officer
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a sez occupant principle officer with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleOfficer[] findBygetSezStatusByAppId_PrevAndNext(
			long sezOccPrincOffId, long sezStatusApplicationId,
			OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator)
		throws NoSuchSezOccupantPrincipleOfficerException {

		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer =
			findByPrimaryKey(sezOccPrincOffId);

		Session session = null;

		try {
			session = openSession();

			SezOccupantPrincipleOfficer[] array =
				new SezOccupantPrincipleOfficerImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccupantPrincipleOfficer, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezOccupantPrincipleOfficer;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccupantPrincipleOfficer, sezStatusApplicationId,
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

	protected SezOccupantPrincipleOfficer getBygetSezStatusByAppId_PrevAndNext(
		Session session,
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer,
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZOCCUPANTPRINCIPLEOFFICER_WHERE);

		sb.append(_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

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
			sb.append(SezOccupantPrincipleOfficerModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(sezStatusApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezOccupantPrincipleOfficer)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezOccupantPrincipleOfficer> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez occupant principle officers where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezOccupantPrincipleOfficer);
		}
	}

	/**
	 * Returns the number of sez occupant principle officers where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant principle officers
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTPRINCIPLEOFFICER_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezOccupantPrincipleOfficer.sezStatusApplicationId = ?";

	public SezOccupantPrincipleOfficerPersistenceImpl() {
		setModelClass(SezOccupantPrincipleOfficer.class);

		setModelImplClass(SezOccupantPrincipleOfficerImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupantPrincipleOfficerTable.INSTANCE);
	}

	/**
	 * Caches the sez occupant principle officer in the entity cache if it is enabled.
	 *
	 * @param sezOccupantPrincipleOfficer the sez occupant principle officer
	 */
	@Override
	public void cacheResult(
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		entityCache.putResult(
			SezOccupantPrincipleOfficerImpl.class,
			sezOccupantPrincipleOfficer.getPrimaryKey(),
			sezOccupantPrincipleOfficer);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupant principle officers in the entity cache if it is enabled.
	 *
	 * @param sezOccupantPrincipleOfficers the sez occupant principle officers
	 */
	@Override
	public void cacheResult(
		List<SezOccupantPrincipleOfficer> sezOccupantPrincipleOfficers) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupantPrincipleOfficers.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer :
				sezOccupantPrincipleOfficers) {

			if (entityCache.getResult(
					SezOccupantPrincipleOfficerImpl.class,
					sezOccupantPrincipleOfficer.getPrimaryKey()) == null) {

				cacheResult(sezOccupantPrincipleOfficer);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupant principle officers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccupantPrincipleOfficerImpl.class);

		finderCache.clearCache(SezOccupantPrincipleOfficerImpl.class);
	}

	/**
	 * Clears the cache for the sez occupant principle officer.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		entityCache.removeResult(
			SezOccupantPrincipleOfficerImpl.class, sezOccupantPrincipleOfficer);
	}

	@Override
	public void clearCache(
		List<SezOccupantPrincipleOfficer> sezOccupantPrincipleOfficers) {

		for (SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer :
				sezOccupantPrincipleOfficers) {

			entityCache.removeResult(
				SezOccupantPrincipleOfficerImpl.class,
				sezOccupantPrincipleOfficer);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccupantPrincipleOfficerImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupantPrincipleOfficerImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez occupant principle officer with the primary key. Does not add the sez occupant principle officer to the database.
	 *
	 * @param sezOccPrincOffId the primary key for the new sez occupant principle officer
	 * @return the new sez occupant principle officer
	 */
	@Override
	public SezOccupantPrincipleOfficer create(long sezOccPrincOffId) {
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer =
			new SezOccupantPrincipleOfficerImpl();

		sezOccupantPrincipleOfficer.setNew(true);
		sezOccupantPrincipleOfficer.setPrimaryKey(sezOccPrincOffId);

		sezOccupantPrincipleOfficer.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupantPrincipleOfficer;
	}

	/**
	 * Removes the sez occupant principle officer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccPrincOffId the primary key of the sez occupant principle officer
	 * @return the sez occupant principle officer that was removed
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a sez occupant principle officer with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleOfficer remove(long sezOccPrincOffId)
		throws NoSuchSezOccupantPrincipleOfficerException {

		return remove((Serializable)sezOccPrincOffId);
	}

	/**
	 * Removes the sez occupant principle officer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupant principle officer
	 * @return the sez occupant principle officer that was removed
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a sez occupant principle officer with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleOfficer remove(Serializable primaryKey)
		throws NoSuchSezOccupantPrincipleOfficerException {

		Session session = null;

		try {
			session = openSession();

			SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer =
				(SezOccupantPrincipleOfficer)session.get(
					SezOccupantPrincipleOfficerImpl.class, primaryKey);

			if (sezOccupantPrincipleOfficer == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupantPrincipleOfficerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupantPrincipleOfficer);
		}
		catch (NoSuchSezOccupantPrincipleOfficerException
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
	protected SezOccupantPrincipleOfficer removeImpl(
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupantPrincipleOfficer)) {
				sezOccupantPrincipleOfficer =
					(SezOccupantPrincipleOfficer)session.get(
						SezOccupantPrincipleOfficerImpl.class,
						sezOccupantPrincipleOfficer.getPrimaryKeyObj());
			}

			if (sezOccupantPrincipleOfficer != null) {
				session.delete(sezOccupantPrincipleOfficer);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupantPrincipleOfficer != null) {
			clearCache(sezOccupantPrincipleOfficer);
		}

		return sezOccupantPrincipleOfficer;
	}

	@Override
	public SezOccupantPrincipleOfficer updateImpl(
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		boolean isNew = sezOccupantPrincipleOfficer.isNew();

		if (!(sezOccupantPrincipleOfficer instanceof
				SezOccupantPrincipleOfficerModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezOccupantPrincipleOfficer.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupantPrincipleOfficer);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupantPrincipleOfficer proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupantPrincipleOfficer implementation " +
					sezOccupantPrincipleOfficer.getClass());
		}

		SezOccupantPrincipleOfficerModelImpl
			sezOccupantPrincipleOfficerModelImpl =
				(SezOccupantPrincipleOfficerModelImpl)
					sezOccupantPrincipleOfficer;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezOccupantPrincipleOfficer.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezOccupantPrincipleOfficer.setCreateDate(date);
			}
			else {
				sezOccupantPrincipleOfficer.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupantPrincipleOfficerModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezOccupantPrincipleOfficer.setModifiedDate(date);
			}
			else {
				sezOccupantPrincipleOfficer.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupantPrincipleOfficer);
			}
			else {
				sezOccupantPrincipleOfficer =
					(SezOccupantPrincipleOfficer)session.merge(
						sezOccupantPrincipleOfficer);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupantPrincipleOfficerImpl.class,
			sezOccupantPrincipleOfficerModelImpl, false, true);

		if (isNew) {
			sezOccupantPrincipleOfficer.setNew(false);
		}

		sezOccupantPrincipleOfficer.resetOriginalValues();

		return sezOccupantPrincipleOfficer;
	}

	/**
	 * Returns the sez occupant principle officer with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupant principle officer
	 * @return the sez occupant principle officer
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a sez occupant principle officer with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleOfficer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezOccupantPrincipleOfficerException {

		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer =
			fetchByPrimaryKey(primaryKey);

		if (sezOccupantPrincipleOfficer == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupantPrincipleOfficerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupantPrincipleOfficer;
	}

	/**
	 * Returns the sez occupant principle officer with the primary key or throws a <code>NoSuchSezOccupantPrincipleOfficerException</code> if it could not be found.
	 *
	 * @param sezOccPrincOffId the primary key of the sez occupant principle officer
	 * @return the sez occupant principle officer
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a sez occupant principle officer with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleOfficer findByPrimaryKey(long sezOccPrincOffId)
		throws NoSuchSezOccupantPrincipleOfficerException {

		return findByPrimaryKey((Serializable)sezOccPrincOffId);
	}

	/**
	 * Returns the sez occupant principle officer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccPrincOffId the primary key of the sez occupant principle officer
	 * @return the sez occupant principle officer, or <code>null</code> if a sez occupant principle officer with the primary key could not be found
	 */
	@Override
	public SezOccupantPrincipleOfficer fetchByPrimaryKey(
		long sezOccPrincOffId) {

		return fetchByPrimaryKey((Serializable)sezOccPrincOffId);
	}

	/**
	 * Returns all the sez occupant principle officers.
	 *
	 * @return the sez occupant principle officers
	 */
	@Override
	public List<SezOccupantPrincipleOfficer> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant principle officers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @return the range of sez occupant principle officers
	 */
	@Override
	public List<SezOccupantPrincipleOfficer> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle officers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant principle officers
	 */
	@Override
	public List<SezOccupantPrincipleOfficer> findAll(
		int start, int end,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle officers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant principle officers
	 */
	@Override
	public List<SezOccupantPrincipleOfficer> findAll(
		int start, int end,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator,
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

		List<SezOccupantPrincipleOfficer> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantPrincipleOfficer>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCUPANTPRINCIPLEOFFICER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTPRINCIPLEOFFICER;

				sql = sql.concat(
					SezOccupantPrincipleOfficerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezOccupantPrincipleOfficer>)QueryUtil.list(
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
	 * Removes all the sez occupant principle officers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer :
				findAll()) {

			remove(sezOccupantPrincipleOfficer);
		}
	}

	/**
	 * Returns the number of sez occupant principle officers.
	 *
	 * @return the number of sez occupant principle officers
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
					_SQL_COUNT_SEZOCCUPANTPRINCIPLEOFFICER);

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
		return "sezOccPrincOffId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTPRINCIPLEOFFICER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupantPrincipleOfficerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupant principle officer persistence.
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

		_finderPathWithPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSezStatusByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezOccupantPrincipleOfficerUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupantPrincipleOfficerUtil.setPersistence(null);

		entityCache.removeCache(
			SezOccupantPrincipleOfficerImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZOCCUPANTPRINCIPLEOFFICER =
		"SELECT sezOccupantPrincipleOfficer FROM SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer";

	private static final String _SQL_SELECT_SEZOCCUPANTPRINCIPLEOFFICER_WHERE =
		"SELECT sezOccupantPrincipleOfficer FROM SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer WHERE ";

	private static final String _SQL_COUNT_SEZOCCUPANTPRINCIPLEOFFICER =
		"SELECT COUNT(sezOccupantPrincipleOfficer) FROM SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer";

	private static final String _SQL_COUNT_SEZOCCUPANTPRINCIPLEOFFICER_WHERE =
		"SELECT COUNT(sezOccupantPrincipleOfficer) FROM SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupantPrincipleOfficer.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupantPrincipleOfficer exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupantPrincipleOfficer exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupantPrincipleOfficerPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}