/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence.impl;

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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationCertificateIssuanceException;
import com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance;
import com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuanceTable;
import com.nbp.mining.stage.service.model.impl.MiningApplicationCertificateIssuanceImpl;
import com.nbp.mining.stage.service.model.impl.MiningApplicationCertificateIssuanceModelImpl;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationCertificateIssuancePersistence;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationCertificateIssuanceUtil;
import com.nbp.mining.stage.service.service.persistence.impl.constants.MINING_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
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
 * The persistence implementation for the mining application certificate issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningApplicationCertificateIssuancePersistence.class)
public class MiningApplicationCertificateIssuancePersistenceImpl
	extends BasePersistenceImpl<MiningApplicationCertificateIssuance>
	implements MiningApplicationCertificateIssuancePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningApplicationCertificateIssuanceUtil</code> to access the mining application certificate issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningApplicationCertificateIssuanceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the mining application certificate issuances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application certificate issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @return the range of matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application certificate issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application certificate issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<MiningApplicationCertificateIssuance> list = null;

		if (useFinderCache) {
			list =
				(List<MiningApplicationCertificateIssuance>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningApplicationCertificateIssuance
						miningApplicationCertificateIssuance : list) {

					if (!uuid.equals(
							miningApplicationCertificateIssuance.getUuid())) {

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

			sb.append(_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					MiningApplicationCertificateIssuanceModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list =
					(List<MiningApplicationCertificateIssuance>)QueryUtil.list(
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
	 * Returns the first mining application certificate issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance findByUuid_First(
			String uuid,
			OrderByComparator<MiningApplicationCertificateIssuance>
				orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = fetchByUuid_First(
				uuid, orderByComparator);

		if (miningApplicationCertificateIssuance != null) {
			return miningApplicationCertificateIssuance;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMiningApplicationCertificateIssuanceException(
			sb.toString());
	}

	/**
	 * Returns the first mining application certificate issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance fetchByUuid_First(
		String uuid,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator) {

		List<MiningApplicationCertificateIssuance> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining application certificate issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance findByUuid_Last(
			String uuid,
			OrderByComparator<MiningApplicationCertificateIssuance>
				orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = fetchByUuid_Last(
				uuid, orderByComparator);

		if (miningApplicationCertificateIssuance != null) {
			return miningApplicationCertificateIssuance;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMiningApplicationCertificateIssuanceException(
			sb.toString());
	}

	/**
	 * Returns the last mining application certificate issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance fetchByUuid_Last(
		String uuid,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MiningApplicationCertificateIssuance> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining application certificate issuances before and after the current mining application certificate issuance in the ordered set where uuid = &#63;.
	 *
	 * @param miningCertIssuId the primary key of the current mining application certificate issuance
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance[] findByUuid_PrevAndNext(
			long miningCertIssuId, String uuid,
			OrderByComparator<MiningApplicationCertificateIssuance>
				orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		uuid = Objects.toString(uuid, "");

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = findByPrimaryKey(
				miningCertIssuId);

		Session session = null;

		try {
			session = openSession();

			MiningApplicationCertificateIssuance[] array =
				new MiningApplicationCertificateIssuanceImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, miningApplicationCertificateIssuance, uuid,
				orderByComparator, true);

			array[1] = miningApplicationCertificateIssuance;

			array[2] = getByUuid_PrevAndNext(
				session, miningApplicationCertificateIssuance, uuid,
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

	protected MiningApplicationCertificateIssuance getByUuid_PrevAndNext(
		Session session,
		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance,
		String uuid,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator,
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

		sb.append(_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

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
			sb.append(
				MiningApplicationCertificateIssuanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						miningApplicationCertificateIssuance)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningApplicationCertificateIssuance> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining application certificate issuances where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MiningApplicationCertificateIssuance
				miningApplicationCertificateIssuance :
					findByUuid(
						uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miningApplicationCertificateIssuance);
		}
	}

	/**
	 * Returns the number of mining application certificate issuances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining application certificate issuances
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"miningApplicationCertificateIssuance.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(miningApplicationCertificateIssuance.uuid IS NULL OR miningApplicationCertificateIssuance.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the mining application certificate issuance where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningApplicationCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance findByUUID_G(
			String uuid, long groupId)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = fetchByUUID_G(uuid, groupId);

		if (miningApplicationCertificateIssuance == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningApplicationCertificateIssuanceException(
				sb.toString());
		}

		return miningApplicationCertificateIssuance;
	}

	/**
	 * Returns the mining application certificate issuance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the mining application certificate issuance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof MiningApplicationCertificateIssuance) {
			MiningApplicationCertificateIssuance
				miningApplicationCertificateIssuance =
					(MiningApplicationCertificateIssuance)result;

			if (!Objects.equals(
					uuid, miningApplicationCertificateIssuance.getUuid()) ||
				(groupId !=
					miningApplicationCertificateIssuance.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<MiningApplicationCertificateIssuance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MiningApplicationCertificateIssuance
						miningApplicationCertificateIssuance = list.get(0);

					result = miningApplicationCertificateIssuance;

					cacheResult(miningApplicationCertificateIssuance);
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
			return (MiningApplicationCertificateIssuance)result;
		}
	}

	/**
	 * Removes the mining application certificate issuance where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining application certificate issuance that was removed
	 */
	@Override
	public MiningApplicationCertificateIssuance removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = findByUUID_G(uuid, groupId);

		return remove(miningApplicationCertificateIssuance);
	}

	/**
	 * Returns the number of mining application certificate issuances where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining application certificate issuances
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"miningApplicationCertificateIssuance.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(miningApplicationCertificateIssuance.uuid IS NULL OR miningApplicationCertificateIssuance.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"miningApplicationCertificateIssuance.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the mining application certificate issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application certificate issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @return the range of matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application certificate issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application certificate issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<MiningApplicationCertificateIssuance> list = null;

		if (useFinderCache) {
			list =
				(List<MiningApplicationCertificateIssuance>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningApplicationCertificateIssuance
						miningApplicationCertificateIssuance : list) {

					if (!uuid.equals(
							miningApplicationCertificateIssuance.getUuid()) ||
						(companyId !=
							miningApplicationCertificateIssuance.
								getCompanyId())) {

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

			sb.append(_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					MiningApplicationCertificateIssuanceModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list =
					(List<MiningApplicationCertificateIssuance>)QueryUtil.list(
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
	 * Returns the first mining application certificate issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationCertificateIssuance>
				orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = fetchByUuid_C_First(
				uuid, companyId, orderByComparator);

		if (miningApplicationCertificateIssuance != null) {
			return miningApplicationCertificateIssuance;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMiningApplicationCertificateIssuanceException(
			sb.toString());
	}

	/**
	 * Returns the first mining application certificate issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator) {

		List<MiningApplicationCertificateIssuance> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining application certificate issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationCertificateIssuance>
				orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = fetchByUuid_C_Last(
				uuid, companyId, orderByComparator);

		if (miningApplicationCertificateIssuance != null) {
			return miningApplicationCertificateIssuance;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMiningApplicationCertificateIssuanceException(
			sb.toString());
	}

	/**
	 * Returns the last mining application certificate issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MiningApplicationCertificateIssuance> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining application certificate issuances before and after the current mining application certificate issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miningCertIssuId the primary key of the current mining application certificate issuance
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance[] findByUuid_C_PrevAndNext(
			long miningCertIssuId, String uuid, long companyId,
			OrderByComparator<MiningApplicationCertificateIssuance>
				orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		uuid = Objects.toString(uuid, "");

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = findByPrimaryKey(
				miningCertIssuId);

		Session session = null;

		try {
			session = openSession();

			MiningApplicationCertificateIssuance[] array =
				new MiningApplicationCertificateIssuanceImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, miningApplicationCertificateIssuance, uuid, companyId,
				orderByComparator, true);

			array[1] = miningApplicationCertificateIssuance;

			array[2] = getByUuid_C_PrevAndNext(
				session, miningApplicationCertificateIssuance, uuid, companyId,
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

	protected MiningApplicationCertificateIssuance getByUuid_C_PrevAndNext(
		Session session,
		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance,
		String uuid, long companyId,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator,
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

		sb.append(_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			sb.append(
				MiningApplicationCertificateIssuanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						miningApplicationCertificateIssuance)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningApplicationCertificateIssuance> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining application certificate issuances where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MiningApplicationCertificateIssuance
				miningApplicationCertificateIssuance :
					findByUuid_C(
						uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
						null)) {

			remove(miningApplicationCertificateIssuance);
		}
	}

	/**
	 * Returns the number of mining application certificate issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining application certificate issuances
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"miningApplicationCertificateIssuance.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(miningApplicationCertificateIssuance.uuid IS NULL OR miningApplicationCertificateIssuance.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"miningApplicationCertificateIssuance.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMining_APP_List_By_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMining_APP_List_By_CI;
	private FinderPath _finderPathCountBygetMining_APP_List_By_CI;

	/**
	 * Returns all the mining application certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance>
		findBygetMining_APP_List_By_CI(String caseId) {

		return findBygetMining_APP_List_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application certificate issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @return the range of matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance>
		findBygetMining_APP_List_By_CI(String caseId, int start, int end) {

		return findBygetMining_APP_List_By_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application certificate issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			OrderByComparator<MiningApplicationCertificateIssuance>
				orderByComparator) {

		return findBygetMining_APP_List_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application certificate issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			OrderByComparator<MiningApplicationCertificateIssuance>
				orderByComparator,
			boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMining_APP_List_By_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMining_APP_List_By_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<MiningApplicationCertificateIssuance> list = null;

		if (useFinderCache) {
			list =
				(List<MiningApplicationCertificateIssuance>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningApplicationCertificateIssuance
						miningApplicationCertificateIssuance : list) {

					if (!caseId.equals(
							miningApplicationCertificateIssuance.getCaseId())) {

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

			sb.append(_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_APP_LIST_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMINING_APP_LIST_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					MiningApplicationCertificateIssuanceModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list =
					(List<MiningApplicationCertificateIssuance>)QueryUtil.list(
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
	 * Returns the first mining application certificate issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance
			findBygetMining_APP_List_By_CI_First(
				String caseId,
				OrderByComparator<MiningApplicationCertificateIssuance>
					orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance =
				fetchBygetMining_APP_List_By_CI_First(
					caseId, orderByComparator);

		if (miningApplicationCertificateIssuance != null) {
			return miningApplicationCertificateIssuance;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMiningApplicationCertificateIssuanceException(
			sb.toString());
	}

	/**
	 * Returns the first mining application certificate issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance
		fetchBygetMining_APP_List_By_CI_First(
			String caseId,
			OrderByComparator<MiningApplicationCertificateIssuance>
				orderByComparator) {

		List<MiningApplicationCertificateIssuance> list =
			findBygetMining_APP_List_By_CI(caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining application certificate issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance
			findBygetMining_APP_List_By_CI_Last(
				String caseId,
				OrderByComparator<MiningApplicationCertificateIssuance>
					orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance =
				fetchBygetMining_APP_List_By_CI_Last(caseId, orderByComparator);

		if (miningApplicationCertificateIssuance != null) {
			return miningApplicationCertificateIssuance;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMiningApplicationCertificateIssuanceException(
			sb.toString());
	}

	/**
	 * Returns the last mining application certificate issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance
		fetchBygetMining_APP_List_By_CI_Last(
			String caseId,
			OrderByComparator<MiningApplicationCertificateIssuance>
				orderByComparator) {

		int count = countBygetMining_APP_List_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<MiningApplicationCertificateIssuance> list =
			findBygetMining_APP_List_By_CI(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining application certificate issuances before and after the current mining application certificate issuance in the ordered set where caseId = &#63;.
	 *
	 * @param miningCertIssuId the primary key of the current mining application certificate issuance
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance[]
			findBygetMining_APP_List_By_CI_PrevAndNext(
				long miningCertIssuId, String caseId,
				OrderByComparator<MiningApplicationCertificateIssuance>
					orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		caseId = Objects.toString(caseId, "");

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = findByPrimaryKey(
				miningCertIssuId);

		Session session = null;

		try {
			session = openSession();

			MiningApplicationCertificateIssuance[] array =
				new MiningApplicationCertificateIssuanceImpl[3];

			array[0] = getBygetMining_APP_List_By_CI_PrevAndNext(
				session, miningApplicationCertificateIssuance, caseId,
				orderByComparator, true);

			array[1] = miningApplicationCertificateIssuance;

			array[2] = getBygetMining_APP_List_By_CI_PrevAndNext(
				session, miningApplicationCertificateIssuance, caseId,
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

	protected MiningApplicationCertificateIssuance
		getBygetMining_APP_List_By_CI_PrevAndNext(
			Session session,
			MiningApplicationCertificateIssuance
				miningApplicationCertificateIssuance,
			String caseId,
			OrderByComparator<MiningApplicationCertificateIssuance>
				orderByComparator,
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

		sb.append(_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMINING_APP_LIST_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMINING_APP_LIST_BY_CI_CASEID_2);
		}

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
			sb.append(
				MiningApplicationCertificateIssuanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						miningApplicationCertificateIssuance)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningApplicationCertificateIssuance> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining application certificate issuances where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMining_APP_List_By_CI(String caseId) {
		for (MiningApplicationCertificateIssuance
				miningApplicationCertificateIssuance :
					findBygetMining_APP_List_By_CI(
						caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miningApplicationCertificateIssuance);
		}
	}

	/**
	 * Returns the number of mining application certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application certificate issuances
	 */
	@Override
	public int countBygetMining_APP_List_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMining_APP_List_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_APP_LIST_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMINING_APP_LIST_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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
		_FINDER_COLUMN_GETMINING_APP_LIST_BY_CI_CASEID_2 =
			"miningApplicationCertificateIssuance.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETMINING_APP_LIST_BY_CI_CASEID_3 =
			"(miningApplicationCertificateIssuance.caseId IS NULL OR miningApplicationCertificateIssuance.caseId = '')";

	private FinderPath _finderPathFetchBygetMining_APP_By_CI;
	private FinderPath _finderPathCountBygetMining_APP_By_CI;

	/**
	 * Returns the mining application certificate issuance where caseId = &#63; or throws a <code>NoSuchMiningApplicationCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance findBygetMining_APP_By_CI(
			String caseId)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = fetchBygetMining_APP_By_CI(
				caseId);

		if (miningApplicationCertificateIssuance == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningApplicationCertificateIssuanceException(
				sb.toString());
		}

		return miningApplicationCertificateIssuance;
	}

	/**
	 * Returns the mining application certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance fetchBygetMining_APP_By_CI(
		String caseId) {

		return fetchBygetMining_APP_By_CI(caseId, true);
	}

	/**
	 * Returns the mining application certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance fetchBygetMining_APP_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMining_APP_By_CI, finderArgs, this);
		}

		if (result instanceof MiningApplicationCertificateIssuance) {
			MiningApplicationCertificateIssuance
				miningApplicationCertificateIssuance =
					(MiningApplicationCertificateIssuance)result;

			if (!Objects.equals(
					caseId, miningApplicationCertificateIssuance.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_APP_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMINING_APP_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<MiningApplicationCertificateIssuance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMining_APP_By_CI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"MiningApplicationCertificateIssuancePersistenceImpl.fetchBygetMining_APP_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningApplicationCertificateIssuance
						miningApplicationCertificateIssuance = list.get(0);

					result = miningApplicationCertificateIssuance;

					cacheResult(miningApplicationCertificateIssuance);
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
			return (MiningApplicationCertificateIssuance)result;
		}
	}

	/**
	 * Removes the mining application certificate issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining application certificate issuance that was removed
	 */
	@Override
	public MiningApplicationCertificateIssuance removeBygetMining_APP_By_CI(
			String caseId)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = findBygetMining_APP_By_CI(
				caseId);

		return remove(miningApplicationCertificateIssuance);
	}

	/**
	 * Returns the number of mining application certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application certificate issuances
	 */
	@Override
	public int countBygetMining_APP_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMining_APP_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMINING_APP_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMINING_APP_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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

	private static final String _FINDER_COLUMN_GETMINING_APP_BY_CI_CASEID_2 =
		"miningApplicationCertificateIssuance.caseId = ?";

	private static final String _FINDER_COLUMN_GETMINING_APP_BY_CI_CASEID_3 =
		"(miningApplicationCertificateIssuance.caseId IS NULL OR miningApplicationCertificateIssuance.caseId = '')";

	private FinderPath _finderPathFetchBygetMining_APP_By_CN;
	private FinderPath _finderPathCountBygetMining_APP_By_CN;

	/**
	 * Returns the mining application certificate issuance where certificateNumber = &#63; or throws a <code>NoSuchMiningApplicationCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param certificateNumber the certificate number
	 * @return the matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance findBygetMining_APP_By_CN(
			String certificateNumber)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = fetchBygetMining_APP_By_CN(
				certificateNumber);

		if (miningApplicationCertificateIssuance == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("certificateNumber=");
			sb.append(certificateNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningApplicationCertificateIssuanceException(
				sb.toString());
		}

		return miningApplicationCertificateIssuance;
	}

	/**
	 * Returns the mining application certificate issuance where certificateNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param certificateNumber the certificate number
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance fetchBygetMining_APP_By_CN(
		String certificateNumber) {

		return fetchBygetMining_APP_By_CN(certificateNumber, true);
	}

	/**
	 * Returns the mining application certificate issuance where certificateNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param certificateNumber the certificate number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance fetchBygetMining_APP_By_CN(
		String certificateNumber, boolean useFinderCache) {

		certificateNumber = Objects.toString(certificateNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {certificateNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMining_APP_By_CN, finderArgs, this);
		}

		if (result instanceof MiningApplicationCertificateIssuance) {
			MiningApplicationCertificateIssuance
				miningApplicationCertificateIssuance =
					(MiningApplicationCertificateIssuance)result;

			if (!Objects.equals(
					certificateNumber,
					miningApplicationCertificateIssuance.
						getCertificateNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindCertificateNumber = false;

			if (certificateNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_APP_BY_CN_CERTIFICATENUMBER_3);
			}
			else {
				bindCertificateNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_APP_BY_CN_CERTIFICATENUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCertificateNumber) {
					queryPos.add(certificateNumber);
				}

				List<MiningApplicationCertificateIssuance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMining_APP_By_CN, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {certificateNumber};
							}

							_log.warn(
								"MiningApplicationCertificateIssuancePersistenceImpl.fetchBygetMining_APP_By_CN(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningApplicationCertificateIssuance
						miningApplicationCertificateIssuance = list.get(0);

					result = miningApplicationCertificateIssuance;

					cacheResult(miningApplicationCertificateIssuance);
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
			return (MiningApplicationCertificateIssuance)result;
		}
	}

	/**
	 * Removes the mining application certificate issuance where certificateNumber = &#63; from the database.
	 *
	 * @param certificateNumber the certificate number
	 * @return the mining application certificate issuance that was removed
	 */
	@Override
	public MiningApplicationCertificateIssuance removeBygetMining_APP_By_CN(
			String certificateNumber)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = findBygetMining_APP_By_CN(
				certificateNumber);

		return remove(miningApplicationCertificateIssuance);
	}

	/**
	 * Returns the number of mining application certificate issuances where certificateNumber = &#63;.
	 *
	 * @param certificateNumber the certificate number
	 * @return the number of matching mining application certificate issuances
	 */
	@Override
	public int countBygetMining_APP_By_CN(String certificateNumber) {
		certificateNumber = Objects.toString(certificateNumber, "");

		FinderPath finderPath = _finderPathCountBygetMining_APP_By_CN;

		Object[] finderArgs = new Object[] {certificateNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE);

			boolean bindCertificateNumber = false;

			if (certificateNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMINING_APP_BY_CN_CERTIFICATENUMBER_3);
			}
			else {
				bindCertificateNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMINING_APP_BY_CN_CERTIFICATENUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCertificateNumber) {
					queryPos.add(certificateNumber);
				}

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
		_FINDER_COLUMN_GETMINING_APP_BY_CN_CERTIFICATENUMBER_2 =
			"miningApplicationCertificateIssuance.certificateNumber = ?";

	private static final String
		_FINDER_COLUMN_GETMINING_APP_BY_CN_CERTIFICATENUMBER_3 =
			"(miningApplicationCertificateIssuance.certificateNumber IS NULL OR miningApplicationCertificateIssuance.certificateNumber = '')";

	public MiningApplicationCertificateIssuancePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MiningApplicationCertificateIssuance.class);

		setModelImplClass(MiningApplicationCertificateIssuanceImpl.class);
		setModelPKClass(long.class);

		setTable(MiningApplicationCertificateIssuanceTable.INSTANCE);
	}

	/**
	 * Caches the mining application certificate issuance in the entity cache if it is enabled.
	 *
	 * @param miningApplicationCertificateIssuance the mining application certificate issuance
	 */
	@Override
	public void cacheResult(
		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance) {

		entityCache.putResult(
			MiningApplicationCertificateIssuanceImpl.class,
			miningApplicationCertificateIssuance.getPrimaryKey(),
			miningApplicationCertificateIssuance);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				miningApplicationCertificateIssuance.getUuid(),
				miningApplicationCertificateIssuance.getGroupId()
			},
			miningApplicationCertificateIssuance);

		finderCache.putResult(
			_finderPathFetchBygetMining_APP_By_CI,
			new Object[] {miningApplicationCertificateIssuance.getCaseId()},
			miningApplicationCertificateIssuance);

		finderCache.putResult(
			_finderPathFetchBygetMining_APP_By_CN,
			new Object[] {
				miningApplicationCertificateIssuance.getCertificateNumber()
			},
			miningApplicationCertificateIssuance);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining application certificate issuances in the entity cache if it is enabled.
	 *
	 * @param miningApplicationCertificateIssuances the mining application certificate issuances
	 */
	@Override
	public void cacheResult(
		List<MiningApplicationCertificateIssuance>
			miningApplicationCertificateIssuances) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningApplicationCertificateIssuances.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningApplicationCertificateIssuance
				miningApplicationCertificateIssuance :
					miningApplicationCertificateIssuances) {

			if (entityCache.getResult(
					MiningApplicationCertificateIssuanceImpl.class,
					miningApplicationCertificateIssuance.getPrimaryKey()) ==
						null) {

				cacheResult(miningApplicationCertificateIssuance);
			}
		}
	}

	/**
	 * Clears the cache for all mining application certificate issuances.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningApplicationCertificateIssuanceImpl.class);

		finderCache.clearCache(MiningApplicationCertificateIssuanceImpl.class);
	}

	/**
	 * Clears the cache for the mining application certificate issuance.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance) {

		entityCache.removeResult(
			MiningApplicationCertificateIssuanceImpl.class,
			miningApplicationCertificateIssuance);
	}

	@Override
	public void clearCache(
		List<MiningApplicationCertificateIssuance>
			miningApplicationCertificateIssuances) {

		for (MiningApplicationCertificateIssuance
				miningApplicationCertificateIssuance :
					miningApplicationCertificateIssuances) {

			entityCache.removeResult(
				MiningApplicationCertificateIssuanceImpl.class,
				miningApplicationCertificateIssuance);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningApplicationCertificateIssuanceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiningApplicationCertificateIssuanceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiningApplicationCertificateIssuanceModelImpl
			miningApplicationCertificateIssuanceModelImpl) {

		Object[] args = new Object[] {
			miningApplicationCertificateIssuanceModelImpl.getUuid(),
			miningApplicationCertificateIssuanceModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			miningApplicationCertificateIssuanceModelImpl);

		args = new Object[] {
			miningApplicationCertificateIssuanceModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetMining_APP_By_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMining_APP_By_CI, args,
			miningApplicationCertificateIssuanceModelImpl);

		args = new Object[] {
			miningApplicationCertificateIssuanceModelImpl.getCertificateNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetMining_APP_By_CN, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMining_APP_By_CN, args,
			miningApplicationCertificateIssuanceModelImpl);
	}

	/**
	 * Creates a new mining application certificate issuance with the primary key. Does not add the mining application certificate issuance to the database.
	 *
	 * @param miningCertIssuId the primary key for the new mining application certificate issuance
	 * @return the new mining application certificate issuance
	 */
	@Override
	public MiningApplicationCertificateIssuance create(long miningCertIssuId) {
		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance =
				new MiningApplicationCertificateIssuanceImpl();

		miningApplicationCertificateIssuance.setNew(true);
		miningApplicationCertificateIssuance.setPrimaryKey(miningCertIssuId);

		String uuid = PortalUUIDUtil.generate();

		miningApplicationCertificateIssuance.setUuid(uuid);

		miningApplicationCertificateIssuance.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return miningApplicationCertificateIssuance;
	}

	/**
	 * Removes the mining application certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningCertIssuId the primary key of the mining application certificate issuance
	 * @return the mining application certificate issuance that was removed
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance remove(long miningCertIssuId)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		return remove((Serializable)miningCertIssuId);
	}

	/**
	 * Removes the mining application certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining application certificate issuance
	 * @return the mining application certificate issuance that was removed
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance remove(Serializable primaryKey)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		Session session = null;

		try {
			session = openSession();

			MiningApplicationCertificateIssuance
				miningApplicationCertificateIssuance =
					(MiningApplicationCertificateIssuance)session.get(
						MiningApplicationCertificateIssuanceImpl.class,
						primaryKey);

			if (miningApplicationCertificateIssuance == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningApplicationCertificateIssuanceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningApplicationCertificateIssuance);
		}
		catch (NoSuchMiningApplicationCertificateIssuanceException
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
	protected MiningApplicationCertificateIssuance removeImpl(
		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningApplicationCertificateIssuance)) {
				miningApplicationCertificateIssuance =
					(MiningApplicationCertificateIssuance)session.get(
						MiningApplicationCertificateIssuanceImpl.class,
						miningApplicationCertificateIssuance.
							getPrimaryKeyObj());
			}

			if (miningApplicationCertificateIssuance != null) {
				session.delete(miningApplicationCertificateIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningApplicationCertificateIssuance != null) {
			clearCache(miningApplicationCertificateIssuance);
		}

		return miningApplicationCertificateIssuance;
	}

	@Override
	public MiningApplicationCertificateIssuance updateImpl(
		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance) {

		boolean isNew = miningApplicationCertificateIssuance.isNew();

		if (!(miningApplicationCertificateIssuance instanceof
				MiningApplicationCertificateIssuanceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					miningApplicationCertificateIssuance.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					miningApplicationCertificateIssuance);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningApplicationCertificateIssuance proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningApplicationCertificateIssuance implementation " +
					miningApplicationCertificateIssuance.getClass());
		}

		MiningApplicationCertificateIssuanceModelImpl
			miningApplicationCertificateIssuanceModelImpl =
				(MiningApplicationCertificateIssuanceModelImpl)
					miningApplicationCertificateIssuance;

		if (Validator.isNull(miningApplicationCertificateIssuance.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			miningApplicationCertificateIssuance.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(miningApplicationCertificateIssuance.getCreateDate() == null)) {

			if (serviceContext == null) {
				miningApplicationCertificateIssuance.setCreateDate(date);
			}
			else {
				miningApplicationCertificateIssuance.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningApplicationCertificateIssuanceModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				miningApplicationCertificateIssuance.setModifiedDate(date);
			}
			else {
				miningApplicationCertificateIssuance.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningApplicationCertificateIssuance);
			}
			else {
				miningApplicationCertificateIssuance =
					(MiningApplicationCertificateIssuance)session.merge(
						miningApplicationCertificateIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningApplicationCertificateIssuanceImpl.class,
			miningApplicationCertificateIssuanceModelImpl, false, true);

		cacheUniqueFindersCache(miningApplicationCertificateIssuanceModelImpl);

		if (isNew) {
			miningApplicationCertificateIssuance.setNew(false);
		}

		miningApplicationCertificateIssuance.resetOriginalValues();

		return miningApplicationCertificateIssuance;
	}

	/**
	 * Returns the mining application certificate issuance with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining application certificate issuance
	 * @return the mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance = fetchByPrimaryKey(
				primaryKey);

		if (miningApplicationCertificateIssuance == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningApplicationCertificateIssuanceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningApplicationCertificateIssuance;
	}

	/**
	 * Returns the mining application certificate issuance with the primary key or throws a <code>NoSuchMiningApplicationCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param miningCertIssuId the primary key of the mining application certificate issuance
	 * @return the mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance findByPrimaryKey(
			long miningCertIssuId)
		throws NoSuchMiningApplicationCertificateIssuanceException {

		return findByPrimaryKey((Serializable)miningCertIssuId);
	}

	/**
	 * Returns the mining application certificate issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningCertIssuId the primary key of the mining application certificate issuance
	 * @return the mining application certificate issuance, or <code>null</code> if a mining application certificate issuance with the primary key could not be found
	 */
	@Override
	public MiningApplicationCertificateIssuance fetchByPrimaryKey(
		long miningCertIssuId) {

		return fetchByPrimaryKey((Serializable)miningCertIssuId);
	}

	/**
	 * Returns all the mining application certificate issuances.
	 *
	 * @return the mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @return the range of mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application certificate issuances
	 */
	@Override
	public List<MiningApplicationCertificateIssuance> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationCertificateIssuance>
			orderByComparator,
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

		List<MiningApplicationCertificateIssuance> list = null;

		if (useFinderCache) {
			list =
				(List<MiningApplicationCertificateIssuance>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE;

				sql = sql.concat(
					MiningApplicationCertificateIssuanceModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<MiningApplicationCertificateIssuance>)QueryUtil.list(
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
	 * Removes all the mining application certificate issuances from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningApplicationCertificateIssuance
				miningApplicationCertificateIssuance : findAll()) {

			remove(miningApplicationCertificateIssuance);
		}
	}

	/**
	 * Returns the number of mining application certificate issuances.
	 *
	 * @return the number of mining application certificate issuances
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
					_SQL_COUNT_MININGAPPLICATIONCERTIFICATEISSUANCE);

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
		return "miningCertIssuId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningApplicationCertificateIssuanceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining application certificate issuance persistence.
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

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindBygetMining_APP_List_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMining_APP_List_By_CI",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetMining_APP_List_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMining_APP_List_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetMining_APP_List_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMining_APP_List_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetMining_APP_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMining_APP_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMining_APP_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMining_APP_By_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchBygetMining_APP_By_CN = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMining_APP_By_CN",
			new String[] {String.class.getName()},
			new String[] {"certificateNumber"}, true);

		_finderPathCountBygetMining_APP_By_CN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMining_APP_By_CN", new String[] {String.class.getName()},
			new String[] {"certificateNumber"}, false);

		MiningApplicationCertificateIssuanceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningApplicationCertificateIssuanceUtil.setPersistence(null);

		entityCache.removeCache(
			MiningApplicationCertificateIssuanceImpl.class.getName());
	}

	@Override
	@Reference(
		target = MINING_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MINING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MINING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String
		_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE =
			"SELECT miningApplicationCertificateIssuance FROM MiningApplicationCertificateIssuance miningApplicationCertificateIssuance";

	private static final String
		_SQL_SELECT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE =
			"SELECT miningApplicationCertificateIssuance FROM MiningApplicationCertificateIssuance miningApplicationCertificateIssuance WHERE ";

	private static final String
		_SQL_COUNT_MININGAPPLICATIONCERTIFICATEISSUANCE =
			"SELECT COUNT(miningApplicationCertificateIssuance) FROM MiningApplicationCertificateIssuance miningApplicationCertificateIssuance";

	private static final String
		_SQL_COUNT_MININGAPPLICATIONCERTIFICATEISSUANCE_WHERE =
			"SELECT COUNT(miningApplicationCertificateIssuance) FROM MiningApplicationCertificateIssuance miningApplicationCertificateIssuance WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miningApplicationCertificateIssuance.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningApplicationCertificateIssuance exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningApplicationCertificateIssuance exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningApplicationCertificateIssuancePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}