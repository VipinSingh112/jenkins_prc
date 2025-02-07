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

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaDrugInfoException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo;
import com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfoTable;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDrugInfoImpl;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDrugInfoModelImpl;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaDrugInfoPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaDrugInfoUtil;
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
 * The persistence implementation for the pharma drug info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PharmaDrugInfoPersistence.class)
public class PharmaDrugInfoPersistenceImpl
	extends BasePersistenceImpl<PharmaDrugInfo>
	implements PharmaDrugInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaDrugInfoUtil</code> to access the pharma drug info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaDrugInfoImpl.class.getName();

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
	 * Returns the pharma drug info where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaDrugInfoException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a matching pharma drug info could not be found
	 */
	@Override
	public PharmaDrugInfo findBygetPharmaByAppId(long pharmaApplicationId)
		throws NoSuchPharmaDrugInfoException {

		PharmaDrugInfo pharmaDrugInfo = fetchBygetPharmaByAppId(
			pharmaApplicationId);

		if (pharmaDrugInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("pharmaApplicationId=");
			sb.append(pharmaApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaDrugInfoException(sb.toString());
		}

		return pharmaDrugInfo;
	}

	/**
	 * Returns the pharma drug info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	@Override
	public PharmaDrugInfo fetchBygetPharmaByAppId(long pharmaApplicationId) {
		return fetchBygetPharmaByAppId(pharmaApplicationId, true);
	}

	/**
	 * Returns the pharma drug info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	@Override
	public PharmaDrugInfo fetchBygetPharmaByAppId(
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

		if (result instanceof PharmaDrugInfo) {
			PharmaDrugInfo pharmaDrugInfo = (PharmaDrugInfo)result;

			if (pharmaApplicationId !=
					pharmaDrugInfo.getPharmaApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMADRUGINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYAPPID_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				List<PharmaDrugInfo> list = query.list();

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
								"PharmaDrugInfoPersistenceImpl.fetchBygetPharmaByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaDrugInfo pharmaDrugInfo = list.get(0);

					result = pharmaDrugInfo;

					cacheResult(pharmaDrugInfo);
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
			return (PharmaDrugInfo)result;
		}
	}

	/**
	 * Removes the pharma drug info where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma drug info that was removed
	 */
	@Override
	public PharmaDrugInfo removeBygetPharmaByAppId(long pharmaApplicationId)
		throws NoSuchPharmaDrugInfoException {

		PharmaDrugInfo pharmaDrugInfo = findBygetPharmaByAppId(
			pharmaApplicationId);

		return remove(pharmaDrugInfo);
	}

	/**
	 * Returns the number of pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma drug infos
	 */
	@Override
	public int countBygetPharmaByAppId(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetPharmaByAppId;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMADRUGINFO_WHERE);

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
			"pharmaDrugInfo.pharmaApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetPA_DI_PAI;
	private FinderPath _finderPathWithoutPaginationFindBygetPA_DI_PAI;
	private FinderPath _finderPathCountBygetPA_DI_PAI;

	/**
	 * Returns all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma drug infos
	 */
	@Override
	public List<PharmaDrugInfo> findBygetPA_DI_PAI(long pharmaApplicationId) {
		return findBygetPA_DI_PAI(
			pharmaApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @return the range of matching pharma drug infos
	 */
	@Override
	public List<PharmaDrugInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end) {

		return findBygetPA_DI_PAI(pharmaApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma drug infos
	 */
	@Override
	public List<PharmaDrugInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaDrugInfo> orderByComparator) {

		return findBygetPA_DI_PAI(
			pharmaApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma drug infos
	 */
	@Override
	public List<PharmaDrugInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaDrugInfo> orderByComparator,
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

		List<PharmaDrugInfo> list = null;

		if (useFinderCache) {
			list = (List<PharmaDrugInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaDrugInfo pharmaDrugInfo : list) {
					if (pharmaApplicationId !=
							pharmaDrugInfo.getPharmaApplicationId()) {

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

			sb.append(_SQL_SELECT_PHARMADRUGINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETPA_DI_PAI_PHARMAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaDrugInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				list = (List<PharmaDrugInfo>)QueryUtil.list(
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
	 * Returns the first pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a matching pharma drug info could not be found
	 */
	@Override
	public PharmaDrugInfo findBygetPA_DI_PAI_First(
			long pharmaApplicationId,
			OrderByComparator<PharmaDrugInfo> orderByComparator)
		throws NoSuchPharmaDrugInfoException {

		PharmaDrugInfo pharmaDrugInfo = fetchBygetPA_DI_PAI_First(
			pharmaApplicationId, orderByComparator);

		if (pharmaDrugInfo != null) {
			return pharmaDrugInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaApplicationId=");
		sb.append(pharmaApplicationId);

		sb.append("}");

		throw new NoSuchPharmaDrugInfoException(sb.toString());
	}

	/**
	 * Returns the first pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	@Override
	public PharmaDrugInfo fetchBygetPA_DI_PAI_First(
		long pharmaApplicationId,
		OrderByComparator<PharmaDrugInfo> orderByComparator) {

		List<PharmaDrugInfo> list = findBygetPA_DI_PAI(
			pharmaApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a matching pharma drug info could not be found
	 */
	@Override
	public PharmaDrugInfo findBygetPA_DI_PAI_Last(
			long pharmaApplicationId,
			OrderByComparator<PharmaDrugInfo> orderByComparator)
		throws NoSuchPharmaDrugInfoException {

		PharmaDrugInfo pharmaDrugInfo = fetchBygetPA_DI_PAI_Last(
			pharmaApplicationId, orderByComparator);

		if (pharmaDrugInfo != null) {
			return pharmaDrugInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaApplicationId=");
		sb.append(pharmaApplicationId);

		sb.append("}");

		throw new NoSuchPharmaDrugInfoException(sb.toString());
	}

	/**
	 * Returns the last pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	@Override
	public PharmaDrugInfo fetchBygetPA_DI_PAI_Last(
		long pharmaApplicationId,
		OrderByComparator<PharmaDrugInfo> orderByComparator) {

		int count = countBygetPA_DI_PAI(pharmaApplicationId);

		if (count == 0) {
			return null;
		}

		List<PharmaDrugInfo> list = findBygetPA_DI_PAI(
			pharmaApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma drug infos before and after the current pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaDrugInfoId the primary key of the current pharma drug info
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a pharma drug info with the primary key could not be found
	 */
	@Override
	public PharmaDrugInfo[] findBygetPA_DI_PAI_PrevAndNext(
			long pharmaDrugInfoId, long pharmaApplicationId,
			OrderByComparator<PharmaDrugInfo> orderByComparator)
		throws NoSuchPharmaDrugInfoException {

		PharmaDrugInfo pharmaDrugInfo = findByPrimaryKey(pharmaDrugInfoId);

		Session session = null;

		try {
			session = openSession();

			PharmaDrugInfo[] array = new PharmaDrugInfoImpl[3];

			array[0] = getBygetPA_DI_PAI_PrevAndNext(
				session, pharmaDrugInfo, pharmaApplicationId, orderByComparator,
				true);

			array[1] = pharmaDrugInfo;

			array[2] = getBygetPA_DI_PAI_PrevAndNext(
				session, pharmaDrugInfo, pharmaApplicationId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PharmaDrugInfo getBygetPA_DI_PAI_PrevAndNext(
		Session session, PharmaDrugInfo pharmaDrugInfo,
		long pharmaApplicationId,
		OrderByComparator<PharmaDrugInfo> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PHARMADRUGINFO_WHERE);

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
			sb.append(PharmaDrugInfoModelImpl.ORDER_BY_JPQL);
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
						pharmaDrugInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaDrugInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma drug infos where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	@Override
	public void removeBygetPA_DI_PAI(long pharmaApplicationId) {
		for (PharmaDrugInfo pharmaDrugInfo :
				findBygetPA_DI_PAI(
					pharmaApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(pharmaDrugInfo);
		}
	}

	/**
	 * Returns the number of pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma drug infos
	 */
	@Override
	public int countBygetPA_DI_PAI(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetPA_DI_PAI;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMADRUGINFO_WHERE);

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
			"pharmaDrugInfo.pharmaApplicationId = ?";

	public PharmaDrugInfoPersistenceImpl() {
		setModelClass(PharmaDrugInfo.class);

		setModelImplClass(PharmaDrugInfoImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaDrugInfoTable.INSTANCE);
	}

	/**
	 * Caches the pharma drug info in the entity cache if it is enabled.
	 *
	 * @param pharmaDrugInfo the pharma drug info
	 */
	@Override
	public void cacheResult(PharmaDrugInfo pharmaDrugInfo) {
		entityCache.putResult(
			PharmaDrugInfoImpl.class, pharmaDrugInfo.getPrimaryKey(),
			pharmaDrugInfo);

		finderCache.putResult(
			_finderPathFetchBygetPharmaByAppId,
			new Object[] {pharmaDrugInfo.getPharmaApplicationId()},
			pharmaDrugInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma drug infos in the entity cache if it is enabled.
	 *
	 * @param pharmaDrugInfos the pharma drug infos
	 */
	@Override
	public void cacheResult(List<PharmaDrugInfo> pharmaDrugInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaDrugInfos.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaDrugInfo pharmaDrugInfo : pharmaDrugInfos) {
			if (entityCache.getResult(
					PharmaDrugInfoImpl.class, pharmaDrugInfo.getPrimaryKey()) ==
						null) {

				cacheResult(pharmaDrugInfo);
			}
		}
	}

	/**
	 * Clears the cache for all pharma drug infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaDrugInfoImpl.class);

		finderCache.clearCache(PharmaDrugInfoImpl.class);
	}

	/**
	 * Clears the cache for the pharma drug info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PharmaDrugInfo pharmaDrugInfo) {
		entityCache.removeResult(PharmaDrugInfoImpl.class, pharmaDrugInfo);
	}

	@Override
	public void clearCache(List<PharmaDrugInfo> pharmaDrugInfos) {
		for (PharmaDrugInfo pharmaDrugInfo : pharmaDrugInfos) {
			entityCache.removeResult(PharmaDrugInfoImpl.class, pharmaDrugInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaDrugInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PharmaDrugInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaDrugInfoModelImpl pharmaDrugInfoModelImpl) {

		Object[] args = new Object[] {
			pharmaDrugInfoModelImpl.getPharmaApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetPharmaByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPharmaByAppId, args, pharmaDrugInfoModelImpl);
	}

	/**
	 * Creates a new pharma drug info with the primary key. Does not add the pharma drug info to the database.
	 *
	 * @param pharmaDrugInfoId the primary key for the new pharma drug info
	 * @return the new pharma drug info
	 */
	@Override
	public PharmaDrugInfo create(long pharmaDrugInfoId) {
		PharmaDrugInfo pharmaDrugInfo = new PharmaDrugInfoImpl();

		pharmaDrugInfo.setNew(true);
		pharmaDrugInfo.setPrimaryKey(pharmaDrugInfoId);

		pharmaDrugInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return pharmaDrugInfo;
	}

	/**
	 * Removes the pharma drug info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaDrugInfoId the primary key of the pharma drug info
	 * @return the pharma drug info that was removed
	 * @throws NoSuchPharmaDrugInfoException if a pharma drug info with the primary key could not be found
	 */
	@Override
	public PharmaDrugInfo remove(long pharmaDrugInfoId)
		throws NoSuchPharmaDrugInfoException {

		return remove((Serializable)pharmaDrugInfoId);
	}

	/**
	 * Removes the pharma drug info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma drug info
	 * @return the pharma drug info that was removed
	 * @throws NoSuchPharmaDrugInfoException if a pharma drug info with the primary key could not be found
	 */
	@Override
	public PharmaDrugInfo remove(Serializable primaryKey)
		throws NoSuchPharmaDrugInfoException {

		Session session = null;

		try {
			session = openSession();

			PharmaDrugInfo pharmaDrugInfo = (PharmaDrugInfo)session.get(
				PharmaDrugInfoImpl.class, primaryKey);

			if (pharmaDrugInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaDrugInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaDrugInfo);
		}
		catch (NoSuchPharmaDrugInfoException noSuchEntityException) {
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
	protected PharmaDrugInfo removeImpl(PharmaDrugInfo pharmaDrugInfo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaDrugInfo)) {
				pharmaDrugInfo = (PharmaDrugInfo)session.get(
					PharmaDrugInfoImpl.class,
					pharmaDrugInfo.getPrimaryKeyObj());
			}

			if (pharmaDrugInfo != null) {
				session.delete(pharmaDrugInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaDrugInfo != null) {
			clearCache(pharmaDrugInfo);
		}

		return pharmaDrugInfo;
	}

	@Override
	public PharmaDrugInfo updateImpl(PharmaDrugInfo pharmaDrugInfo) {
		boolean isNew = pharmaDrugInfo.isNew();

		if (!(pharmaDrugInfo instanceof PharmaDrugInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaDrugInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaDrugInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaDrugInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaDrugInfo implementation " +
					pharmaDrugInfo.getClass());
		}

		PharmaDrugInfoModelImpl pharmaDrugInfoModelImpl =
			(PharmaDrugInfoModelImpl)pharmaDrugInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaDrugInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaDrugInfo.setCreateDate(date);
			}
			else {
				pharmaDrugInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaDrugInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaDrugInfo.setModifiedDate(date);
			}
			else {
				pharmaDrugInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaDrugInfo);
			}
			else {
				pharmaDrugInfo = (PharmaDrugInfo)session.merge(pharmaDrugInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaDrugInfoImpl.class, pharmaDrugInfoModelImpl, false, true);

		cacheUniqueFindersCache(pharmaDrugInfoModelImpl);

		if (isNew) {
			pharmaDrugInfo.setNew(false);
		}

		pharmaDrugInfo.resetOriginalValues();

		return pharmaDrugInfo;
	}

	/**
	 * Returns the pharma drug info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma drug info
	 * @return the pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a pharma drug info with the primary key could not be found
	 */
	@Override
	public PharmaDrugInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaDrugInfoException {

		PharmaDrugInfo pharmaDrugInfo = fetchByPrimaryKey(primaryKey);

		if (pharmaDrugInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaDrugInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaDrugInfo;
	}

	/**
	 * Returns the pharma drug info with the primary key or throws a <code>NoSuchPharmaDrugInfoException</code> if it could not be found.
	 *
	 * @param pharmaDrugInfoId the primary key of the pharma drug info
	 * @return the pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a pharma drug info with the primary key could not be found
	 */
	@Override
	public PharmaDrugInfo findByPrimaryKey(long pharmaDrugInfoId)
		throws NoSuchPharmaDrugInfoException {

		return findByPrimaryKey((Serializable)pharmaDrugInfoId);
	}

	/**
	 * Returns the pharma drug info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaDrugInfoId the primary key of the pharma drug info
	 * @return the pharma drug info, or <code>null</code> if a pharma drug info with the primary key could not be found
	 */
	@Override
	public PharmaDrugInfo fetchByPrimaryKey(long pharmaDrugInfoId) {
		return fetchByPrimaryKey((Serializable)pharmaDrugInfoId);
	}

	/**
	 * Returns all the pharma drug infos.
	 *
	 * @return the pharma drug infos
	 */
	@Override
	public List<PharmaDrugInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma drug infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @return the range of pharma drug infos
	 */
	@Override
	public List<PharmaDrugInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma drug infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma drug infos
	 */
	@Override
	public List<PharmaDrugInfo> findAll(
		int start, int end,
		OrderByComparator<PharmaDrugInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma drug infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma drug infos
	 */
	@Override
	public List<PharmaDrugInfo> findAll(
		int start, int end, OrderByComparator<PharmaDrugInfo> orderByComparator,
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

		List<PharmaDrugInfo> list = null;

		if (useFinderCache) {
			list = (List<PharmaDrugInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMADRUGINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMADRUGINFO;

				sql = sql.concat(PharmaDrugInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaDrugInfo>)QueryUtil.list(
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
	 * Removes all the pharma drug infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaDrugInfo pharmaDrugInfo : findAll()) {
			remove(pharmaDrugInfo);
		}
	}

	/**
	 * Returns the number of pharma drug infos.
	 *
	 * @return the number of pharma drug infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PHARMADRUGINFO);

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
		return "pharmaDrugInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMADRUGINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaDrugInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma drug info persistence.
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

		PharmaDrugInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PharmaDrugInfoUtil.setPersistence(null);

		entityCache.removeCache(PharmaDrugInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_PHARMADRUGINFO =
		"SELECT pharmaDrugInfo FROM PharmaDrugInfo pharmaDrugInfo";

	private static final String _SQL_SELECT_PHARMADRUGINFO_WHERE =
		"SELECT pharmaDrugInfo FROM PharmaDrugInfo pharmaDrugInfo WHERE ";

	private static final String _SQL_COUNT_PHARMADRUGINFO =
		"SELECT COUNT(pharmaDrugInfo) FROM PharmaDrugInfo pharmaDrugInfo";

	private static final String _SQL_COUNT_PHARMADRUGINFO_WHERE =
		"SELECT COUNT(pharmaDrugInfo) FROM PharmaDrugInfo pharmaDrugInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "pharmaDrugInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaDrugInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaDrugInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaDrugInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}