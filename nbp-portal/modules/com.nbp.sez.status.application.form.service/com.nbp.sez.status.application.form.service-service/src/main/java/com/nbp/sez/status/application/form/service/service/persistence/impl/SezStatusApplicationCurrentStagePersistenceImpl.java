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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezStatusApplicationCurrentStageException;
import com.nbp.sez.status.application.form.service.model.SezStatusApplicationCurrentStage;
import com.nbp.sez.status.application.form.service.model.SezStatusApplicationCurrentStageTable;
import com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationCurrentStageImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationCurrentStageModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusApplicationCurrentStagePersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusApplicationCurrentStageUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez status application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusApplicationCurrentStagePersistence.class)
public class SezStatusApplicationCurrentStagePersistenceImpl
	extends BasePersistenceImpl<SezStatusApplicationCurrentStage>
	implements SezStatusApplicationCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusApplicationCurrentStageUtil</code> to access the sez status application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusApplicationCurrentStageImpl.class.getName();

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
	 * Returns all the sez status application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @return the range of matching sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator,
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

		List<SezStatusApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list =
				(List<SezStatusApplicationCurrentStage>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusApplicationCurrentStage
						sezStatusApplicationCurrentStage : list) {

					if (!uuid.equals(
							sezStatusApplicationCurrentStage.getUuid())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE);

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
					SezStatusApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusApplicationCurrentStage>)QueryUtil.list(
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
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException {

		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			fetchByUuid_First(uuid, orderByComparator);

		if (sezStatusApplicationCurrentStage != null) {
			return sezStatusApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusApplicationCurrentStageException(
			sb.toString());
	}

	/**
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage fetchByUuid_First(
		String uuid,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		List<SezStatusApplicationCurrentStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException {

		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			fetchByUuid_Last(uuid, orderByComparator);

		if (sezStatusApplicationCurrentStage != null) {
			return sezStatusApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusApplicationCurrentStageException(
			sb.toString());
	}

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<SezStatusApplicationCurrentStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status application current stages before and after the current sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param sezStageId the primary key of the current sez status application current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage[] findByUuid_PrevAndNext(
			long sezStageId, String uuid,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException {

		uuid = Objects.toString(uuid, "");

		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			findByPrimaryKey(sezStageId);

		Session session = null;

		try {
			session = openSession();

			SezStatusApplicationCurrentStage[] array =
				new SezStatusApplicationCurrentStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, sezStatusApplicationCurrentStage, uuid,
				orderByComparator, true);

			array[1] = sezStatusApplicationCurrentStage;

			array[2] = getByUuid_PrevAndNext(
				session, sezStatusApplicationCurrentStage, uuid,
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

	protected SezStatusApplicationCurrentStage getByUuid_PrevAndNext(
		Session session,
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage,
		String uuid,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE);

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
			sb.append(SezStatusApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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
						sezStatusApplicationCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusApplicationCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status application current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of sez status application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status application current stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE);

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
		"sezStatusApplicationCurrentStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(sezStatusApplicationCurrentStage.uuid IS NULL OR sezStatusApplicationCurrentStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the sez status application current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage findByUUID_G(
			String uuid, long groupId)
		throws NoSuchSezStatusApplicationCurrentStageException {

		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			fetchByUUID_G(uuid, groupId);

		if (sezStatusApplicationCurrentStage == null) {
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

			throw new NoSuchSezStatusApplicationCurrentStageException(
				sb.toString());
		}

		return sezStatusApplicationCurrentStage;
	}

	/**
	 * Returns the sez status application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the sez status application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage fetchByUUID_G(
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

		if (result instanceof SezStatusApplicationCurrentStage) {
			SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
				(SezStatusApplicationCurrentStage)result;

			if (!Objects.equals(
					uuid, sezStatusApplicationCurrentStage.getUuid()) ||
				(groupId != sezStatusApplicationCurrentStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE);

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

				List<SezStatusApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					SezStatusApplicationCurrentStage
						sezStatusApplicationCurrentStage = list.get(0);

					result = sezStatusApplicationCurrentStage;

					cacheResult(sezStatusApplicationCurrentStage);
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
			return (SezStatusApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the sez status application current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status application current stage that was removed
	 */
	@Override
	public SezStatusApplicationCurrentStage removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchSezStatusApplicationCurrentStageException {

		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			findByUUID_G(uuid, groupId);

		return remove(sezStatusApplicationCurrentStage);
	}

	/**
	 * Returns the number of sez status application current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status application current stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE);

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
		"sezStatusApplicationCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(sezStatusApplicationCurrentStage.uuid IS NULL OR sezStatusApplicationCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"sezStatusApplicationCurrentStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @return the range of matching sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator,
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

		List<SezStatusApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list =
				(List<SezStatusApplicationCurrentStage>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusApplicationCurrentStage
						sezStatusApplicationCurrentStage : list) {

					if (!uuid.equals(
							sezStatusApplicationCurrentStage.getUuid()) ||
						(companyId !=
							sezStatusApplicationCurrentStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE);

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
					SezStatusApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusApplicationCurrentStage>)QueryUtil.list(
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
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException {

		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (sezStatusApplicationCurrentStage != null) {
			return sezStatusApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusApplicationCurrentStageException(
			sb.toString());
	}

	/**
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		List<SezStatusApplicationCurrentStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException {

		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (sezStatusApplicationCurrentStage != null) {
			return sezStatusApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusApplicationCurrentStageException(
			sb.toString());
	}

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<SezStatusApplicationCurrentStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status application current stages before and after the current sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStageId the primary key of the current sez status application current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage[] findByUuid_C_PrevAndNext(
			long sezStageId, String uuid, long companyId,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException {

		uuid = Objects.toString(uuid, "");

		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			findByPrimaryKey(sezStageId);

		Session session = null;

		try {
			session = openSession();

			SezStatusApplicationCurrentStage[] array =
				new SezStatusApplicationCurrentStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, sezStatusApplicationCurrentStage, uuid, companyId,
				orderByComparator, true);

			array[1] = sezStatusApplicationCurrentStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, sezStatusApplicationCurrentStage, uuid, companyId,
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

	protected SezStatusApplicationCurrentStage getByUuid_C_PrevAndNext(
		Session session,
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage,
		String uuid, long companyId,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE);

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
			sb.append(SezStatusApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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
						sezStatusApplicationCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusApplicationCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status application current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sezStatusApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status application current stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE);

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
		"sezStatusApplicationCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(sezStatusApplicationCurrentStage.uuid IS NULL OR sezStatusApplicationCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"sezStatusApplicationCurrentStage.companyId = ?";

	private FinderPath _finderPathFetchBygetSEZ_Stage_SAI;
	private FinderPath _finderPathCountBygetSEZ_Stage_SAI;

	/**
	 * Returns the sez status application current stage where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage findBygetSEZ_Stage_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationCurrentStageException {

		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			fetchBygetSEZ_Stage_SAI(sezStatusApplicationId);

		if (sezStatusApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusApplicationCurrentStageException(
				sb.toString());
		}

		return sezStatusApplicationCurrentStage;
	}

	/**
	 * Returns the sez status application current stage where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage fetchBygetSEZ_Stage_SAI(
		long sezStatusApplicationId) {

		return fetchBygetSEZ_Stage_SAI(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez status application current stage where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage fetchBygetSEZ_Stage_SAI(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSEZ_Stage_SAI, finderArgs, this);
		}

		if (result instanceof SezStatusApplicationCurrentStage) {
			SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
				(SezStatusApplicationCurrentStage)result;

			if (sezStatusApplicationId !=
					sezStatusApplicationCurrentStage.
						getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETSEZ_STAGE_SAI_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezStatusApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSEZ_Stage_SAI, finderArgs,
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
								"SezStatusApplicationCurrentStagePersistenceImpl.fetchBygetSEZ_Stage_SAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusApplicationCurrentStage
						sezStatusApplicationCurrentStage = list.get(0);

					result = sezStatusApplicationCurrentStage;

					cacheResult(sezStatusApplicationCurrentStage);
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
			return (SezStatusApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the sez status application current stage where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status application current stage that was removed
	 */
	@Override
	public SezStatusApplicationCurrentStage removeBygetSEZ_Stage_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationCurrentStageException {

		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			findBygetSEZ_Stage_SAI(sezStatusApplicationId);

		return remove(sezStatusApplicationCurrentStage);
	}

	/**
	 * Returns the number of sez status application current stages where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status application current stages
	 */
	@Override
	public int countBygetSEZ_Stage_SAI(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSEZ_Stage_SAI;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETSEZ_STAGE_SAI_SEZSTATUSAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETSEZ_STAGE_SAI_SEZSTATUSAPPLICATIONID_2 =
			"sezStatusApplicationCurrentStage.sezStatusApplicationId = ?";

	public SezStatusApplicationCurrentStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(SezStatusApplicationCurrentStage.class);

		setModelImplClass(SezStatusApplicationCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusApplicationCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the sez status application current stage in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationCurrentStage the sez status application current stage
	 */
	@Override
	public void cacheResult(
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage) {

		entityCache.putResult(
			SezStatusApplicationCurrentStageImpl.class,
			sezStatusApplicationCurrentStage.getPrimaryKey(),
			sezStatusApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				sezStatusApplicationCurrentStage.getUuid(),
				sezStatusApplicationCurrentStage.getGroupId()
			},
			sezStatusApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetSEZ_Stage_SAI,
			new Object[] {
				sezStatusApplicationCurrentStage.getSezStatusApplicationId()
			},
			sezStatusApplicationCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status application current stages in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationCurrentStages the sez status application current stages
	 */
	@Override
	public void cacheResult(
		List<SezStatusApplicationCurrentStage>
			sezStatusApplicationCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusApplicationCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage :
				sezStatusApplicationCurrentStages) {

			if (entityCache.getResult(
					SezStatusApplicationCurrentStageImpl.class,
					sezStatusApplicationCurrentStage.getPrimaryKey()) == null) {

				cacheResult(sezStatusApplicationCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all sez status application current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusApplicationCurrentStageImpl.class);

		finderCache.clearCache(SezStatusApplicationCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the sez status application current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage) {

		entityCache.removeResult(
			SezStatusApplicationCurrentStageImpl.class,
			sezStatusApplicationCurrentStage);
	}

	@Override
	public void clearCache(
		List<SezStatusApplicationCurrentStage>
			sezStatusApplicationCurrentStages) {

		for (SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage :
				sezStatusApplicationCurrentStages) {

			entityCache.removeResult(
				SezStatusApplicationCurrentStageImpl.class,
				sezStatusApplicationCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusApplicationCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusApplicationCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusApplicationCurrentStageModelImpl
			sezStatusApplicationCurrentStageModelImpl) {

		Object[] args = new Object[] {
			sezStatusApplicationCurrentStageModelImpl.getUuid(),
			sezStatusApplicationCurrentStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			sezStatusApplicationCurrentStageModelImpl);

		args = new Object[] {
			sezStatusApplicationCurrentStageModelImpl.
				getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSEZ_Stage_SAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSEZ_Stage_SAI, args,
			sezStatusApplicationCurrentStageModelImpl);
	}

	/**
	 * Creates a new sez status application current stage with the primary key. Does not add the sez status application current stage to the database.
	 *
	 * @param sezStageId the primary key for the new sez status application current stage
	 * @return the new sez status application current stage
	 */
	@Override
	public SezStatusApplicationCurrentStage create(long sezStageId) {
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			new SezStatusApplicationCurrentStageImpl();

		sezStatusApplicationCurrentStage.setNew(true);
		sezStatusApplicationCurrentStage.setPrimaryKey(sezStageId);

		String uuid = PortalUUIDUtil.generate();

		sezStatusApplicationCurrentStage.setUuid(uuid);

		sezStatusApplicationCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezStatusApplicationCurrentStage;
	}

	/**
	 * Removes the sez status application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage that was removed
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage remove(long sezStageId)
		throws NoSuchSezStatusApplicationCurrentStageException {

		return remove((Serializable)sezStageId);
	}

	/**
	 * Removes the sez status application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status application current stage
	 * @return the sez status application current stage that was removed
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage remove(Serializable primaryKey)
		throws NoSuchSezStatusApplicationCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
				(SezStatusApplicationCurrentStage)session.get(
					SezStatusApplicationCurrentStageImpl.class, primaryKey);

			if (sezStatusApplicationCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusApplicationCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusApplicationCurrentStage);
		}
		catch (NoSuchSezStatusApplicationCurrentStageException
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
	protected SezStatusApplicationCurrentStage removeImpl(
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusApplicationCurrentStage)) {
				sezStatusApplicationCurrentStage =
					(SezStatusApplicationCurrentStage)session.get(
						SezStatusApplicationCurrentStageImpl.class,
						sezStatusApplicationCurrentStage.getPrimaryKeyObj());
			}

			if (sezStatusApplicationCurrentStage != null) {
				session.delete(sezStatusApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusApplicationCurrentStage != null) {
			clearCache(sezStatusApplicationCurrentStage);
		}

		return sezStatusApplicationCurrentStage;
	}

	@Override
	public SezStatusApplicationCurrentStage updateImpl(
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage) {

		boolean isNew = sezStatusApplicationCurrentStage.isNew();

		if (!(sezStatusApplicationCurrentStage instanceof
				SezStatusApplicationCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezStatusApplicationCurrentStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusApplicationCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusApplicationCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusApplicationCurrentStage implementation " +
					sezStatusApplicationCurrentStage.getClass());
		}

		SezStatusApplicationCurrentStageModelImpl
			sezStatusApplicationCurrentStageModelImpl =
				(SezStatusApplicationCurrentStageModelImpl)
					sezStatusApplicationCurrentStage;

		if (Validator.isNull(sezStatusApplicationCurrentStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			sezStatusApplicationCurrentStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(sezStatusApplicationCurrentStage.getCreateDate() == null)) {

			if (serviceContext == null) {
				sezStatusApplicationCurrentStage.setCreateDate(date);
			}
			else {
				sezStatusApplicationCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusApplicationCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusApplicationCurrentStage.setModifiedDate(date);
			}
			else {
				sezStatusApplicationCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusApplicationCurrentStage);
			}
			else {
				sezStatusApplicationCurrentStage =
					(SezStatusApplicationCurrentStage)session.merge(
						sezStatusApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusApplicationCurrentStageImpl.class,
			sezStatusApplicationCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(sezStatusApplicationCurrentStageModelImpl);

		if (isNew) {
			sezStatusApplicationCurrentStage.setNew(false);
		}

		sezStatusApplicationCurrentStage.resetOriginalValues();

		return sezStatusApplicationCurrentStage;
	}

	/**
	 * Returns the sez status application current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status application current stage
	 * @return the sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezStatusApplicationCurrentStageException {

		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (sezStatusApplicationCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusApplicationCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusApplicationCurrentStage;
	}

	/**
	 * Returns the sez status application current stage with the primary key or throws a <code>NoSuchSezStatusApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage findByPrimaryKey(long sezStageId)
		throws NoSuchSezStatusApplicationCurrentStageException {

		return findByPrimaryKey((Serializable)sezStageId);
	}

	/**
	 * Returns the sez status application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage, or <code>null</code> if a sez status application current stage with the primary key could not be found
	 */
	@Override
	public SezStatusApplicationCurrentStage fetchByPrimaryKey(long sezStageId) {
		return fetchByPrimaryKey((Serializable)sezStageId);
	}

	/**
	 * Returns all the sez status application current stages.
	 *
	 * @return the sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @return the range of sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status application current stages
	 */
	@Override
	public List<SezStatusApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator,
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

		List<SezStatusApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list =
				(List<SezStatusApplicationCurrentStage>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSAPPLICATIONCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSAPPLICATIONCURRENTSTAGE;

				sql = sql.concat(
					SezStatusApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusApplicationCurrentStage>)QueryUtil.list(
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
	 * Removes all the sez status application current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage :
				findAll()) {

			remove(sezStatusApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of sez status application current stages.
	 *
	 * @return the number of sez status application current stages
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
					_SQL_COUNT_SEZSTATUSAPPLICATIONCURRENTSTAGE);

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
		return "sezStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSAPPLICATIONCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusApplicationCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status application current stage persistence.
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

		_finderPathFetchBygetSEZ_Stage_SAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSEZ_Stage_SAI",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSEZ_Stage_SAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSEZ_Stage_SAI", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezStatusApplicationCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusApplicationCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(
			SezStatusApplicationCurrentStageImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZSTATUSAPPLICATIONCURRENTSTAGE =
		"SELECT sezStatusApplicationCurrentStage FROM SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage";

	private static final String
		_SQL_SELECT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE =
			"SELECT sezStatusApplicationCurrentStage FROM SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSAPPLICATIONCURRENTSTAGE =
		"SELECT COUNT(sezStatusApplicationCurrentStage) FROM SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage";

	private static final String
		_SQL_COUNT_SEZSTATUSAPPLICATIONCURRENTSTAGE_WHERE =
			"SELECT COUNT(sezStatusApplicationCurrentStage) FROM SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusApplicationCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusApplicationCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusApplicationCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusApplicationCurrentStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}