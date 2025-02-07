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

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaMedicalDeviceInfoException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaMedicalDeviceInfo;
import com.nbp.pharmaceutical.application.form.service.model.PharmaMedicalDeviceInfoTable;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaMedicalDeviceInfoImpl;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaMedicalDeviceInfoModelImpl;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaMedicalDeviceInfoPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaMedicalDeviceInfoUtil;
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
 * The persistence implementation for the pharma medical device info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PharmaMedicalDeviceInfoPersistence.class)
public class PharmaMedicalDeviceInfoPersistenceImpl
	extends BasePersistenceImpl<PharmaMedicalDeviceInfo>
	implements PharmaMedicalDeviceInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaMedicalDeviceInfoUtil</code> to access the pharma medical device info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaMedicalDeviceInfoImpl.class.getName();

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
	 * Returns the pharma medical device info where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaMedicalDeviceInfoException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a matching pharma medical device info could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo findBygetPharmaByAppId(
			long pharmaApplicationId)
		throws NoSuchPharmaMedicalDeviceInfoException {

		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo =
			fetchBygetPharmaByAppId(pharmaApplicationId);

		if (pharmaMedicalDeviceInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("pharmaApplicationId=");
			sb.append(pharmaApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaMedicalDeviceInfoException(sb.toString());
		}

		return pharmaMedicalDeviceInfo;
	}

	/**
	 * Returns the pharma medical device info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId) {

		return fetchBygetPharmaByAppId(pharmaApplicationId, true);
	}

	/**
	 * Returns the pharma medical device info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo fetchBygetPharmaByAppId(
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

		if (result instanceof PharmaMedicalDeviceInfo) {
			PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo =
				(PharmaMedicalDeviceInfo)result;

			if (pharmaApplicationId !=
					pharmaMedicalDeviceInfo.getPharmaApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAMEDICALDEVICEINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYAPPID_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				List<PharmaMedicalDeviceInfo> list = query.list();

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
								"PharmaMedicalDeviceInfoPersistenceImpl.fetchBygetPharmaByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo = list.get(
						0);

					result = pharmaMedicalDeviceInfo;

					cacheResult(pharmaMedicalDeviceInfo);
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
			return (PharmaMedicalDeviceInfo)result;
		}
	}

	/**
	 * Removes the pharma medical device info where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma medical device info that was removed
	 */
	@Override
	public PharmaMedicalDeviceInfo removeBygetPharmaByAppId(
			long pharmaApplicationId)
		throws NoSuchPharmaMedicalDeviceInfoException {

		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo =
			findBygetPharmaByAppId(pharmaApplicationId);

		return remove(pharmaMedicalDeviceInfo);
	}

	/**
	 * Returns the number of pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma medical device infos
	 */
	@Override
	public int countBygetPharmaByAppId(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetPharmaByAppId;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAMEDICALDEVICEINFO_WHERE);

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
			"pharmaMedicalDeviceInfo.pharmaApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetPA_MD_PAI;
	private FinderPath _finderPathWithoutPaginationFindBygetPA_MD_PAI;
	private FinderPath _finderPathCountBygetPA_MD_PAI;

	/**
	 * Returns all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma medical device infos
	 */
	@Override
	public List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId) {

		return findBygetPA_MD_PAI(
			pharmaApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @return the range of matching pharma medical device infos
	 */
	@Override
	public List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId, int start, int end) {

		return findBygetPA_MD_PAI(pharmaApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma medical device infos
	 */
	@Override
	public List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator) {

		return findBygetPA_MD_PAI(
			pharmaApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma medical device infos
	 */
	@Override
	public List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetPA_MD_PAI;
				finderArgs = new Object[] {pharmaApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPA_MD_PAI;
			finderArgs = new Object[] {
				pharmaApplicationId, start, end, orderByComparator
			};
		}

		List<PharmaMedicalDeviceInfo> list = null;

		if (useFinderCache) {
			list = (List<PharmaMedicalDeviceInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo : list) {
					if (pharmaApplicationId !=
							pharmaMedicalDeviceInfo.getPharmaApplicationId()) {

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

			sb.append(_SQL_SELECT_PHARMAMEDICALDEVICEINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETPA_MD_PAI_PHARMAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaMedicalDeviceInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				list = (List<PharmaMedicalDeviceInfo>)QueryUtil.list(
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
	 * Returns the first pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a matching pharma medical device info could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo findBygetPA_MD_PAI_First(
			long pharmaApplicationId,
			OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator)
		throws NoSuchPharmaMedicalDeviceInfoException {

		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo =
			fetchBygetPA_MD_PAI_First(pharmaApplicationId, orderByComparator);

		if (pharmaMedicalDeviceInfo != null) {
			return pharmaMedicalDeviceInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaApplicationId=");
		sb.append(pharmaApplicationId);

		sb.append("}");

		throw new NoSuchPharmaMedicalDeviceInfoException(sb.toString());
	}

	/**
	 * Returns the first pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo fetchBygetPA_MD_PAI_First(
		long pharmaApplicationId,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator) {

		List<PharmaMedicalDeviceInfo> list = findBygetPA_MD_PAI(
			pharmaApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a matching pharma medical device info could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo findBygetPA_MD_PAI_Last(
			long pharmaApplicationId,
			OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator)
		throws NoSuchPharmaMedicalDeviceInfoException {

		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo =
			fetchBygetPA_MD_PAI_Last(pharmaApplicationId, orderByComparator);

		if (pharmaMedicalDeviceInfo != null) {
			return pharmaMedicalDeviceInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaApplicationId=");
		sb.append(pharmaApplicationId);

		sb.append("}");

		throw new NoSuchPharmaMedicalDeviceInfoException(sb.toString());
	}

	/**
	 * Returns the last pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo fetchBygetPA_MD_PAI_Last(
		long pharmaApplicationId,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator) {

		int count = countBygetPA_MD_PAI(pharmaApplicationId);

		if (count == 0) {
			return null;
		}

		List<PharmaMedicalDeviceInfo> list = findBygetPA_MD_PAI(
			pharmaApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma medical device infos before and after the current pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the current pharma medical device info
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a pharma medical device info with the primary key could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo[] findBygetPA_MD_PAI_PrevAndNext(
			long pharmaMedicalDeviceId, long pharmaApplicationId,
			OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator)
		throws NoSuchPharmaMedicalDeviceInfoException {

		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo = findByPrimaryKey(
			pharmaMedicalDeviceId);

		Session session = null;

		try {
			session = openSession();

			PharmaMedicalDeviceInfo[] array =
				new PharmaMedicalDeviceInfoImpl[3];

			array[0] = getBygetPA_MD_PAI_PrevAndNext(
				session, pharmaMedicalDeviceInfo, pharmaApplicationId,
				orderByComparator, true);

			array[1] = pharmaMedicalDeviceInfo;

			array[2] = getBygetPA_MD_PAI_PrevAndNext(
				session, pharmaMedicalDeviceInfo, pharmaApplicationId,
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

	protected PharmaMedicalDeviceInfo getBygetPA_MD_PAI_PrevAndNext(
		Session session, PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo,
		long pharmaApplicationId,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMAMEDICALDEVICEINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETPA_MD_PAI_PHARMAAPPLICATIONID_2);

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
			sb.append(PharmaMedicalDeviceInfoModelImpl.ORDER_BY_JPQL);
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
						pharmaMedicalDeviceInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaMedicalDeviceInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma medical device infos where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	@Override
	public void removeBygetPA_MD_PAI(long pharmaApplicationId) {
		for (PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo :
				findBygetPA_MD_PAI(
					pharmaApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(pharmaMedicalDeviceInfo);
		}
	}

	/**
	 * Returns the number of pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma medical device infos
	 */
	@Override
	public int countBygetPA_MD_PAI(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetPA_MD_PAI;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAMEDICALDEVICEINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETPA_MD_PAI_PHARMAAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETPA_MD_PAI_PHARMAAPPLICATIONID_2 =
			"pharmaMedicalDeviceInfo.pharmaApplicationId = ?";

	public PharmaMedicalDeviceInfoPersistenceImpl() {
		setModelClass(PharmaMedicalDeviceInfo.class);

		setModelImplClass(PharmaMedicalDeviceInfoImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaMedicalDeviceInfoTable.INSTANCE);
	}

	/**
	 * Caches the pharma medical device info in the entity cache if it is enabled.
	 *
	 * @param pharmaMedicalDeviceInfo the pharma medical device info
	 */
	@Override
	public void cacheResult(PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo) {
		entityCache.putResult(
			PharmaMedicalDeviceInfoImpl.class,
			pharmaMedicalDeviceInfo.getPrimaryKey(), pharmaMedicalDeviceInfo);

		finderCache.putResult(
			_finderPathFetchBygetPharmaByAppId,
			new Object[] {pharmaMedicalDeviceInfo.getPharmaApplicationId()},
			pharmaMedicalDeviceInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma medical device infos in the entity cache if it is enabled.
	 *
	 * @param pharmaMedicalDeviceInfos the pharma medical device infos
	 */
	@Override
	public void cacheResult(
		List<PharmaMedicalDeviceInfo> pharmaMedicalDeviceInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaMedicalDeviceInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo :
				pharmaMedicalDeviceInfos) {

			if (entityCache.getResult(
					PharmaMedicalDeviceInfoImpl.class,
					pharmaMedicalDeviceInfo.getPrimaryKey()) == null) {

				cacheResult(pharmaMedicalDeviceInfo);
			}
		}
	}

	/**
	 * Clears the cache for all pharma medical device infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaMedicalDeviceInfoImpl.class);

		finderCache.clearCache(PharmaMedicalDeviceInfoImpl.class);
	}

	/**
	 * Clears the cache for the pharma medical device info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo) {
		entityCache.removeResult(
			PharmaMedicalDeviceInfoImpl.class, pharmaMedicalDeviceInfo);
	}

	@Override
	public void clearCache(
		List<PharmaMedicalDeviceInfo> pharmaMedicalDeviceInfos) {

		for (PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo :
				pharmaMedicalDeviceInfos) {

			entityCache.removeResult(
				PharmaMedicalDeviceInfoImpl.class, pharmaMedicalDeviceInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaMedicalDeviceInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PharmaMedicalDeviceInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaMedicalDeviceInfoModelImpl pharmaMedicalDeviceInfoModelImpl) {

		Object[] args = new Object[] {
			pharmaMedicalDeviceInfoModelImpl.getPharmaApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetPharmaByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPharmaByAppId, args,
			pharmaMedicalDeviceInfoModelImpl);
	}

	/**
	 * Creates a new pharma medical device info with the primary key. Does not add the pharma medical device info to the database.
	 *
	 * @param pharmaMedicalDeviceId the primary key for the new pharma medical device info
	 * @return the new pharma medical device info
	 */
	@Override
	public PharmaMedicalDeviceInfo create(long pharmaMedicalDeviceId) {
		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo =
			new PharmaMedicalDeviceInfoImpl();

		pharmaMedicalDeviceInfo.setNew(true);
		pharmaMedicalDeviceInfo.setPrimaryKey(pharmaMedicalDeviceId);

		pharmaMedicalDeviceInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return pharmaMedicalDeviceInfo;
	}

	/**
	 * Removes the pharma medical device info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the pharma medical device info
	 * @return the pharma medical device info that was removed
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a pharma medical device info with the primary key could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo remove(long pharmaMedicalDeviceId)
		throws NoSuchPharmaMedicalDeviceInfoException {

		return remove((Serializable)pharmaMedicalDeviceId);
	}

	/**
	 * Removes the pharma medical device info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma medical device info
	 * @return the pharma medical device info that was removed
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a pharma medical device info with the primary key could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo remove(Serializable primaryKey)
		throws NoSuchPharmaMedicalDeviceInfoException {

		Session session = null;

		try {
			session = openSession();

			PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo =
				(PharmaMedicalDeviceInfo)session.get(
					PharmaMedicalDeviceInfoImpl.class, primaryKey);

			if (pharmaMedicalDeviceInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaMedicalDeviceInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaMedicalDeviceInfo);
		}
		catch (NoSuchPharmaMedicalDeviceInfoException noSuchEntityException) {
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
	protected PharmaMedicalDeviceInfo removeImpl(
		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaMedicalDeviceInfo)) {
				pharmaMedicalDeviceInfo = (PharmaMedicalDeviceInfo)session.get(
					PharmaMedicalDeviceInfoImpl.class,
					pharmaMedicalDeviceInfo.getPrimaryKeyObj());
			}

			if (pharmaMedicalDeviceInfo != null) {
				session.delete(pharmaMedicalDeviceInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaMedicalDeviceInfo != null) {
			clearCache(pharmaMedicalDeviceInfo);
		}

		return pharmaMedicalDeviceInfo;
	}

	@Override
	public PharmaMedicalDeviceInfo updateImpl(
		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo) {

		boolean isNew = pharmaMedicalDeviceInfo.isNew();

		if (!(pharmaMedicalDeviceInfo instanceof
				PharmaMedicalDeviceInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaMedicalDeviceInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaMedicalDeviceInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaMedicalDeviceInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaMedicalDeviceInfo implementation " +
					pharmaMedicalDeviceInfo.getClass());
		}

		PharmaMedicalDeviceInfoModelImpl pharmaMedicalDeviceInfoModelImpl =
			(PharmaMedicalDeviceInfoModelImpl)pharmaMedicalDeviceInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaMedicalDeviceInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaMedicalDeviceInfo.setCreateDate(date);
			}
			else {
				pharmaMedicalDeviceInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaMedicalDeviceInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaMedicalDeviceInfo.setModifiedDate(date);
			}
			else {
				pharmaMedicalDeviceInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaMedicalDeviceInfo);
			}
			else {
				pharmaMedicalDeviceInfo =
					(PharmaMedicalDeviceInfo)session.merge(
						pharmaMedicalDeviceInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaMedicalDeviceInfoImpl.class, pharmaMedicalDeviceInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(pharmaMedicalDeviceInfoModelImpl);

		if (isNew) {
			pharmaMedicalDeviceInfo.setNew(false);
		}

		pharmaMedicalDeviceInfo.resetOriginalValues();

		return pharmaMedicalDeviceInfo;
	}

	/**
	 * Returns the pharma medical device info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma medical device info
	 * @return the pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a pharma medical device info with the primary key could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaMedicalDeviceInfoException {

		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo = fetchByPrimaryKey(
			primaryKey);

		if (pharmaMedicalDeviceInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaMedicalDeviceInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaMedicalDeviceInfo;
	}

	/**
	 * Returns the pharma medical device info with the primary key or throws a <code>NoSuchPharmaMedicalDeviceInfoException</code> if it could not be found.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the pharma medical device info
	 * @return the pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a pharma medical device info with the primary key could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo findByPrimaryKey(long pharmaMedicalDeviceId)
		throws NoSuchPharmaMedicalDeviceInfoException {

		return findByPrimaryKey((Serializable)pharmaMedicalDeviceId);
	}

	/**
	 * Returns the pharma medical device info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the pharma medical device info
	 * @return the pharma medical device info, or <code>null</code> if a pharma medical device info with the primary key could not be found
	 */
	@Override
	public PharmaMedicalDeviceInfo fetchByPrimaryKey(
		long pharmaMedicalDeviceId) {

		return fetchByPrimaryKey((Serializable)pharmaMedicalDeviceId);
	}

	/**
	 * Returns all the pharma medical device infos.
	 *
	 * @return the pharma medical device infos
	 */
	@Override
	public List<PharmaMedicalDeviceInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma medical device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @return the range of pharma medical device infos
	 */
	@Override
	public List<PharmaMedicalDeviceInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma medical device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma medical device infos
	 */
	@Override
	public List<PharmaMedicalDeviceInfo> findAll(
		int start, int end,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma medical device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma medical device infos
	 */
	@Override
	public List<PharmaMedicalDeviceInfo> findAll(
		int start, int end,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator,
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

		List<PharmaMedicalDeviceInfo> list = null;

		if (useFinderCache) {
			list = (List<PharmaMedicalDeviceInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMAMEDICALDEVICEINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMAMEDICALDEVICEINFO;

				sql = sql.concat(
					PharmaMedicalDeviceInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaMedicalDeviceInfo>)QueryUtil.list(
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
	 * Removes all the pharma medical device infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo : findAll()) {
			remove(pharmaMedicalDeviceInfo);
		}
	}

	/**
	 * Returns the number of pharma medical device infos.
	 *
	 * @return the number of pharma medical device infos
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
					_SQL_COUNT_PHARMAMEDICALDEVICEINFO);

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
		return "pharmaMedicalDeviceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMAMEDICALDEVICEINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaMedicalDeviceInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma medical device info persistence.
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

		_finderPathWithPaginationFindBygetPA_MD_PAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetPA_MD_PAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetPA_MD_PAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetPA_MD_PAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathCountBygetPA_MD_PAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetPA_MD_PAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, false);

		PharmaMedicalDeviceInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PharmaMedicalDeviceInfoUtil.setPersistence(null);

		entityCache.removeCache(PharmaMedicalDeviceInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_PHARMAMEDICALDEVICEINFO =
		"SELECT pharmaMedicalDeviceInfo FROM PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo";

	private static final String _SQL_SELECT_PHARMAMEDICALDEVICEINFO_WHERE =
		"SELECT pharmaMedicalDeviceInfo FROM PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo WHERE ";

	private static final String _SQL_COUNT_PHARMAMEDICALDEVICEINFO =
		"SELECT COUNT(pharmaMedicalDeviceInfo) FROM PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo";

	private static final String _SQL_COUNT_PHARMAMEDICALDEVICEINFO_WHERE =
		"SELECT COUNT(pharmaMedicalDeviceInfo) FROM PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pharmaMedicalDeviceInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaMedicalDeviceInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaMedicalDeviceInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaMedicalDeviceInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}