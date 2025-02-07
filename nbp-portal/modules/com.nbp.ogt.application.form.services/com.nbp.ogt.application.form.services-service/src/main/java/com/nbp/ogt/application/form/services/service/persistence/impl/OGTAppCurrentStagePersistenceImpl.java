/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence.impl;

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

import com.nbp.ogt.application.form.services.exception.NoSuchOGTAppCurrentStageException;
import com.nbp.ogt.application.form.services.model.OGTAppCurrentStage;
import com.nbp.ogt.application.form.services.model.OGTAppCurrentStageTable;
import com.nbp.ogt.application.form.services.model.impl.OGTAppCurrentStageImpl;
import com.nbp.ogt.application.form.services.model.impl.OGTAppCurrentStageModelImpl;
import com.nbp.ogt.application.form.services.service.persistence.OGTAppCurrentStagePersistence;
import com.nbp.ogt.application.form.services.service.persistence.OGTAppCurrentStageUtil;
import com.nbp.ogt.application.form.services.service.persistence.impl.constants.OGT_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the ogt app current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OGTAppCurrentStagePersistence.class)
public class OGTAppCurrentStagePersistenceImpl
	extends BasePersistenceImpl<OGTAppCurrentStage>
	implements OGTAppCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OGTAppCurrentStageUtil</code> to access the ogt app current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OGTAppCurrentStageImpl.class.getName();

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
	 * Returns all the ogt app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @return the range of matching ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator,
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

		List<OGTAppCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<OGTAppCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OGTAppCurrentStage ogtAppCurrentStage : list) {
					if (!uuid.equals(ogtAppCurrentStage.getUuid())) {
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

			sb.append(_SQL_SELECT_OGTAPPCURRENTSTAGE_WHERE);

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
				sb.append(OGTAppCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<OGTAppCurrentStage>)QueryUtil.list(
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
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws NoSuchOGTAppCurrentStageException {

		OGTAppCurrentStage ogtAppCurrentStage = fetchByUuid_First(
			uuid, orderByComparator);

		if (ogtAppCurrentStage != null) {
			return ogtAppCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOGTAppCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage fetchByUuid_First(
		String uuid, OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		List<OGTAppCurrentStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws NoSuchOGTAppCurrentStageException {

		OGTAppCurrentStage ogtAppCurrentStage = fetchByUuid_Last(
			uuid, orderByComparator);

		if (ogtAppCurrentStage != null) {
			return ogtAppCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOGTAppCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage fetchByUuid_Last(
		String uuid, OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OGTAppCurrentStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ogt app current stages before and after the current ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param ogtAppCurrentStageId the primary key of the current ogt app current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	@Override
	public OGTAppCurrentStage[] findByUuid_PrevAndNext(
			long ogtAppCurrentStageId, String uuid,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws NoSuchOGTAppCurrentStageException {

		uuid = Objects.toString(uuid, "");

		OGTAppCurrentStage ogtAppCurrentStage = findByPrimaryKey(
			ogtAppCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			OGTAppCurrentStage[] array = new OGTAppCurrentStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, ogtAppCurrentStage, uuid, orderByComparator, true);

			array[1] = ogtAppCurrentStage;

			array[2] = getByUuid_PrevAndNext(
				session, ogtAppCurrentStage, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OGTAppCurrentStage getByUuid_PrevAndNext(
		Session session, OGTAppCurrentStage ogtAppCurrentStage, String uuid,
		OrderByComparator<OGTAppCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_OGTAPPCURRENTSTAGE_WHERE);

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
			sb.append(OGTAppCurrentStageModelImpl.ORDER_BY_JPQL);
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
						ogtAppCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OGTAppCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ogt app current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OGTAppCurrentStage ogtAppCurrentStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ogtAppCurrentStage);
		}
	}

	/**
	 * Returns the number of ogt app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ogt app current stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTAPPCURRENTSTAGE_WHERE);

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
		"ogtAppCurrentStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(ogtAppCurrentStage.uuid IS NULL OR ogtAppCurrentStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the ogt app current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOGTAppCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchOGTAppCurrentStageException {

		OGTAppCurrentStage ogtAppCurrentStage = fetchByUUID_G(uuid, groupId);

		if (ogtAppCurrentStage == null) {
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

			throw new NoSuchOGTAppCurrentStageException(sb.toString());
		}

		return ogtAppCurrentStage;
	}

	/**
	 * Returns the ogt app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the ogt app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage fetchByUUID_G(
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

		if (result instanceof OGTAppCurrentStage) {
			OGTAppCurrentStage ogtAppCurrentStage = (OGTAppCurrentStage)result;

			if (!Objects.equals(uuid, ogtAppCurrentStage.getUuid()) ||
				(groupId != ogtAppCurrentStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OGTAPPCURRENTSTAGE_WHERE);

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

				List<OGTAppCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OGTAppCurrentStage ogtAppCurrentStage = list.get(0);

					result = ogtAppCurrentStage;

					cacheResult(ogtAppCurrentStage);
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
			return (OGTAppCurrentStage)result;
		}
	}

	/**
	 * Removes the ogt app current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ogt app current stage that was removed
	 */
	@Override
	public OGTAppCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchOGTAppCurrentStageException {

		OGTAppCurrentStage ogtAppCurrentStage = findByUUID_G(uuid, groupId);

		return remove(ogtAppCurrentStage);
	}

	/**
	 * Returns the number of ogt app current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ogt app current stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OGTAPPCURRENTSTAGE_WHERE);

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
		"ogtAppCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(ogtAppCurrentStage.uuid IS NULL OR ogtAppCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"ogtAppCurrentStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @return the range of matching ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator,
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

		List<OGTAppCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<OGTAppCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OGTAppCurrentStage ogtAppCurrentStage : list) {
					if (!uuid.equals(ogtAppCurrentStage.getUuid()) ||
						(companyId != ogtAppCurrentStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_OGTAPPCURRENTSTAGE_WHERE);

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
				sb.append(OGTAppCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<OGTAppCurrentStage>)QueryUtil.list(
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
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws NoSuchOGTAppCurrentStageException {

		OGTAppCurrentStage ogtAppCurrentStage = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (ogtAppCurrentStage != null) {
			return ogtAppCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOGTAppCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		List<OGTAppCurrentStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws NoSuchOGTAppCurrentStageException {

		OGTAppCurrentStage ogtAppCurrentStage = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (ogtAppCurrentStage != null) {
			return ogtAppCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOGTAppCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OGTAppCurrentStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ogt app current stages before and after the current ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ogtAppCurrentStageId the primary key of the current ogt app current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	@Override
	public OGTAppCurrentStage[] findByUuid_C_PrevAndNext(
			long ogtAppCurrentStageId, String uuid, long companyId,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws NoSuchOGTAppCurrentStageException {

		uuid = Objects.toString(uuid, "");

		OGTAppCurrentStage ogtAppCurrentStage = findByPrimaryKey(
			ogtAppCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			OGTAppCurrentStage[] array = new OGTAppCurrentStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, ogtAppCurrentStage, uuid, companyId, orderByComparator,
				true);

			array[1] = ogtAppCurrentStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, ogtAppCurrentStage, uuid, companyId, orderByComparator,
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

	protected OGTAppCurrentStage getByUuid_C_PrevAndNext(
		Session session, OGTAppCurrentStage ogtAppCurrentStage, String uuid,
		long companyId, OrderByComparator<OGTAppCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_OGTAPPCURRENTSTAGE_WHERE);

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
			sb.append(OGTAppCurrentStageModelImpl.ORDER_BY_JPQL);
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
						ogtAppCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OGTAppCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ogt app current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OGTAppCurrentStage ogtAppCurrentStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ogtAppCurrentStage);
		}
	}

	/**
	 * Returns the number of ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ogt app current stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OGTAPPCURRENTSTAGE_WHERE);

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
		"ogtAppCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(ogtAppCurrentStage.uuid IS NULL OR ogtAppCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"ogtAppCurrentStage.companyId = ?";

	private FinderPath _finderPathFetchBygetByOGT_Stage;
	private FinderPath _finderPathCountBygetByOGT_Stage;

	/**
	 * Returns the ogt app current stage where ogtApplicationId = &#63; or throws a <code>NoSuchOGTAppCurrentStageException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage findBygetByOGT_Stage(long ogtApplicationId)
		throws NoSuchOGTAppCurrentStageException {

		OGTAppCurrentStage ogtAppCurrentStage = fetchBygetByOGT_Stage(
			ogtApplicationId);

		if (ogtAppCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ogtApplicationId=");
			sb.append(ogtApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOGTAppCurrentStageException(sb.toString());
		}

		return ogtAppCurrentStage;
	}

	/**
	 * Returns the ogt app current stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage fetchBygetByOGT_Stage(long ogtApplicationId) {
		return fetchBygetByOGT_Stage(ogtApplicationId, true);
	}

	/**
	 * Returns the ogt app current stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	@Override
	public OGTAppCurrentStage fetchBygetByOGT_Stage(
		long ogtApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ogtApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetByOGT_Stage, finderArgs, this);
		}

		if (result instanceof OGTAppCurrentStage) {
			OGTAppCurrentStage ogtAppCurrentStage = (OGTAppCurrentStage)result;

			if (ogtApplicationId != ogtAppCurrentStage.getOgtApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OGTAPPCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYOGT_STAGE_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

				List<OGTAppCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetByOGT_Stage, finderArgs, list);
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
								"OGTAppCurrentStagePersistenceImpl.fetchBygetByOGT_Stage(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OGTAppCurrentStage ogtAppCurrentStage = list.get(0);

					result = ogtAppCurrentStage;

					cacheResult(ogtAppCurrentStage);
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
			return (OGTAppCurrentStage)result;
		}
	}

	/**
	 * Removes the ogt app current stage where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt app current stage that was removed
	 */
	@Override
	public OGTAppCurrentStage removeBygetByOGT_Stage(long ogtApplicationId)
		throws NoSuchOGTAppCurrentStageException {

		OGTAppCurrentStage ogtAppCurrentStage = findBygetByOGT_Stage(
			ogtApplicationId);

		return remove(ogtAppCurrentStage);
	}

	/**
	 * Returns the number of ogt app current stages where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt app current stages
	 */
	@Override
	public int countBygetByOGT_Stage(long ogtApplicationId) {
		FinderPath finderPath = _finderPathCountBygetByOGT_Stage;

		Object[] finderArgs = new Object[] {ogtApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTAPPCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYOGT_STAGE_OGTAPPLICATIONID_2);

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

	private static final String
		_FINDER_COLUMN_GETBYOGT_STAGE_OGTAPPLICATIONID_2 =
			"ogtAppCurrentStage.ogtApplicationId = ?";

	public OGTAppCurrentStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OGTAppCurrentStage.class);

		setModelImplClass(OGTAppCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(OGTAppCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the ogt app current stage in the entity cache if it is enabled.
	 *
	 * @param ogtAppCurrentStage the ogt app current stage
	 */
	@Override
	public void cacheResult(OGTAppCurrentStage ogtAppCurrentStage) {
		entityCache.putResult(
			OGTAppCurrentStageImpl.class, ogtAppCurrentStage.getPrimaryKey(),
			ogtAppCurrentStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				ogtAppCurrentStage.getUuid(), ogtAppCurrentStage.getGroupId()
			},
			ogtAppCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetByOGT_Stage,
			new Object[] {ogtAppCurrentStage.getOgtApplicationId()},
			ogtAppCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ogt app current stages in the entity cache if it is enabled.
	 *
	 * @param ogtAppCurrentStages the ogt app current stages
	 */
	@Override
	public void cacheResult(List<OGTAppCurrentStage> ogtAppCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ogtAppCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OGTAppCurrentStage ogtAppCurrentStage : ogtAppCurrentStages) {
			if (entityCache.getResult(
					OGTAppCurrentStageImpl.class,
					ogtAppCurrentStage.getPrimaryKey()) == null) {

				cacheResult(ogtAppCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all ogt app current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OGTAppCurrentStageImpl.class);

		finderCache.clearCache(OGTAppCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the ogt app current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OGTAppCurrentStage ogtAppCurrentStage) {
		entityCache.removeResult(
			OGTAppCurrentStageImpl.class, ogtAppCurrentStage);
	}

	@Override
	public void clearCache(List<OGTAppCurrentStage> ogtAppCurrentStages) {
		for (OGTAppCurrentStage ogtAppCurrentStage : ogtAppCurrentStages) {
			entityCache.removeResult(
				OGTAppCurrentStageImpl.class, ogtAppCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OGTAppCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OGTAppCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OGTAppCurrentStageModelImpl ogtAppCurrentStageModelImpl) {

		Object[] args = new Object[] {
			ogtAppCurrentStageModelImpl.getUuid(),
			ogtAppCurrentStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, ogtAppCurrentStageModelImpl);

		args = new Object[] {ogtAppCurrentStageModelImpl.getOgtApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetByOGT_Stage, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetByOGT_Stage, args,
			ogtAppCurrentStageModelImpl);
	}

	/**
	 * Creates a new ogt app current stage with the primary key. Does not add the ogt app current stage to the database.
	 *
	 * @param ogtAppCurrentStageId the primary key for the new ogt app current stage
	 * @return the new ogt app current stage
	 */
	@Override
	public OGTAppCurrentStage create(long ogtAppCurrentStageId) {
		OGTAppCurrentStage ogtAppCurrentStage = new OGTAppCurrentStageImpl();

		ogtAppCurrentStage.setNew(true);
		ogtAppCurrentStage.setPrimaryKey(ogtAppCurrentStageId);

		String uuid = PortalUUIDUtil.generate();

		ogtAppCurrentStage.setUuid(uuid);

		ogtAppCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ogtAppCurrentStage;
	}

	/**
	 * Removes the ogt app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage that was removed
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	@Override
	public OGTAppCurrentStage remove(long ogtAppCurrentStageId)
		throws NoSuchOGTAppCurrentStageException {

		return remove((Serializable)ogtAppCurrentStageId);
	}

	/**
	 * Removes the ogt app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ogt app current stage
	 * @return the ogt app current stage that was removed
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	@Override
	public OGTAppCurrentStage remove(Serializable primaryKey)
		throws NoSuchOGTAppCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			OGTAppCurrentStage ogtAppCurrentStage =
				(OGTAppCurrentStage)session.get(
					OGTAppCurrentStageImpl.class, primaryKey);

			if (ogtAppCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOGTAppCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ogtAppCurrentStage);
		}
		catch (NoSuchOGTAppCurrentStageException noSuchEntityException) {
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
	protected OGTAppCurrentStage removeImpl(
		OGTAppCurrentStage ogtAppCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ogtAppCurrentStage)) {
				ogtAppCurrentStage = (OGTAppCurrentStage)session.get(
					OGTAppCurrentStageImpl.class,
					ogtAppCurrentStage.getPrimaryKeyObj());
			}

			if (ogtAppCurrentStage != null) {
				session.delete(ogtAppCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ogtAppCurrentStage != null) {
			clearCache(ogtAppCurrentStage);
		}

		return ogtAppCurrentStage;
	}

	@Override
	public OGTAppCurrentStage updateImpl(
		OGTAppCurrentStage ogtAppCurrentStage) {

		boolean isNew = ogtAppCurrentStage.isNew();

		if (!(ogtAppCurrentStage instanceof OGTAppCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ogtAppCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ogtAppCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ogtAppCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OGTAppCurrentStage implementation " +
					ogtAppCurrentStage.getClass());
		}

		OGTAppCurrentStageModelImpl ogtAppCurrentStageModelImpl =
			(OGTAppCurrentStageModelImpl)ogtAppCurrentStage;

		if (Validator.isNull(ogtAppCurrentStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			ogtAppCurrentStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ogtAppCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				ogtAppCurrentStage.setCreateDate(date);
			}
			else {
				ogtAppCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ogtAppCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ogtAppCurrentStage.setModifiedDate(date);
			}
			else {
				ogtAppCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ogtAppCurrentStage);
			}
			else {
				ogtAppCurrentStage = (OGTAppCurrentStage)session.merge(
					ogtAppCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OGTAppCurrentStageImpl.class, ogtAppCurrentStageModelImpl, false,
			true);

		cacheUniqueFindersCache(ogtAppCurrentStageModelImpl);

		if (isNew) {
			ogtAppCurrentStage.setNew(false);
		}

		ogtAppCurrentStage.resetOriginalValues();

		return ogtAppCurrentStage;
	}

	/**
	 * Returns the ogt app current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ogt app current stage
	 * @return the ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	@Override
	public OGTAppCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOGTAppCurrentStageException {

		OGTAppCurrentStage ogtAppCurrentStage = fetchByPrimaryKey(primaryKey);

		if (ogtAppCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOGTAppCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ogtAppCurrentStage;
	}

	/**
	 * Returns the ogt app current stage with the primary key or throws a <code>NoSuchOGTAppCurrentStageException</code> if it could not be found.
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	@Override
	public OGTAppCurrentStage findByPrimaryKey(long ogtAppCurrentStageId)
		throws NoSuchOGTAppCurrentStageException {

		return findByPrimaryKey((Serializable)ogtAppCurrentStageId);
	}

	/**
	 * Returns the ogt app current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage, or <code>null</code> if a ogt app current stage with the primary key could not be found
	 */
	@Override
	public OGTAppCurrentStage fetchByPrimaryKey(long ogtAppCurrentStageId) {
		return fetchByPrimaryKey((Serializable)ogtAppCurrentStageId);
	}

	/**
	 * Returns all the ogt app current stages.
	 *
	 * @return the ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @return the range of ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt app current stages
	 */
	@Override
	public List<OGTAppCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator,
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

		List<OGTAppCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<OGTAppCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OGTAPPCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OGTAPPCURRENTSTAGE;

				sql = sql.concat(OGTAppCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OGTAppCurrentStage>)QueryUtil.list(
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
	 * Removes all the ogt app current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OGTAppCurrentStage ogtAppCurrentStage : findAll()) {
			remove(ogtAppCurrentStage);
		}
	}

	/**
	 * Returns the number of ogt app current stages.
	 *
	 * @return the number of ogt app current stages
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
					_SQL_COUNT_OGTAPPCURRENTSTAGE);

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
		return "ogtAppCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OGTAPPCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OGTAppCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ogt app current stage persistence.
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

		_finderPathFetchBygetByOGT_Stage = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetByOGT_Stage",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, true);

		_finderPathCountBygetByOGT_Stage = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetByOGT_Stage",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, false);

		OGTAppCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OGTAppCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(OGTAppCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OGTAPPCURRENTSTAGE =
		"SELECT ogtAppCurrentStage FROM OGTAppCurrentStage ogtAppCurrentStage";

	private static final String _SQL_SELECT_OGTAPPCURRENTSTAGE_WHERE =
		"SELECT ogtAppCurrentStage FROM OGTAppCurrentStage ogtAppCurrentStage WHERE ";

	private static final String _SQL_COUNT_OGTAPPCURRENTSTAGE =
		"SELECT COUNT(ogtAppCurrentStage) FROM OGTAppCurrentStage ogtAppCurrentStage";

	private static final String _SQL_COUNT_OGTAPPCURRENTSTAGE_WHERE =
		"SELECT COUNT(ogtAppCurrentStage) FROM OGTAppCurrentStage ogtAppCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ogtAppCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OGTAppCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OGTAppCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OGTAppCurrentStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}