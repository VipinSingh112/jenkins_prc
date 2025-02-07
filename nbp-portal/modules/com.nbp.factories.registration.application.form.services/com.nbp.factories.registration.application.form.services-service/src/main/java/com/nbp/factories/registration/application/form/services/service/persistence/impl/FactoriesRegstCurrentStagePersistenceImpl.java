/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence.impl;

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

import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesRegstCurrentStageException;
import com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage;
import com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStageTable;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageImpl;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageModelImpl;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesRegstCurrentStagePersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesRegstCurrentStageUtil;
import com.nbp.factories.registration.application.form.services.service.persistence.impl.constants.FACTORIESPersistenceConstants;

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
 * The persistence implementation for the factories regst current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FactoriesRegstCurrentStagePersistence.class)
public class FactoriesRegstCurrentStagePersistenceImpl
	extends BasePersistenceImpl<FactoriesRegstCurrentStage>
	implements FactoriesRegstCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FactoriesRegstCurrentStageUtil</code> to access the factories regst current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FactoriesRegstCurrentStageImpl.class.getName();

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
	 * Returns all the factories regst current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories regst current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of matching factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator,
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

		List<FactoriesRegstCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<FactoriesRegstCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesRegstCurrentStage factoriesRegstCurrentStage :
						list) {

					if (!uuid.equals(factoriesRegstCurrentStage.getUuid())) {
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

			sb.append(_SQL_SELECT_FACTORIESREGSTCURRENTSTAGE_WHERE);

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
				sb.append(FactoriesRegstCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FactoriesRegstCurrentStage>)QueryUtil.list(
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
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException {

		FactoriesRegstCurrentStage factoriesRegstCurrentStage =
			fetchByUuid_First(uuid, orderByComparator);

		if (factoriesRegstCurrentStage != null) {
			return factoriesRegstCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFactoriesRegstCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage fetchByUuid_First(
		String uuid,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		List<FactoriesRegstCurrentStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException {

		FactoriesRegstCurrentStage factoriesRegstCurrentStage =
			fetchByUuid_Last(uuid, orderByComparator);

		if (factoriesRegstCurrentStage != null) {
			return factoriesRegstCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFactoriesRegstCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<FactoriesRegstCurrentStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories regst current stages before and after the current factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param factoriesCurrentStageId the primary key of the current factories regst current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage[] findByUuid_PrevAndNext(
			long factoriesCurrentStageId, String uuid,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException {

		uuid = Objects.toString(uuid, "");

		FactoriesRegstCurrentStage factoriesRegstCurrentStage =
			findByPrimaryKey(factoriesCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			FactoriesRegstCurrentStage[] array =
				new FactoriesRegstCurrentStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, factoriesRegstCurrentStage, uuid, orderByComparator,
				true);

			array[1] = factoriesRegstCurrentStage;

			array[2] = getByUuid_PrevAndNext(
				session, factoriesRegstCurrentStage, uuid, orderByComparator,
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

	protected FactoriesRegstCurrentStage getByUuid_PrevAndNext(
		Session session, FactoriesRegstCurrentStage factoriesRegstCurrentStage,
		String uuid,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESREGSTCURRENTSTAGE_WHERE);

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
			sb.append(FactoriesRegstCurrentStageModelImpl.ORDER_BY_JPQL);
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
						factoriesRegstCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesRegstCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories regst current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (FactoriesRegstCurrentStage factoriesRegstCurrentStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(factoriesRegstCurrentStage);
		}
	}

	/**
	 * Returns the number of factories regst current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching factories regst current stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESREGSTCURRENTSTAGE_WHERE);

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
		"factoriesRegstCurrentStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(factoriesRegstCurrentStage.uuid IS NULL OR factoriesRegstCurrentStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the factories regst current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFactoriesRegstCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchFactoriesRegstCurrentStageException {

		FactoriesRegstCurrentStage factoriesRegstCurrentStage = fetchByUUID_G(
			uuid, groupId);

		if (factoriesRegstCurrentStage == null) {
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

			throw new NoSuchFactoriesRegstCurrentStageException(sb.toString());
		}

		return factoriesRegstCurrentStage;
	}

	/**
	 * Returns the factories regst current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the factories regst current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage fetchByUUID_G(
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

		if (result instanceof FactoriesRegstCurrentStage) {
			FactoriesRegstCurrentStage factoriesRegstCurrentStage =
				(FactoriesRegstCurrentStage)result;

			if (!Objects.equals(uuid, factoriesRegstCurrentStage.getUuid()) ||
				(groupId != factoriesRegstCurrentStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FACTORIESREGSTCURRENTSTAGE_WHERE);

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

				List<FactoriesRegstCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					FactoriesRegstCurrentStage factoriesRegstCurrentStage =
						list.get(0);

					result = factoriesRegstCurrentStage;

					cacheResult(factoriesRegstCurrentStage);
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
			return (FactoriesRegstCurrentStage)result;
		}
	}

	/**
	 * Removes the factories regst current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the factories regst current stage that was removed
	 */
	@Override
	public FactoriesRegstCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchFactoriesRegstCurrentStageException {

		FactoriesRegstCurrentStage factoriesRegstCurrentStage = findByUUID_G(
			uuid, groupId);

		return remove(factoriesRegstCurrentStage);
	}

	/**
	 * Returns the number of factories regst current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching factories regst current stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FACTORIESREGSTCURRENTSTAGE_WHERE);

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
		"factoriesRegstCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(factoriesRegstCurrentStage.uuid IS NULL OR factoriesRegstCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"factoriesRegstCurrentStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of matching factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator,
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

		List<FactoriesRegstCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<FactoriesRegstCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesRegstCurrentStage factoriesRegstCurrentStage :
						list) {

					if (!uuid.equals(factoriesRegstCurrentStage.getUuid()) ||
						(companyId !=
							factoriesRegstCurrentStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_FACTORIESREGSTCURRENTSTAGE_WHERE);

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
				sb.append(FactoriesRegstCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FactoriesRegstCurrentStage>)QueryUtil.list(
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
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException {

		FactoriesRegstCurrentStage factoriesRegstCurrentStage =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (factoriesRegstCurrentStage != null) {
			return factoriesRegstCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFactoriesRegstCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		List<FactoriesRegstCurrentStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException {

		FactoriesRegstCurrentStage factoriesRegstCurrentStage =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (factoriesRegstCurrentStage != null) {
			return factoriesRegstCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFactoriesRegstCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<FactoriesRegstCurrentStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories regst current stages before and after the current factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param factoriesCurrentStageId the primary key of the current factories regst current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage[] findByUuid_C_PrevAndNext(
			long factoriesCurrentStageId, String uuid, long companyId,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException {

		uuid = Objects.toString(uuid, "");

		FactoriesRegstCurrentStage factoriesRegstCurrentStage =
			findByPrimaryKey(factoriesCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			FactoriesRegstCurrentStage[] array =
				new FactoriesRegstCurrentStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, factoriesRegstCurrentStage, uuid, companyId,
				orderByComparator, true);

			array[1] = factoriesRegstCurrentStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, factoriesRegstCurrentStage, uuid, companyId,
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

	protected FactoriesRegstCurrentStage getByUuid_C_PrevAndNext(
		Session session, FactoriesRegstCurrentStage factoriesRegstCurrentStage,
		String uuid, long companyId,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESREGSTCURRENTSTAGE_WHERE);

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
			sb.append(FactoriesRegstCurrentStageModelImpl.ORDER_BY_JPQL);
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
						factoriesRegstCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesRegstCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories regst current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (FactoriesRegstCurrentStage factoriesRegstCurrentStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(factoriesRegstCurrentStage);
		}
	}

	/**
	 * Returns the number of factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching factories regst current stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FACTORIESREGSTCURRENTSTAGE_WHERE);

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
		"factoriesRegstCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(factoriesRegstCurrentStage.uuid IS NULL OR factoriesRegstCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"factoriesRegstCurrentStage.companyId = ?";

	private FinderPath _finderPathFetchBygetByFactories_Stage;
	private FinderPath _finderPathCountBygetByFactories_Stage;

	/**
	 * Returns the factories regst current stage where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesRegstCurrentStageException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage findBygetByFactories_Stage(
			long factoriesApplicationId)
		throws NoSuchFactoriesRegstCurrentStageException {

		FactoriesRegstCurrentStage factoriesRegstCurrentStage =
			fetchBygetByFactories_Stage(factoriesApplicationId);

		if (factoriesRegstCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("factoriesApplicationId=");
			sb.append(factoriesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesRegstCurrentStageException(sb.toString());
		}

		return factoriesRegstCurrentStage;
	}

	/**
	 * Returns the factories regst current stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage fetchBygetByFactories_Stage(
		long factoriesApplicationId) {

		return fetchBygetByFactories_Stage(factoriesApplicationId, true);
	}

	/**
	 * Returns the factories regst current stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage fetchBygetByFactories_Stage(
		long factoriesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {factoriesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetByFactories_Stage, finderArgs, this);
		}

		if (result instanceof FactoriesRegstCurrentStage) {
			FactoriesRegstCurrentStage factoriesRegstCurrentStage =
				(FactoriesRegstCurrentStage)result;

			if (factoriesApplicationId !=
					factoriesRegstCurrentStage.getFactoriesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESREGSTCURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETBYFACTORIES_STAGE_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

				List<FactoriesRegstCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetByFactories_Stage, finderArgs,
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
								"FactoriesRegstCurrentStagePersistenceImpl.fetchBygetByFactories_Stage(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesRegstCurrentStage factoriesRegstCurrentStage =
						list.get(0);

					result = factoriesRegstCurrentStage;

					cacheResult(factoriesRegstCurrentStage);
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
			return (FactoriesRegstCurrentStage)result;
		}
	}

	/**
	 * Removes the factories regst current stage where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories regst current stage that was removed
	 */
	@Override
	public FactoriesRegstCurrentStage removeBygetByFactories_Stage(
			long factoriesApplicationId)
		throws NoSuchFactoriesRegstCurrentStageException {

		FactoriesRegstCurrentStage factoriesRegstCurrentStage =
			findBygetByFactories_Stage(factoriesApplicationId);

		return remove(factoriesRegstCurrentStage);
	}

	/**
	 * Returns the number of factories regst current stages where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories regst current stages
	 */
	@Override
	public int countBygetByFactories_Stage(long factoriesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetByFactories_Stage;

		Object[] finderArgs = new Object[] {factoriesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESREGSTCURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETBYFACTORIES_STAGE_FACTORIESAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETBYFACTORIES_STAGE_FACTORIESAPPLICATIONID_2 =
			"factoriesRegstCurrentStage.factoriesApplicationId = ?";

	public FactoriesRegstCurrentStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FactoriesRegstCurrentStage.class);

		setModelImplClass(FactoriesRegstCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(FactoriesRegstCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the factories regst current stage in the entity cache if it is enabled.
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 */
	@Override
	public void cacheResult(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		entityCache.putResult(
			FactoriesRegstCurrentStageImpl.class,
			factoriesRegstCurrentStage.getPrimaryKey(),
			factoriesRegstCurrentStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				factoriesRegstCurrentStage.getUuid(),
				factoriesRegstCurrentStage.getGroupId()
			},
			factoriesRegstCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetByFactories_Stage,
			new Object[] {
				factoriesRegstCurrentStage.getFactoriesApplicationId()
			},
			factoriesRegstCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the factories regst current stages in the entity cache if it is enabled.
	 *
	 * @param factoriesRegstCurrentStages the factories regst current stages
	 */
	@Override
	public void cacheResult(
		List<FactoriesRegstCurrentStage> factoriesRegstCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (factoriesRegstCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FactoriesRegstCurrentStage factoriesRegstCurrentStage :
				factoriesRegstCurrentStages) {

			if (entityCache.getResult(
					FactoriesRegstCurrentStageImpl.class,
					factoriesRegstCurrentStage.getPrimaryKey()) == null) {

				cacheResult(factoriesRegstCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all factories regst current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FactoriesRegstCurrentStageImpl.class);

		finderCache.clearCache(FactoriesRegstCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the factories regst current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		entityCache.removeResult(
			FactoriesRegstCurrentStageImpl.class, factoriesRegstCurrentStage);
	}

	@Override
	public void clearCache(
		List<FactoriesRegstCurrentStage> factoriesRegstCurrentStages) {

		for (FactoriesRegstCurrentStage factoriesRegstCurrentStage :
				factoriesRegstCurrentStages) {

			entityCache.removeResult(
				FactoriesRegstCurrentStageImpl.class,
				factoriesRegstCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FactoriesRegstCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FactoriesRegstCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FactoriesRegstCurrentStageModelImpl
			factoriesRegstCurrentStageModelImpl) {

		Object[] args = new Object[] {
			factoriesRegstCurrentStageModelImpl.getUuid(),
			factoriesRegstCurrentStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			factoriesRegstCurrentStageModelImpl);

		args = new Object[] {
			factoriesRegstCurrentStageModelImpl.getFactoriesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetByFactories_Stage, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetByFactories_Stage, args,
			factoriesRegstCurrentStageModelImpl);
	}

	/**
	 * Creates a new factories regst current stage with the primary key. Does not add the factories regst current stage to the database.
	 *
	 * @param factoriesCurrentStageId the primary key for the new factories regst current stage
	 * @return the new factories regst current stage
	 */
	@Override
	public FactoriesRegstCurrentStage create(long factoriesCurrentStageId) {
		FactoriesRegstCurrentStage factoriesRegstCurrentStage =
			new FactoriesRegstCurrentStageImpl();

		factoriesRegstCurrentStage.setNew(true);
		factoriesRegstCurrentStage.setPrimaryKey(factoriesCurrentStageId);

		String uuid = PortalUUIDUtil.generate();

		factoriesRegstCurrentStage.setUuid(uuid);

		factoriesRegstCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return factoriesRegstCurrentStage;
	}

	/**
	 * Removes the factories regst current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage that was removed
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage remove(long factoriesCurrentStageId)
		throws NoSuchFactoriesRegstCurrentStageException {

		return remove((Serializable)factoriesCurrentStageId);
	}

	/**
	 * Removes the factories regst current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the factories regst current stage
	 * @return the factories regst current stage that was removed
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage remove(Serializable primaryKey)
		throws NoSuchFactoriesRegstCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			FactoriesRegstCurrentStage factoriesRegstCurrentStage =
				(FactoriesRegstCurrentStage)session.get(
					FactoriesRegstCurrentStageImpl.class, primaryKey);

			if (factoriesRegstCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFactoriesRegstCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(factoriesRegstCurrentStage);
		}
		catch (NoSuchFactoriesRegstCurrentStageException
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
	protected FactoriesRegstCurrentStage removeImpl(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(factoriesRegstCurrentStage)) {
				factoriesRegstCurrentStage =
					(FactoriesRegstCurrentStage)session.get(
						FactoriesRegstCurrentStageImpl.class,
						factoriesRegstCurrentStage.getPrimaryKeyObj());
			}

			if (factoriesRegstCurrentStage != null) {
				session.delete(factoriesRegstCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (factoriesRegstCurrentStage != null) {
			clearCache(factoriesRegstCurrentStage);
		}

		return factoriesRegstCurrentStage;
	}

	@Override
	public FactoriesRegstCurrentStage updateImpl(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		boolean isNew = factoriesRegstCurrentStage.isNew();

		if (!(factoriesRegstCurrentStage instanceof
				FactoriesRegstCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(factoriesRegstCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					factoriesRegstCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in factoriesRegstCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FactoriesRegstCurrentStage implementation " +
					factoriesRegstCurrentStage.getClass());
		}

		FactoriesRegstCurrentStageModelImpl
			factoriesRegstCurrentStageModelImpl =
				(FactoriesRegstCurrentStageModelImpl)factoriesRegstCurrentStage;

		if (Validator.isNull(factoriesRegstCurrentStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			factoriesRegstCurrentStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (factoriesRegstCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				factoriesRegstCurrentStage.setCreateDate(date);
			}
			else {
				factoriesRegstCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!factoriesRegstCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				factoriesRegstCurrentStage.setModifiedDate(date);
			}
			else {
				factoriesRegstCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(factoriesRegstCurrentStage);
			}
			else {
				factoriesRegstCurrentStage =
					(FactoriesRegstCurrentStage)session.merge(
						factoriesRegstCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FactoriesRegstCurrentStageImpl.class,
			factoriesRegstCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(factoriesRegstCurrentStageModelImpl);

		if (isNew) {
			factoriesRegstCurrentStage.setNew(false);
		}

		factoriesRegstCurrentStage.resetOriginalValues();

		return factoriesRegstCurrentStage;
	}

	/**
	 * Returns the factories regst current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the factories regst current stage
	 * @return the factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFactoriesRegstCurrentStageException {

		FactoriesRegstCurrentStage factoriesRegstCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (factoriesRegstCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFactoriesRegstCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return factoriesRegstCurrentStage;
	}

	/**
	 * Returns the factories regst current stage with the primary key or throws a <code>NoSuchFactoriesRegstCurrentStageException</code> if it could not be found.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage findByPrimaryKey(
			long factoriesCurrentStageId)
		throws NoSuchFactoriesRegstCurrentStageException {

		return findByPrimaryKey((Serializable)factoriesCurrentStageId);
	}

	/**
	 * Returns the factories regst current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage, or <code>null</code> if a factories regst current stage with the primary key could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage fetchByPrimaryKey(
		long factoriesCurrentStageId) {

		return fetchByPrimaryKey((Serializable)factoriesCurrentStageId);
	}

	/**
	 * Returns all the factories regst current stages.
	 *
	 * @return the factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator,
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

		List<FactoriesRegstCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<FactoriesRegstCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FACTORIESREGSTCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FACTORIESREGSTCURRENTSTAGE;

				sql = sql.concat(
					FactoriesRegstCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FactoriesRegstCurrentStage>)QueryUtil.list(
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
	 * Removes all the factories regst current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FactoriesRegstCurrentStage factoriesRegstCurrentStage :
				findAll()) {

			remove(factoriesRegstCurrentStage);
		}
	}

	/**
	 * Returns the number of factories regst current stages.
	 *
	 * @return the number of factories regst current stages
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
					_SQL_COUNT_FACTORIESREGSTCURRENTSTAGE);

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
		return "factoriesCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FACTORIESREGSTCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FactoriesRegstCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the factories regst current stage persistence.
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

		_finderPathFetchBygetByFactories_Stage = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetByFactories_Stage",
			new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, true);

		_finderPathCountBygetByFactories_Stage = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetByFactories_Stage", new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, false);

		FactoriesRegstCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FactoriesRegstCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(FactoriesRegstCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FACTORIESREGSTCURRENTSTAGE =
		"SELECT factoriesRegstCurrentStage FROM FactoriesRegstCurrentStage factoriesRegstCurrentStage";

	private static final String _SQL_SELECT_FACTORIESREGSTCURRENTSTAGE_WHERE =
		"SELECT factoriesRegstCurrentStage FROM FactoriesRegstCurrentStage factoriesRegstCurrentStage WHERE ";

	private static final String _SQL_COUNT_FACTORIESREGSTCURRENTSTAGE =
		"SELECT COUNT(factoriesRegstCurrentStage) FROM FactoriesRegstCurrentStage factoriesRegstCurrentStage";

	private static final String _SQL_COUNT_FACTORIESREGSTCURRENTSTAGE_WHERE =
		"SELECT COUNT(factoriesRegstCurrentStage) FROM FactoriesRegstCurrentStage factoriesRegstCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"factoriesRegstCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FactoriesRegstCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FactoriesRegstCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FactoriesRegstCurrentStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}