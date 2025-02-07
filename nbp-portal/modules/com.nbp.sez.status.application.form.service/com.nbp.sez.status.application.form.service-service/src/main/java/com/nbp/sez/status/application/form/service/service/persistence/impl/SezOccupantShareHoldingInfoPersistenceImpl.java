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
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantShareHoldingInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantShareHoldingInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantShareHoldingInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantShareHoldingInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantShareHoldingInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantShareHoldingInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantShareHoldingInfoUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the sez occupant share holding info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccupantShareHoldingInfoPersistence.class)
public class SezOccupantShareHoldingInfoPersistenceImpl
	extends BasePersistenceImpl<SezOccupantShareHoldingInfo>
	implements SezOccupantShareHoldingInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupantShareHoldingInfoUtil</code> to access the sez occupant share holding info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupantShareHoldingInfoImpl.class.getName();

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
	 * Returns all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant share holding infos
	 */
	@Override
	public List<SezOccupantShareHoldingInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @return the range of matching sez occupant share holding infos
	 */
	@Override
	public List<SezOccupantShareHoldingInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant share holding infos
	 */
	@Override
	public List<SezOccupantShareHoldingInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant share holding infos
	 */
	@Override
	public List<SezOccupantShareHoldingInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator,
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

		List<SezOccupantShareHoldingInfo> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantShareHoldingInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo :
						list) {

					if (sezStatusApplicationId !=
							sezOccupantShareHoldingInfo.
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

			sb.append(_SQL_SELECT_SEZOCCUPANTSHAREHOLDINGINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezOccupantShareHoldingInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezOccupantShareHoldingInfo>)QueryUtil.list(
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
	 * Returns the first sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a matching sez occupant share holding info could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator)
		throws NoSuchSezOccupantShareHoldingInfoException {

		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezOccupantShareHoldingInfo != null) {
			return sezOccupantShareHoldingInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantShareHoldingInfoException(sb.toString());
	}

	/**
	 * Returns the first sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator) {

		List<SezOccupantShareHoldingInfo> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a matching sez occupant share holding info could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator)
		throws NoSuchSezOccupantShareHoldingInfoException {

		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezOccupantShareHoldingInfo != null) {
			return sezOccupantShareHoldingInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantShareHoldingInfoException(sb.toString());
	}

	/**
	 * Returns the last sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezOccupantShareHoldingInfo> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez occupant share holding infos before and after the current sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccShareHolderId the primary key of the current sez occupant share holding info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a sez occupant share holding info with the primary key could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo[] findBygetSezStatusByAppId_PrevAndNext(
			long sezOccShareHolderId, long sezStatusApplicationId,
			OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator)
		throws NoSuchSezOccupantShareHoldingInfoException {

		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo =
			findByPrimaryKey(sezOccShareHolderId);

		Session session = null;

		try {
			session = openSession();

			SezOccupantShareHoldingInfo[] array =
				new SezOccupantShareHoldingInfoImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccupantShareHoldingInfo, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezOccupantShareHoldingInfo;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccupantShareHoldingInfo, sezStatusApplicationId,
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

	protected SezOccupantShareHoldingInfo getBygetSezStatusByAppId_PrevAndNext(
		Session session,
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo,
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZOCCUPANTSHAREHOLDINGINFO_WHERE);

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
			sb.append(SezOccupantShareHoldingInfoModelImpl.ORDER_BY_JPQL);
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
						sezOccupantShareHoldingInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezOccupantShareHoldingInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez occupant share holding infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezOccupantShareHoldingInfo);
		}
	}

	/**
	 * Returns the number of sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant share holding infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTSHAREHOLDINGINFO_WHERE);

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
			"sezOccupantShareHoldingInfo.sezStatusApplicationId = ?";

	private FinderPath _finderPathFetchBygetSezStatusBy_App_Id;
	private FinderPath _finderPathCountBygetSezStatusBy_App_Id;

	/**
	 * Returns the sez occupant share holding info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantShareHoldingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a matching sez occupant share holding info could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo findBygetSezStatusBy_App_Id(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantShareHoldingInfoException {

		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo =
			fetchBygetSezStatusBy_App_Id(sezStatusApplicationId);

		if (sezOccupantShareHoldingInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezOccupantShareHoldingInfoException(sb.toString());
		}

		return sezOccupantShareHoldingInfo;
	}

	/**
	 * Returns the sez occupant share holding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo fetchBygetSezStatusBy_App_Id(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusBy_App_Id(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez occupant share holding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo fetchBygetSezStatusBy_App_Id(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusBy_App_Id, finderArgs, this);
		}

		if (result instanceof SezOccupantShareHoldingInfo) {
			SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo =
				(SezOccupantShareHoldingInfo)result;

			if (sezStatusApplicationId !=
					sezOccupantShareHoldingInfo.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZOCCUPANTSHAREHOLDINGINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBY_APP_ID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezOccupantShareHoldingInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusBy_App_Id, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId
								};
							}

							_log.warn(
								"SezOccupantShareHoldingInfoPersistenceImpl.fetchBygetSezStatusBy_App_Id(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo =
						list.get(0);

					result = sezOccupantShareHoldingInfo;

					cacheResult(sezOccupantShareHoldingInfo);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (SezOccupantShareHoldingInfo)result;
		}
	}

	/**
	 * Removes the sez occupant share holding info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant share holding info that was removed
	 */
	@Override
	public SezOccupantShareHoldingInfo removeBygetSezStatusBy_App_Id(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantShareHoldingInfoException {

		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo =
			findBygetSezStatusBy_App_Id(sezStatusApplicationId);

		return remove(sezOccupantShareHoldingInfo);
	}

	/**
	 * Returns the number of sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant share holding infos
	 */
	@Override
	public int countBygetSezStatusBy_App_Id(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusBy_App_Id;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTSHAREHOLDINGINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBY_APP_ID_SEZSTATUSAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETSEZSTATUSBY_APP_ID_SEZSTATUSAPPLICATIONID_2 =
			"sezOccupantShareHoldingInfo.sezStatusApplicationId = ?";

	public SezOccupantShareHoldingInfoPersistenceImpl() {
		setModelClass(SezOccupantShareHoldingInfo.class);

		setModelImplClass(SezOccupantShareHoldingInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupantShareHoldingInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez occupant share holding info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantShareHoldingInfo the sez occupant share holding info
	 */
	@Override
	public void cacheResult(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		entityCache.putResult(
			SezOccupantShareHoldingInfoImpl.class,
			sezOccupantShareHoldingInfo.getPrimaryKey(),
			sezOccupantShareHoldingInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusBy_App_Id,
			new Object[] {
				sezOccupantShareHoldingInfo.getSezStatusApplicationId()
			},
			sezOccupantShareHoldingInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupant share holding infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantShareHoldingInfos the sez occupant share holding infos
	 */
	@Override
	public void cacheResult(
		List<SezOccupantShareHoldingInfo> sezOccupantShareHoldingInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupantShareHoldingInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo :
				sezOccupantShareHoldingInfos) {

			if (entityCache.getResult(
					SezOccupantShareHoldingInfoImpl.class,
					sezOccupantShareHoldingInfo.getPrimaryKey()) == null) {

				cacheResult(sezOccupantShareHoldingInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupant share holding infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccupantShareHoldingInfoImpl.class);

		finderCache.clearCache(SezOccupantShareHoldingInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez occupant share holding info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		entityCache.removeResult(
			SezOccupantShareHoldingInfoImpl.class, sezOccupantShareHoldingInfo);
	}

	@Override
	public void clearCache(
		List<SezOccupantShareHoldingInfo> sezOccupantShareHoldingInfos) {

		for (SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo :
				sezOccupantShareHoldingInfos) {

			entityCache.removeResult(
				SezOccupantShareHoldingInfoImpl.class,
				sezOccupantShareHoldingInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccupantShareHoldingInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupantShareHoldingInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezOccupantShareHoldingInfoModelImpl
			sezOccupantShareHoldingInfoModelImpl) {

		Object[] args = new Object[] {
			sezOccupantShareHoldingInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusBy_App_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusBy_App_Id, args,
			sezOccupantShareHoldingInfoModelImpl);
	}

	/**
	 * Creates a new sez occupant share holding info with the primary key. Does not add the sez occupant share holding info to the database.
	 *
	 * @param sezOccShareHolderId the primary key for the new sez occupant share holding info
	 * @return the new sez occupant share holding info
	 */
	@Override
	public SezOccupantShareHoldingInfo create(long sezOccShareHolderId) {
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo =
			new SezOccupantShareHoldingInfoImpl();

		sezOccupantShareHoldingInfo.setNew(true);
		sezOccupantShareHoldingInfo.setPrimaryKey(sezOccShareHolderId);

		sezOccupantShareHoldingInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupantShareHoldingInfo;
	}

	/**
	 * Removes the sez occupant share holding info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccShareHolderId the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info that was removed
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a sez occupant share holding info with the primary key could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo remove(long sezOccShareHolderId)
		throws NoSuchSezOccupantShareHoldingInfoException {

		return remove((Serializable)sezOccShareHolderId);
	}

	/**
	 * Removes the sez occupant share holding info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info that was removed
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a sez occupant share holding info with the primary key could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo remove(Serializable primaryKey)
		throws NoSuchSezOccupantShareHoldingInfoException {

		Session session = null;

		try {
			session = openSession();

			SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo =
				(SezOccupantShareHoldingInfo)session.get(
					SezOccupantShareHoldingInfoImpl.class, primaryKey);

			if (sezOccupantShareHoldingInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupantShareHoldingInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupantShareHoldingInfo);
		}
		catch (NoSuchSezOccupantShareHoldingInfoException
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
	protected SezOccupantShareHoldingInfo removeImpl(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupantShareHoldingInfo)) {
				sezOccupantShareHoldingInfo =
					(SezOccupantShareHoldingInfo)session.get(
						SezOccupantShareHoldingInfoImpl.class,
						sezOccupantShareHoldingInfo.getPrimaryKeyObj());
			}

			if (sezOccupantShareHoldingInfo != null) {
				session.delete(sezOccupantShareHoldingInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupantShareHoldingInfo != null) {
			clearCache(sezOccupantShareHoldingInfo);
		}

		return sezOccupantShareHoldingInfo;
	}

	@Override
	public SezOccupantShareHoldingInfo updateImpl(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		boolean isNew = sezOccupantShareHoldingInfo.isNew();

		if (!(sezOccupantShareHoldingInfo instanceof
				SezOccupantShareHoldingInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezOccupantShareHoldingInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupantShareHoldingInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupantShareHoldingInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupantShareHoldingInfo implementation " +
					sezOccupantShareHoldingInfo.getClass());
		}

		SezOccupantShareHoldingInfoModelImpl
			sezOccupantShareHoldingInfoModelImpl =
				(SezOccupantShareHoldingInfoModelImpl)
					sezOccupantShareHoldingInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezOccupantShareHoldingInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezOccupantShareHoldingInfo.setCreateDate(date);
			}
			else {
				sezOccupantShareHoldingInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupantShareHoldingInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezOccupantShareHoldingInfo.setModifiedDate(date);
			}
			else {
				sezOccupantShareHoldingInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupantShareHoldingInfo);
			}
			else {
				sezOccupantShareHoldingInfo =
					(SezOccupantShareHoldingInfo)session.merge(
						sezOccupantShareHoldingInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupantShareHoldingInfoImpl.class,
			sezOccupantShareHoldingInfoModelImpl, false, true);

		cacheUniqueFindersCache(sezOccupantShareHoldingInfoModelImpl);

		if (isNew) {
			sezOccupantShareHoldingInfo.setNew(false);
		}

		sezOccupantShareHoldingInfo.resetOriginalValues();

		return sezOccupantShareHoldingInfo;
	}

	/**
	 * Returns the sez occupant share holding info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a sez occupant share holding info with the primary key could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezOccupantShareHoldingInfoException {

		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo =
			fetchByPrimaryKey(primaryKey);

		if (sezOccupantShareHoldingInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupantShareHoldingInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupantShareHoldingInfo;
	}

	/**
	 * Returns the sez occupant share holding info with the primary key or throws a <code>NoSuchSezOccupantShareHoldingInfoException</code> if it could not be found.
	 *
	 * @param sezOccShareHolderId the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a sez occupant share holding info with the primary key could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo findByPrimaryKey(
			long sezOccShareHolderId)
		throws NoSuchSezOccupantShareHoldingInfoException {

		return findByPrimaryKey((Serializable)sezOccShareHolderId);
	}

	/**
	 * Returns the sez occupant share holding info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccShareHolderId the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info, or <code>null</code> if a sez occupant share holding info with the primary key could not be found
	 */
	@Override
	public SezOccupantShareHoldingInfo fetchByPrimaryKey(
		long sezOccShareHolderId) {

		return fetchByPrimaryKey((Serializable)sezOccShareHolderId);
	}

	/**
	 * Returns all the sez occupant share holding infos.
	 *
	 * @return the sez occupant share holding infos
	 */
	@Override
	public List<SezOccupantShareHoldingInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant share holding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @return the range of sez occupant share holding infos
	 */
	@Override
	public List<SezOccupantShareHoldingInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant share holding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant share holding infos
	 */
	@Override
	public List<SezOccupantShareHoldingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant share holding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant share holding infos
	 */
	@Override
	public List<SezOccupantShareHoldingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator,
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

		List<SezOccupantShareHoldingInfo> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantShareHoldingInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCUPANTSHAREHOLDINGINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTSHAREHOLDINGINFO;

				sql = sql.concat(
					SezOccupantShareHoldingInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezOccupantShareHoldingInfo>)QueryUtil.list(
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
	 * Removes all the sez occupant share holding infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo :
				findAll()) {

			remove(sezOccupantShareHoldingInfo);
		}
	}

	/**
	 * Returns the number of sez occupant share holding infos.
	 *
	 * @return the number of sez occupant share holding infos
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
					_SQL_COUNT_SEZOCCUPANTSHAREHOLDINGINFO);

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
		return "sezOccShareHolderId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTSHAREHOLDINGINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupantShareHoldingInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupant share holding info persistence.
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

		_finderPathFetchBygetSezStatusBy_App_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusBy_App_Id",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusBy_App_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusBy_App_Id", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezOccupantShareHoldingInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupantShareHoldingInfoUtil.setPersistence(null);

		entityCache.removeCache(
			SezOccupantShareHoldingInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZOCCUPANTSHAREHOLDINGINFO =
		"SELECT sezOccupantShareHoldingInfo FROM SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo";

	private static final String _SQL_SELECT_SEZOCCUPANTSHAREHOLDINGINFO_WHERE =
		"SELECT sezOccupantShareHoldingInfo FROM SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo WHERE ";

	private static final String _SQL_COUNT_SEZOCCUPANTSHAREHOLDINGINFO =
		"SELECT COUNT(sezOccupantShareHoldingInfo) FROM SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo";

	private static final String _SQL_COUNT_SEZOCCUPANTSHAREHOLDINGINFO_WHERE =
		"SELECT COUNT(sezOccupantShareHoldingInfo) FROM SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupantShareHoldingInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupantShareHoldingInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupantShareHoldingInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupantShareHoldingInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}