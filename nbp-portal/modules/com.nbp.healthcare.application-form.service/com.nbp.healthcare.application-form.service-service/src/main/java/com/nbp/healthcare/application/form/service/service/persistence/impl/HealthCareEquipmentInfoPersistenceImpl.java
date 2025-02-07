/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence.impl;

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

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareEquipmentInfoException;
import com.nbp.healthcare.application.form.service.model.HealthCareEquipmentInfo;
import com.nbp.healthcare.application.form.service.model.HealthCareEquipmentInfoTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareEquipmentInfoImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareEquipmentInfoModelImpl;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareEquipmentInfoPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareEquipmentInfoUtil;
import com.nbp.healthcare.application.form.service.service.persistence.impl.constants.HEALTHPersistenceConstants;

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
 * The persistence implementation for the health care equipment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthCareEquipmentInfoPersistence.class)
public class HealthCareEquipmentInfoPersistenceImpl
	extends BasePersistenceImpl<HealthCareEquipmentInfo>
	implements HealthCareEquipmentInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthCareEquipmentInfoUtil</code> to access the health care equipment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthCareEquipmentInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHelthCareById;
	private FinderPath _finderPathCountBygetHelthCareById;

	/**
	 * Returns the health care equipment info where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareEquipmentInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a matching health care equipment info could not be found
	 */
	@Override
	public HealthCareEquipmentInfo findBygetHelthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareEquipmentInfoException {

		HealthCareEquipmentInfo healthCareEquipmentInfo =
			fetchBygetHelthCareById(healthCareApplicationId);

		if (healthCareEquipmentInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("healthCareApplicationId=");
			sb.append(healthCareApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareEquipmentInfoException(sb.toString());
		}

		return healthCareEquipmentInfo;
	}

	/**
	 * Returns the health care equipment info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	@Override
	public HealthCareEquipmentInfo fetchBygetHelthCareById(
		long healthCareApplicationId) {

		return fetchBygetHelthCareById(healthCareApplicationId, true);
	}

	/**
	 * Returns the health care equipment info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	@Override
	public HealthCareEquipmentInfo fetchBygetHelthCareById(
		long healthCareApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {healthCareApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHelthCareById, finderArgs, this);
		}

		if (result instanceof HealthCareEquipmentInfo) {
			HealthCareEquipmentInfo healthCareEquipmentInfo =
				(HealthCareEquipmentInfo)result;

			if (healthCareApplicationId !=
					healthCareEquipmentInfo.getHealthCareApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREEQUIPMENTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETHELTHCAREBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

				List<HealthCareEquipmentInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHelthCareById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									healthCareApplicationId
								};
							}

							_log.warn(
								"HealthCareEquipmentInfoPersistenceImpl.fetchBygetHelthCareById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareEquipmentInfo healthCareEquipmentInfo = list.get(
						0);

					result = healthCareEquipmentInfo;

					cacheResult(healthCareEquipmentInfo);
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
			return (HealthCareEquipmentInfo)result;
		}
	}

	/**
	 * Removes the health care equipment info where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care equipment info that was removed
	 */
	@Override
	public HealthCareEquipmentInfo removeBygetHelthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareEquipmentInfoException {

		HealthCareEquipmentInfo healthCareEquipmentInfo =
			findBygetHelthCareById(healthCareApplicationId);

		return remove(healthCareEquipmentInfo);
	}

	/**
	 * Returns the number of health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care equipment infos
	 */
	@Override
	public int countBygetHelthCareById(long healthCareApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHelthCareById;

		Object[] finderArgs = new Object[] {healthCareApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREEQUIPMENTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETHELTHCAREBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

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
		_FINDER_COLUMN_GETHELTHCAREBYID_HEALTHCAREAPPLICATIONID_2 =
			"healthCareEquipmentInfo.healthCareApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetHC_EB_HAI;
	private FinderPath _finderPathWithoutPaginationFindBygetHC_EB_HAI;
	private FinderPath _finderPathCountBygetHC_EB_HAI;

	/**
	 * Returns all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care equipment infos
	 */
	@Override
	public List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId) {

		return findBygetHC_EB_HAI(
			healthCareApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @return the range of matching health care equipment infos
	 */
	@Override
	public List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId, int start, int end) {

		return findBygetHC_EB_HAI(healthCareApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health care equipment infos
	 */
	@Override
	public List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId, int start, int end,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator) {

		return findBygetHC_EB_HAI(
			healthCareApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health care equipment infos
	 */
	@Override
	public List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId, int start, int end,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHC_EB_HAI;
				finderArgs = new Object[] {healthCareApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHC_EB_HAI;
			finderArgs = new Object[] {
				healthCareApplicationId, start, end, orderByComparator
			};
		}

		List<HealthCareEquipmentInfo> list = null;

		if (useFinderCache) {
			list = (List<HealthCareEquipmentInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HealthCareEquipmentInfo healthCareEquipmentInfo : list) {
					if (healthCareApplicationId !=
							healthCareEquipmentInfo.
								getHealthCareApplicationId()) {

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

			sb.append(_SQL_SELECT_HEALTHCAREEQUIPMENTINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHC_EB_HAI_HEALTHCAREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HealthCareEquipmentInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

				list = (List<HealthCareEquipmentInfo>)QueryUtil.list(
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
	 * Returns the first health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a matching health care equipment info could not be found
	 */
	@Override
	public HealthCareEquipmentInfo findBygetHC_EB_HAI_First(
			long healthCareApplicationId,
			OrderByComparator<HealthCareEquipmentInfo> orderByComparator)
		throws NoSuchHealthCareEquipmentInfoException {

		HealthCareEquipmentInfo healthCareEquipmentInfo =
			fetchBygetHC_EB_HAI_First(
				healthCareApplicationId, orderByComparator);

		if (healthCareEquipmentInfo != null) {
			return healthCareEquipmentInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("healthCareApplicationId=");
		sb.append(healthCareApplicationId);

		sb.append("}");

		throw new NoSuchHealthCareEquipmentInfoException(sb.toString());
	}

	/**
	 * Returns the first health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	@Override
	public HealthCareEquipmentInfo fetchBygetHC_EB_HAI_First(
		long healthCareApplicationId,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator) {

		List<HealthCareEquipmentInfo> list = findBygetHC_EB_HAI(
			healthCareApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a matching health care equipment info could not be found
	 */
	@Override
	public HealthCareEquipmentInfo findBygetHC_EB_HAI_Last(
			long healthCareApplicationId,
			OrderByComparator<HealthCareEquipmentInfo> orderByComparator)
		throws NoSuchHealthCareEquipmentInfoException {

		HealthCareEquipmentInfo healthCareEquipmentInfo =
			fetchBygetHC_EB_HAI_Last(
				healthCareApplicationId, orderByComparator);

		if (healthCareEquipmentInfo != null) {
			return healthCareEquipmentInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("healthCareApplicationId=");
		sb.append(healthCareApplicationId);

		sb.append("}");

		throw new NoSuchHealthCareEquipmentInfoException(sb.toString());
	}

	/**
	 * Returns the last health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	@Override
	public HealthCareEquipmentInfo fetchBygetHC_EB_HAI_Last(
		long healthCareApplicationId,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator) {

		int count = countBygetHC_EB_HAI(healthCareApplicationId);

		if (count == 0) {
			return null;
		}

		List<HealthCareEquipmentInfo> list = findBygetHC_EB_HAI(
			healthCareApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the health care equipment infos before and after the current health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the current health care equipment info
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a health care equipment info with the primary key could not be found
	 */
	@Override
	public HealthCareEquipmentInfo[] findBygetHC_EB_HAI_PrevAndNext(
			long healthCareEquipmentInfoId, long healthCareApplicationId,
			OrderByComparator<HealthCareEquipmentInfo> orderByComparator)
		throws NoSuchHealthCareEquipmentInfoException {

		HealthCareEquipmentInfo healthCareEquipmentInfo = findByPrimaryKey(
			healthCareEquipmentInfoId);

		Session session = null;

		try {
			session = openSession();

			HealthCareEquipmentInfo[] array =
				new HealthCareEquipmentInfoImpl[3];

			array[0] = getBygetHC_EB_HAI_PrevAndNext(
				session, healthCareEquipmentInfo, healthCareApplicationId,
				orderByComparator, true);

			array[1] = healthCareEquipmentInfo;

			array[2] = getBygetHC_EB_HAI_PrevAndNext(
				session, healthCareEquipmentInfo, healthCareApplicationId,
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

	protected HealthCareEquipmentInfo getBygetHC_EB_HAI_PrevAndNext(
		Session session, HealthCareEquipmentInfo healthCareEquipmentInfo,
		long healthCareApplicationId,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_HEALTHCAREEQUIPMENTINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETHC_EB_HAI_HEALTHCAREAPPLICATIONID_2);

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
			sb.append(HealthCareEquipmentInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(healthCareApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						healthCareEquipmentInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HealthCareEquipmentInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the health care equipment infos where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 */
	@Override
	public void removeBygetHC_EB_HAI(long healthCareApplicationId) {
		for (HealthCareEquipmentInfo healthCareEquipmentInfo :
				findBygetHC_EB_HAI(
					healthCareApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(healthCareEquipmentInfo);
		}
	}

	/**
	 * Returns the number of health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care equipment infos
	 */
	@Override
	public int countBygetHC_EB_HAI(long healthCareApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHC_EB_HAI;

		Object[] finderArgs = new Object[] {healthCareApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREEQUIPMENTINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHC_EB_HAI_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

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
		_FINDER_COLUMN_GETHC_EB_HAI_HEALTHCAREAPPLICATIONID_2 =
			"healthCareEquipmentInfo.healthCareApplicationId = ?";

	public HealthCareEquipmentInfoPersistenceImpl() {
		setModelClass(HealthCareEquipmentInfo.class);

		setModelImplClass(HealthCareEquipmentInfoImpl.class);
		setModelPKClass(long.class);

		setTable(HealthCareEquipmentInfoTable.INSTANCE);
	}

	/**
	 * Caches the health care equipment info in the entity cache if it is enabled.
	 *
	 * @param healthCareEquipmentInfo the health care equipment info
	 */
	@Override
	public void cacheResult(HealthCareEquipmentInfo healthCareEquipmentInfo) {
		entityCache.putResult(
			HealthCareEquipmentInfoImpl.class,
			healthCareEquipmentInfo.getPrimaryKey(), healthCareEquipmentInfo);

		finderCache.putResult(
			_finderPathFetchBygetHelthCareById,
			new Object[] {healthCareEquipmentInfo.getHealthCareApplicationId()},
			healthCareEquipmentInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health care equipment infos in the entity cache if it is enabled.
	 *
	 * @param healthCareEquipmentInfos the health care equipment infos
	 */
	@Override
	public void cacheResult(
		List<HealthCareEquipmentInfo> healthCareEquipmentInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthCareEquipmentInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthCareEquipmentInfo healthCareEquipmentInfo :
				healthCareEquipmentInfos) {

			if (entityCache.getResult(
					HealthCareEquipmentInfoImpl.class,
					healthCareEquipmentInfo.getPrimaryKey()) == null) {

				cacheResult(healthCareEquipmentInfo);
			}
		}
	}

	/**
	 * Clears the cache for all health care equipment infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthCareEquipmentInfoImpl.class);

		finderCache.clearCache(HealthCareEquipmentInfoImpl.class);
	}

	/**
	 * Clears the cache for the health care equipment info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HealthCareEquipmentInfo healthCareEquipmentInfo) {
		entityCache.removeResult(
			HealthCareEquipmentInfoImpl.class, healthCareEquipmentInfo);
	}

	@Override
	public void clearCache(
		List<HealthCareEquipmentInfo> healthCareEquipmentInfos) {

		for (HealthCareEquipmentInfo healthCareEquipmentInfo :
				healthCareEquipmentInfos) {

			entityCache.removeResult(
				HealthCareEquipmentInfoImpl.class, healthCareEquipmentInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthCareEquipmentInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthCareEquipmentInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthCareEquipmentInfoModelImpl healthCareEquipmentInfoModelImpl) {

		Object[] args = new Object[] {
			healthCareEquipmentInfoModelImpl.getHealthCareApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHelthCareById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHelthCareById, args,
			healthCareEquipmentInfoModelImpl);
	}

	/**
	 * Creates a new health care equipment info with the primary key. Does not add the health care equipment info to the database.
	 *
	 * @param healthCareEquipmentInfoId the primary key for the new health care equipment info
	 * @return the new health care equipment info
	 */
	@Override
	public HealthCareEquipmentInfo create(long healthCareEquipmentInfoId) {
		HealthCareEquipmentInfo healthCareEquipmentInfo =
			new HealthCareEquipmentInfoImpl();

		healthCareEquipmentInfo.setNew(true);
		healthCareEquipmentInfo.setPrimaryKey(healthCareEquipmentInfoId);

		healthCareEquipmentInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return healthCareEquipmentInfo;
	}

	/**
	 * Removes the health care equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info that was removed
	 * @throws NoSuchHealthCareEquipmentInfoException if a health care equipment info with the primary key could not be found
	 */
	@Override
	public HealthCareEquipmentInfo remove(long healthCareEquipmentInfoId)
		throws NoSuchHealthCareEquipmentInfoException {

		return remove((Serializable)healthCareEquipmentInfoId);
	}

	/**
	 * Removes the health care equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health care equipment info
	 * @return the health care equipment info that was removed
	 * @throws NoSuchHealthCareEquipmentInfoException if a health care equipment info with the primary key could not be found
	 */
	@Override
	public HealthCareEquipmentInfo remove(Serializable primaryKey)
		throws NoSuchHealthCareEquipmentInfoException {

		Session session = null;

		try {
			session = openSession();

			HealthCareEquipmentInfo healthCareEquipmentInfo =
				(HealthCareEquipmentInfo)session.get(
					HealthCareEquipmentInfoImpl.class, primaryKey);

			if (healthCareEquipmentInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthCareEquipmentInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthCareEquipmentInfo);
		}
		catch (NoSuchHealthCareEquipmentInfoException noSuchEntityException) {
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
	protected HealthCareEquipmentInfo removeImpl(
		HealthCareEquipmentInfo healthCareEquipmentInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthCareEquipmentInfo)) {
				healthCareEquipmentInfo = (HealthCareEquipmentInfo)session.get(
					HealthCareEquipmentInfoImpl.class,
					healthCareEquipmentInfo.getPrimaryKeyObj());
			}

			if (healthCareEquipmentInfo != null) {
				session.delete(healthCareEquipmentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthCareEquipmentInfo != null) {
			clearCache(healthCareEquipmentInfo);
		}

		return healthCareEquipmentInfo;
	}

	@Override
	public HealthCareEquipmentInfo updateImpl(
		HealthCareEquipmentInfo healthCareEquipmentInfo) {

		boolean isNew = healthCareEquipmentInfo.isNew();

		if (!(healthCareEquipmentInfo instanceof
				HealthCareEquipmentInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthCareEquipmentInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthCareEquipmentInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthCareEquipmentInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthCareEquipmentInfo implementation " +
					healthCareEquipmentInfo.getClass());
		}

		HealthCareEquipmentInfoModelImpl healthCareEquipmentInfoModelImpl =
			(HealthCareEquipmentInfoModelImpl)healthCareEquipmentInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthCareEquipmentInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthCareEquipmentInfo.setCreateDate(date);
			}
			else {
				healthCareEquipmentInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthCareEquipmentInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthCareEquipmentInfo.setModifiedDate(date);
			}
			else {
				healthCareEquipmentInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthCareEquipmentInfo);
			}
			else {
				healthCareEquipmentInfo =
					(HealthCareEquipmentInfo)session.merge(
						healthCareEquipmentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthCareEquipmentInfoImpl.class, healthCareEquipmentInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(healthCareEquipmentInfoModelImpl);

		if (isNew) {
			healthCareEquipmentInfo.setNew(false);
		}

		healthCareEquipmentInfo.resetOriginalValues();

		return healthCareEquipmentInfo;
	}

	/**
	 * Returns the health care equipment info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health care equipment info
	 * @return the health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a health care equipment info with the primary key could not be found
	 */
	@Override
	public HealthCareEquipmentInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthCareEquipmentInfoException {

		HealthCareEquipmentInfo healthCareEquipmentInfo = fetchByPrimaryKey(
			primaryKey);

		if (healthCareEquipmentInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthCareEquipmentInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthCareEquipmentInfo;
	}

	/**
	 * Returns the health care equipment info with the primary key or throws a <code>NoSuchHealthCareEquipmentInfoException</code> if it could not be found.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a health care equipment info with the primary key could not be found
	 */
	@Override
	public HealthCareEquipmentInfo findByPrimaryKey(
			long healthCareEquipmentInfoId)
		throws NoSuchHealthCareEquipmentInfoException {

		return findByPrimaryKey((Serializable)healthCareEquipmentInfoId);
	}

	/**
	 * Returns the health care equipment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info, or <code>null</code> if a health care equipment info with the primary key could not be found
	 */
	@Override
	public HealthCareEquipmentInfo fetchByPrimaryKey(
		long healthCareEquipmentInfoId) {

		return fetchByPrimaryKey((Serializable)healthCareEquipmentInfoId);
	}

	/**
	 * Returns all the health care equipment infos.
	 *
	 * @return the health care equipment infos
	 */
	@Override
	public List<HealthCareEquipmentInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @return the range of health care equipment infos
	 */
	@Override
	public List<HealthCareEquipmentInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care equipment infos
	 */
	@Override
	public List<HealthCareEquipmentInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care equipment infos
	 */
	@Override
	public List<HealthCareEquipmentInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator,
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

		List<HealthCareEquipmentInfo> list = null;

		if (useFinderCache) {
			list = (List<HealthCareEquipmentInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCAREEQUIPMENTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCAREEQUIPMENTINFO;

				sql = sql.concat(
					HealthCareEquipmentInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthCareEquipmentInfo>)QueryUtil.list(
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
	 * Removes all the health care equipment infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthCareEquipmentInfo healthCareEquipmentInfo : findAll()) {
			remove(healthCareEquipmentInfo);
		}
	}

	/**
	 * Returns the number of health care equipment infos.
	 *
	 * @return the number of health care equipment infos
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
					_SQL_COUNT_HEALTHCAREEQUIPMENTINFO);

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
		return "healthCareEquipmentInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCAREEQUIPMENTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthCareEquipmentInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health care equipment info persistence.
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

		_finderPathFetchBygetHelthCareById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHelthCareById",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, true);

		_finderPathCountBygetHelthCareById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHelthCareById", new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, false);

		_finderPathWithPaginationFindBygetHC_EB_HAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHC_EB_HAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"healthCareApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHC_EB_HAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHC_EB_HAI",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, true);

		_finderPathCountBygetHC_EB_HAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHC_EB_HAI",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, false);

		HealthCareEquipmentInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthCareEquipmentInfoUtil.setPersistence(null);

		entityCache.removeCache(HealthCareEquipmentInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HEALTHCAREEQUIPMENTINFO =
		"SELECT healthCareEquipmentInfo FROM HealthCareEquipmentInfo healthCareEquipmentInfo";

	private static final String _SQL_SELECT_HEALTHCAREEQUIPMENTINFO_WHERE =
		"SELECT healthCareEquipmentInfo FROM HealthCareEquipmentInfo healthCareEquipmentInfo WHERE ";

	private static final String _SQL_COUNT_HEALTHCAREEQUIPMENTINFO =
		"SELECT COUNT(healthCareEquipmentInfo) FROM HealthCareEquipmentInfo healthCareEquipmentInfo";

	private static final String _SQL_COUNT_HEALTHCAREEQUIPMENTINFO_WHERE =
		"SELECT COUNT(healthCareEquipmentInfo) FROM HealthCareEquipmentInfo healthCareEquipmentInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthCareEquipmentInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthCareEquipmentInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthCareEquipmentInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCareEquipmentInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}