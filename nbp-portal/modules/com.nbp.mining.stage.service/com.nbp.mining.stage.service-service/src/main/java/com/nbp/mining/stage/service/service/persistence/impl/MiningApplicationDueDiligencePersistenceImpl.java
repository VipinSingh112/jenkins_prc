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

import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationDueDiligenceException;
import com.nbp.mining.stage.service.model.MiningApplicationDueDiligence;
import com.nbp.mining.stage.service.model.MiningApplicationDueDiligenceTable;
import com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceImpl;
import com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceModelImpl;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationDueDiligencePersistence;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationDueDiligenceUtil;
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
 * The persistence implementation for the mining application due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningApplicationDueDiligencePersistence.class)
public class MiningApplicationDueDiligencePersistenceImpl
	extends BasePersistenceImpl<MiningApplicationDueDiligence>
	implements MiningApplicationDueDiligencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningApplicationDueDiligenceUtil</code> to access the mining application due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningApplicationDueDiligenceImpl.class.getName();

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
	 * Returns all the mining application due diligences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application due diligences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator,
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

		List<MiningApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<MiningApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningApplicationDueDiligence
						miningApplicationDueDiligence : list) {

					if (!uuid.equals(miningApplicationDueDiligence.getUuid())) {
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

			sb.append(_SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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
				sb.append(MiningApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiningApplicationDueDiligence>)QueryUtil.list(
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
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence findByUuid_First(
			String uuid,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException {

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			fetchByUuid_First(uuid, orderByComparator);

		if (miningApplicationDueDiligence != null) {
			return miningApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMiningApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence fetchByUuid_First(
		String uuid,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		List<MiningApplicationDueDiligence> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence findByUuid_Last(
			String uuid,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException {

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			fetchByUuid_Last(uuid, orderByComparator);

		if (miningApplicationDueDiligence != null) {
			return miningApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMiningApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence fetchByUuid_Last(
		String uuid,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MiningApplicationDueDiligence> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining application due diligences before and after the current mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param miningDueDiliId the primary key of the current mining application due diligence
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	@Override
	public MiningApplicationDueDiligence[] findByUuid_PrevAndNext(
			long miningDueDiliId, String uuid,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException {

		uuid = Objects.toString(uuid, "");

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			findByPrimaryKey(miningDueDiliId);

		Session session = null;

		try {
			session = openSession();

			MiningApplicationDueDiligence[] array =
				new MiningApplicationDueDiligenceImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, miningApplicationDueDiligence, uuid, orderByComparator,
				true);

			array[1] = miningApplicationDueDiligence;

			array[2] = getByUuid_PrevAndNext(
				session, miningApplicationDueDiligence, uuid, orderByComparator,
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

	protected MiningApplicationDueDiligence getByUuid_PrevAndNext(
		Session session,
		MiningApplicationDueDiligence miningApplicationDueDiligence,
		String uuid,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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
			sb.append(MiningApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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
						miningApplicationDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningApplicationDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining application due diligences where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MiningApplicationDueDiligence miningApplicationDueDiligence :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miningApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of mining application due diligences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining application due diligences
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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
		"miningApplicationDueDiligence.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(miningApplicationDueDiligence.uuid IS NULL OR miningApplicationDueDiligence.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the mining application due diligence where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence findByUUID_G(String uuid, long groupId)
		throws NoSuchMiningApplicationDueDiligenceException {

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			fetchByUUID_G(uuid, groupId);

		if (miningApplicationDueDiligence == null) {
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

			throw new NoSuchMiningApplicationDueDiligenceException(
				sb.toString());
		}

		return miningApplicationDueDiligence;
	}

	/**
	 * Returns the mining application due diligence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the mining application due diligence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence fetchByUUID_G(
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

		if (result instanceof MiningApplicationDueDiligence) {
			MiningApplicationDueDiligence miningApplicationDueDiligence =
				(MiningApplicationDueDiligence)result;

			if (!Objects.equals(
					uuid, miningApplicationDueDiligence.getUuid()) ||
				(groupId != miningApplicationDueDiligence.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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

				List<MiningApplicationDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MiningApplicationDueDiligence
						miningApplicationDueDiligence = list.get(0);

					result = miningApplicationDueDiligence;

					cacheResult(miningApplicationDueDiligence);
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
			return (MiningApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the mining application due diligence where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining application due diligence that was removed
	 */
	@Override
	public MiningApplicationDueDiligence removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchMiningApplicationDueDiligenceException {

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			findByUUID_G(uuid, groupId);

		return remove(miningApplicationDueDiligence);
	}

	/**
	 * Returns the number of mining application due diligences where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining application due diligences
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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
		"miningApplicationDueDiligence.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(miningApplicationDueDiligence.uuid IS NULL OR miningApplicationDueDiligence.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"miningApplicationDueDiligence.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator,
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

		List<MiningApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<MiningApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningApplicationDueDiligence
						miningApplicationDueDiligence : list) {

					if (!uuid.equals(miningApplicationDueDiligence.getUuid()) ||
						(companyId !=
							miningApplicationDueDiligence.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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
				sb.append(MiningApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiningApplicationDueDiligence>)QueryUtil.list(
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
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException {

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (miningApplicationDueDiligence != null) {
			return miningApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMiningApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		List<MiningApplicationDueDiligence> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException {

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (miningApplicationDueDiligence != null) {
			return miningApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMiningApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MiningApplicationDueDiligence> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining application due diligences before and after the current mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miningDueDiliId the primary key of the current mining application due diligence
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	@Override
	public MiningApplicationDueDiligence[] findByUuid_C_PrevAndNext(
			long miningDueDiliId, String uuid, long companyId,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException {

		uuid = Objects.toString(uuid, "");

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			findByPrimaryKey(miningDueDiliId);

		Session session = null;

		try {
			session = openSession();

			MiningApplicationDueDiligence[] array =
				new MiningApplicationDueDiligenceImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, miningApplicationDueDiligence, uuid, companyId,
				orderByComparator, true);

			array[1] = miningApplicationDueDiligence;

			array[2] = getByUuid_C_PrevAndNext(
				session, miningApplicationDueDiligence, uuid, companyId,
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

	protected MiningApplicationDueDiligence getByUuid_C_PrevAndNext(
		Session session,
		MiningApplicationDueDiligence miningApplicationDueDiligence,
		String uuid, long companyId,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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
			sb.append(MiningApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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
						miningApplicationDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningApplicationDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining application due diligences where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MiningApplicationDueDiligence miningApplicationDueDiligence :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miningApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining application due diligences
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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
		"miningApplicationDueDiligence.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(miningApplicationDueDiligence.uuid IS NULL OR miningApplicationDueDiligence.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"miningApplicationDueDiligence.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMining_APP_List_By_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMining_APP_List_By_CI;
	private FinderPath _finderPathCountBygetMining_APP_List_By_CI;

	/**
	 * Returns all the mining application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findBygetMining_APP_List_By_CI(
		String caseId) {

		return findBygetMining_APP_List_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findBygetMining_APP_List_By_CI(
		String caseId, int start, int end) {

		return findBygetMining_APP_List_By_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findBygetMining_APP_List_By_CI(
		String caseId, int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return findBygetMining_APP_List_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findBygetMining_APP_List_By_CI(
		String caseId, int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator,
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

		List<MiningApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<MiningApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningApplicationDueDiligence
						miningApplicationDueDiligence : list) {

					if (!caseId.equals(
							miningApplicationDueDiligence.getCaseId())) {

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

			sb.append(_SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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
				sb.append(MiningApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiningApplicationDueDiligence>)QueryUtil.list(
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
	 * Returns the first mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence findBygetMining_APP_List_By_CI_First(
			String caseId,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException {

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			fetchBygetMining_APP_List_By_CI_First(caseId, orderByComparator);

		if (miningApplicationDueDiligence != null) {
			return miningApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMiningApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence fetchBygetMining_APP_List_By_CI_First(
		String caseId,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		List<MiningApplicationDueDiligence> list =
			findBygetMining_APP_List_By_CI(caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence findBygetMining_APP_List_By_CI_Last(
			String caseId,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException {

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			fetchBygetMining_APP_List_By_CI_Last(caseId, orderByComparator);

		if (miningApplicationDueDiligence != null) {
			return miningApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMiningApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence fetchBygetMining_APP_List_By_CI_Last(
		String caseId,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		int count = countBygetMining_APP_List_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<MiningApplicationDueDiligence> list =
			findBygetMining_APP_List_By_CI(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining application due diligences before and after the current mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param miningDueDiliId the primary key of the current mining application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	@Override
	public MiningApplicationDueDiligence[]
			findBygetMining_APP_List_By_CI_PrevAndNext(
				long miningDueDiliId, String caseId,
				OrderByComparator<MiningApplicationDueDiligence>
					orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException {

		caseId = Objects.toString(caseId, "");

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			findByPrimaryKey(miningDueDiliId);

		Session session = null;

		try {
			session = openSession();

			MiningApplicationDueDiligence[] array =
				new MiningApplicationDueDiligenceImpl[3];

			array[0] = getBygetMining_APP_List_By_CI_PrevAndNext(
				session, miningApplicationDueDiligence, caseId,
				orderByComparator, true);

			array[1] = miningApplicationDueDiligence;

			array[2] = getBygetMining_APP_List_By_CI_PrevAndNext(
				session, miningApplicationDueDiligence, caseId,
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

	protected MiningApplicationDueDiligence
		getBygetMining_APP_List_By_CI_PrevAndNext(
			Session session,
			MiningApplicationDueDiligence miningApplicationDueDiligence,
			String caseId,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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
			sb.append(MiningApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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
						miningApplicationDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningApplicationDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMining_APP_List_By_CI(String caseId) {
		for (MiningApplicationDueDiligence miningApplicationDueDiligence :
				findBygetMining_APP_List_By_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miningApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of mining application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application due diligences
	 */
	@Override
	public int countBygetMining_APP_List_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMining_APP_List_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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
			"miningApplicationDueDiligence.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETMINING_APP_LIST_BY_CI_CASEID_3 =
			"(miningApplicationDueDiligence.caseId IS NULL OR miningApplicationDueDiligence.caseId = '')";

	private FinderPath _finderPathFetchBygetMining_APP_By_CI;
	private FinderPath _finderPathCountBygetMining_APP_By_CI;

	/**
	 * Returns the mining application due diligence where caseId = &#63; or throws a <code>NoSuchMiningApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence findBygetMining_APP_By_CI(
			String caseId)
		throws NoSuchMiningApplicationDueDiligenceException {

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			fetchBygetMining_APP_By_CI(caseId);

		if (miningApplicationDueDiligence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningApplicationDueDiligenceException(
				sb.toString());
		}

		return miningApplicationDueDiligence;
	}

	/**
	 * Returns the mining application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence fetchBygetMining_APP_By_CI(
		String caseId) {

		return fetchBygetMining_APP_By_CI(caseId, true);
	}

	/**
	 * Returns the mining application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	@Override
	public MiningApplicationDueDiligence fetchBygetMining_APP_By_CI(
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

		if (result instanceof MiningApplicationDueDiligence) {
			MiningApplicationDueDiligence miningApplicationDueDiligence =
				(MiningApplicationDueDiligence)result;

			if (!Objects.equals(
					caseId, miningApplicationDueDiligence.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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

				List<MiningApplicationDueDiligence> list = query.list();

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
								"MiningApplicationDueDiligencePersistenceImpl.fetchBygetMining_APP_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningApplicationDueDiligence
						miningApplicationDueDiligence = list.get(0);

					result = miningApplicationDueDiligence;

					cacheResult(miningApplicationDueDiligence);
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
			return (MiningApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the mining application due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining application due diligence that was removed
	 */
	@Override
	public MiningApplicationDueDiligence removeBygetMining_APP_By_CI(
			String caseId)
		throws NoSuchMiningApplicationDueDiligenceException {

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			findBygetMining_APP_By_CI(caseId);

		return remove(miningApplicationDueDiligence);
	}

	/**
	 * Returns the number of mining application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application due diligences
	 */
	@Override
	public int countBygetMining_APP_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMining_APP_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONDUEDILIGENCE_WHERE);

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
		"miningApplicationDueDiligence.caseId = ?";

	private static final String _FINDER_COLUMN_GETMINING_APP_BY_CI_CASEID_3 =
		"(miningApplicationDueDiligence.caseId IS NULL OR miningApplicationDueDiligence.caseId = '')";

	public MiningApplicationDueDiligencePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MiningApplicationDueDiligence.class);

		setModelImplClass(MiningApplicationDueDiligenceImpl.class);
		setModelPKClass(long.class);

		setTable(MiningApplicationDueDiligenceTable.INSTANCE);
	}

	/**
	 * Caches the mining application due diligence in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDueDiligence the mining application due diligence
	 */
	@Override
	public void cacheResult(
		MiningApplicationDueDiligence miningApplicationDueDiligence) {

		entityCache.putResult(
			MiningApplicationDueDiligenceImpl.class,
			miningApplicationDueDiligence.getPrimaryKey(),
			miningApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				miningApplicationDueDiligence.getUuid(),
				miningApplicationDueDiligence.getGroupId()
			},
			miningApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetMining_APP_By_CI,
			new Object[] {miningApplicationDueDiligence.getCaseId()},
			miningApplicationDueDiligence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining application due diligences in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDueDiligences the mining application due diligences
	 */
	@Override
	public void cacheResult(
		List<MiningApplicationDueDiligence> miningApplicationDueDiligences) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningApplicationDueDiligences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningApplicationDueDiligence miningApplicationDueDiligence :
				miningApplicationDueDiligences) {

			if (entityCache.getResult(
					MiningApplicationDueDiligenceImpl.class,
					miningApplicationDueDiligence.getPrimaryKey()) == null) {

				cacheResult(miningApplicationDueDiligence);
			}
		}
	}

	/**
	 * Clears the cache for all mining application due diligences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningApplicationDueDiligenceImpl.class);

		finderCache.clearCache(MiningApplicationDueDiligenceImpl.class);
	}

	/**
	 * Clears the cache for the mining application due diligence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MiningApplicationDueDiligence miningApplicationDueDiligence) {

		entityCache.removeResult(
			MiningApplicationDueDiligenceImpl.class,
			miningApplicationDueDiligence);
	}

	@Override
	public void clearCache(
		List<MiningApplicationDueDiligence> miningApplicationDueDiligences) {

		for (MiningApplicationDueDiligence miningApplicationDueDiligence :
				miningApplicationDueDiligences) {

			entityCache.removeResult(
				MiningApplicationDueDiligenceImpl.class,
				miningApplicationDueDiligence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningApplicationDueDiligenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiningApplicationDueDiligenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiningApplicationDueDiligenceModelImpl
			miningApplicationDueDiligenceModelImpl) {

		Object[] args = new Object[] {
			miningApplicationDueDiligenceModelImpl.getUuid(),
			miningApplicationDueDiligenceModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			miningApplicationDueDiligenceModelImpl);

		args = new Object[] {
			miningApplicationDueDiligenceModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetMining_APP_By_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMining_APP_By_CI, args,
			miningApplicationDueDiligenceModelImpl);
	}

	/**
	 * Creates a new mining application due diligence with the primary key. Does not add the mining application due diligence to the database.
	 *
	 * @param miningDueDiliId the primary key for the new mining application due diligence
	 * @return the new mining application due diligence
	 */
	@Override
	public MiningApplicationDueDiligence create(long miningDueDiliId) {
		MiningApplicationDueDiligence miningApplicationDueDiligence =
			new MiningApplicationDueDiligenceImpl();

		miningApplicationDueDiligence.setNew(true);
		miningApplicationDueDiligence.setPrimaryKey(miningDueDiliId);

		String uuid = PortalUUIDUtil.generate();

		miningApplicationDueDiligence.setUuid(uuid);

		miningApplicationDueDiligence.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return miningApplicationDueDiligence;
	}

	/**
	 * Removes the mining application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence that was removed
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	@Override
	public MiningApplicationDueDiligence remove(long miningDueDiliId)
		throws NoSuchMiningApplicationDueDiligenceException {

		return remove((Serializable)miningDueDiliId);
	}

	/**
	 * Removes the mining application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining application due diligence
	 * @return the mining application due diligence that was removed
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	@Override
	public MiningApplicationDueDiligence remove(Serializable primaryKey)
		throws NoSuchMiningApplicationDueDiligenceException {

		Session session = null;

		try {
			session = openSession();

			MiningApplicationDueDiligence miningApplicationDueDiligence =
				(MiningApplicationDueDiligence)session.get(
					MiningApplicationDueDiligenceImpl.class, primaryKey);

			if (miningApplicationDueDiligence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningApplicationDueDiligenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningApplicationDueDiligence);
		}
		catch (NoSuchMiningApplicationDueDiligenceException
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
	protected MiningApplicationDueDiligence removeImpl(
		MiningApplicationDueDiligence miningApplicationDueDiligence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningApplicationDueDiligence)) {
				miningApplicationDueDiligence =
					(MiningApplicationDueDiligence)session.get(
						MiningApplicationDueDiligenceImpl.class,
						miningApplicationDueDiligence.getPrimaryKeyObj());
			}

			if (miningApplicationDueDiligence != null) {
				session.delete(miningApplicationDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningApplicationDueDiligence != null) {
			clearCache(miningApplicationDueDiligence);
		}

		return miningApplicationDueDiligence;
	}

	@Override
	public MiningApplicationDueDiligence updateImpl(
		MiningApplicationDueDiligence miningApplicationDueDiligence) {

		boolean isNew = miningApplicationDueDiligence.isNew();

		if (!(miningApplicationDueDiligence instanceof
				MiningApplicationDueDiligenceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					miningApplicationDueDiligence.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					miningApplicationDueDiligence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningApplicationDueDiligence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningApplicationDueDiligence implementation " +
					miningApplicationDueDiligence.getClass());
		}

		MiningApplicationDueDiligenceModelImpl
			miningApplicationDueDiligenceModelImpl =
				(MiningApplicationDueDiligenceModelImpl)
					miningApplicationDueDiligence;

		if (Validator.isNull(miningApplicationDueDiligence.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			miningApplicationDueDiligence.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miningApplicationDueDiligence.getCreateDate() == null)) {
			if (serviceContext == null) {
				miningApplicationDueDiligence.setCreateDate(date);
			}
			else {
				miningApplicationDueDiligence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningApplicationDueDiligenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miningApplicationDueDiligence.setModifiedDate(date);
			}
			else {
				miningApplicationDueDiligence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningApplicationDueDiligence);
			}
			else {
				miningApplicationDueDiligence =
					(MiningApplicationDueDiligence)session.merge(
						miningApplicationDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningApplicationDueDiligenceImpl.class,
			miningApplicationDueDiligenceModelImpl, false, true);

		cacheUniqueFindersCache(miningApplicationDueDiligenceModelImpl);

		if (isNew) {
			miningApplicationDueDiligence.setNew(false);
		}

		miningApplicationDueDiligence.resetOriginalValues();

		return miningApplicationDueDiligence;
	}

	/**
	 * Returns the mining application due diligence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining application due diligence
	 * @return the mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	@Override
	public MiningApplicationDueDiligence findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchMiningApplicationDueDiligenceException {

		MiningApplicationDueDiligence miningApplicationDueDiligence =
			fetchByPrimaryKey(primaryKey);

		if (miningApplicationDueDiligence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningApplicationDueDiligenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningApplicationDueDiligence;
	}

	/**
	 * Returns the mining application due diligence with the primary key or throws a <code>NoSuchMiningApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	@Override
	public MiningApplicationDueDiligence findByPrimaryKey(long miningDueDiliId)
		throws NoSuchMiningApplicationDueDiligenceException {

		return findByPrimaryKey((Serializable)miningDueDiliId);
	}

	/**
	 * Returns the mining application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence, or <code>null</code> if a mining application due diligence with the primary key could not be found
	 */
	@Override
	public MiningApplicationDueDiligence fetchByPrimaryKey(
		long miningDueDiliId) {

		return fetchByPrimaryKey((Serializable)miningDueDiliId);
	}

	/**
	 * Returns all the mining application due diligences.
	 *
	 * @return the mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application due diligences
	 */
	@Override
	public List<MiningApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator,
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

		List<MiningApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<MiningApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE;

				sql = sql.concat(
					MiningApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiningApplicationDueDiligence>)QueryUtil.list(
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
	 * Removes all the mining application due diligences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningApplicationDueDiligence miningApplicationDueDiligence :
				findAll()) {

			remove(miningApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of mining application due diligences.
	 *
	 * @return the number of mining application due diligences
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
					_SQL_COUNT_MININGAPPLICATIONDUEDILIGENCE);

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
		return "miningDueDiliId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningApplicationDueDiligenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining application due diligence persistence.
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

		MiningApplicationDueDiligenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningApplicationDueDiligenceUtil.setPersistence(null);

		entityCache.removeCache(
			MiningApplicationDueDiligenceImpl.class.getName());
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

	private static final String _SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE =
		"SELECT miningApplicationDueDiligence FROM MiningApplicationDueDiligence miningApplicationDueDiligence";

	private static final String
		_SQL_SELECT_MININGAPPLICATIONDUEDILIGENCE_WHERE =
			"SELECT miningApplicationDueDiligence FROM MiningApplicationDueDiligence miningApplicationDueDiligence WHERE ";

	private static final String _SQL_COUNT_MININGAPPLICATIONDUEDILIGENCE =
		"SELECT COUNT(miningApplicationDueDiligence) FROM MiningApplicationDueDiligence miningApplicationDueDiligence";

	private static final String _SQL_COUNT_MININGAPPLICATIONDUEDILIGENCE_WHERE =
		"SELECT COUNT(miningApplicationDueDiligence) FROM MiningApplicationDueDiligence miningApplicationDueDiligence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miningApplicationDueDiligence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningApplicationDueDiligence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningApplicationDueDiligence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningApplicationDueDiligencePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}