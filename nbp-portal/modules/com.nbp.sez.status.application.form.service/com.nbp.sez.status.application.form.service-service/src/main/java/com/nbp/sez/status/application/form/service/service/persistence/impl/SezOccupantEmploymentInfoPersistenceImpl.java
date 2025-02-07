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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantEmploymentInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantEmploymentInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantEmploymentInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantEmploymentInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantEmploymentInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantEmploymentInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantEmploymentInfoUtil;
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
 * The persistence implementation for the sez occupant employment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccupantEmploymentInfoPersistence.class)
public class SezOccupantEmploymentInfoPersistenceImpl
	extends BasePersistenceImpl<SezOccupantEmploymentInfo>
	implements SezOccupantEmploymentInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupantEmploymentInfoUtil</code> to access the sez occupant employment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupantEmploymentInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns the sez occupant employment info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantEmploymentInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a matching sez occupant employment info could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantEmploymentInfoException {

		SezOccupantEmploymentInfo sezOccupantEmploymentInfo =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezOccupantEmploymentInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezOccupantEmploymentInfoException(sb.toString());
		}

		return sezOccupantEmploymentInfo;
	}

	/**
	 * Returns the sez occupant employment info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez occupant employment info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAppId, finderArgs, this);
		}

		if (result instanceof SezOccupantEmploymentInfo) {
			SezOccupantEmploymentInfo sezOccupantEmploymentInfo =
				(SezOccupantEmploymentInfo)result;

			if (sezStatusApplicationId !=
					sezOccupantEmploymentInfo.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZOCCUPANTEMPLOYMENTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezOccupantEmploymentInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAppId, finderArgs,
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
								"SezOccupantEmploymentInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezOccupantEmploymentInfo sezOccupantEmploymentInfo =
						list.get(0);

					result = sezOccupantEmploymentInfo;

					cacheResult(sezOccupantEmploymentInfo);
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
			return (SezOccupantEmploymentInfo)result;
		}
	}

	/**
	 * Removes the sez occupant employment info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant employment info that was removed
	 */
	@Override
	public SezOccupantEmploymentInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantEmploymentInfoException {

		SezOccupantEmploymentInfo sezOccupantEmploymentInfo =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezOccupantEmploymentInfo);
	}

	/**
	 * Returns the number of sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant employment infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTEMPLOYMENTINFO_WHERE);

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
			"sezOccupantEmploymentInfo.sezStatusApplicationId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetSezStatusByApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetSezStatusByApplicationId;
	private FinderPath _finderPathCountBygetSezStatusByApplicationId;

	/**
	 * Returns all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant employment infos
	 */
	@Override
	public List<SezOccupantEmploymentInfo> findBygetSezStatusByApplicationId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByApplicationId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @return the range of matching sez occupant employment infos
	 */
	@Override
	public List<SezOccupantEmploymentInfo> findBygetSezStatusByApplicationId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByApplicationId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant employment infos
	 */
	@Override
	public List<SezOccupantEmploymentInfo> findBygetSezStatusByApplicationId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantEmploymentInfo> orderByComparator) {

		return findBygetSezStatusByApplicationId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant employment infos
	 */
	@Override
	public List<SezOccupantEmploymentInfo> findBygetSezStatusByApplicationId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantEmploymentInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSezStatusByApplicationId;
				finderArgs = new Object[] {sezStatusApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetSezStatusByApplicationId;
			finderArgs = new Object[] {
				sezStatusApplicationId, start, end, orderByComparator
			};
		}

		List<SezOccupantEmploymentInfo> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantEmploymentInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezOccupantEmploymentInfo sezOccupantEmploymentInfo :
						list) {

					if (sezStatusApplicationId !=
							sezOccupantEmploymentInfo.
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

			sb.append(_SQL_SELECT_SEZOCCUPANTEMPLOYMENTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPLICATIONID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezOccupantEmploymentInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezOccupantEmploymentInfo>)QueryUtil.list(
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
	 * Returns the first sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a matching sez occupant employment info could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo findBygetSezStatusByApplicationId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantEmploymentInfo> orderByComparator)
		throws NoSuchSezOccupantEmploymentInfoException {

		SezOccupantEmploymentInfo sezOccupantEmploymentInfo =
			fetchBygetSezStatusByApplicationId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezOccupantEmploymentInfo != null) {
			return sezOccupantEmploymentInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantEmploymentInfoException(sb.toString());
	}

	/**
	 * Returns the first sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo fetchBygetSezStatusByApplicationId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantEmploymentInfo> orderByComparator) {

		List<SezOccupantEmploymentInfo> list =
			findBygetSezStatusByApplicationId(
				sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a matching sez occupant employment info could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo findBygetSezStatusByApplicationId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantEmploymentInfo> orderByComparator)
		throws NoSuchSezOccupantEmploymentInfoException {

		SezOccupantEmploymentInfo sezOccupantEmploymentInfo =
			fetchBygetSezStatusByApplicationId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezOccupantEmploymentInfo != null) {
			return sezOccupantEmploymentInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantEmploymentInfoException(sb.toString());
	}

	/**
	 * Returns the last sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo fetchBygetSezStatusByApplicationId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantEmploymentInfo> orderByComparator) {

		int count = countBygetSezStatusByApplicationId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezOccupantEmploymentInfo> list =
			findBygetSezStatusByApplicationId(
				sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez occupant employment infos before and after the current sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccEmpId the primary key of the current sez occupant employment info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a sez occupant employment info with the primary key could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo[]
			findBygetSezStatusByApplicationId_PrevAndNext(
				long sezOccEmpId, long sezStatusApplicationId,
				OrderByComparator<SezOccupantEmploymentInfo> orderByComparator)
		throws NoSuchSezOccupantEmploymentInfoException {

		SezOccupantEmploymentInfo sezOccupantEmploymentInfo = findByPrimaryKey(
			sezOccEmpId);

		Session session = null;

		try {
			session = openSession();

			SezOccupantEmploymentInfo[] array =
				new SezOccupantEmploymentInfoImpl[3];

			array[0] = getBygetSezStatusByApplicationId_PrevAndNext(
				session, sezOccupantEmploymentInfo, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezOccupantEmploymentInfo;

			array[2] = getBygetSezStatusByApplicationId_PrevAndNext(
				session, sezOccupantEmploymentInfo, sezStatusApplicationId,
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

	protected SezOccupantEmploymentInfo
		getBygetSezStatusByApplicationId_PrevAndNext(
			Session session,
			SezOccupantEmploymentInfo sezOccupantEmploymentInfo,
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantEmploymentInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZOCCUPANTEMPLOYMENTINFO_WHERE);

		sb.append(
			_FINDER_COLUMN_GETSEZSTATUSBYAPPLICATIONID_SEZSTATUSAPPLICATIONID_2);

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
			sb.append(SezOccupantEmploymentInfoModelImpl.ORDER_BY_JPQL);
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
						sezOccupantEmploymentInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezOccupantEmploymentInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez occupant employment infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByApplicationId(
		long sezStatusApplicationId) {

		for (SezOccupantEmploymentInfo sezOccupantEmploymentInfo :
				findBygetSezStatusByApplicationId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezOccupantEmploymentInfo);
		}
	}

	/**
	 * Returns the number of sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant employment infos
	 */
	@Override
	public int countBygetSezStatusByApplicationId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByApplicationId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTEMPLOYMENTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPLICATIONID_SEZSTATUSAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPLICATIONID_SEZSTATUSAPPLICATIONID_2 =
			"sezOccupantEmploymentInfo.sezStatusApplicationId = ?";

	public SezOccupantEmploymentInfoPersistenceImpl() {
		setModelClass(SezOccupantEmploymentInfo.class);

		setModelImplClass(SezOccupantEmploymentInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupantEmploymentInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez occupant employment info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantEmploymentInfo the sez occupant employment info
	 */
	@Override
	public void cacheResult(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		entityCache.putResult(
			SezOccupantEmploymentInfoImpl.class,
			sezOccupantEmploymentInfo.getPrimaryKey(),
			sezOccupantEmploymentInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezOccupantEmploymentInfo.getSezStatusApplicationId()
			},
			sezOccupantEmploymentInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupant employment infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantEmploymentInfos the sez occupant employment infos
	 */
	@Override
	public void cacheResult(
		List<SezOccupantEmploymentInfo> sezOccupantEmploymentInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupantEmploymentInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupantEmploymentInfo sezOccupantEmploymentInfo :
				sezOccupantEmploymentInfos) {

			if (entityCache.getResult(
					SezOccupantEmploymentInfoImpl.class,
					sezOccupantEmploymentInfo.getPrimaryKey()) == null) {

				cacheResult(sezOccupantEmploymentInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupant employment infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccupantEmploymentInfoImpl.class);

		finderCache.clearCache(SezOccupantEmploymentInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez occupant employment info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		entityCache.removeResult(
			SezOccupantEmploymentInfoImpl.class, sezOccupantEmploymentInfo);
	}

	@Override
	public void clearCache(
		List<SezOccupantEmploymentInfo> sezOccupantEmploymentInfos) {

		for (SezOccupantEmploymentInfo sezOccupantEmploymentInfo :
				sezOccupantEmploymentInfos) {

			entityCache.removeResult(
				SezOccupantEmploymentInfoImpl.class, sezOccupantEmploymentInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccupantEmploymentInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupantEmploymentInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezOccupantEmploymentInfoModelImpl sezOccupantEmploymentInfoModelImpl) {

		Object[] args = new Object[] {
			sezOccupantEmploymentInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezOccupantEmploymentInfoModelImpl);
	}

	/**
	 * Creates a new sez occupant employment info with the primary key. Does not add the sez occupant employment info to the database.
	 *
	 * @param sezOccEmpId the primary key for the new sez occupant employment info
	 * @return the new sez occupant employment info
	 */
	@Override
	public SezOccupantEmploymentInfo create(long sezOccEmpId) {
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo =
			new SezOccupantEmploymentInfoImpl();

		sezOccupantEmploymentInfo.setNew(true);
		sezOccupantEmploymentInfo.setPrimaryKey(sezOccEmpId);

		sezOccupantEmploymentInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupantEmploymentInfo;
	}

	/**
	 * Removes the sez occupant employment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccEmpId the primary key of the sez occupant employment info
	 * @return the sez occupant employment info that was removed
	 * @throws NoSuchSezOccupantEmploymentInfoException if a sez occupant employment info with the primary key could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo remove(long sezOccEmpId)
		throws NoSuchSezOccupantEmploymentInfoException {

		return remove((Serializable)sezOccEmpId);
	}

	/**
	 * Removes the sez occupant employment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupant employment info
	 * @return the sez occupant employment info that was removed
	 * @throws NoSuchSezOccupantEmploymentInfoException if a sez occupant employment info with the primary key could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo remove(Serializable primaryKey)
		throws NoSuchSezOccupantEmploymentInfoException {

		Session session = null;

		try {
			session = openSession();

			SezOccupantEmploymentInfo sezOccupantEmploymentInfo =
				(SezOccupantEmploymentInfo)session.get(
					SezOccupantEmploymentInfoImpl.class, primaryKey);

			if (sezOccupantEmploymentInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupantEmploymentInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupantEmploymentInfo);
		}
		catch (NoSuchSezOccupantEmploymentInfoException noSuchEntityException) {
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
	protected SezOccupantEmploymentInfo removeImpl(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupantEmploymentInfo)) {
				sezOccupantEmploymentInfo =
					(SezOccupantEmploymentInfo)session.get(
						SezOccupantEmploymentInfoImpl.class,
						sezOccupantEmploymentInfo.getPrimaryKeyObj());
			}

			if (sezOccupantEmploymentInfo != null) {
				session.delete(sezOccupantEmploymentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupantEmploymentInfo != null) {
			clearCache(sezOccupantEmploymentInfo);
		}

		return sezOccupantEmploymentInfo;
	}

	@Override
	public SezOccupantEmploymentInfo updateImpl(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		boolean isNew = sezOccupantEmploymentInfo.isNew();

		if (!(sezOccupantEmploymentInfo instanceof
				SezOccupantEmploymentInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezOccupantEmploymentInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupantEmploymentInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupantEmploymentInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupantEmploymentInfo implementation " +
					sezOccupantEmploymentInfo.getClass());
		}

		SezOccupantEmploymentInfoModelImpl sezOccupantEmploymentInfoModelImpl =
			(SezOccupantEmploymentInfoModelImpl)sezOccupantEmploymentInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezOccupantEmploymentInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezOccupantEmploymentInfo.setCreateDate(date);
			}
			else {
				sezOccupantEmploymentInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupantEmploymentInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezOccupantEmploymentInfo.setModifiedDate(date);
			}
			else {
				sezOccupantEmploymentInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupantEmploymentInfo);
			}
			else {
				sezOccupantEmploymentInfo =
					(SezOccupantEmploymentInfo)session.merge(
						sezOccupantEmploymentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupantEmploymentInfoImpl.class,
			sezOccupantEmploymentInfoModelImpl, false, true);

		cacheUniqueFindersCache(sezOccupantEmploymentInfoModelImpl);

		if (isNew) {
			sezOccupantEmploymentInfo.setNew(false);
		}

		sezOccupantEmploymentInfo.resetOriginalValues();

		return sezOccupantEmploymentInfo;
	}

	/**
	 * Returns the sez occupant employment info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupant employment info
	 * @return the sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a sez occupant employment info with the primary key could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezOccupantEmploymentInfoException {

		SezOccupantEmploymentInfo sezOccupantEmploymentInfo = fetchByPrimaryKey(
			primaryKey);

		if (sezOccupantEmploymentInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupantEmploymentInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupantEmploymentInfo;
	}

	/**
	 * Returns the sez occupant employment info with the primary key or throws a <code>NoSuchSezOccupantEmploymentInfoException</code> if it could not be found.
	 *
	 * @param sezOccEmpId the primary key of the sez occupant employment info
	 * @return the sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a sez occupant employment info with the primary key could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo findByPrimaryKey(long sezOccEmpId)
		throws NoSuchSezOccupantEmploymentInfoException {

		return findByPrimaryKey((Serializable)sezOccEmpId);
	}

	/**
	 * Returns the sez occupant employment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccEmpId the primary key of the sez occupant employment info
	 * @return the sez occupant employment info, or <code>null</code> if a sez occupant employment info with the primary key could not be found
	 */
	@Override
	public SezOccupantEmploymentInfo fetchByPrimaryKey(long sezOccEmpId) {
		return fetchByPrimaryKey((Serializable)sezOccEmpId);
	}

	/**
	 * Returns all the sez occupant employment infos.
	 *
	 * @return the sez occupant employment infos
	 */
	@Override
	public List<SezOccupantEmploymentInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @return the range of sez occupant employment infos
	 */
	@Override
	public List<SezOccupantEmploymentInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant employment infos
	 */
	@Override
	public List<SezOccupantEmploymentInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantEmploymentInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant employment infos
	 */
	@Override
	public List<SezOccupantEmploymentInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantEmploymentInfo> orderByComparator,
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

		List<SezOccupantEmploymentInfo> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantEmploymentInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCUPANTEMPLOYMENTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTEMPLOYMENTINFO;

				sql = sql.concat(
					SezOccupantEmploymentInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezOccupantEmploymentInfo>)QueryUtil.list(
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
	 * Removes all the sez occupant employment infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupantEmploymentInfo sezOccupantEmploymentInfo : findAll()) {
			remove(sezOccupantEmploymentInfo);
		}
	}

	/**
	 * Returns the number of sez occupant employment infos.
	 *
	 * @return the number of sez occupant employment infos
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
					_SQL_COUNT_SEZOCCUPANTEMPLOYMENTINFO);

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
		return "sezOccEmpId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTEMPLOYMENTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupantEmploymentInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupant employment info persistence.
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

		_finderPathFetchBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAppId",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		_finderPathWithPaginationFindBygetSezStatusByApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetSezStatusByApplicationId",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"sezStatusApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetSezStatusByApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetSezStatusByApplicationId",
				new String[] {Long.class.getName()},
				new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezOccupantEmploymentInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupantEmploymentInfoUtil.setPersistence(null);

		entityCache.removeCache(SezOccupantEmploymentInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZOCCUPANTEMPLOYMENTINFO =
		"SELECT sezOccupantEmploymentInfo FROM SezOccupantEmploymentInfo sezOccupantEmploymentInfo";

	private static final String _SQL_SELECT_SEZOCCUPANTEMPLOYMENTINFO_WHERE =
		"SELECT sezOccupantEmploymentInfo FROM SezOccupantEmploymentInfo sezOccupantEmploymentInfo WHERE ";

	private static final String _SQL_COUNT_SEZOCCUPANTEMPLOYMENTINFO =
		"SELECT COUNT(sezOccupantEmploymentInfo) FROM SezOccupantEmploymentInfo sezOccupantEmploymentInfo";

	private static final String _SQL_COUNT_SEZOCCUPANTEMPLOYMENTINFO_WHERE =
		"SELECT COUNT(sezOccupantEmploymentInfo) FROM SezOccupantEmploymentInfo sezOccupantEmploymentInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupantEmploymentInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupantEmploymentInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupantEmploymentInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupantEmploymentInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}