/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence.impl;

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

import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesApplicationStageException;
import com.nbp.factories.registration.stage.services.model.FactoriesApplicationStage;
import com.nbp.factories.registration.stage.services.model.FactoriesApplicationStageTable;
import com.nbp.factories.registration.stage.services.model.impl.FactoriesApplicationStageImpl;
import com.nbp.factories.registration.stage.services.model.impl.FactoriesApplicationStageModelImpl;
import com.nbp.factories.registration.stage.services.service.persistence.FactoriesApplicationStagePersistence;
import com.nbp.factories.registration.stage.services.service.persistence.FactoriesApplicationStageUtil;
import com.nbp.factories.registration.stage.services.service.persistence.impl.constants.FACTORIES_REGISTRATIONPersistenceConstants;

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
 * The persistence implementation for the factories application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FactoriesApplicationStagePersistence.class)
public class FactoriesApplicationStagePersistenceImpl
	extends BasePersistenceImpl<FactoriesApplicationStage>
	implements FactoriesApplicationStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FactoriesApplicationStageUtil</code> to access the factories application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FactoriesApplicationStageImpl.class.getName();

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
	 * Returns all the factories application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
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

		List<FactoriesApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<FactoriesApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesApplicationStage factoriesApplicationStage :
						list) {

					if (!uuid.equals(factoriesApplicationStage.getUuid())) {
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

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

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
				sb.append(FactoriesApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FactoriesApplicationStage>)QueryUtil.list(
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
	 * Returns the first factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage = fetchByUuid_First(
			uuid, orderByComparator);

		if (factoriesApplicationStage != null) {
			return factoriesApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFactoriesApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchByUuid_First(
		String uuid,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		List<FactoriesApplicationStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage = fetchByUuid_Last(
			uuid, orderByComparator);

		if (factoriesApplicationStage != null) {
			return factoriesApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFactoriesApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<FactoriesApplicationStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationStage[] findByUuid_PrevAndNext(
			long factoriesApplicationStageId, String uuid,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		uuid = Objects.toString(uuid, "");

		FactoriesApplicationStage factoriesApplicationStage = findByPrimaryKey(
			factoriesApplicationStageId);

		Session session = null;

		try {
			session = openSession();

			FactoriesApplicationStage[] array =
				new FactoriesApplicationStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, factoriesApplicationStage, uuid, orderByComparator,
				true);

			array[1] = factoriesApplicationStage;

			array[2] = getByUuid_PrevAndNext(
				session, factoriesApplicationStage, uuid, orderByComparator,
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

	protected FactoriesApplicationStage getByUuid_PrevAndNext(
		Session session, FactoriesApplicationStage factoriesApplicationStage,
		String uuid,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

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
			sb.append(FactoriesApplicationStageModelImpl.ORDER_BY_JPQL);
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
						factoriesApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (FactoriesApplicationStage factoriesApplicationStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(factoriesApplicationStage);
		}
	}

	/**
	 * Returns the number of factories application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching factories application stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONSTAGE_WHERE);

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
		"factoriesApplicationStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(factoriesApplicationStage.uuid IS NULL OR factoriesApplicationStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the factories application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage = fetchByUUID_G(
			uuid, groupId);

		if (factoriesApplicationStage == null) {
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

			throw new NoSuchFactoriesApplicationStageException(sb.toString());
		}

		return factoriesApplicationStage;
	}

	/**
	 * Returns the factories application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the factories application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchByUUID_G(
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

		if (result instanceof FactoriesApplicationStage) {
			FactoriesApplicationStage factoriesApplicationStage =
				(FactoriesApplicationStage)result;

			if (!Objects.equals(uuid, factoriesApplicationStage.getUuid()) ||
				(groupId != factoriesApplicationStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

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

				List<FactoriesApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					FactoriesApplicationStage factoriesApplicationStage =
						list.get(0);

					result = factoriesApplicationStage;

					cacheResult(factoriesApplicationStage);
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
			return (FactoriesApplicationStage)result;
		}
	}

	/**
	 * Removes the factories application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the factories application stage that was removed
	 */
	@Override
	public FactoriesApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage = findByUUID_G(
			uuid, groupId);

		return remove(factoriesApplicationStage);
	}

	/**
	 * Returns the number of factories application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching factories application stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONSTAGE_WHERE);

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
		"factoriesApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(factoriesApplicationStage.uuid IS NULL OR factoriesApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"factoriesApplicationStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
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

		List<FactoriesApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<FactoriesApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesApplicationStage factoriesApplicationStage :
						list) {

					if (!uuid.equals(factoriesApplicationStage.getUuid()) ||
						(companyId !=
							factoriesApplicationStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

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
				sb.append(FactoriesApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FactoriesApplicationStage>)QueryUtil.list(
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
	 * Returns the first factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (factoriesApplicationStage != null) {
			return factoriesApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFactoriesApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		List<FactoriesApplicationStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (factoriesApplicationStage != null) {
			return factoriesApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFactoriesApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<FactoriesApplicationStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationStage[] findByUuid_C_PrevAndNext(
			long factoriesApplicationStageId, String uuid, long companyId,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		uuid = Objects.toString(uuid, "");

		FactoriesApplicationStage factoriesApplicationStage = findByPrimaryKey(
			factoriesApplicationStageId);

		Session session = null;

		try {
			session = openSession();

			FactoriesApplicationStage[] array =
				new FactoriesApplicationStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, factoriesApplicationStage, uuid, companyId,
				orderByComparator, true);

			array[1] = factoriesApplicationStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, factoriesApplicationStage, uuid, companyId,
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

	protected FactoriesApplicationStage getByUuid_C_PrevAndNext(
		Session session, FactoriesApplicationStage factoriesApplicationStage,
		String uuid, long companyId,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

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
			sb.append(FactoriesApplicationStageModelImpl.ORDER_BY_JPQL);
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
						factoriesApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (FactoriesApplicationStage factoriesApplicationStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(factoriesApplicationStage);
		}
	}

	/**
	 * Returns the number of factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching factories application stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONSTAGE_WHERE);

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
		"factoriesApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(factoriesApplicationStage.uuid IS NULL OR factoriesApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"factoriesApplicationStage.companyId = ?";

	private FinderPath _finderPathFetchBygetFactories_By_AI;
	private FinderPath _finderPathCountBygetFactories_By_AI;

	/**
	 * Returns the factories application stage where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findBygetFactories_By_AI(
			long factoriesApplicationId)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			fetchBygetFactories_By_AI(factoriesApplicationId);

		if (factoriesApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("factoriesApplicationId=");
			sb.append(factoriesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesApplicationStageException(sb.toString());
		}

		return factoriesApplicationStage;
	}

	/**
	 * Returns the factories application stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_AI(
		long factoriesApplicationId) {

		return fetchBygetFactories_By_AI(factoriesApplicationId, true);
	}

	/**
	 * Returns the factories application stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_AI(
		long factoriesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {factoriesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactories_By_AI, finderArgs, this);
		}

		if (result instanceof FactoriesApplicationStage) {
			FactoriesApplicationStage factoriesApplicationStage =
				(FactoriesApplicationStage)result;

			if (factoriesApplicationId !=
					factoriesApplicationStage.getFactoriesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFACTORIES_BY_AI_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

				List<FactoriesApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactories_By_AI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									factoriesApplicationId
								};
							}

							_log.warn(
								"FactoriesApplicationStagePersistenceImpl.fetchBygetFactories_By_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesApplicationStage factoriesApplicationStage =
						list.get(0);

					result = factoriesApplicationStage;

					cacheResult(factoriesApplicationStage);
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
			return (FactoriesApplicationStage)result;
		}
	}

	/**
	 * Removes the factories application stage where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories application stage that was removed
	 */
	@Override
	public FactoriesApplicationStage removeBygetFactories_By_AI(
			long factoriesApplicationId)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			findBygetFactories_By_AI(factoriesApplicationId);

		return remove(factoriesApplicationStage);
	}

	/**
	 * Returns the number of factories application stages where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories application stages
	 */
	@Override
	public int countBygetFactories_By_AI(long factoriesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFactories_By_AI;

		Object[] finderArgs = new Object[] {factoriesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFACTORIES_BY_AI_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

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
		_FINDER_COLUMN_GETFACTORIES_BY_AI_FACTORIESAPPLICATIONID_2 =
			"factoriesApplicationStage.factoriesApplicationId = ?";

	private FinderPath _finderPathFetchBygetFactories_By_CaseIdStageName;
	private FinderPath _finderPathCountBygetFactories_By_CaseIdStageName;

	/**
	 * Returns the factories application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findBygetFactories_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			fetchBygetFactories_By_CaseIdStageName(caseId, stageName);

		if (factoriesApplicationStage == null) {
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

			throw new NoSuchFactoriesApplicationStageException(sb.toString());
		}

		return factoriesApplicationStage;
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetFactories_By_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdStageName(
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
				_finderPathFetchBygetFactories_By_CaseIdStageName, finderArgs,
				this);
		}

		if (result instanceof FactoriesApplicationStage) {
			FactoriesApplicationStage factoriesApplicationStage =
				(FactoriesApplicationStage)result;

			if (!Objects.equals(
					caseId, factoriesApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageName, factoriesApplicationStage.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				List<FactoriesApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactories_By_CaseIdStageName,
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
								"FactoriesApplicationStagePersistenceImpl.fetchBygetFactories_By_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesApplicationStage factoriesApplicationStage =
						list.get(0);

					result = factoriesApplicationStage;

					cacheResult(factoriesApplicationStage);
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
			return (FactoriesApplicationStage)result;
		}
	}

	/**
	 * Removes the factories application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the factories application stage that was removed
	 */
	@Override
	public FactoriesApplicationStage removeBygetFactories_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			findBygetFactories_By_CaseIdStageName(caseId, stageName);

		return remove(factoriesApplicationStage);
	}

	/**
	 * Returns the number of factories application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching factories application stages
	 */
	@Override
	public int countBygetFactories_By_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath =
			_finderPathCountBygetFactories_By_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_CASEID_2 =
			"factoriesApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_CASEID_3 =
			"(factoriesApplicationStage.caseId IS NULL OR factoriesApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_STAGENAME_2 =
			"factoriesApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGENAME_STAGENAME_3 =
			"(factoriesApplicationStage.stageName IS NULL OR factoriesApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchByget_Factories_By_CaseId;
	private FinderPath _finderPathCountByget_Factories_By_CaseId;

	/**
	 * Returns the factories application stage where caseId = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findByget_Factories_By_CaseId(
			String caseId)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			fetchByget_Factories_By_CaseId(caseId);

		if (factoriesApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesApplicationStageException(sb.toString());
		}

		return factoriesApplicationStage;
	}

	/**
	 * Returns the factories application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchByget_Factories_By_CaseId(
		String caseId) {

		return fetchByget_Factories_By_CaseId(caseId, true);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchByget_Factories_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByget_Factories_By_CaseId, finderArgs, this);
		}

		if (result instanceof FactoriesApplicationStage) {
			FactoriesApplicationStage factoriesApplicationStage =
				(FactoriesApplicationStage)result;

			if (!Objects.equals(
					caseId, factoriesApplicationStage.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FACTORIES_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FACTORIES_BY_CASEID_CASEID_2);
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

				List<FactoriesApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_Factories_By_CaseId,
							finderArgs, list);
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
								"FactoriesApplicationStagePersistenceImpl.fetchByget_Factories_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesApplicationStage factoriesApplicationStage =
						list.get(0);

					result = factoriesApplicationStage;

					cacheResult(factoriesApplicationStage);
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
			return (FactoriesApplicationStage)result;
		}
	}

	/**
	 * Removes the factories application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories application stage that was removed
	 */
	@Override
	public FactoriesApplicationStage removeByget_Factories_By_CaseId(
			String caseId)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			findByget_Factories_By_CaseId(caseId);

		return remove(factoriesApplicationStage);
	}

	/**
	 * Returns the number of factories application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application stages
	 */
	@Override
	public int countByget_Factories_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountByget_Factories_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FACTORIES_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FACTORIES_BY_CASEID_CASEID_2);
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
		_FINDER_COLUMN_GET_FACTORIES_BY_CASEID_CASEID_2 =
			"factoriesApplicationStage.caseId = ?";

	private static final String
		_FINDER_COLUMN_GET_FACTORIES_BY_CASEID_CASEID_3 =
			"(factoriesApplicationStage.caseId IS NULL OR factoriesApplicationStage.caseId = '')";

	private FinderPath _finderPathFetchBygetFactories_By_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetFactories_By_CaseIdStageStatus;

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findBygetFactories_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			fetchBygetFactories_By_CaseIdStageStatus(
				caseId, stageStatus, stageName);

		if (factoriesApplicationStage == null) {
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

			throw new NoSuchFactoriesApplicationStageException(sb.toString());
		}

		return factoriesApplicationStage;
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetFactories_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdStageStatus(
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
				_finderPathFetchBygetFactories_By_CaseIdStageStatus, finderArgs,
				this);
		}

		if (result instanceof FactoriesApplicationStage) {
			FactoriesApplicationStage factoriesApplicationStage =
				(FactoriesApplicationStage)result;

			if (!Objects.equals(
					caseId, factoriesApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageStatus, factoriesApplicationStage.getStageStatus()) ||
				!Objects.equals(
					stageName, factoriesApplicationStage.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				List<FactoriesApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactories_By_CaseIdStageStatus,
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
								"FactoriesApplicationStagePersistenceImpl.fetchBygetFactories_By_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesApplicationStage factoriesApplicationStage =
						list.get(0);

					result = factoriesApplicationStage;

					cacheResult(factoriesApplicationStage);
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
			return (FactoriesApplicationStage)result;
		}
	}

	/**
	 * Removes the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the factories application stage that was removed
	 */
	@Override
	public FactoriesApplicationStage removeBygetFactories_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			findBygetFactories_By_CaseIdStageStatus(
				caseId, stageStatus, stageName);

		return remove(factoriesApplicationStage);
	}

	/**
	 * Returns the number of factories application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching factories application stages
	 */
	@Override
	public int countBygetFactories_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath =
			_finderPathCountBygetFactories_By_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_CASEID_2 =
			"factoriesApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_CASEID_3 =
			"(factoriesApplicationStage.caseId IS NULL OR factoriesApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"factoriesApplicationStage.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(factoriesApplicationStage.stageStatus IS NULL OR factoriesApplicationStage.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGENAME_2 =
			"factoriesApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(factoriesApplicationStage.stageName IS NULL OR factoriesApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchBygetFactories_By_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetFactories_By_CaseIdAndStatus;

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findBygetFactories_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			fetchBygetFactories_By_CaseIdAndStatus(caseId, stageStatus);

		if (factoriesApplicationStage == null) {
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

			throw new NoSuchFactoriesApplicationStageException(sb.toString());
		}

		return factoriesApplicationStage;
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetFactories_By_CaseIdAndStatus(
			caseId, stageStatus, true);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdAndStatus(
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
				_finderPathFetchBygetFactories_By_CaseIdAndStatus, finderArgs,
				this);
		}

		if (result instanceof FactoriesApplicationStage) {
			FactoriesApplicationStage factoriesApplicationStage =
				(FactoriesApplicationStage)result;

			if (!Objects.equals(
					caseId, factoriesApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageStatus, factoriesApplicationStage.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<FactoriesApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactories_By_CaseIdAndStatus,
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
								"FactoriesApplicationStagePersistenceImpl.fetchBygetFactories_By_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesApplicationStage factoriesApplicationStage =
						list.get(0);

					result = factoriesApplicationStage;

					cacheResult(factoriesApplicationStage);
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
			return (FactoriesApplicationStage)result;
		}
	}

	/**
	 * Removes the factories application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the factories application stage that was removed
	 */
	@Override
	public FactoriesApplicationStage removeBygetFactories_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			findBygetFactories_By_CaseIdAndStatus(caseId, stageStatus);

		return remove(factoriesApplicationStage);
	}

	/**
	 * Returns the number of factories application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching factories application stages
	 */
	@Override
	public int countBygetFactories_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath =
			_finderPathCountBygetFactories_By_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_CASEID_2 =
			"factoriesApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_CASEID_3 =
			"(factoriesApplicationStage.caseId IS NULL OR factoriesApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_STAGESTATUS_2 =
			"factoriesApplicationStage.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(factoriesApplicationStage.stageStatus IS NULL OR factoriesApplicationStage.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetFactories_By_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetFactories_By_CaseId;
	private FinderPath _finderPathCountBygetFactories_By_CaseId;

	/**
	 * Returns all the factories application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findBygetFactories_By_CaseId(
		String caseId) {

		return findBygetFactories_By_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findBygetFactories_By_CaseId(
		String caseId, int start, int end) {

		return findBygetFactories_By_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findBygetFactories_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return findBygetFactories_By_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findBygetFactories_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFactories_By_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFactories_By_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FactoriesApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<FactoriesApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesApplicationStage factoriesApplicationStage :
						list) {

					if (!caseId.equals(factoriesApplicationStage.getCaseId())) {
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

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORIES_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORIES_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FactoriesApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FactoriesApplicationStage>)QueryUtil.list(
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
	 * Returns the first factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findBygetFactories_By_CaseId_First(
			String caseId,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			fetchBygetFactories_By_CaseId_First(caseId, orderByComparator);

		if (factoriesApplicationStage != null) {
			return factoriesApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFactoriesApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_CaseId_First(
		String caseId,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		List<FactoriesApplicationStage> list = findBygetFactories_By_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findBygetFactories_By_CaseId_Last(
			String caseId,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			fetchBygetFactories_By_CaseId_Last(caseId, orderByComparator);

		if (factoriesApplicationStage != null) {
			return factoriesApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFactoriesApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_CaseId_Last(
		String caseId,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		int count = countBygetFactories_By_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<FactoriesApplicationStage> list = findBygetFactories_By_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationStage[] findBygetFactories_By_CaseId_PrevAndNext(
			long factoriesApplicationStageId, String caseId,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		caseId = Objects.toString(caseId, "");

		FactoriesApplicationStage factoriesApplicationStage = findByPrimaryKey(
			factoriesApplicationStageId);

		Session session = null;

		try {
			session = openSession();

			FactoriesApplicationStage[] array =
				new FactoriesApplicationStageImpl[3];

			array[0] = getBygetFactories_By_CaseId_PrevAndNext(
				session, factoriesApplicationStage, caseId, orderByComparator,
				true);

			array[1] = factoriesApplicationStage;

			array[2] = getBygetFactories_By_CaseId_PrevAndNext(
				session, factoriesApplicationStage, caseId, orderByComparator,
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

	protected FactoriesApplicationStage getBygetFactories_By_CaseId_PrevAndNext(
		Session session, FactoriesApplicationStage factoriesApplicationStage,
		String caseId,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFACTORIES_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETFACTORIES_BY_CASEID_CASEID_2);
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
			sb.append(FactoriesApplicationStageModelImpl.ORDER_BY_JPQL);
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
						factoriesApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetFactories_By_CaseId(String caseId) {
		for (FactoriesApplicationStage factoriesApplicationStage :
				findBygetFactories_By_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(factoriesApplicationStage);
		}
	}

	/**
	 * Returns the number of factories application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application stages
	 */
	@Override
	public int countBygetFactories_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFactories_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORIES_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORIES_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETFACTORIES_BY_CASEID_CASEID_2 =
		"factoriesApplicationStage.caseId = ?";

	private static final String _FINDER_COLUMN_GETFACTORIES_BY_CASEID_CASEID_3 =
		"(factoriesApplicationStage.caseId IS NULL OR factoriesApplicationStage.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetFactories_By_StageName;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFactories_By_StageName;
	private FinderPath _finderPathCountBygetFactories_By_StageName;

	/**
	 * Returns all the factories application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findBygetFactories_By_StageName(
		String stageName) {

		return findBygetFactories_By_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findBygetFactories_By_StageName(
		String stageName, int start, int end) {

		return findBygetFactories_By_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findBygetFactories_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return findBygetFactories_By_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findBygetFactories_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFactories_By_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFactories_By_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<FactoriesApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<FactoriesApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesApplicationStage factoriesApplicationStage :
						list) {

					if (!stageName.equals(
							factoriesApplicationStage.getStageName())) {

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

			sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORIES_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFACTORIES_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FactoriesApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FactoriesApplicationStage>)QueryUtil.list(
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
	 * Returns the first factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findBygetFactories_By_StageName_First(
			String stageName,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			fetchBygetFactories_By_StageName_First(
				stageName, orderByComparator);

		if (factoriesApplicationStage != null) {
			return factoriesApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchFactoriesApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_StageName_First(
		String stageName,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		List<FactoriesApplicationStage> list = findBygetFactories_By_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage findBygetFactories_By_StageName_Last(
			String stageName,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage =
			fetchBygetFactories_By_StageName_Last(stageName, orderByComparator);

		if (factoriesApplicationStage != null) {
			return factoriesApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchFactoriesApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchBygetFactories_By_StageName_Last(
		String stageName,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		int count = countBygetFactories_By_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<FactoriesApplicationStage> list = findBygetFactories_By_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationStage[]
			findBygetFactories_By_StageName_PrevAndNext(
				long factoriesApplicationStageId, String stageName,
				OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException {

		stageName = Objects.toString(stageName, "");

		FactoriesApplicationStage factoriesApplicationStage = findByPrimaryKey(
			factoriesApplicationStageId);

		Session session = null;

		try {
			session = openSession();

			FactoriesApplicationStage[] array =
				new FactoriesApplicationStageImpl[3];

			array[0] = getBygetFactories_By_StageName_PrevAndNext(
				session, factoriesApplicationStage, stageName,
				orderByComparator, true);

			array[1] = factoriesApplicationStage;

			array[2] = getBygetFactories_By_StageName_PrevAndNext(
				session, factoriesApplicationStage, stageName,
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

	protected FactoriesApplicationStage
		getBygetFactories_By_StageName_PrevAndNext(
			Session session,
			FactoriesApplicationStage factoriesApplicationStage,
			String stageName,
			OrderByComparator<FactoriesApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFACTORIES_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETFACTORIES_BY_STAGENAME_STAGENAME_2);
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
			sb.append(FactoriesApplicationStageModelImpl.ORDER_BY_JPQL);
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
						factoriesApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetFactories_By_StageName(String stageName) {
		for (FactoriesApplicationStage factoriesApplicationStage :
				findBygetFactories_By_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(factoriesApplicationStage);
		}
	}

	/**
	 * Returns the number of factories application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching factories application stages
	 */
	@Override
	public int countBygetFactories_By_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetFactories_By_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORIES_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFACTORIES_BY_STAGENAME_STAGENAME_2);
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

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_STAGENAME_STAGENAME_2 =
			"factoriesApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORIES_BY_STAGENAME_STAGENAME_3 =
			"(factoriesApplicationStage.stageName IS NULL OR factoriesApplicationStage.stageName = '')";

	public FactoriesApplicationStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FactoriesApplicationStage.class);

		setModelImplClass(FactoriesApplicationStageImpl.class);
		setModelPKClass(long.class);

		setTable(FactoriesApplicationStageTable.INSTANCE);
	}

	/**
	 * Caches the factories application stage in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationStage the factories application stage
	 */
	@Override
	public void cacheResult(
		FactoriesApplicationStage factoriesApplicationStage) {

		entityCache.putResult(
			FactoriesApplicationStageImpl.class,
			factoriesApplicationStage.getPrimaryKey(),
			factoriesApplicationStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				factoriesApplicationStage.getUuid(),
				factoriesApplicationStage.getGroupId()
			},
			factoriesApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetFactories_By_AI,
			new Object[] {
				factoriesApplicationStage.getFactoriesApplicationId()
			},
			factoriesApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetFactories_By_CaseIdStageName,
			new Object[] {
				factoriesApplicationStage.getCaseId(),
				factoriesApplicationStage.getStageName()
			},
			factoriesApplicationStage);

		finderCache.putResult(
			_finderPathFetchByget_Factories_By_CaseId,
			new Object[] {factoriesApplicationStage.getCaseId()},
			factoriesApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetFactories_By_CaseIdStageStatus,
			new Object[] {
				factoriesApplicationStage.getCaseId(),
				factoriesApplicationStage.getStageStatus(),
				factoriesApplicationStage.getStageName()
			},
			factoriesApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetFactories_By_CaseIdAndStatus,
			new Object[] {
				factoriesApplicationStage.getCaseId(),
				factoriesApplicationStage.getStageStatus()
			},
			factoriesApplicationStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the factories application stages in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationStages the factories application stages
	 */
	@Override
	public void cacheResult(
		List<FactoriesApplicationStage> factoriesApplicationStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (factoriesApplicationStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FactoriesApplicationStage factoriesApplicationStage :
				factoriesApplicationStages) {

			if (entityCache.getResult(
					FactoriesApplicationStageImpl.class,
					factoriesApplicationStage.getPrimaryKey()) == null) {

				cacheResult(factoriesApplicationStage);
			}
		}
	}

	/**
	 * Clears the cache for all factories application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FactoriesApplicationStageImpl.class);

		finderCache.clearCache(FactoriesApplicationStageImpl.class);
	}

	/**
	 * Clears the cache for the factories application stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FactoriesApplicationStage factoriesApplicationStage) {

		entityCache.removeResult(
			FactoriesApplicationStageImpl.class, factoriesApplicationStage);
	}

	@Override
	public void clearCache(
		List<FactoriesApplicationStage> factoriesApplicationStages) {

		for (FactoriesApplicationStage factoriesApplicationStage :
				factoriesApplicationStages) {

			entityCache.removeResult(
				FactoriesApplicationStageImpl.class, factoriesApplicationStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FactoriesApplicationStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FactoriesApplicationStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FactoriesApplicationStageModelImpl factoriesApplicationStageModelImpl) {

		Object[] args = new Object[] {
			factoriesApplicationStageModelImpl.getUuid(),
			factoriesApplicationStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, factoriesApplicationStageModelImpl);

		args = new Object[] {
			factoriesApplicationStageModelImpl.getFactoriesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFactories_By_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactories_By_AI, args,
			factoriesApplicationStageModelImpl);

		args = new Object[] {
			factoriesApplicationStageModelImpl.getCaseId(),
			factoriesApplicationStageModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetFactories_By_CaseIdStageName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactories_By_CaseIdStageName, args,
			factoriesApplicationStageModelImpl);

		args = new Object[] {factoriesApplicationStageModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountByget_Factories_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_Factories_By_CaseId, args,
			factoriesApplicationStageModelImpl);

		args = new Object[] {
			factoriesApplicationStageModelImpl.getCaseId(),
			factoriesApplicationStageModelImpl.getStageStatus(),
			factoriesApplicationStageModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetFactories_By_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactories_By_CaseIdStageStatus, args,
			factoriesApplicationStageModelImpl);

		args = new Object[] {
			factoriesApplicationStageModelImpl.getCaseId(),
			factoriesApplicationStageModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetFactories_By_CaseIdAndStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactories_By_CaseIdAndStatus, args,
			factoriesApplicationStageModelImpl);
	}

	/**
	 * Creates a new factories application stage with the primary key. Does not add the factories application stage to the database.
	 *
	 * @param factoriesApplicationStageId the primary key for the new factories application stage
	 * @return the new factories application stage
	 */
	@Override
	public FactoriesApplicationStage create(long factoriesApplicationStageId) {
		FactoriesApplicationStage factoriesApplicationStage =
			new FactoriesApplicationStageImpl();

		factoriesApplicationStage.setNew(true);
		factoriesApplicationStage.setPrimaryKey(factoriesApplicationStageId);

		String uuid = PortalUUIDUtil.generate();

		factoriesApplicationStage.setUuid(uuid);

		factoriesApplicationStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return factoriesApplicationStage;
	}

	/**
	 * Removes the factories application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage that was removed
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationStage remove(long factoriesApplicationStageId)
		throws NoSuchFactoriesApplicationStageException {

		return remove((Serializable)factoriesApplicationStageId);
	}

	/**
	 * Removes the factories application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the factories application stage
	 * @return the factories application stage that was removed
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationStage remove(Serializable primaryKey)
		throws NoSuchFactoriesApplicationStageException {

		Session session = null;

		try {
			session = openSession();

			FactoriesApplicationStage factoriesApplicationStage =
				(FactoriesApplicationStage)session.get(
					FactoriesApplicationStageImpl.class, primaryKey);

			if (factoriesApplicationStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFactoriesApplicationStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(factoriesApplicationStage);
		}
		catch (NoSuchFactoriesApplicationStageException noSuchEntityException) {
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
	protected FactoriesApplicationStage removeImpl(
		FactoriesApplicationStage factoriesApplicationStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(factoriesApplicationStage)) {
				factoriesApplicationStage =
					(FactoriesApplicationStage)session.get(
						FactoriesApplicationStageImpl.class,
						factoriesApplicationStage.getPrimaryKeyObj());
			}

			if (factoriesApplicationStage != null) {
				session.delete(factoriesApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (factoriesApplicationStage != null) {
			clearCache(factoriesApplicationStage);
		}

		return factoriesApplicationStage;
	}

	@Override
	public FactoriesApplicationStage updateImpl(
		FactoriesApplicationStage factoriesApplicationStage) {

		boolean isNew = factoriesApplicationStage.isNew();

		if (!(factoriesApplicationStage instanceof
				FactoriesApplicationStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(factoriesApplicationStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					factoriesApplicationStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in factoriesApplicationStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FactoriesApplicationStage implementation " +
					factoriesApplicationStage.getClass());
		}

		FactoriesApplicationStageModelImpl factoriesApplicationStageModelImpl =
			(FactoriesApplicationStageModelImpl)factoriesApplicationStage;

		if (Validator.isNull(factoriesApplicationStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			factoriesApplicationStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (factoriesApplicationStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				factoriesApplicationStage.setCreateDate(date);
			}
			else {
				factoriesApplicationStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!factoriesApplicationStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				factoriesApplicationStage.setModifiedDate(date);
			}
			else {
				factoriesApplicationStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(factoriesApplicationStage);
			}
			else {
				factoriesApplicationStage =
					(FactoriesApplicationStage)session.merge(
						factoriesApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FactoriesApplicationStageImpl.class,
			factoriesApplicationStageModelImpl, false, true);

		cacheUniqueFindersCache(factoriesApplicationStageModelImpl);

		if (isNew) {
			factoriesApplicationStage.setNew(false);
		}

		factoriesApplicationStage.resetOriginalValues();

		return factoriesApplicationStage;
	}

	/**
	 * Returns the factories application stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the factories application stage
	 * @return the factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFactoriesApplicationStageException {

		FactoriesApplicationStage factoriesApplicationStage = fetchByPrimaryKey(
			primaryKey);

		if (factoriesApplicationStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFactoriesApplicationStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return factoriesApplicationStage;
	}

	/**
	 * Returns the factories application stage with the primary key or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationStage findByPrimaryKey(
			long factoriesApplicationStageId)
		throws NoSuchFactoriesApplicationStageException {

		return findByPrimaryKey((Serializable)factoriesApplicationStageId);
	}

	/**
	 * Returns the factories application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage, or <code>null</code> if a factories application stage with the primary key could not be found
	 */
	@Override
	public FactoriesApplicationStage fetchByPrimaryKey(
		long factoriesApplicationStageId) {

		return fetchByPrimaryKey((Serializable)factoriesApplicationStageId);
	}

	/**
	 * Returns all the factories application stages.
	 *
	 * @return the factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findAll(
		int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories application stages
	 */
	@Override
	public List<FactoriesApplicationStage> findAll(
		int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
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

		List<FactoriesApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<FactoriesApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FACTORIESAPPLICATIONSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FACTORIESAPPLICATIONSTAGE;

				sql = sql.concat(
					FactoriesApplicationStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FactoriesApplicationStage>)QueryUtil.list(
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
	 * Removes all the factories application stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FactoriesApplicationStage factoriesApplicationStage : findAll()) {
			remove(factoriesApplicationStage);
		}
	}

	/**
	 * Returns the number of factories application stages.
	 *
	 * @return the number of factories application stages
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
					_SQL_COUNT_FACTORIESAPPLICATIONSTAGE);

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
		return "factoriesApplicationStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FACTORIESAPPLICATIONSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FactoriesApplicationStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the factories application stage persistence.
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

		_finderPathFetchBygetFactories_By_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactories_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, true);

		_finderPathCountBygetFactories_By_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactories_By_AI", new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, false);

		_finderPathFetchBygetFactories_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactories_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetFactories_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactories_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchByget_Factories_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_Factories_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountByget_Factories_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_Factories_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetFactories_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY,
			"fetchBygetFactories_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetFactories_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactories_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetFactories_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactories_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetFactories_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactories_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetFactories_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetFactories_By_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetFactories_By_CaseId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFactories_By_CaseId",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetFactories_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactories_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetFactories_By_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFactories_By_StageName",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetFactories_By_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFactories_By_StageName",
				new String[] {String.class.getName()},
				new String[] {"stageName"}, true);

		_finderPathCountBygetFactories_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactories_By_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		FactoriesApplicationStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FactoriesApplicationStageUtil.setPersistence(null);

		entityCache.removeCache(FactoriesApplicationStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FACTORIESAPPLICATIONSTAGE =
		"SELECT factoriesApplicationStage FROM FactoriesApplicationStage factoriesApplicationStage";

	private static final String _SQL_SELECT_FACTORIESAPPLICATIONSTAGE_WHERE =
		"SELECT factoriesApplicationStage FROM FactoriesApplicationStage factoriesApplicationStage WHERE ";

	private static final String _SQL_COUNT_FACTORIESAPPLICATIONSTAGE =
		"SELECT COUNT(factoriesApplicationStage) FROM FactoriesApplicationStage factoriesApplicationStage";

	private static final String _SQL_COUNT_FACTORIESAPPLICATIONSTAGE_WHERE =
		"SELECT COUNT(factoriesApplicationStage) FROM FactoriesApplicationStage factoriesApplicationStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"factoriesApplicationStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FactoriesApplicationStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FactoriesApplicationStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FactoriesApplicationStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}