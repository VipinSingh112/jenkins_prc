/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjCurrentStageException;
import com.nbp.ncbj.application.form.service.model.NcbjCurrentStage;
import com.nbp.ncbj.application.form.service.model.NcbjCurrentStageTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjCurrentStageImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjCurrentStageModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCurrentStagePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCurrentStageUtil;
import com.nbp.ncbj.application.form.service.service.persistence.impl.constants.FOOPersistenceConstants;

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
 * The persistence implementation for the ncbj current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjCurrentStagePersistence.class)
public class NcbjCurrentStagePersistenceImpl
	extends BasePersistenceImpl<NcbjCurrentStage>
	implements NcbjCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjCurrentStageUtil</code> to access the ncbj current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjCurrentStageImpl.class.getName();

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
	 * Returns all the ncbj current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of matching ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator,
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

		List<NcbjCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<NcbjCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjCurrentStage ncbjCurrentStage : list) {
					if (!uuid.equals(ncbjCurrentStage.getUuid())) {
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

			sb.append(_SQL_SELECT_NCBJCURRENTSTAGE_WHERE);

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
				sb.append(NcbjCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjCurrentStage>)QueryUtil.list(
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
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage findByUuid_First(
			String uuid, OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws NoSuchNcbjCurrentStageException {

		NcbjCurrentStage ncbjCurrentStage = fetchByUuid_First(
			uuid, orderByComparator);

		if (ncbjCurrentStage != null) {
			return ncbjCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNcbjCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage fetchByUuid_First(
		String uuid, OrderByComparator<NcbjCurrentStage> orderByComparator) {

		List<NcbjCurrentStage> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage findByUuid_Last(
			String uuid, OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws NoSuchNcbjCurrentStageException {

		NcbjCurrentStage ncbjCurrentStage = fetchByUuid_Last(
			uuid, orderByComparator);

		if (ncbjCurrentStage != null) {
			return ncbjCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNcbjCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage fetchByUuid_Last(
		String uuid, OrderByComparator<NcbjCurrentStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<NcbjCurrentStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj current stages before and after the current ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param ncbjCurrentStageId the primary key of the current ncbj current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	@Override
	public NcbjCurrentStage[] findByUuid_PrevAndNext(
			long ncbjCurrentStageId, String uuid,
			OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws NoSuchNcbjCurrentStageException {

		uuid = Objects.toString(uuid, "");

		NcbjCurrentStage ncbjCurrentStage = findByPrimaryKey(
			ncbjCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			NcbjCurrentStage[] array = new NcbjCurrentStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, ncbjCurrentStage, uuid, orderByComparator, true);

			array[1] = ncbjCurrentStage;

			array[2] = getByUuid_PrevAndNext(
				session, ncbjCurrentStage, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcbjCurrentStage getByUuid_PrevAndNext(
		Session session, NcbjCurrentStage ncbjCurrentStage, String uuid,
		OrderByComparator<NcbjCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJCURRENTSTAGE_WHERE);

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
			sb.append(NcbjCurrentStageModelImpl.ORDER_BY_JPQL);
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
						ncbjCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (NcbjCurrentStage ncbjCurrentStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncbjCurrentStage);
		}
	}

	/**
	 * Returns the number of ncbj current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncbj current stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJCURRENTSTAGE_WHERE);

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
		"ncbjCurrentStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(ncbjCurrentStage.uuid IS NULL OR ncbjCurrentStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the ncbj current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcbjCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjCurrentStageException {

		NcbjCurrentStage ncbjCurrentStage = fetchByUUID_G(uuid, groupId);

		if (ncbjCurrentStage == null) {
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

			throw new NoSuchNcbjCurrentStageException(sb.toString());
		}

		return ncbjCurrentStage;
	}

	/**
	 * Returns the ncbj current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the ncbj current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage fetchByUUID_G(
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

		if (result instanceof NcbjCurrentStage) {
			NcbjCurrentStage ncbjCurrentStage = (NcbjCurrentStage)result;

			if (!Objects.equals(uuid, ncbjCurrentStage.getUuid()) ||
				(groupId != ncbjCurrentStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NCBJCURRENTSTAGE_WHERE);

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

				List<NcbjCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					NcbjCurrentStage ncbjCurrentStage = list.get(0);

					result = ncbjCurrentStage;

					cacheResult(ncbjCurrentStage);
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
			return (NcbjCurrentStage)result;
		}
	}

	/**
	 * Removes the ncbj current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncbj current stage that was removed
	 */
	@Override
	public NcbjCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjCurrentStageException {

		NcbjCurrentStage ncbjCurrentStage = findByUUID_G(uuid, groupId);

		return remove(ncbjCurrentStage);
	}

	/**
	 * Returns the number of ncbj current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncbj current stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJCURRENTSTAGE_WHERE);

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
		"ncbjCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(ncbjCurrentStage.uuid IS NULL OR ncbjCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"ncbjCurrentStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of matching ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator,
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

		List<NcbjCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<NcbjCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjCurrentStage ncbjCurrentStage : list) {
					if (!uuid.equals(ncbjCurrentStage.getUuid()) ||
						(companyId != ncbjCurrentStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_NCBJCURRENTSTAGE_WHERE);

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
				sb.append(NcbjCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjCurrentStage>)QueryUtil.list(
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
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws NoSuchNcbjCurrentStageException {

		NcbjCurrentStage ncbjCurrentStage = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (ncbjCurrentStage != null) {
			return ncbjCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchNcbjCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		List<NcbjCurrentStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws NoSuchNcbjCurrentStageException {

		NcbjCurrentStage ncbjCurrentStage = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (ncbjCurrentStage != null) {
			return ncbjCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchNcbjCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<NcbjCurrentStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj current stages before and after the current ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncbjCurrentStageId the primary key of the current ncbj current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	@Override
	public NcbjCurrentStage[] findByUuid_C_PrevAndNext(
			long ncbjCurrentStageId, String uuid, long companyId,
			OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws NoSuchNcbjCurrentStageException {

		uuid = Objects.toString(uuid, "");

		NcbjCurrentStage ncbjCurrentStage = findByPrimaryKey(
			ncbjCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			NcbjCurrentStage[] array = new NcbjCurrentStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, ncbjCurrentStage, uuid, companyId, orderByComparator,
				true);

			array[1] = ncbjCurrentStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, ncbjCurrentStage, uuid, companyId, orderByComparator,
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

	protected NcbjCurrentStage getByUuid_C_PrevAndNext(
		Session session, NcbjCurrentStage ncbjCurrentStage, String uuid,
		long companyId, OrderByComparator<NcbjCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJCURRENTSTAGE_WHERE);

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
			sb.append(NcbjCurrentStageModelImpl.ORDER_BY_JPQL);
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
						ncbjCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (NcbjCurrentStage ncbjCurrentStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjCurrentStage);
		}
	}

	/**
	 * Returns the number of ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncbj current stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJCURRENTSTAGE_WHERE);

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
		"ncbjCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(ncbjCurrentStage.uuid IS NULL OR ncbjCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"ncbjCurrentStage.companyId = ?";

	private FinderPath _finderPathFetchBygetByNcbj_Stage;
	private FinderPath _finderPathCountBygetByNcbj_Stage;

	/**
	 * Returns the ncbj current stage where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjCurrentStageException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage findBygetByNcbj_Stage(long ncbjApplicationId)
		throws NoSuchNcbjCurrentStageException {

		NcbjCurrentStage ncbjCurrentStage = fetchBygetByNcbj_Stage(
			ncbjApplicationId);

		if (ncbjCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjCurrentStageException(sb.toString());
		}

		return ncbjCurrentStage;
	}

	/**
	 * Returns the ncbj current stage where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage fetchBygetByNcbj_Stage(long ncbjApplicationId) {
		return fetchBygetByNcbj_Stage(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj current stage where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage fetchBygetByNcbj_Stage(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetByNcbj_Stage, finderArgs, this);
		}

		if (result instanceof NcbjCurrentStage) {
			NcbjCurrentStage ncbjCurrentStage = (NcbjCurrentStage)result;

			if (ncbjApplicationId != ncbjCurrentStage.getNcbjApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYNCBJ_STAGE_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetByNcbj_Stage, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncbjApplicationId};
							}

							_log.warn(
								"NcbjCurrentStagePersistenceImpl.fetchBygetByNcbj_Stage(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjCurrentStage ncbjCurrentStage = list.get(0);

					result = ncbjCurrentStage;

					cacheResult(ncbjCurrentStage);
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
			return (NcbjCurrentStage)result;
		}
	}

	/**
	 * Removes the ncbj current stage where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj current stage that was removed
	 */
	@Override
	public NcbjCurrentStage removeBygetByNcbj_Stage(long ncbjApplicationId)
		throws NoSuchNcbjCurrentStageException {

		NcbjCurrentStage ncbjCurrentStage = findBygetByNcbj_Stage(
			ncbjApplicationId);

		return remove(ncbjCurrentStage);
	}

	/**
	 * Returns the number of ncbj current stages where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj current stages
	 */
	@Override
	public int countBygetByNcbj_Stage(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetByNcbj_Stage;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYNCBJ_STAGE_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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
		_FINDER_COLUMN_GETBYNCBJ_STAGE_NCBJAPPLICATIONID_2 =
			"ncbjCurrentStage.ncbjApplicationId = ?";

	public NcbjCurrentStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(NcbjCurrentStage.class);

		setModelImplClass(NcbjCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the ncbj current stage in the entity cache if it is enabled.
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 */
	@Override
	public void cacheResult(NcbjCurrentStage ncbjCurrentStage) {
		entityCache.putResult(
			NcbjCurrentStageImpl.class, ncbjCurrentStage.getPrimaryKey(),
			ncbjCurrentStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				ncbjCurrentStage.getUuid(), ncbjCurrentStage.getGroupId()
			},
			ncbjCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetByNcbj_Stage,
			new Object[] {ncbjCurrentStage.getNcbjApplicationId()},
			ncbjCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj current stages in the entity cache if it is enabled.
	 *
	 * @param ncbjCurrentStages the ncbj current stages
	 */
	@Override
	public void cacheResult(List<NcbjCurrentStage> ncbjCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjCurrentStage ncbjCurrentStage : ncbjCurrentStages) {
			if (entityCache.getResult(
					NcbjCurrentStageImpl.class,
					ncbjCurrentStage.getPrimaryKey()) == null) {

				cacheResult(ncbjCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjCurrentStageImpl.class);

		finderCache.clearCache(NcbjCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the ncbj current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjCurrentStage ncbjCurrentStage) {
		entityCache.removeResult(NcbjCurrentStageImpl.class, ncbjCurrentStage);
	}

	@Override
	public void clearCache(List<NcbjCurrentStage> ncbjCurrentStages) {
		for (NcbjCurrentStage ncbjCurrentStage : ncbjCurrentStages) {
			entityCache.removeResult(
				NcbjCurrentStageImpl.class, ncbjCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjCurrentStageModelImpl ncbjCurrentStageModelImpl) {

		Object[] args = new Object[] {
			ncbjCurrentStageModelImpl.getUuid(),
			ncbjCurrentStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, ncbjCurrentStageModelImpl);

		args = new Object[] {ncbjCurrentStageModelImpl.getNcbjApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetByNcbj_Stage, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetByNcbj_Stage, args, ncbjCurrentStageModelImpl);
	}

	/**
	 * Creates a new ncbj current stage with the primary key. Does not add the ncbj current stage to the database.
	 *
	 * @param ncbjCurrentStageId the primary key for the new ncbj current stage
	 * @return the new ncbj current stage
	 */
	@Override
	public NcbjCurrentStage create(long ncbjCurrentStageId) {
		NcbjCurrentStage ncbjCurrentStage = new NcbjCurrentStageImpl();

		ncbjCurrentStage.setNew(true);
		ncbjCurrentStage.setPrimaryKey(ncbjCurrentStageId);

		String uuid = PortalUUIDUtil.generate();

		ncbjCurrentStage.setUuid(uuid);

		ncbjCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjCurrentStage;
	}

	/**
	 * Removes the ncbj current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage that was removed
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	@Override
	public NcbjCurrentStage remove(long ncbjCurrentStageId)
		throws NoSuchNcbjCurrentStageException {

		return remove((Serializable)ncbjCurrentStageId);
	}

	/**
	 * Removes the ncbj current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj current stage
	 * @return the ncbj current stage that was removed
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	@Override
	public NcbjCurrentStage remove(Serializable primaryKey)
		throws NoSuchNcbjCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			NcbjCurrentStage ncbjCurrentStage = (NcbjCurrentStage)session.get(
				NcbjCurrentStageImpl.class, primaryKey);

			if (ncbjCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjCurrentStage);
		}
		catch (NoSuchNcbjCurrentStageException noSuchEntityException) {
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
	protected NcbjCurrentStage removeImpl(NcbjCurrentStage ncbjCurrentStage) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjCurrentStage)) {
				ncbjCurrentStage = (NcbjCurrentStage)session.get(
					NcbjCurrentStageImpl.class,
					ncbjCurrentStage.getPrimaryKeyObj());
			}

			if (ncbjCurrentStage != null) {
				session.delete(ncbjCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjCurrentStage != null) {
			clearCache(ncbjCurrentStage);
		}

		return ncbjCurrentStage;
	}

	@Override
	public NcbjCurrentStage updateImpl(NcbjCurrentStage ncbjCurrentStage) {
		boolean isNew = ncbjCurrentStage.isNew();

		if (!(ncbjCurrentStage instanceof NcbjCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjCurrentStage implementation " +
					ncbjCurrentStage.getClass());
		}

		NcbjCurrentStageModelImpl ncbjCurrentStageModelImpl =
			(NcbjCurrentStageModelImpl)ncbjCurrentStage;

		if (Validator.isNull(ncbjCurrentStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			ncbjCurrentStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjCurrentStage.setCreateDate(date);
			}
			else {
				ncbjCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjCurrentStage.setModifiedDate(date);
			}
			else {
				ncbjCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjCurrentStage);
			}
			else {
				ncbjCurrentStage = (NcbjCurrentStage)session.merge(
					ncbjCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjCurrentStageImpl.class, ncbjCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(ncbjCurrentStageModelImpl);

		if (isNew) {
			ncbjCurrentStage.setNew(false);
		}

		ncbjCurrentStage.resetOriginalValues();

		return ncbjCurrentStage;
	}

	/**
	 * Returns the ncbj current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj current stage
	 * @return the ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	@Override
	public NcbjCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjCurrentStageException {

		NcbjCurrentStage ncbjCurrentStage = fetchByPrimaryKey(primaryKey);

		if (ncbjCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjCurrentStage;
	}

	/**
	 * Returns the ncbj current stage with the primary key or throws a <code>NoSuchNcbjCurrentStageException</code> if it could not be found.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	@Override
	public NcbjCurrentStage findByPrimaryKey(long ncbjCurrentStageId)
		throws NoSuchNcbjCurrentStageException {

		return findByPrimaryKey((Serializable)ncbjCurrentStageId);
	}

	/**
	 * Returns the ncbj current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage, or <code>null</code> if a ncbj current stage with the primary key could not be found
	 */
	@Override
	public NcbjCurrentStage fetchByPrimaryKey(long ncbjCurrentStageId) {
		return fetchByPrimaryKey((Serializable)ncbjCurrentStageId);
	}

	/**
	 * Returns all the ncbj current stages.
	 *
	 * @return the ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findAll(
		int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> findAll(
		int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator,
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

		List<NcbjCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<NcbjCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJCURRENTSTAGE;

				sql = sql.concat(NcbjCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjCurrentStage>)QueryUtil.list(
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
	 * Removes all the ncbj current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjCurrentStage ncbjCurrentStage : findAll()) {
			remove(ncbjCurrentStage);
		}
	}

	/**
	 * Returns the number of ncbj current stages.
	 *
	 * @return the number of ncbj current stages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJCURRENTSTAGE);

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
		return "ncbjCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj current stage persistence.
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

		_finderPathFetchBygetByNcbj_Stage = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetByNcbj_Stage",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetByNcbj_Stage = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetByNcbj_Stage",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(NcbjCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJCURRENTSTAGE =
		"SELECT ncbjCurrentStage FROM NcbjCurrentStage ncbjCurrentStage";

	private static final String _SQL_SELECT_NCBJCURRENTSTAGE_WHERE =
		"SELECT ncbjCurrentStage FROM NcbjCurrentStage ncbjCurrentStage WHERE ";

	private static final String _SQL_COUNT_NCBJCURRENTSTAGE =
		"SELECT COUNT(ncbjCurrentStage) FROM NcbjCurrentStage ncbjCurrentStage";

	private static final String _SQL_COUNT_NCBJCURRENTSTAGE_WHERE =
		"SELECT COUNT(ncbjCurrentStage) FROM NcbjCurrentStage ncbjCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjCurrentStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}