/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.stages.services.service.persistence.impl;

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

import com.nbp.ogt.stages.services.exception.NoSuchOgtApplicationStageException;
import com.nbp.ogt.stages.services.model.OgtApplicationStage;
import com.nbp.ogt.stages.services.model.OgtApplicationStageTable;
import com.nbp.ogt.stages.services.model.impl.OgtApplicationStageImpl;
import com.nbp.ogt.stages.services.model.impl.OgtApplicationStageModelImpl;
import com.nbp.ogt.stages.services.service.persistence.OgtApplicationStagePersistence;
import com.nbp.ogt.stages.services.service.persistence.OgtApplicationStageUtil;
import com.nbp.ogt.stages.services.service.persistence.impl.constants.OGT_STAGEPersistenceConstants;

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
 * The persistence implementation for the ogt application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OgtApplicationStagePersistence.class)
public class OgtApplicationStagePersistenceImpl
	extends BasePersistenceImpl<OgtApplicationStage>
	implements OgtApplicationStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OgtApplicationStageUtil</code> to access the ogt application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OgtApplicationStageImpl.class.getName();

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
	 * Returns all the ogt application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator,
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

		List<OgtApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<OgtApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OgtApplicationStage ogtApplicationStage : list) {
					if (!uuid.equals(ogtApplicationStage.getUuid())) {
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

			sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

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
				sb.append(OgtApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<OgtApplicationStage>)QueryUtil.list(
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
	 * Returns the first ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = fetchByUuid_First(
			uuid, orderByComparator);

		if (ogtApplicationStage != null) {
			return ogtApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOgtApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchByUuid_First(
		String uuid, OrderByComparator<OgtApplicationStage> orderByComparator) {

		List<OgtApplicationStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = fetchByUuid_Last(
			uuid, orderByComparator);

		if (ogtApplicationStage != null) {
			return ogtApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOgtApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchByUuid_Last(
		String uuid, OrderByComparator<OgtApplicationStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OgtApplicationStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	@Override
	public OgtApplicationStage[] findByUuid_PrevAndNext(
			long ogtStagesId, String uuid,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		uuid = Objects.toString(uuid, "");

		OgtApplicationStage ogtApplicationStage = findByPrimaryKey(ogtStagesId);

		Session session = null;

		try {
			session = openSession();

			OgtApplicationStage[] array = new OgtApplicationStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, ogtApplicationStage, uuid, orderByComparator, true);

			array[1] = ogtApplicationStage;

			array[2] = getByUuid_PrevAndNext(
				session, ogtApplicationStage, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OgtApplicationStage getByUuid_PrevAndNext(
		Session session, OgtApplicationStage ogtApplicationStage, String uuid,
		OrderByComparator<OgtApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

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
			sb.append(OgtApplicationStageModelImpl.ORDER_BY_JPQL);
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
						ogtApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OgtApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ogt application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OgtApplicationStage ogtApplicationStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ogtApplicationStage);
		}
	}

	/**
	 * Returns the number of ogt application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ogt application stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTAPPLICATIONSTAGE_WHERE);

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
		"ogtApplicationStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(ogtApplicationStage.uuid IS NULL OR ogtApplicationStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the ogt application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = fetchByUUID_G(uuid, groupId);

		if (ogtApplicationStage == null) {
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

			throw new NoSuchOgtApplicationStageException(sb.toString());
		}

		return ogtApplicationStage;
	}

	/**
	 * Returns the ogt application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the ogt application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchByUUID_G(
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

		if (result instanceof OgtApplicationStage) {
			OgtApplicationStage ogtApplicationStage =
				(OgtApplicationStage)result;

			if (!Objects.equals(uuid, ogtApplicationStage.getUuid()) ||
				(groupId != ogtApplicationStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

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

				List<OgtApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OgtApplicationStage ogtApplicationStage = list.get(0);

					result = ogtApplicationStage;

					cacheResult(ogtApplicationStage);
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
			return (OgtApplicationStage)result;
		}
	}

	/**
	 * Removes the ogt application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ogt application stage that was removed
	 */
	@Override
	public OgtApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = findByUUID_G(uuid, groupId);

		return remove(ogtApplicationStage);
	}

	/**
	 * Returns the number of ogt application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ogt application stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OGTAPPLICATIONSTAGE_WHERE);

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
		"ogtApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(ogtApplicationStage.uuid IS NULL OR ogtApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"ogtApplicationStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator,
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

		List<OgtApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<OgtApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OgtApplicationStage ogtApplicationStage : list) {
					if (!uuid.equals(ogtApplicationStage.getUuid()) ||
						(companyId != ogtApplicationStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

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
				sb.append(OgtApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<OgtApplicationStage>)QueryUtil.list(
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
	 * Returns the first ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (ogtApplicationStage != null) {
			return ogtApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOgtApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		List<OgtApplicationStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (ogtApplicationStage != null) {
			return ogtApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOgtApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OgtApplicationStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	@Override
	public OgtApplicationStage[] findByUuid_C_PrevAndNext(
			long ogtStagesId, String uuid, long companyId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		uuid = Objects.toString(uuid, "");

		OgtApplicationStage ogtApplicationStage = findByPrimaryKey(ogtStagesId);

		Session session = null;

		try {
			session = openSession();

			OgtApplicationStage[] array = new OgtApplicationStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, ogtApplicationStage, uuid, companyId,
				orderByComparator, true);

			array[1] = ogtApplicationStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, ogtApplicationStage, uuid, companyId,
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

	protected OgtApplicationStage getByUuid_C_PrevAndNext(
		Session session, OgtApplicationStage ogtApplicationStage, String uuid,
		long companyId,
		OrderByComparator<OgtApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

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
			sb.append(OgtApplicationStageModelImpl.ORDER_BY_JPQL);
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
						ogtApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OgtApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ogt application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OgtApplicationStage ogtApplicationStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ogtApplicationStage);
		}
	}

	/**
	 * Returns the number of ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ogt application stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OGTAPPLICATIONSTAGE_WHERE);

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
		"ogtApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(ogtApplicationStage.uuid IS NULL OR ogtApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"ogtApplicationStage.companyId = ?";

	private FinderPath _finderPathFetchBygetOgt_AI;
	private FinderPath _finderPathCountBygetOgt_AI;

	/**
	 * Returns the ogt application stage where ogtApplicationId = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findBygetOgt_AI(long ogtApplicationId)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = fetchBygetOgt_AI(
			ogtApplicationId);

		if (ogtApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ogtApplicationId=");
			sb.append(ogtApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtApplicationStageException(sb.toString());
		}

		return ogtApplicationStage;
	}

	/**
	 * Returns the ogt application stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_AI(long ogtApplicationId) {
		return fetchBygetOgt_AI(ogtApplicationId, true);
	}

	/**
	 * Returns the ogt application stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_AI(
		long ogtApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ogtApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgt_AI, finderArgs, this);
		}

		if (result instanceof OgtApplicationStage) {
			OgtApplicationStage ogtApplicationStage =
				(OgtApplicationStage)result;

			if (ogtApplicationId != ogtApplicationStage.getOgtApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETOGT_AI_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

				List<OgtApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgt_AI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ogtApplicationId};
							}

							_log.warn(
								"OgtApplicationStagePersistenceImpl.fetchBygetOgt_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtApplicationStage ogtApplicationStage = list.get(0);

					result = ogtApplicationStage;

					cacheResult(ogtApplicationStage);
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
			return (OgtApplicationStage)result;
		}
	}

	/**
	 * Removes the ogt application stage where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt application stage that was removed
	 */
	@Override
	public OgtApplicationStage removeBygetOgt_AI(long ogtApplicationId)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = findBygetOgt_AI(
			ogtApplicationId);

		return remove(ogtApplicationStage);
	}

	/**
	 * Returns the number of ogt application stages where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt application stages
	 */
	@Override
	public int countBygetOgt_AI(long ogtApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOgt_AI;

		Object[] finderArgs = new Object[] {ogtApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTAPPLICATIONSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETOGT_AI_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

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

	private static final String _FINDER_COLUMN_GETOGT_AI_OGTAPPLICATIONID_2 =
		"ogtApplicationStage.ogtApplicationId = ?";

	private FinderPath _finderPathFetchBygetOgt_By_CaseIdStageName;
	private FinderPath _finderPathCountBygetOgt_By_CaseIdStageName;

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findBygetOgt_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage =
			fetchBygetOgt_By_CaseIdStageName(caseId, stageName);

		if (ogtApplicationStage == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtApplicationStageException(sb.toString());
		}

		return ogtApplicationStage;
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetOgt_By_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgt_By_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof OgtApplicationStage) {
			OgtApplicationStage ogtApplicationStage =
				(OgtApplicationStage)result;

			if (!Objects.equals(caseId, ogtApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageName, ogtApplicationStage.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<OgtApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgt_By_CaseIdStageName,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageName};
							}

							_log.warn(
								"OgtApplicationStagePersistenceImpl.fetchBygetOgt_By_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtApplicationStage ogtApplicationStage = list.get(0);

					result = ogtApplicationStage;

					cacheResult(ogtApplicationStage);
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
			return (OgtApplicationStage)result;
		}
	}

	/**
	 * Removes the ogt application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the ogt application stage that was removed
	 */
	@Override
	public OgtApplicationStage removeBygetOgt_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage =
			findBygetOgt_By_CaseIdStageName(caseId, stageName);

		return remove(ogtApplicationStage);
	}

	/**
	 * Returns the number of ogt application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching ogt application stages
	 */
	@Override
	public int countBygetOgt_By_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetOgt_By_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
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
		_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_CASEID_2 =
			"ogtApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_CASEID_3 =
			"(ogtApplicationStage.caseId IS NULL OR ogtApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_STAGENAME_2 =
			"ogtApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGENAME_STAGENAME_3 =
			"(ogtApplicationStage.stageName IS NULL OR ogtApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchBygetOgt_By_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetOgt_By_CaseIdStageStatus;

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findBygetOgt_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage =
			fetchBygetOgt_By_CaseIdStageStatus(caseId, stageStatus, stageName);

		if (ogtApplicationStage == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtApplicationStageException(sb.toString());
		}

		return ogtApplicationStage;
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetOgt_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgt_By_CaseIdStageStatus, finderArgs,
				this);
		}

		if (result instanceof OgtApplicationStage) {
			OgtApplicationStage ogtApplicationStage =
				(OgtApplicationStage)result;

			if (!Objects.equals(caseId, ogtApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageStatus, ogtApplicationStage.getStageStatus()) ||
				!Objects.equals(
					stageName, ogtApplicationStage.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<OgtApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgt_By_CaseIdStageStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, stageStatus, stageName
								};
							}

							_log.warn(
								"OgtApplicationStagePersistenceImpl.fetchBygetOgt_By_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtApplicationStage ogtApplicationStage = list.get(0);

					result = ogtApplicationStage;

					cacheResult(ogtApplicationStage);
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
			return (OgtApplicationStage)result;
		}
	}

	/**
	 * Removes the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the ogt application stage that was removed
	 */
	@Override
	public OgtApplicationStage removeBygetOgt_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage =
			findBygetOgt_By_CaseIdStageStatus(caseId, stageStatus, stageName);

		return remove(ogtApplicationStage);
	}

	/**
	 * Returns the number of ogt application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching ogt application stages
	 */
	@Override
	public int countBygetOgt_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetOgt_By_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				if (bindStageName) {
					queryPos.add(stageName);
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
		_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_CASEID_2 =
			"ogtApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_CASEID_3 =
			"(ogtApplicationStage.caseId IS NULL OR ogtApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"ogtApplicationStage.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(ogtApplicationStage.stageStatus IS NULL OR ogtApplicationStage.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGENAME_2 =
			"ogtApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETOGT_BY_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(ogtApplicationStage.stageName IS NULL OR ogtApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchBygetOgt_By_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetOgt_By_CaseIdAndStatus;

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findBygetOgt_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage =
			fetchBygetOgt_By_CaseIdAndStatus(caseId, stageStatus);

		if (ogtApplicationStage == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtApplicationStageException(sb.toString());
		}

		return ogtApplicationStage;
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetOgt_By_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgt_By_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof OgtApplicationStage) {
			OgtApplicationStage ogtApplicationStage =
				(OgtApplicationStage)result;

			if (!Objects.equals(caseId, ogtApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageStatus, ogtApplicationStage.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<OgtApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgt_By_CaseIdAndStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageStatus};
							}

							_log.warn(
								"OgtApplicationStagePersistenceImpl.fetchBygetOgt_By_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtApplicationStage ogtApplicationStage = list.get(0);

					result = ogtApplicationStage;

					cacheResult(ogtApplicationStage);
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
			return (OgtApplicationStage)result;
		}
	}

	/**
	 * Removes the ogt application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the ogt application stage that was removed
	 */
	@Override
	public OgtApplicationStage removeBygetOgt_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage =
			findBygetOgt_By_CaseIdAndStatus(caseId, stageStatus);

		return remove(ogtApplicationStage);
	}

	/**
	 * Returns the number of ogt application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching ogt application stages
	 */
	@Override
	public int countBygetOgt_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetOgt_By_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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
		_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_CASEID_2 =
			"ogtApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_CASEID_3 =
			"(ogtApplicationStage.caseId IS NULL OR ogtApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_STAGESTATUS_2 =
			"ogtApplicationStage.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETOGT_BY_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(ogtApplicationStage.stageStatus IS NULL OR ogtApplicationStage.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetOgt_By_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetOgt_By_CaseId;
	private FinderPath _finderPathCountBygetOgt_By_CaseId;

	/**
	 * Returns all the ogt application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findBygetOgt_By_CaseId(String caseId) {
		return findBygetOgt_By_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findBygetOgt_By_CaseId(
		String caseId, int start, int end) {

		return findBygetOgt_By_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findBygetOgt_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return findBygetOgt_By_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findBygetOgt_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOgt_By_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOgt_By_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<OgtApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<OgtApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OgtApplicationStage ogtApplicationStage : list) {
					if (!caseId.equals(ogtApplicationStage.getCaseId())) {
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

			sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OgtApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<OgtApplicationStage>)QueryUtil.list(
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
	 * Returns the first ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findBygetOgt_By_CaseId_First(
			String caseId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = fetchBygetOgt_By_CaseId_First(
			caseId, orderByComparator);

		if (ogtApplicationStage != null) {
			return ogtApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOgtApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_CaseId_First(
		String caseId,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		List<OgtApplicationStage> list = findBygetOgt_By_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findBygetOgt_By_CaseId_Last(
			String caseId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = fetchBygetOgt_By_CaseId_Last(
			caseId, orderByComparator);

		if (ogtApplicationStage != null) {
			return ogtApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOgtApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_CaseId_Last(
		String caseId,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		int count = countBygetOgt_By_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<OgtApplicationStage> list = findBygetOgt_By_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	@Override
	public OgtApplicationStage[] findBygetOgt_By_CaseId_PrevAndNext(
			long ogtStagesId, String caseId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		caseId = Objects.toString(caseId, "");

		OgtApplicationStage ogtApplicationStage = findByPrimaryKey(ogtStagesId);

		Session session = null;

		try {
			session = openSession();

			OgtApplicationStage[] array = new OgtApplicationStageImpl[3];

			array[0] = getBygetOgt_By_CaseId_PrevAndNext(
				session, ogtApplicationStage, caseId, orderByComparator, true);

			array[1] = ogtApplicationStage;

			array[2] = getBygetOgt_By_CaseId_PrevAndNext(
				session, ogtApplicationStage, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OgtApplicationStage getBygetOgt_By_CaseId_PrevAndNext(
		Session session, OgtApplicationStage ogtApplicationStage, String caseId,
		OrderByComparator<OgtApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOGT_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETOGT_BY_CASEID_CASEID_2);
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
			sb.append(OgtApplicationStageModelImpl.ORDER_BY_JPQL);
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
						ogtApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OgtApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ogt application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetOgt_By_CaseId(String caseId) {
		for (OgtApplicationStage ogtApplicationStage :
				findBygetOgt_By_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ogtApplicationStage);
		}
	}

	/**
	 * Returns the number of ogt application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ogt application stages
	 */
	@Override
	public int countBygetOgt_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOgt_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETOGT_BY_CASEID_CASEID_2 =
		"ogtApplicationStage.caseId = ?";

	private static final String _FINDER_COLUMN_GETOGT_BY_CASEID_CASEID_3 =
		"(ogtApplicationStage.caseId IS NULL OR ogtApplicationStage.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetOgt_By_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetOgt_By_StageName;
	private FinderPath _finderPathCountBygetOgt_By_StageName;

	/**
	 * Returns all the ogt application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName) {

		return findBygetOgt_By_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName, int start, int end) {

		return findBygetOgt_By_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return findBygetOgt_By_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOgt_By_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOgt_By_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<OgtApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<OgtApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OgtApplicationStage ogtApplicationStage : list) {
					if (!stageName.equals(ogtApplicationStage.getStageName())) {
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

			sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OgtApplicationStageModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				list = (List<OgtApplicationStage>)QueryUtil.list(
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
	 * Returns the first ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findBygetOgt_By_StageName_First(
			String stageName,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage =
			fetchBygetOgt_By_StageName_First(stageName, orderByComparator);

		if (ogtApplicationStage != null) {
			return ogtApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchOgtApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_StageName_First(
		String stageName,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		List<OgtApplicationStage> list = findBygetOgt_By_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findBygetOgt_By_StageName_Last(
			String stageName,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage =
			fetchBygetOgt_By_StageName_Last(stageName, orderByComparator);

		if (ogtApplicationStage != null) {
			return ogtApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchOgtApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_StageName_Last(
		String stageName,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		int count = countBygetOgt_By_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<OgtApplicationStage> list = findBygetOgt_By_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	@Override
	public OgtApplicationStage[] findBygetOgt_By_StageName_PrevAndNext(
			long ogtStagesId, String stageName,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException {

		stageName = Objects.toString(stageName, "");

		OgtApplicationStage ogtApplicationStage = findByPrimaryKey(ogtStagesId);

		Session session = null;

		try {
			session = openSession();

			OgtApplicationStage[] array = new OgtApplicationStageImpl[3];

			array[0] = getBygetOgt_By_StageName_PrevAndNext(
				session, ogtApplicationStage, stageName, orderByComparator,
				true);

			array[1] = ogtApplicationStage;

			array[2] = getBygetOgt_By_StageName_PrevAndNext(
				session, ogtApplicationStage, stageName, orderByComparator,
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

	protected OgtApplicationStage getBygetOgt_By_StageName_PrevAndNext(
		Session session, OgtApplicationStage ogtApplicationStage,
		String stageName,
		OrderByComparator<OgtApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOGT_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETOGT_BY_STAGENAME_STAGENAME_2);
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
			sb.append(OgtApplicationStageModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ogtApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OgtApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ogt application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetOgt_By_StageName(String stageName) {
		for (OgtApplicationStage ogtApplicationStage :
				findBygetOgt_By_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ogtApplicationStage);
		}
	}

	/**
	 * Returns the number of ogt application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching ogt application stages
	 */
	@Override
	public int countBygetOgt_By_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetOgt_By_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_STAGENAME_STAGENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
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

	private static final String _FINDER_COLUMN_GETOGT_BY_STAGENAME_STAGENAME_2 =
		"ogtApplicationStage.stageName = ?";

	private static final String _FINDER_COLUMN_GETOGT_BY_STAGENAME_STAGENAME_3 =
		"(ogtApplicationStage.stageName IS NULL OR ogtApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchBygetOgt_By_CI;
	private FinderPath _finderPathCountBygetOgt_By_CI;

	/**
	 * Returns the ogt application stage where caseId = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage findBygetOgt_By_CI(String caseId)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = fetchBygetOgt_By_CI(caseId);

		if (ogtApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtApplicationStageException(sb.toString());
		}

		return ogtApplicationStage;
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_CI(String caseId) {
		return fetchBygetOgt_By_CI(caseId, true);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public OgtApplicationStage fetchBygetOgt_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgt_By_CI, finderArgs, this);
		}

		if (result instanceof OgtApplicationStage) {
			OgtApplicationStage ogtApplicationStage =
				(OgtApplicationStage)result;

			if (!Objects.equals(caseId, ogtApplicationStage.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CI_CASEID_2);
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

				List<OgtApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgt_By_CI, finderArgs, list);
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
								"OgtApplicationStagePersistenceImpl.fetchBygetOgt_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtApplicationStage ogtApplicationStage = list.get(0);

					result = ogtApplicationStage;

					cacheResult(ogtApplicationStage);
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
			return (OgtApplicationStage)result;
		}
	}

	/**
	 * Removes the ogt application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ogt application stage that was removed
	 */
	@Override
	public OgtApplicationStage removeBygetOgt_By_CI(String caseId)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = findBygetOgt_By_CI(caseId);

		return remove(ogtApplicationStage);
	}

	/**
	 * Returns the number of ogt application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ogt application stages
	 */
	@Override
	public int countBygetOgt_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOgt_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGT_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGT_BY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETOGT_BY_CI_CASEID_2 =
		"ogtApplicationStage.caseId = ?";

	private static final String _FINDER_COLUMN_GETOGT_BY_CI_CASEID_3 =
		"(ogtApplicationStage.caseId IS NULL OR ogtApplicationStage.caseId = '')";

	public OgtApplicationStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OgtApplicationStage.class);

		setModelImplClass(OgtApplicationStageImpl.class);
		setModelPKClass(long.class);

		setTable(OgtApplicationStageTable.INSTANCE);
	}

	/**
	 * Caches the ogt application stage in the entity cache if it is enabled.
	 *
	 * @param ogtApplicationStage the ogt application stage
	 */
	@Override
	public void cacheResult(OgtApplicationStage ogtApplicationStage) {
		entityCache.putResult(
			OgtApplicationStageImpl.class, ogtApplicationStage.getPrimaryKey(),
			ogtApplicationStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				ogtApplicationStage.getUuid(), ogtApplicationStage.getGroupId()
			},
			ogtApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetOgt_AI,
			new Object[] {ogtApplicationStage.getOgtApplicationId()},
			ogtApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetOgt_By_CaseIdStageName,
			new Object[] {
				ogtApplicationStage.getCaseId(),
				ogtApplicationStage.getStageName()
			},
			ogtApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetOgt_By_CaseIdStageStatus,
			new Object[] {
				ogtApplicationStage.getCaseId(),
				ogtApplicationStage.getStageStatus(),
				ogtApplicationStage.getStageName()
			},
			ogtApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetOgt_By_CaseIdAndStatus,
			new Object[] {
				ogtApplicationStage.getCaseId(),
				ogtApplicationStage.getStageStatus()
			},
			ogtApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetOgt_By_CI,
			new Object[] {ogtApplicationStage.getCaseId()},
			ogtApplicationStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ogt application stages in the entity cache if it is enabled.
	 *
	 * @param ogtApplicationStages the ogt application stages
	 */
	@Override
	public void cacheResult(List<OgtApplicationStage> ogtApplicationStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ogtApplicationStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OgtApplicationStage ogtApplicationStage : ogtApplicationStages) {
			if (entityCache.getResult(
					OgtApplicationStageImpl.class,
					ogtApplicationStage.getPrimaryKey()) == null) {

				cacheResult(ogtApplicationStage);
			}
		}
	}

	/**
	 * Clears the cache for all ogt application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OgtApplicationStageImpl.class);

		finderCache.clearCache(OgtApplicationStageImpl.class);
	}

	/**
	 * Clears the cache for the ogt application stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OgtApplicationStage ogtApplicationStage) {
		entityCache.removeResult(
			OgtApplicationStageImpl.class, ogtApplicationStage);
	}

	@Override
	public void clearCache(List<OgtApplicationStage> ogtApplicationStages) {
		for (OgtApplicationStage ogtApplicationStage : ogtApplicationStages) {
			entityCache.removeResult(
				OgtApplicationStageImpl.class, ogtApplicationStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OgtApplicationStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OgtApplicationStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OgtApplicationStageModelImpl ogtApplicationStageModelImpl) {

		Object[] args = new Object[] {
			ogtApplicationStageModelImpl.getUuid(),
			ogtApplicationStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, ogtApplicationStageModelImpl);

		args = new Object[] {
			ogtApplicationStageModelImpl.getOgtApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOgt_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgt_AI, args, ogtApplicationStageModelImpl);

		args = new Object[] {
			ogtApplicationStageModelImpl.getCaseId(),
			ogtApplicationStageModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetOgt_By_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgt_By_CaseIdStageName, args,
			ogtApplicationStageModelImpl);

		args = new Object[] {
			ogtApplicationStageModelImpl.getCaseId(),
			ogtApplicationStageModelImpl.getStageStatus(),
			ogtApplicationStageModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetOgt_By_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgt_By_CaseIdStageStatus, args,
			ogtApplicationStageModelImpl);

		args = new Object[] {
			ogtApplicationStageModelImpl.getCaseId(),
			ogtApplicationStageModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetOgt_By_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgt_By_CaseIdAndStatus, args,
			ogtApplicationStageModelImpl);

		args = new Object[] {ogtApplicationStageModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetOgt_By_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgt_By_CI, args, ogtApplicationStageModelImpl);
	}

	/**
	 * Creates a new ogt application stage with the primary key. Does not add the ogt application stage to the database.
	 *
	 * @param ogtStagesId the primary key for the new ogt application stage
	 * @return the new ogt application stage
	 */
	@Override
	public OgtApplicationStage create(long ogtStagesId) {
		OgtApplicationStage ogtApplicationStage = new OgtApplicationStageImpl();

		ogtApplicationStage.setNew(true);
		ogtApplicationStage.setPrimaryKey(ogtStagesId);

		String uuid = PortalUUIDUtil.generate();

		ogtApplicationStage.setUuid(uuid);

		ogtApplicationStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ogtApplicationStage;
	}

	/**
	 * Removes the ogt application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage that was removed
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	@Override
	public OgtApplicationStage remove(long ogtStagesId)
		throws NoSuchOgtApplicationStageException {

		return remove((Serializable)ogtStagesId);
	}

	/**
	 * Removes the ogt application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ogt application stage
	 * @return the ogt application stage that was removed
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	@Override
	public OgtApplicationStage remove(Serializable primaryKey)
		throws NoSuchOgtApplicationStageException {

		Session session = null;

		try {
			session = openSession();

			OgtApplicationStage ogtApplicationStage =
				(OgtApplicationStage)session.get(
					OgtApplicationStageImpl.class, primaryKey);

			if (ogtApplicationStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOgtApplicationStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ogtApplicationStage);
		}
		catch (NoSuchOgtApplicationStageException noSuchEntityException) {
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
	protected OgtApplicationStage removeImpl(
		OgtApplicationStage ogtApplicationStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ogtApplicationStage)) {
				ogtApplicationStage = (OgtApplicationStage)session.get(
					OgtApplicationStageImpl.class,
					ogtApplicationStage.getPrimaryKeyObj());
			}

			if (ogtApplicationStage != null) {
				session.delete(ogtApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ogtApplicationStage != null) {
			clearCache(ogtApplicationStage);
		}

		return ogtApplicationStage;
	}

	@Override
	public OgtApplicationStage updateImpl(
		OgtApplicationStage ogtApplicationStage) {

		boolean isNew = ogtApplicationStage.isNew();

		if (!(ogtApplicationStage instanceof OgtApplicationStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ogtApplicationStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ogtApplicationStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ogtApplicationStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OgtApplicationStage implementation " +
					ogtApplicationStage.getClass());
		}

		OgtApplicationStageModelImpl ogtApplicationStageModelImpl =
			(OgtApplicationStageModelImpl)ogtApplicationStage;

		if (Validator.isNull(ogtApplicationStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			ogtApplicationStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ogtApplicationStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				ogtApplicationStage.setCreateDate(date);
			}
			else {
				ogtApplicationStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ogtApplicationStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ogtApplicationStage.setModifiedDate(date);
			}
			else {
				ogtApplicationStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ogtApplicationStage);
			}
			else {
				ogtApplicationStage = (OgtApplicationStage)session.merge(
					ogtApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OgtApplicationStageImpl.class, ogtApplicationStageModelImpl, false,
			true);

		cacheUniqueFindersCache(ogtApplicationStageModelImpl);

		if (isNew) {
			ogtApplicationStage.setNew(false);
		}

		ogtApplicationStage.resetOriginalValues();

		return ogtApplicationStage;
	}

	/**
	 * Returns the ogt application stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ogt application stage
	 * @return the ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	@Override
	public OgtApplicationStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOgtApplicationStageException {

		OgtApplicationStage ogtApplicationStage = fetchByPrimaryKey(primaryKey);

		if (ogtApplicationStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOgtApplicationStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ogtApplicationStage;
	}

	/**
	 * Returns the ogt application stage with the primary key or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	@Override
	public OgtApplicationStage findByPrimaryKey(long ogtStagesId)
		throws NoSuchOgtApplicationStageException {

		return findByPrimaryKey((Serializable)ogtStagesId);
	}

	/**
	 * Returns the ogt application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage, or <code>null</code> if a ogt application stage with the primary key could not be found
	 */
	@Override
	public OgtApplicationStage fetchByPrimaryKey(long ogtStagesId) {
		return fetchByPrimaryKey((Serializable)ogtStagesId);
	}

	/**
	 * Returns all the ogt application stages.
	 *
	 * @return the ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findAll(
		int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt application stages
	 */
	@Override
	public List<OgtApplicationStage> findAll(
		int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator,
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

		List<OgtApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<OgtApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OGTAPPLICATIONSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OGTAPPLICATIONSTAGE;

				sql = sql.concat(OgtApplicationStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OgtApplicationStage>)QueryUtil.list(
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
	 * Removes all the ogt application stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OgtApplicationStage ogtApplicationStage : findAll()) {
			remove(ogtApplicationStage);
		}
	}

	/**
	 * Returns the number of ogt application stages.
	 *
	 * @return the number of ogt application stages
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
					_SQL_COUNT_OGTAPPLICATIONSTAGE);

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
		return "ogtStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OGTAPPLICATIONSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OgtApplicationStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ogt application stage persistence.
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

		_finderPathFetchBygetOgt_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgt_AI",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, true);

		_finderPathCountBygetOgt_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOgt_AI",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, false);

		_finderPathFetchBygetOgt_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgt_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetOgt_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOgt_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetOgt_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgt_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetOgt_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOgt_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetOgt_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgt_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetOgt_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOgt_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetOgt_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOgt_By_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetOgt_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOgt_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOgt_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOgt_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetOgt_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOgt_By_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetOgt_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetOgt_By_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, true);

		_finderPathCountBygetOgt_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOgt_By_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathFetchBygetOgt_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgt_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOgt_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOgt_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		OgtApplicationStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OgtApplicationStageUtil.setPersistence(null);

		entityCache.removeCache(OgtApplicationStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = OGT_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OGT_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OGT_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OGTAPPLICATIONSTAGE =
		"SELECT ogtApplicationStage FROM OgtApplicationStage ogtApplicationStage";

	private static final String _SQL_SELECT_OGTAPPLICATIONSTAGE_WHERE =
		"SELECT ogtApplicationStage FROM OgtApplicationStage ogtApplicationStage WHERE ";

	private static final String _SQL_COUNT_OGTAPPLICATIONSTAGE =
		"SELECT COUNT(ogtApplicationStage) FROM OgtApplicationStage ogtApplicationStage";

	private static final String _SQL_COUNT_OGTAPPLICATIONSTAGE_WHERE =
		"SELECT COUNT(ogtApplicationStage) FROM OgtApplicationStage ogtApplicationStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ogtApplicationStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OgtApplicationStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OgtApplicationStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OgtApplicationStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}