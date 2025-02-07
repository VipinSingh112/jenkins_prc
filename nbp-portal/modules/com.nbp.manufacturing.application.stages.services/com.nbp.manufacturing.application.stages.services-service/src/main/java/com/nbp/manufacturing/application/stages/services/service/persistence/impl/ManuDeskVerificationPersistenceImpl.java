/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence.impl;

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

import com.nbp.manufacturing.application.stages.services.exception.NoSuchManuDeskVerificationException;
import com.nbp.manufacturing.application.stages.services.model.ManuDeskVerification;
import com.nbp.manufacturing.application.stages.services.model.ManuDeskVerificationTable;
import com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationImpl;
import com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationModelImpl;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManuDeskVerificationPersistence;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManuDeskVerificationUtil;
import com.nbp.manufacturing.application.stages.services.service.persistence.impl.constants.MANUFACTURING_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the manu desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManuDeskVerificationPersistence.class)
public class ManuDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<ManuDeskVerification>
	implements ManuDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManuDeskVerificationUtil</code> to access the manu desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManuDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath
		_finderPathWithPaginationFindBygetManuDeskVerificationByStatus_ApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetManuDeskVerificationByStatus_ApplicationId;
	private FinderPath
		_finderPathCountBygetManuDeskVerificationByStatus_ApplicationId;

	/**
	 * Returns all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId) {

		return findBygetManuDeskVerificationByStatus_ApplicationId(
			status, manufacturingApplicationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @return the range of matching manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId, int start,
			int end) {

		return findBygetManuDeskVerificationByStatus_ApplicationId(
			status, manufacturingApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId, int start, int end,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		return findBygetManuDeskVerificationByStatus_ApplicationId(
			status, manufacturingApplicationId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId, int start, int end,
			OrderByComparator<ManuDeskVerification> orderByComparator,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetManuDeskVerificationByStatus_ApplicationId;
				finderArgs = new Object[] {status, manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetManuDeskVerificationByStatus_ApplicationId;
			finderArgs = new Object[] {
				status, manufacturingApplicationId, start, end,
				orderByComparator
			};
		}

		List<ManuDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<ManuDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuDeskVerification manuDeskVerification : list) {
					if (!status.equals(manuDeskVerification.getStatus()) ||
						(manufacturingApplicationId !=
							manuDeskVerification.
								getManufacturingApplicationId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_MANUDESKVERIFICATION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuDeskVerification>)QueryUtil.list(
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
	 * Returns the first manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	@Override
	public ManuDeskVerification
			findBygetManuDeskVerificationByStatus_ApplicationId_First(
				String status, long manufacturingApplicationId,
				OrderByComparator<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException {

		ManuDeskVerification manuDeskVerification =
			fetchBygetManuDeskVerificationByStatus_ApplicationId_First(
				status, manufacturingApplicationId, orderByComparator);

		if (manuDeskVerification != null) {
			return manuDeskVerification;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	@Override
	public ManuDeskVerification
		fetchBygetManuDeskVerificationByStatus_ApplicationId_First(
			String status, long manufacturingApplicationId,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		List<ManuDeskVerification> list =
			findBygetManuDeskVerificationByStatus_ApplicationId(
				status, manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	@Override
	public ManuDeskVerification
			findBygetManuDeskVerificationByStatus_ApplicationId_Last(
				String status, long manufacturingApplicationId,
				OrderByComparator<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException {

		ManuDeskVerification manuDeskVerification =
			fetchBygetManuDeskVerificationByStatus_ApplicationId_Last(
				status, manufacturingApplicationId, orderByComparator);

		if (manuDeskVerification != null) {
			return manuDeskVerification;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	@Override
	public ManuDeskVerification
		fetchBygetManuDeskVerificationByStatus_ApplicationId_Last(
			String status, long manufacturingApplicationId,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		int count = countBygetManuDeskVerificationByStatus_ApplicationId(
			status, manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuDeskVerification> list =
			findBygetManuDeskVerificationByStatus_ApplicationId(
				status, manufacturingApplicationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu desk verifications before and after the current manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param manuDeskVerificationId the primary key of the current manu desk verification
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	@Override
	public ManuDeskVerification[]
			findBygetManuDeskVerificationByStatus_ApplicationId_PrevAndNext(
				long manuDeskVerificationId, String status,
				long manufacturingApplicationId,
				OrderByComparator<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException {

		status = Objects.toString(status, "");

		ManuDeskVerification manuDeskVerification = findByPrimaryKey(
			manuDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			ManuDeskVerification[] array = new ManuDeskVerificationImpl[3];

			array[0] =
				getBygetManuDeskVerificationByStatus_ApplicationId_PrevAndNext(
					session, manuDeskVerification, status,
					manufacturingApplicationId, orderByComparator, true);

			array[1] = manuDeskVerification;

			array[2] =
				getBygetManuDeskVerificationByStatus_ApplicationId_PrevAndNext(
					session, manuDeskVerification, status,
					manufacturingApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ManuDeskVerification
		getBygetManuDeskVerificationByStatus_ApplicationId_PrevAndNext(
			Session session, ManuDeskVerification manuDeskVerification,
			String status, long manufacturingApplicationId,
			OrderByComparator<ManuDeskVerification> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_MANUDESKVERIFICATION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(
				_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_MANUFACTURINGAPPLICATIONID_2);

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
			sb.append(ManuDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetManuDeskVerificationByStatus_ApplicationId(
		String status, long manufacturingApplicationId) {

		for (ManuDeskVerification manuDeskVerification :
				findBygetManuDeskVerificationByStatus_ApplicationId(
					status, manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuDeskVerification);
		}
	}

	/**
	 * Returns the number of manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu desk verifications
	 */
	@Override
	public int countBygetManuDeskVerificationByStatus_ApplicationId(
		String status, long manufacturingApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetManuDeskVerificationByStatus_ApplicationId;

		Object[] finderArgs = new Object[] {status, manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MANUDESKVERIFICATION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_2 =
			"manuDeskVerification.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_STATUS_3 =
			"(manuDeskVerification.status IS NULL OR manuDeskVerification.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMANUDESKVERIFICATIONBYSTATUS_APPLICATIONID_MANUFACTURINGAPPLICATIONID_2 =
			"manuDeskVerification.manufacturingApplicationId = ?";

	private FinderPath _finderPathFetchBygetManufactuirngById;
	private FinderPath _finderPathCountBygetManufactuirngById;

	/**
	 * Returns the manu desk verification where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuDeskVerificationException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	@Override
	public ManuDeskVerification findBygetManufactuirngById(
			long manufacturingApplicationId)
		throws NoSuchManuDeskVerificationException {

		ManuDeskVerification manuDeskVerification = fetchBygetManufactuirngById(
			manufacturingApplicationId);

		if (manuDeskVerification == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManuDeskVerificationException(sb.toString());
		}

		return manuDeskVerification;
	}

	/**
	 * Returns the manu desk verification where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	@Override
	public ManuDeskVerification fetchBygetManufactuirngById(
		long manufacturingApplicationId) {

		return fetchBygetManufactuirngById(manufacturingApplicationId, true);
	}

	/**
	 * Returns the manu desk verification where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	@Override
	public ManuDeskVerification fetchBygetManufactuirngById(
		long manufacturingApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {manufacturingApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufactuirngById, finderArgs, this);
		}

		if (result instanceof ManuDeskVerification) {
			ManuDeskVerification manuDeskVerification =
				(ManuDeskVerification)result;

			if (manufacturingApplicationId !=
					manuDeskVerification.getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUIRNGBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<ManuDeskVerification> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufactuirngById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									manufacturingApplicationId
								};
							}

							_log.warn(
								"ManuDeskVerificationPersistenceImpl.fetchBygetManufactuirngById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManuDeskVerification manuDeskVerification = list.get(0);

					result = manuDeskVerification;

					cacheResult(manuDeskVerification);
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
			return (ManuDeskVerification)result;
		}
	}

	/**
	 * Removes the manu desk verification where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu desk verification that was removed
	 */
	@Override
	public ManuDeskVerification removeBygetManufactuirngById(
			long manufacturingApplicationId)
		throws NoSuchManuDeskVerificationException {

		ManuDeskVerification manuDeskVerification = findBygetManufactuirngById(
			manufacturingApplicationId);

		return remove(manuDeskVerification);
	}

	/**
	 * Returns the number of manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu desk verifications
	 */
	@Override
	public int countBygetManufactuirngById(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetManufactuirngById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUIRNGBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMANUFACTUIRNGBYID_MANUFACTURINGAPPLICATIONID_2 =
			"manuDeskVerification.manufacturingApplicationId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetDeskVerificationManufactuirngById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetDeskVerificationManufactuirngById;
	private FinderPath _finderPathCountBygetDeskVerificationManufactuirngById;

	/**
	 * Returns all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId) {

		return findBygetDeskVerificationManufactuirngById(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @return the range of matching manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId, int start, int end) {

		return findBygetDeskVerificationManufactuirngById(
			manufacturingApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId, int start, int end,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		return findBygetDeskVerificationManufactuirngById(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId, int start, int end,
			OrderByComparator<ManuDeskVerification> orderByComparator,
			boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDeskVerificationManufactuirngById;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetDeskVerificationManufactuirngById;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ManuDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<ManuDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuDeskVerification manuDeskVerification : list) {
					if (manufacturingApplicationId !=
							manuDeskVerification.
								getManufacturingApplicationId()) {

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

			sb.append(_SQL_SELECT_MANUDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONMANUFACTUIRNGBYID_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuDeskVerification>)QueryUtil.list(
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
	 * Returns the first manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	@Override
	public ManuDeskVerification
			findBygetDeskVerificationManufactuirngById_First(
				long manufacturingApplicationId,
				OrderByComparator<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException {

		ManuDeskVerification manuDeskVerification =
			fetchBygetDeskVerificationManufactuirngById_First(
				manufacturingApplicationId, orderByComparator);

		if (manuDeskVerification != null) {
			return manuDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	@Override
	public ManuDeskVerification
		fetchBygetDeskVerificationManufactuirngById_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		List<ManuDeskVerification> list =
			findBygetDeskVerificationManufactuirngById(
				manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	@Override
	public ManuDeskVerification findBygetDeskVerificationManufactuirngById_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException {

		ManuDeskVerification manuDeskVerification =
			fetchBygetDeskVerificationManufactuirngById_Last(
				manufacturingApplicationId, orderByComparator);

		if (manuDeskVerification != null) {
			return manuDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	@Override
	public ManuDeskVerification
		fetchBygetDeskVerificationManufactuirngById_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		int count = countBygetDeskVerificationManufactuirngById(
			manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuDeskVerification> list =
			findBygetDeskVerificationManufactuirngById(
				manufacturingApplicationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu desk verifications before and after the current manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuDeskVerificationId the primary key of the current manu desk verification
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	@Override
	public ManuDeskVerification[]
			findBygetDeskVerificationManufactuirngById_PrevAndNext(
				long manuDeskVerificationId, long manufacturingApplicationId,
				OrderByComparator<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException {

		ManuDeskVerification manuDeskVerification = findByPrimaryKey(
			manuDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			ManuDeskVerification[] array = new ManuDeskVerificationImpl[3];

			array[0] = getBygetDeskVerificationManufactuirngById_PrevAndNext(
				session, manuDeskVerification, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = manuDeskVerification;

			array[2] = getBygetDeskVerificationManufactuirngById_PrevAndNext(
				session, manuDeskVerification, manufacturingApplicationId,
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

	protected ManuDeskVerification
		getBygetDeskVerificationManufactuirngById_PrevAndNext(
			Session session, ManuDeskVerification manuDeskVerification,
			long manufacturingApplicationId,
			OrderByComparator<ManuDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUDESKVERIFICATION_WHERE);

		sb.append(
			_FINDER_COLUMN_GETDESKVERIFICATIONMANUFACTUIRNGBYID_MANUFACTURINGAPPLICATIONID_2);

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
			sb.append(ManuDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu desk verifications where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetDeskVerificationManufactuirngById(
		long manufacturingApplicationId) {

		for (ManuDeskVerification manuDeskVerification :
				findBygetDeskVerificationManufactuirngById(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuDeskVerification);
		}
	}

	/**
	 * Returns the number of manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu desk verifications
	 */
	@Override
	public int countBygetDeskVerificationManufactuirngById(
		long manufacturingApplicationId) {

		FinderPath finderPath =
			_finderPathCountBygetDeskVerificationManufactuirngById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONMANUFACTUIRNGBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETDESKVERIFICATIONMANUFACTUIRNGBYID_MANUFACTURINGAPPLICATIONID_2 =
			"manuDeskVerification.manufacturingApplicationId = ?";

	public ManuDeskVerificationPersistenceImpl() {
		setModelClass(ManuDeskVerification.class);

		setModelImplClass(ManuDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(ManuDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the manu desk verification in the entity cache if it is enabled.
	 *
	 * @param manuDeskVerification the manu desk verification
	 */
	@Override
	public void cacheResult(ManuDeskVerification manuDeskVerification) {
		entityCache.putResult(
			ManuDeskVerificationImpl.class,
			manuDeskVerification.getPrimaryKey(), manuDeskVerification);

		finderCache.putResult(
			_finderPathFetchBygetManufactuirngById,
			new Object[] {manuDeskVerification.getManufacturingApplicationId()},
			manuDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manu desk verifications in the entity cache if it is enabled.
	 *
	 * @param manuDeskVerifications the manu desk verifications
	 */
	@Override
	public void cacheResult(List<ManuDeskVerification> manuDeskVerifications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manuDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManuDeskVerification manuDeskVerification :
				manuDeskVerifications) {

			if (entityCache.getResult(
					ManuDeskVerificationImpl.class,
					manuDeskVerification.getPrimaryKey()) == null) {

				cacheResult(manuDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all manu desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManuDeskVerificationImpl.class);

		finderCache.clearCache(ManuDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the manu desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ManuDeskVerification manuDeskVerification) {
		entityCache.removeResult(
			ManuDeskVerificationImpl.class, manuDeskVerification);
	}

	@Override
	public void clearCache(List<ManuDeskVerification> manuDeskVerifications) {
		for (ManuDeskVerification manuDeskVerification :
				manuDeskVerifications) {

			entityCache.removeResult(
				ManuDeskVerificationImpl.class, manuDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManuDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ManuDeskVerificationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManuDeskVerificationModelImpl manuDeskVerificationModelImpl) {

		Object[] args = new Object[] {
			manuDeskVerificationModelImpl.getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetManufactuirngById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufactuirngById, args,
			manuDeskVerificationModelImpl);
	}

	/**
	 * Creates a new manu desk verification with the primary key. Does not add the manu desk verification to the database.
	 *
	 * @param manuDeskVerificationId the primary key for the new manu desk verification
	 * @return the new manu desk verification
	 */
	@Override
	public ManuDeskVerification create(long manuDeskVerificationId) {
		ManuDeskVerification manuDeskVerification =
			new ManuDeskVerificationImpl();

		manuDeskVerification.setNew(true);
		manuDeskVerification.setPrimaryKey(manuDeskVerificationId);

		manuDeskVerification.setCompanyId(CompanyThreadLocal.getCompanyId());

		return manuDeskVerification;
	}

	/**
	 * Removes the manu desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification that was removed
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	@Override
	public ManuDeskVerification remove(long manuDeskVerificationId)
		throws NoSuchManuDeskVerificationException {

		return remove((Serializable)manuDeskVerificationId);
	}

	/**
	 * Removes the manu desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manu desk verification
	 * @return the manu desk verification that was removed
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	@Override
	public ManuDeskVerification remove(Serializable primaryKey)
		throws NoSuchManuDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			ManuDeskVerification manuDeskVerification =
				(ManuDeskVerification)session.get(
					ManuDeskVerificationImpl.class, primaryKey);

			if (manuDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManuDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manuDeskVerification);
		}
		catch (NoSuchManuDeskVerificationException noSuchEntityException) {
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
	protected ManuDeskVerification removeImpl(
		ManuDeskVerification manuDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manuDeskVerification)) {
				manuDeskVerification = (ManuDeskVerification)session.get(
					ManuDeskVerificationImpl.class,
					manuDeskVerification.getPrimaryKeyObj());
			}

			if (manuDeskVerification != null) {
				session.delete(manuDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manuDeskVerification != null) {
			clearCache(manuDeskVerification);
		}

		return manuDeskVerification;
	}

	@Override
	public ManuDeskVerification updateImpl(
		ManuDeskVerification manuDeskVerification) {

		boolean isNew = manuDeskVerification.isNew();

		if (!(manuDeskVerification instanceof ManuDeskVerificationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(manuDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					manuDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manuDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManuDeskVerification implementation " +
					manuDeskVerification.getClass());
		}

		ManuDeskVerificationModelImpl manuDeskVerificationModelImpl =
			(ManuDeskVerificationModelImpl)manuDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manuDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				manuDeskVerification.setCreateDate(date);
			}
			else {
				manuDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manuDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manuDeskVerification.setModifiedDate(date);
			}
			else {
				manuDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manuDeskVerification);
			}
			else {
				manuDeskVerification = (ManuDeskVerification)session.merge(
					manuDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManuDeskVerificationImpl.class, manuDeskVerificationModelImpl,
			false, true);

		cacheUniqueFindersCache(manuDeskVerificationModelImpl);

		if (isNew) {
			manuDeskVerification.setNew(false);
		}

		manuDeskVerification.resetOriginalValues();

		return manuDeskVerification;
	}

	/**
	 * Returns the manu desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manu desk verification
	 * @return the manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	@Override
	public ManuDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManuDeskVerificationException {

		ManuDeskVerification manuDeskVerification = fetchByPrimaryKey(
			primaryKey);

		if (manuDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManuDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manuDeskVerification;
	}

	/**
	 * Returns the manu desk verification with the primary key or throws a <code>NoSuchManuDeskVerificationException</code> if it could not be found.
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	@Override
	public ManuDeskVerification findByPrimaryKey(long manuDeskVerificationId)
		throws NoSuchManuDeskVerificationException {

		return findByPrimaryKey((Serializable)manuDeskVerificationId);
	}

	/**
	 * Returns the manu desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification, or <code>null</code> if a manu desk verification with the primary key could not be found
	 */
	@Override
	public ManuDeskVerification fetchByPrimaryKey(long manuDeskVerificationId) {
		return fetchByPrimaryKey((Serializable)manuDeskVerificationId);
	}

	/**
	 * Returns all the manu desk verifications.
	 *
	 * @return the manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @return the range of manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification> findAll(
		int start, int end,
		OrderByComparator<ManuDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu desk verifications
	 */
	@Override
	public List<ManuDeskVerification> findAll(
		int start, int end,
		OrderByComparator<ManuDeskVerification> orderByComparator,
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

		List<ManuDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<ManuDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUDESKVERIFICATION;

				sql = sql.concat(ManuDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManuDeskVerification>)QueryUtil.list(
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
	 * Removes all the manu desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManuDeskVerification manuDeskVerification : findAll()) {
			remove(manuDeskVerification);
		}
	}

	/**
	 * Returns the number of manu desk verifications.
	 *
	 * @return the number of manu desk verifications
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
					_SQL_COUNT_MANUDESKVERIFICATION);

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
		return "manuDeskVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManuDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manu desk verification persistence.
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

		_finderPathWithPaginationFindBygetManuDeskVerificationByStatus_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetManuDeskVerificationByStatus_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetManuDeskVerificationByStatus_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetManuDeskVerificationByStatus_ApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "manufacturingApplicationId"}, true);

		_finderPathCountBygetManuDeskVerificationByStatus_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetManuDeskVerificationByStatus_ApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "manufacturingApplicationId"}, false);

		_finderPathFetchBygetManufactuirngById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufactuirngById",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetManufactuirngById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufactuirngById", new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetDeskVerificationManufactuirngById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetDeskVerificationManufactuirngById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetDeskVerificationManufactuirngById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetDeskVerificationManufactuirngById",
				new String[] {Long.class.getName()},
				new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetDeskVerificationManufactuirngById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDeskVerificationManufactuirngById",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		ManuDeskVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManuDeskVerificationUtil.setPersistence(null);

		entityCache.removeCache(ManuDeskVerificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUDESKVERIFICATION =
		"SELECT manuDeskVerification FROM ManuDeskVerification manuDeskVerification";

	private static final String _SQL_SELECT_MANUDESKVERIFICATION_WHERE =
		"SELECT manuDeskVerification FROM ManuDeskVerification manuDeskVerification WHERE ";

	private static final String _SQL_COUNT_MANUDESKVERIFICATION =
		"SELECT COUNT(manuDeskVerification) FROM ManuDeskVerification manuDeskVerification";

	private static final String _SQL_COUNT_MANUDESKVERIFICATION_WHERE =
		"SELECT COUNT(manuDeskVerification) FROM ManuDeskVerification manuDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"manuDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManuDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManuDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManuDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}