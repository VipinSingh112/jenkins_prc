/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence.impl;

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

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaManufacturerInfoException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaManufacturerInfo;
import com.nbp.pharmaceutical.application.form.service.model.PharmaManufacturerInfoTable;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaManufacturerInfoImpl;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaManufacturerInfoModelImpl;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaManufacturerInfoPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaManufacturerInfoUtil;
import com.nbp.pharmaceutical.application.form.service.service.persistence.impl.constants.PHARMACEUTICALPersistenceConstants;

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
 * The persistence implementation for the pharma manufacturer info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PharmaManufacturerInfoPersistence.class)
public class PharmaManufacturerInfoPersistenceImpl
	extends BasePersistenceImpl<PharmaManufacturerInfo>
	implements PharmaManufacturerInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaManufacturerInfoUtil</code> to access the pharma manufacturer info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaManufacturerInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetPharmaByAppId;
	private FinderPath _finderPathCountBygetPharmaByAppId;

	/**
	 * Returns the pharma manufacturer info where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaManufacturerInfoException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a matching pharma manufacturer info could not be found
	 */
	@Override
	public PharmaManufacturerInfo findBygetPharmaByAppId(
			long pharmaApplicationId)
		throws NoSuchPharmaManufacturerInfoException {

		PharmaManufacturerInfo pharmaManufacturerInfo = fetchBygetPharmaByAppId(
			pharmaApplicationId);

		if (pharmaManufacturerInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("pharmaApplicationId=");
			sb.append(pharmaApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaManufacturerInfoException(sb.toString());
		}

		return pharmaManufacturerInfo;
	}

	/**
	 * Returns the pharma manufacturer info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	@Override
	public PharmaManufacturerInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId) {

		return fetchBygetPharmaByAppId(pharmaApplicationId, true);
	}

	/**
	 * Returns the pharma manufacturer info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	@Override
	public PharmaManufacturerInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {pharmaApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPharmaByAppId, finderArgs, this);
		}

		if (result instanceof PharmaManufacturerInfo) {
			PharmaManufacturerInfo pharmaManufacturerInfo =
				(PharmaManufacturerInfo)result;

			if (pharmaApplicationId !=
					pharmaManufacturerInfo.getPharmaApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAMANUFACTURERINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYAPPID_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				List<PharmaManufacturerInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPharmaByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {pharmaApplicationId};
							}

							_log.warn(
								"PharmaManufacturerInfoPersistenceImpl.fetchBygetPharmaByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaManufacturerInfo pharmaManufacturerInfo = list.get(0);

					result = pharmaManufacturerInfo;

					cacheResult(pharmaManufacturerInfo);
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
			return (PharmaManufacturerInfo)result;
		}
	}

	/**
	 * Removes the pharma manufacturer info where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma manufacturer info that was removed
	 */
	@Override
	public PharmaManufacturerInfo removeBygetPharmaByAppId(
			long pharmaApplicationId)
		throws NoSuchPharmaManufacturerInfoException {

		PharmaManufacturerInfo pharmaManufacturerInfo = findBygetPharmaByAppId(
			pharmaApplicationId);

		return remove(pharmaManufacturerInfo);
	}

	/**
	 * Returns the number of pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma manufacturer infos
	 */
	@Override
	public int countBygetPharmaByAppId(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetPharmaByAppId;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAMANUFACTURERINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYAPPID_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

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
		_FINDER_COLUMN_GETPHARMABYAPPID_PHARMAAPPLICATIONID_2 =
			"pharmaManufacturerInfo.pharmaApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetPA_DI_PAI;
	private FinderPath _finderPathWithoutPaginationFindBygetPA_DI_PAI;
	private FinderPath _finderPathCountBygetPA_DI_PAI;

	/**
	 * Returns all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma manufacturer infos
	 */
	@Override
	public List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId) {

		return findBygetPA_DI_PAI(
			pharmaApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @return the range of matching pharma manufacturer infos
	 */
	@Override
	public List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end) {

		return findBygetPA_DI_PAI(pharmaApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma manufacturer infos
	 */
	@Override
	public List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator) {

		return findBygetPA_DI_PAI(
			pharmaApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma manufacturer infos
	 */
	@Override
	public List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetPA_DI_PAI;
				finderArgs = new Object[] {pharmaApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPA_DI_PAI;
			finderArgs = new Object[] {
				pharmaApplicationId, start, end, orderByComparator
			};
		}

		List<PharmaManufacturerInfo> list = null;

		if (useFinderCache) {
			list = (List<PharmaManufacturerInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaManufacturerInfo pharmaManufacturerInfo : list) {
					if (pharmaApplicationId !=
							pharmaManufacturerInfo.getPharmaApplicationId()) {

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

			sb.append(_SQL_SELECT_PHARMAMANUFACTURERINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETPA_DI_PAI_PHARMAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaManufacturerInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				list = (List<PharmaManufacturerInfo>)QueryUtil.list(
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
	 * Returns the first pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a matching pharma manufacturer info could not be found
	 */
	@Override
	public PharmaManufacturerInfo findBygetPA_DI_PAI_First(
			long pharmaApplicationId,
			OrderByComparator<PharmaManufacturerInfo> orderByComparator)
		throws NoSuchPharmaManufacturerInfoException {

		PharmaManufacturerInfo pharmaManufacturerInfo =
			fetchBygetPA_DI_PAI_First(pharmaApplicationId, orderByComparator);

		if (pharmaManufacturerInfo != null) {
			return pharmaManufacturerInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaApplicationId=");
		sb.append(pharmaApplicationId);

		sb.append("}");

		throw new NoSuchPharmaManufacturerInfoException(sb.toString());
	}

	/**
	 * Returns the first pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	@Override
	public PharmaManufacturerInfo fetchBygetPA_DI_PAI_First(
		long pharmaApplicationId,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator) {

		List<PharmaManufacturerInfo> list = findBygetPA_DI_PAI(
			pharmaApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a matching pharma manufacturer info could not be found
	 */
	@Override
	public PharmaManufacturerInfo findBygetPA_DI_PAI_Last(
			long pharmaApplicationId,
			OrderByComparator<PharmaManufacturerInfo> orderByComparator)
		throws NoSuchPharmaManufacturerInfoException {

		PharmaManufacturerInfo pharmaManufacturerInfo =
			fetchBygetPA_DI_PAI_Last(pharmaApplicationId, orderByComparator);

		if (pharmaManufacturerInfo != null) {
			return pharmaManufacturerInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaApplicationId=");
		sb.append(pharmaApplicationId);

		sb.append("}");

		throw new NoSuchPharmaManufacturerInfoException(sb.toString());
	}

	/**
	 * Returns the last pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	@Override
	public PharmaManufacturerInfo fetchBygetPA_DI_PAI_Last(
		long pharmaApplicationId,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator) {

		int count = countBygetPA_DI_PAI(pharmaApplicationId);

		if (count == 0) {
			return null;
		}

		List<PharmaManufacturerInfo> list = findBygetPA_DI_PAI(
			pharmaApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma manufacturer infos before and after the current pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the current pharma manufacturer info
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a pharma manufacturer info with the primary key could not be found
	 */
	@Override
	public PharmaManufacturerInfo[] findBygetPA_DI_PAI_PrevAndNext(
			long pharmaManufacturerInfoId, long pharmaApplicationId,
			OrderByComparator<PharmaManufacturerInfo> orderByComparator)
		throws NoSuchPharmaManufacturerInfoException {

		PharmaManufacturerInfo pharmaManufacturerInfo = findByPrimaryKey(
			pharmaManufacturerInfoId);

		Session session = null;

		try {
			session = openSession();

			PharmaManufacturerInfo[] array = new PharmaManufacturerInfoImpl[3];

			array[0] = getBygetPA_DI_PAI_PrevAndNext(
				session, pharmaManufacturerInfo, pharmaApplicationId,
				orderByComparator, true);

			array[1] = pharmaManufacturerInfo;

			array[2] = getBygetPA_DI_PAI_PrevAndNext(
				session, pharmaManufacturerInfo, pharmaApplicationId,
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

	protected PharmaManufacturerInfo getBygetPA_DI_PAI_PrevAndNext(
		Session session, PharmaManufacturerInfo pharmaManufacturerInfo,
		long pharmaApplicationId,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMAMANUFACTURERINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETPA_DI_PAI_PHARMAAPPLICATIONID_2);

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
			sb.append(PharmaManufacturerInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(pharmaApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						pharmaManufacturerInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaManufacturerInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma manufacturer infos where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	@Override
	public void removeBygetPA_DI_PAI(long pharmaApplicationId) {
		for (PharmaManufacturerInfo pharmaManufacturerInfo :
				findBygetPA_DI_PAI(
					pharmaApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(pharmaManufacturerInfo);
		}
	}

	/**
	 * Returns the number of pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma manufacturer infos
	 */
	@Override
	public int countBygetPA_DI_PAI(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetPA_DI_PAI;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAMANUFACTURERINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETPA_DI_PAI_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

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
		_FINDER_COLUMN_GETPA_DI_PAI_PHARMAAPPLICATIONID_2 =
			"pharmaManufacturerInfo.pharmaApplicationId = ?";

	public PharmaManufacturerInfoPersistenceImpl() {
		setModelClass(PharmaManufacturerInfo.class);

		setModelImplClass(PharmaManufacturerInfoImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaManufacturerInfoTable.INSTANCE);
	}

	/**
	 * Caches the pharma manufacturer info in the entity cache if it is enabled.
	 *
	 * @param pharmaManufacturerInfo the pharma manufacturer info
	 */
	@Override
	public void cacheResult(PharmaManufacturerInfo pharmaManufacturerInfo) {
		entityCache.putResult(
			PharmaManufacturerInfoImpl.class,
			pharmaManufacturerInfo.getPrimaryKey(), pharmaManufacturerInfo);

		finderCache.putResult(
			_finderPathFetchBygetPharmaByAppId,
			new Object[] {pharmaManufacturerInfo.getPharmaApplicationId()},
			pharmaManufacturerInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma manufacturer infos in the entity cache if it is enabled.
	 *
	 * @param pharmaManufacturerInfos the pharma manufacturer infos
	 */
	@Override
	public void cacheResult(
		List<PharmaManufacturerInfo> pharmaManufacturerInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaManufacturerInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaManufacturerInfo pharmaManufacturerInfo :
				pharmaManufacturerInfos) {

			if (entityCache.getResult(
					PharmaManufacturerInfoImpl.class,
					pharmaManufacturerInfo.getPrimaryKey()) == null) {

				cacheResult(pharmaManufacturerInfo);
			}
		}
	}

	/**
	 * Clears the cache for all pharma manufacturer infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaManufacturerInfoImpl.class);

		finderCache.clearCache(PharmaManufacturerInfoImpl.class);
	}

	/**
	 * Clears the cache for the pharma manufacturer info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PharmaManufacturerInfo pharmaManufacturerInfo) {
		entityCache.removeResult(
			PharmaManufacturerInfoImpl.class, pharmaManufacturerInfo);
	}

	@Override
	public void clearCache(
		List<PharmaManufacturerInfo> pharmaManufacturerInfos) {

		for (PharmaManufacturerInfo pharmaManufacturerInfo :
				pharmaManufacturerInfos) {

			entityCache.removeResult(
				PharmaManufacturerInfoImpl.class, pharmaManufacturerInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaManufacturerInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PharmaManufacturerInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaManufacturerInfoModelImpl pharmaManufacturerInfoModelImpl) {

		Object[] args = new Object[] {
			pharmaManufacturerInfoModelImpl.getPharmaApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetPharmaByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPharmaByAppId, args,
			pharmaManufacturerInfoModelImpl);
	}

	/**
	 * Creates a new pharma manufacturer info with the primary key. Does not add the pharma manufacturer info to the database.
	 *
	 * @param pharmaManufacturerInfoId the primary key for the new pharma manufacturer info
	 * @return the new pharma manufacturer info
	 */
	@Override
	public PharmaManufacturerInfo create(long pharmaManufacturerInfoId) {
		PharmaManufacturerInfo pharmaManufacturerInfo =
			new PharmaManufacturerInfoImpl();

		pharmaManufacturerInfo.setNew(true);
		pharmaManufacturerInfo.setPrimaryKey(pharmaManufacturerInfoId);

		pharmaManufacturerInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return pharmaManufacturerInfo;
	}

	/**
	 * Removes the pharma manufacturer info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info that was removed
	 * @throws NoSuchPharmaManufacturerInfoException if a pharma manufacturer info with the primary key could not be found
	 */
	@Override
	public PharmaManufacturerInfo remove(long pharmaManufacturerInfoId)
		throws NoSuchPharmaManufacturerInfoException {

		return remove((Serializable)pharmaManufacturerInfoId);
	}

	/**
	 * Removes the pharma manufacturer info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info that was removed
	 * @throws NoSuchPharmaManufacturerInfoException if a pharma manufacturer info with the primary key could not be found
	 */
	@Override
	public PharmaManufacturerInfo remove(Serializable primaryKey)
		throws NoSuchPharmaManufacturerInfoException {

		Session session = null;

		try {
			session = openSession();

			PharmaManufacturerInfo pharmaManufacturerInfo =
				(PharmaManufacturerInfo)session.get(
					PharmaManufacturerInfoImpl.class, primaryKey);

			if (pharmaManufacturerInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaManufacturerInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaManufacturerInfo);
		}
		catch (NoSuchPharmaManufacturerInfoException noSuchEntityException) {
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
	protected PharmaManufacturerInfo removeImpl(
		PharmaManufacturerInfo pharmaManufacturerInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaManufacturerInfo)) {
				pharmaManufacturerInfo = (PharmaManufacturerInfo)session.get(
					PharmaManufacturerInfoImpl.class,
					pharmaManufacturerInfo.getPrimaryKeyObj());
			}

			if (pharmaManufacturerInfo != null) {
				session.delete(pharmaManufacturerInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaManufacturerInfo != null) {
			clearCache(pharmaManufacturerInfo);
		}

		return pharmaManufacturerInfo;
	}

	@Override
	public PharmaManufacturerInfo updateImpl(
		PharmaManufacturerInfo pharmaManufacturerInfo) {

		boolean isNew = pharmaManufacturerInfo.isNew();

		if (!(pharmaManufacturerInfo instanceof
				PharmaManufacturerInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaManufacturerInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaManufacturerInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaManufacturerInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaManufacturerInfo implementation " +
					pharmaManufacturerInfo.getClass());
		}

		PharmaManufacturerInfoModelImpl pharmaManufacturerInfoModelImpl =
			(PharmaManufacturerInfoModelImpl)pharmaManufacturerInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaManufacturerInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaManufacturerInfo.setCreateDate(date);
			}
			else {
				pharmaManufacturerInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaManufacturerInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaManufacturerInfo.setModifiedDate(date);
			}
			else {
				pharmaManufacturerInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaManufacturerInfo);
			}
			else {
				pharmaManufacturerInfo = (PharmaManufacturerInfo)session.merge(
					pharmaManufacturerInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaManufacturerInfoImpl.class, pharmaManufacturerInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(pharmaManufacturerInfoModelImpl);

		if (isNew) {
			pharmaManufacturerInfo.setNew(false);
		}

		pharmaManufacturerInfo.resetOriginalValues();

		return pharmaManufacturerInfo;
	}

	/**
	 * Returns the pharma manufacturer info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a pharma manufacturer info with the primary key could not be found
	 */
	@Override
	public PharmaManufacturerInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaManufacturerInfoException {

		PharmaManufacturerInfo pharmaManufacturerInfo = fetchByPrimaryKey(
			primaryKey);

		if (pharmaManufacturerInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaManufacturerInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaManufacturerInfo;
	}

	/**
	 * Returns the pharma manufacturer info with the primary key or throws a <code>NoSuchPharmaManufacturerInfoException</code> if it could not be found.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a pharma manufacturer info with the primary key could not be found
	 */
	@Override
	public PharmaManufacturerInfo findByPrimaryKey(
			long pharmaManufacturerInfoId)
		throws NoSuchPharmaManufacturerInfoException {

		return findByPrimaryKey((Serializable)pharmaManufacturerInfoId);
	}

	/**
	 * Returns the pharma manufacturer info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info, or <code>null</code> if a pharma manufacturer info with the primary key could not be found
	 */
	@Override
	public PharmaManufacturerInfo fetchByPrimaryKey(
		long pharmaManufacturerInfoId) {

		return fetchByPrimaryKey((Serializable)pharmaManufacturerInfoId);
	}

	/**
	 * Returns all the pharma manufacturer infos.
	 *
	 * @return the pharma manufacturer infos
	 */
	@Override
	public List<PharmaManufacturerInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma manufacturer infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @return the range of pharma manufacturer infos
	 */
	@Override
	public List<PharmaManufacturerInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma manufacturer infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma manufacturer infos
	 */
	@Override
	public List<PharmaManufacturerInfo> findAll(
		int start, int end,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma manufacturer infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma manufacturer infos
	 */
	@Override
	public List<PharmaManufacturerInfo> findAll(
		int start, int end,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator,
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

		List<PharmaManufacturerInfo> list = null;

		if (useFinderCache) {
			list = (List<PharmaManufacturerInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMAMANUFACTURERINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMAMANUFACTURERINFO;

				sql = sql.concat(PharmaManufacturerInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaManufacturerInfo>)QueryUtil.list(
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
	 * Removes all the pharma manufacturer infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaManufacturerInfo pharmaManufacturerInfo : findAll()) {
			remove(pharmaManufacturerInfo);
		}
	}

	/**
	 * Returns the number of pharma manufacturer infos.
	 *
	 * @return the number of pharma manufacturer infos
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
					_SQL_COUNT_PHARMAMANUFACTURERINFO);

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
		return "pharmaManufacturerInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMAMANUFACTURERINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaManufacturerInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma manufacturer info persistence.
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

		_finderPathFetchBygetPharmaByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPharmaByAppId",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathCountBygetPharmaByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPharmaByAppId", new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, false);

		_finderPathWithPaginationFindBygetPA_DI_PAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetPA_DI_PAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetPA_DI_PAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetPA_DI_PAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathCountBygetPA_DI_PAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetPA_DI_PAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, false);

		PharmaManufacturerInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PharmaManufacturerInfoUtil.setPersistence(null);

		entityCache.removeCache(PharmaManufacturerInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PHARMAMANUFACTURERINFO =
		"SELECT pharmaManufacturerInfo FROM PharmaManufacturerInfo pharmaManufacturerInfo";

	private static final String _SQL_SELECT_PHARMAMANUFACTURERINFO_WHERE =
		"SELECT pharmaManufacturerInfo FROM PharmaManufacturerInfo pharmaManufacturerInfo WHERE ";

	private static final String _SQL_COUNT_PHARMAMANUFACTURERINFO =
		"SELECT COUNT(pharmaManufacturerInfo) FROM PharmaManufacturerInfo pharmaManufacturerInfo";

	private static final String _SQL_COUNT_PHARMAMANUFACTURERINFO_WHERE =
		"SELECT COUNT(pharmaManufacturerInfo) FROM PharmaManufacturerInfo pharmaManufacturerInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pharmaManufacturerInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaManufacturerInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaManufacturerInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaManufacturerInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}