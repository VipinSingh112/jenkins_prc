/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence.impl;

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

import com.nbp.jadsc.stage.services.exception.NoSuchJadscApplicationStageException;
import com.nbp.jadsc.stage.services.model.JadscApplicationStage;
import com.nbp.jadsc.stage.services.model.JadscApplicationStageTable;
import com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageImpl;
import com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageModelImpl;
import com.nbp.jadsc.stage.services.service.persistence.JadscApplicationStagePersistence;
import com.nbp.jadsc.stage.services.service.persistence.JadscApplicationStageUtil;
import com.nbp.jadsc.stage.services.service.persistence.impl.constants.JADSC_STAGESPersistenceConstants;

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
 * The persistence implementation for the jadsc application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JadscApplicationStagePersistence.class)
public class JadscApplicationStagePersistenceImpl
	extends BasePersistenceImpl<JadscApplicationStage>
	implements JadscApplicationStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JadscApplicationStageUtil</code> to access the jadsc application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JadscApplicationStageImpl.class.getName();

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
	 * Returns all the jadsc application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator,
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

		List<JadscApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<JadscApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JadscApplicationStage jadscApplicationStage : list) {
					if (!uuid.equals(jadscApplicationStage.getUuid())) {
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

			sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

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
				sb.append(JadscApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<JadscApplicationStage>)QueryUtil.list(
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
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage = fetchByUuid_First(
			uuid, orderByComparator);

		if (jadscApplicationStage != null) {
			return jadscApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJadscApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchByUuid_First(
		String uuid,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		List<JadscApplicationStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage = fetchByUuid_Last(
			uuid, orderByComparator);

		if (jadscApplicationStage != null) {
			return jadscApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJadscApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JadscApplicationStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	@Override
	public JadscApplicationStage[] findByUuid_PrevAndNext(
			long jadscAppStageId, String uuid,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		uuid = Objects.toString(uuid, "");

		JadscApplicationStage jadscApplicationStage = findByPrimaryKey(
			jadscAppStageId);

		Session session = null;

		try {
			session = openSession();

			JadscApplicationStage[] array = new JadscApplicationStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jadscApplicationStage, uuid, orderByComparator, true);

			array[1] = jadscApplicationStage;

			array[2] = getByUuid_PrevAndNext(
				session, jadscApplicationStage, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JadscApplicationStage getByUuid_PrevAndNext(
		Session session, JadscApplicationStage jadscApplicationStage,
		String uuid, OrderByComparator<JadscApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

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
			sb.append(JadscApplicationStageModelImpl.ORDER_BY_JPQL);
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
						jadscApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JadscApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JadscApplicationStage jadscApplicationStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscApplicationStage);
		}
	}

	/**
	 * Returns the number of jadsc application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc application stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONSTAGE_WHERE);

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
		"jadscApplicationStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jadscApplicationStage.uuid IS NULL OR jadscApplicationStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jadsc application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage = fetchByUUID_G(
			uuid, groupId);

		if (jadscApplicationStage == null) {
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

			throw new NoSuchJadscApplicationStageException(sb.toString());
		}

		return jadscApplicationStage;
	}

	/**
	 * Returns the jadsc application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jadsc application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchByUUID_G(
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

		if (result instanceof JadscApplicationStage) {
			JadscApplicationStage jadscApplicationStage =
				(JadscApplicationStage)result;

			if (!Objects.equals(uuid, jadscApplicationStage.getUuid()) ||
				(groupId != jadscApplicationStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

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

				List<JadscApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JadscApplicationStage jadscApplicationStage = list.get(0);

					result = jadscApplicationStage;

					cacheResult(jadscApplicationStage);
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
			return (JadscApplicationStage)result;
		}
	}

	/**
	 * Removes the jadsc application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc application stage that was removed
	 */
	@Override
	public JadscApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage = findByUUID_G(
			uuid, groupId);

		return remove(jadscApplicationStage);
	}

	/**
	 * Returns the number of jadsc application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc application stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONSTAGE_WHERE);

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
		"jadscApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jadscApplicationStage.uuid IS NULL OR jadscApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jadscApplicationStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator,
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

		List<JadscApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<JadscApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JadscApplicationStage jadscApplicationStage : list) {
					if (!uuid.equals(jadscApplicationStage.getUuid()) ||
						(companyId != jadscApplicationStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

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
				sb.append(JadscApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<JadscApplicationStage>)QueryUtil.list(
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
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (jadscApplicationStage != null) {
			return jadscApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJadscApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		List<JadscApplicationStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (jadscApplicationStage != null) {
			return jadscApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJadscApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JadscApplicationStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	@Override
	public JadscApplicationStage[] findByUuid_C_PrevAndNext(
			long jadscAppStageId, String uuid, long companyId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		uuid = Objects.toString(uuid, "");

		JadscApplicationStage jadscApplicationStage = findByPrimaryKey(
			jadscAppStageId);

		Session session = null;

		try {
			session = openSession();

			JadscApplicationStage[] array = new JadscApplicationStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jadscApplicationStage, uuid, companyId,
				orderByComparator, true);

			array[1] = jadscApplicationStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, jadscApplicationStage, uuid, companyId,
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

	protected JadscApplicationStage getByUuid_C_PrevAndNext(
		Session session, JadscApplicationStage jadscApplicationStage,
		String uuid, long companyId,
		OrderByComparator<JadscApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

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
			sb.append(JadscApplicationStageModelImpl.ORDER_BY_JPQL);
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
						jadscApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JadscApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JadscApplicationStage jadscApplicationStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscApplicationStage);
		}
	}

	/**
	 * Returns the number of jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc application stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONSTAGE_WHERE);

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
		"jadscApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jadscApplicationStage.uuid IS NULL OR jadscApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jadscApplicationStage.companyId = ?";

	private FinderPath _finderPathFetchBygetJadsc_By_AI;
	private FinderPath _finderPathCountBygetJadsc_By_AI;

	/**
	 * Returns the jadsc application stage where jadscApplicationId = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findBygetJadsc_By_AI(long jadscApplicationId)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage = fetchBygetJadsc_By_AI(
			jadscApplicationId);

		if (jadscApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jadscApplicationId=");
			sb.append(jadscApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJadscApplicationStageException(sb.toString());
		}

		return jadscApplicationStage;
	}

	/**
	 * Returns the jadsc application stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_AI(
		long jadscApplicationId) {

		return fetchBygetJadsc_By_AI(jadscApplicationId, true);
	}

	/**
	 * Returns the jadsc application stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_AI(
		long jadscApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jadscApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJadsc_By_AI, finderArgs, this);
		}

		if (result instanceof JadscApplicationStage) {
			JadscApplicationStage jadscApplicationStage =
				(JadscApplicationStage)result;

			if (jadscApplicationId !=
					jadscApplicationStage.getJadscApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSC_BY_AI_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

				List<JadscApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJadsc_By_AI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jadscApplicationId};
							}

							_log.warn(
								"JadscApplicationStagePersistenceImpl.fetchBygetJadsc_By_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JadscApplicationStage jadscApplicationStage = list.get(0);

					result = jadscApplicationStage;

					cacheResult(jadscApplicationStage);
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
			return (JadscApplicationStage)result;
		}
	}

	/**
	 * Removes the jadsc application stage where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc application stage that was removed
	 */
	@Override
	public JadscApplicationStage removeBygetJadsc_By_AI(long jadscApplicationId)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage = findBygetJadsc_By_AI(
			jadscApplicationId);

		return remove(jadscApplicationStage);
	}

	/**
	 * Returns the number of jadsc application stages where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc application stages
	 */
	@Override
	public int countBygetJadsc_By_AI(long jadscApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJadsc_By_AI;

		Object[] finderArgs = new Object[] {jadscApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSC_BY_AI_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

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
		_FINDER_COLUMN_GETJADSC_BY_AI_JADSCAPPLICATIONID_2 =
			"jadscApplicationStage.jadscApplicationId = ?";

	private FinderPath _finderPathFetchBygetJadsc_By_CaseIdStageName;
	private FinderPath _finderPathCountBygetJadsc_By_CaseIdStageName;

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findBygetJadsc_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage =
			fetchBygetJadsc_By_CaseIdStageName(caseId, stageName);

		if (jadscApplicationStage == null) {
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

			throw new NoSuchJadscApplicationStageException(sb.toString());
		}

		return jadscApplicationStage;
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetJadsc_By_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdStageName(
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
				_finderPathFetchBygetJadsc_By_CaseIdStageName, finderArgs,
				this);
		}

		if (result instanceof JadscApplicationStage) {
			JadscApplicationStage jadscApplicationStage =
				(JadscApplicationStage)result;

			if (!Objects.equals(caseId, jadscApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageName, jadscApplicationStage.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				List<JadscApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJadsc_By_CaseIdStageName,
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
								"JadscApplicationStagePersistenceImpl.fetchBygetJadsc_By_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JadscApplicationStage jadscApplicationStage = list.get(0);

					result = jadscApplicationStage;

					cacheResult(jadscApplicationStage);
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
			return (JadscApplicationStage)result;
		}
	}

	/**
	 * Removes the jadsc application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the jadsc application stage that was removed
	 */
	@Override
	public JadscApplicationStage removeBygetJadsc_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage =
			findBygetJadsc_By_CaseIdStageName(caseId, stageName);

		return remove(jadscApplicationStage);
	}

	/**
	 * Returns the number of jadsc application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching jadsc application stages
	 */
	@Override
	public int countBygetJadsc_By_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_By_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_CASEID_2 =
			"jadscApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_CASEID_3 =
			"(jadscApplicationStage.caseId IS NULL OR jadscApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_STAGENAME_2 =
			"jadscApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGENAME_STAGENAME_3 =
			"(jadscApplicationStage.stageName IS NULL OR jadscApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchBygetJadsc_By_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetJadsc_By_CaseIdStageStatus;

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findBygetJadsc_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage =
			fetchBygetJadsc_By_CaseIdStageStatus(
				caseId, stageStatus, stageName);

		if (jadscApplicationStage == null) {
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

			throw new NoSuchJadscApplicationStageException(sb.toString());
		}

		return jadscApplicationStage;
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetJadsc_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdStageStatus(
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
				_finderPathFetchBygetJadsc_By_CaseIdStageStatus, finderArgs,
				this);
		}

		if (result instanceof JadscApplicationStage) {
			JadscApplicationStage jadscApplicationStage =
				(JadscApplicationStage)result;

			if (!Objects.equals(caseId, jadscApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageStatus, jadscApplicationStage.getStageStatus()) ||
				!Objects.equals(
					stageName, jadscApplicationStage.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				List<JadscApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJadsc_By_CaseIdStageStatus,
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
								"JadscApplicationStagePersistenceImpl.fetchBygetJadsc_By_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JadscApplicationStage jadscApplicationStage = list.get(0);

					result = jadscApplicationStage;

					cacheResult(jadscApplicationStage);
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
			return (JadscApplicationStage)result;
		}
	}

	/**
	 * Removes the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the jadsc application stage that was removed
	 */
	@Override
	public JadscApplicationStage removeBygetJadsc_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage =
			findBygetJadsc_By_CaseIdStageStatus(caseId, stageStatus, stageName);

		return remove(jadscApplicationStage);
	}

	/**
	 * Returns the number of jadsc application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching jadsc application stages
	 */
	@Override
	public int countBygetJadsc_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_By_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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
		_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_CASEID_2 =
			"jadscApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_CASEID_3 =
			"(jadscApplicationStage.caseId IS NULL OR jadscApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"jadscApplicationStage.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(jadscApplicationStage.stageStatus IS NULL OR jadscApplicationStage.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGENAME_2 =
			"jadscApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(jadscApplicationStage.stageName IS NULL OR jadscApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchBygetJadsc_By_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetJadsc_By_CaseIdAndStatus;

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findBygetJadsc_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage =
			fetchBygetJadsc_By_CaseIdAndStatus(caseId, stageStatus);

		if (jadscApplicationStage == null) {
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

			throw new NoSuchJadscApplicationStageException(sb.toString());
		}

		return jadscApplicationStage;
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetJadsc_By_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdAndStatus(
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
				_finderPathFetchBygetJadsc_By_CaseIdAndStatus, finderArgs,
				this);
		}

		if (result instanceof JadscApplicationStage) {
			JadscApplicationStage jadscApplicationStage =
				(JadscApplicationStage)result;

			if (!Objects.equals(caseId, jadscApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageStatus, jadscApplicationStage.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<JadscApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJadsc_By_CaseIdAndStatus,
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
								"JadscApplicationStagePersistenceImpl.fetchBygetJadsc_By_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JadscApplicationStage jadscApplicationStage = list.get(0);

					result = jadscApplicationStage;

					cacheResult(jadscApplicationStage);
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
			return (JadscApplicationStage)result;
		}
	}

	/**
	 * Removes the jadsc application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the jadsc application stage that was removed
	 */
	@Override
	public JadscApplicationStage removeBygetJadsc_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage =
			findBygetJadsc_By_CaseIdAndStatus(caseId, stageStatus);

		return remove(jadscApplicationStage);
	}

	/**
	 * Returns the number of jadsc application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching jadsc application stages
	 */
	@Override
	public int countBygetJadsc_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_By_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_CASEID_2 =
			"jadscApplicationStage.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_CASEID_3 =
			"(jadscApplicationStage.caseId IS NULL OR jadscApplicationStage.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_STAGESTATUS_2 =
			"jadscApplicationStage.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(jadscApplicationStage.stageStatus IS NULL OR jadscApplicationStage.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetJadsc_By_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetJadsc_By_CaseId;
	private FinderPath _finderPathCountBygetJadsc_By_CaseId;

	/**
	 * Returns all the jadsc application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findBygetJadsc_By_CaseId(String caseId) {
		return findBygetJadsc_By_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findBygetJadsc_By_CaseId(
		String caseId, int start, int end) {

		return findBygetJadsc_By_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findBygetJadsc_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return findBygetJadsc_By_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findBygetJadsc_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJadsc_By_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJadsc_By_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<JadscApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<JadscApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JadscApplicationStage jadscApplicationStage : list) {
					if (!caseId.equals(jadscApplicationStage.getCaseId())) {
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

			sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JadscApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<JadscApplicationStage>)QueryUtil.list(
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
	 * Returns the first jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findBygetJadsc_By_CaseId_First(
			String caseId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage =
			fetchBygetJadsc_By_CaseId_First(caseId, orderByComparator);

		if (jadscApplicationStage != null) {
			return jadscApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJadscApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_CaseId_First(
		String caseId,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		List<JadscApplicationStage> list = findBygetJadsc_By_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findBygetJadsc_By_CaseId_Last(
			String caseId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage =
			fetchBygetJadsc_By_CaseId_Last(caseId, orderByComparator);

		if (jadscApplicationStage != null) {
			return jadscApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJadscApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_CaseId_Last(
		String caseId,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		int count = countBygetJadsc_By_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<JadscApplicationStage> list = findBygetJadsc_By_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	@Override
	public JadscApplicationStage[] findBygetJadsc_By_CaseId_PrevAndNext(
			long jadscAppStageId, String caseId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		caseId = Objects.toString(caseId, "");

		JadscApplicationStage jadscApplicationStage = findByPrimaryKey(
			jadscAppStageId);

		Session session = null;

		try {
			session = openSession();

			JadscApplicationStage[] array = new JadscApplicationStageImpl[3];

			array[0] = getBygetJadsc_By_CaseId_PrevAndNext(
				session, jadscApplicationStage, caseId, orderByComparator,
				true);

			array[1] = jadscApplicationStage;

			array[2] = getBygetJadsc_By_CaseId_PrevAndNext(
				session, jadscApplicationStage, caseId, orderByComparator,
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

	protected JadscApplicationStage getBygetJadsc_By_CaseId_PrevAndNext(
		Session session, JadscApplicationStage jadscApplicationStage,
		String caseId,
		OrderByComparator<JadscApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEID_CASEID_2);
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
			sb.append(JadscApplicationStageModelImpl.ORDER_BY_JPQL);
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
						jadscApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JadscApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetJadsc_By_CaseId(String caseId) {
		for (JadscApplicationStage jadscApplicationStage :
				findBygetJadsc_By_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscApplicationStage);
		}
	}

	/**
	 * Returns the number of jadsc application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application stages
	 */
	@Override
	public int countBygetJadsc_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJADSC_BY_CASEID_CASEID_2 =
		"jadscApplicationStage.caseId = ?";

	private static final String _FINDER_COLUMN_GETJADSC_BY_CASEID_CASEID_3 =
		"(jadscApplicationStage.caseId IS NULL OR jadscApplicationStage.caseId = '')";

	private FinderPath _finderPathFetchBygetJadsc_ByCaseId;
	private FinderPath _finderPathCountBygetJadsc_ByCaseId;

	/**
	 * Returns the jadsc application stage where caseId = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findBygetJadsc_ByCaseId(String caseId)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage = fetchBygetJadsc_ByCaseId(
			caseId);

		if (jadscApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJadscApplicationStageException(sb.toString());
		}

		return jadscApplicationStage;
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_ByCaseId(String caseId) {
		return fetchBygetJadsc_ByCaseId(caseId, true);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_ByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJadsc_ByCaseId, finderArgs, this);
		}

		if (result instanceof JadscApplicationStage) {
			JadscApplicationStage jadscApplicationStage =
				(JadscApplicationStage)result;

			if (!Objects.equals(caseId, jadscApplicationStage.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BYCASEID_CASEID_2);
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

				List<JadscApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJadsc_ByCaseId, finderArgs,
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
								"JadscApplicationStagePersistenceImpl.fetchBygetJadsc_ByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JadscApplicationStage jadscApplicationStage = list.get(0);

					result = jadscApplicationStage;

					cacheResult(jadscApplicationStage);
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
			return (JadscApplicationStage)result;
		}
	}

	/**
	 * Removes the jadsc application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application stage that was removed
	 */
	@Override
	public JadscApplicationStage removeBygetJadsc_ByCaseId(String caseId)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage = findBygetJadsc_ByCaseId(
			caseId);

		return remove(jadscApplicationStage);
	}

	/**
	 * Returns the number of jadsc application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application stages
	 */
	@Override
	public int countBygetJadsc_ByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_ByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJADSC_BYCASEID_CASEID_2 =
		"jadscApplicationStage.caseId = ?";

	private static final String _FINDER_COLUMN_GETJADSC_BYCASEID_CASEID_3 =
		"(jadscApplicationStage.caseId IS NULL OR jadscApplicationStage.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJadsc_By_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetJadsc_By_StageName;
	private FinderPath _finderPathCountBygetJadsc_By_StageName;

	/**
	 * Returns all the jadsc application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName) {

		return findBygetJadsc_By_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName, int start, int end) {

		return findBygetJadsc_By_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return findBygetJadsc_By_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJadsc_By_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJadsc_By_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<JadscApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<JadscApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JadscApplicationStage jadscApplicationStage : list) {
					if (!stageName.equals(
							jadscApplicationStage.getStageName())) {

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

			sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JadscApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<JadscApplicationStage>)QueryUtil.list(
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
	 * Returns the first jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findBygetJadsc_By_StageName_First(
			String stageName,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage =
			fetchBygetJadsc_By_StageName_First(stageName, orderByComparator);

		if (jadscApplicationStage != null) {
			return jadscApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchJadscApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_StageName_First(
		String stageName,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		List<JadscApplicationStage> list = findBygetJadsc_By_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage findBygetJadsc_By_StageName_Last(
			String stageName,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage =
			fetchBygetJadsc_By_StageName_Last(stageName, orderByComparator);

		if (jadscApplicationStage != null) {
			return jadscApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchJadscApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	@Override
	public JadscApplicationStage fetchBygetJadsc_By_StageName_Last(
		String stageName,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		int count = countBygetJadsc_By_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<JadscApplicationStage> list = findBygetJadsc_By_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	@Override
	public JadscApplicationStage[] findBygetJadsc_By_StageName_PrevAndNext(
			long jadscAppStageId, String stageName,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException {

		stageName = Objects.toString(stageName, "");

		JadscApplicationStage jadscApplicationStage = findByPrimaryKey(
			jadscAppStageId);

		Session session = null;

		try {
			session = openSession();

			JadscApplicationStage[] array = new JadscApplicationStageImpl[3];

			array[0] = getBygetJadsc_By_StageName_PrevAndNext(
				session, jadscApplicationStage, stageName, orderByComparator,
				true);

			array[1] = jadscApplicationStage;

			array[2] = getBygetJadsc_By_StageName_PrevAndNext(
				session, jadscApplicationStage, stageName, orderByComparator,
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

	protected JadscApplicationStage getBygetJadsc_By_StageName_PrevAndNext(
		Session session, JadscApplicationStage jadscApplicationStage,
		String stageName,
		OrderByComparator<JadscApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJADSC_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETJADSC_BY_STAGENAME_STAGENAME_2);
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
			sb.append(JadscApplicationStageModelImpl.ORDER_BY_JPQL);
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
						jadscApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JadscApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetJadsc_By_StageName(String stageName) {
		for (JadscApplicationStage jadscApplicationStage :
				findBygetJadsc_By_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscApplicationStage);
		}
	}

	/**
	 * Returns the number of jadsc application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching jadsc application stages
	 */
	@Override
	public int countBygetJadsc_By_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_By_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_STAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETJADSC_BY_STAGENAME_STAGENAME_2 =
			"jadscApplicationStage.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_STAGENAME_STAGENAME_3 =
			"(jadscApplicationStage.stageName IS NULL OR jadscApplicationStage.stageName = '')";

	public JadscApplicationStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JadscApplicationStage.class);

		setModelImplClass(JadscApplicationStageImpl.class);
		setModelPKClass(long.class);

		setTable(JadscApplicationStageTable.INSTANCE);
	}

	/**
	 * Caches the jadsc application stage in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 */
	@Override
	public void cacheResult(JadscApplicationStage jadscApplicationStage) {
		entityCache.putResult(
			JadscApplicationStageImpl.class,
			jadscApplicationStage.getPrimaryKey(), jadscApplicationStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jadscApplicationStage.getUuid(),
				jadscApplicationStage.getGroupId()
			},
			jadscApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetJadsc_By_AI,
			new Object[] {jadscApplicationStage.getJadscApplicationId()},
			jadscApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetJadsc_By_CaseIdStageName,
			new Object[] {
				jadscApplicationStage.getCaseId(),
				jadscApplicationStage.getStageName()
			},
			jadscApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetJadsc_By_CaseIdStageStatus,
			new Object[] {
				jadscApplicationStage.getCaseId(),
				jadscApplicationStage.getStageStatus(),
				jadscApplicationStage.getStageName()
			},
			jadscApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetJadsc_By_CaseIdAndStatus,
			new Object[] {
				jadscApplicationStage.getCaseId(),
				jadscApplicationStage.getStageStatus()
			},
			jadscApplicationStage);

		finderCache.putResult(
			_finderPathFetchBygetJadsc_ByCaseId,
			new Object[] {jadscApplicationStage.getCaseId()},
			jadscApplicationStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc application stages in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationStages the jadsc application stages
	 */
	@Override
	public void cacheResult(
		List<JadscApplicationStage> jadscApplicationStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscApplicationStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JadscApplicationStage jadscApplicationStage :
				jadscApplicationStages) {

			if (entityCache.getResult(
					JadscApplicationStageImpl.class,
					jadscApplicationStage.getPrimaryKey()) == null) {

				cacheResult(jadscApplicationStage);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JadscApplicationStageImpl.class);

		finderCache.clearCache(JadscApplicationStageImpl.class);
	}

	/**
	 * Clears the cache for the jadsc application stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JadscApplicationStage jadscApplicationStage) {
		entityCache.removeResult(
			JadscApplicationStageImpl.class, jadscApplicationStage);
	}

	@Override
	public void clearCache(List<JadscApplicationStage> jadscApplicationStages) {
		for (JadscApplicationStage jadscApplicationStage :
				jadscApplicationStages) {

			entityCache.removeResult(
				JadscApplicationStageImpl.class, jadscApplicationStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JadscApplicationStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JadscApplicationStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JadscApplicationStageModelImpl jadscApplicationStageModelImpl) {

		Object[] args = new Object[] {
			jadscApplicationStageModelImpl.getUuid(),
			jadscApplicationStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, jadscApplicationStageModelImpl);

		args = new Object[] {
			jadscApplicationStageModelImpl.getJadscApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJadsc_By_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJadsc_By_AI, args,
			jadscApplicationStageModelImpl);

		args = new Object[] {
			jadscApplicationStageModelImpl.getCaseId(),
			jadscApplicationStageModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetJadsc_By_CaseIdStageName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJadsc_By_CaseIdStageName, args,
			jadscApplicationStageModelImpl);

		args = new Object[] {
			jadscApplicationStageModelImpl.getCaseId(),
			jadscApplicationStageModelImpl.getStageStatus(),
			jadscApplicationStageModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetJadsc_By_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJadsc_By_CaseIdStageStatus, args,
			jadscApplicationStageModelImpl);

		args = new Object[] {
			jadscApplicationStageModelImpl.getCaseId(),
			jadscApplicationStageModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetJadsc_By_CaseIdAndStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJadsc_By_CaseIdAndStatus, args,
			jadscApplicationStageModelImpl);

		args = new Object[] {jadscApplicationStageModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetJadsc_ByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJadsc_ByCaseId, args,
			jadscApplicationStageModelImpl);
	}

	/**
	 * Creates a new jadsc application stage with the primary key. Does not add the jadsc application stage to the database.
	 *
	 * @param jadscAppStageId the primary key for the new jadsc application stage
	 * @return the new jadsc application stage
	 */
	@Override
	public JadscApplicationStage create(long jadscAppStageId) {
		JadscApplicationStage jadscApplicationStage =
			new JadscApplicationStageImpl();

		jadscApplicationStage.setNew(true);
		jadscApplicationStage.setPrimaryKey(jadscAppStageId);

		String uuid = PortalUUIDUtil.generate();

		jadscApplicationStage.setUuid(uuid);

		jadscApplicationStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jadscApplicationStage;
	}

	/**
	 * Removes the jadsc application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage that was removed
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	@Override
	public JadscApplicationStage remove(long jadscAppStageId)
		throws NoSuchJadscApplicationStageException {

		return remove((Serializable)jadscAppStageId);
	}

	/**
	 * Removes the jadsc application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc application stage
	 * @return the jadsc application stage that was removed
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	@Override
	public JadscApplicationStage remove(Serializable primaryKey)
		throws NoSuchJadscApplicationStageException {

		Session session = null;

		try {
			session = openSession();

			JadscApplicationStage jadscApplicationStage =
				(JadscApplicationStage)session.get(
					JadscApplicationStageImpl.class, primaryKey);

			if (jadscApplicationStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJadscApplicationStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscApplicationStage);
		}
		catch (NoSuchJadscApplicationStageException noSuchEntityException) {
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
	protected JadscApplicationStage removeImpl(
		JadscApplicationStage jadscApplicationStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscApplicationStage)) {
				jadscApplicationStage = (JadscApplicationStage)session.get(
					JadscApplicationStageImpl.class,
					jadscApplicationStage.getPrimaryKeyObj());
			}

			if (jadscApplicationStage != null) {
				session.delete(jadscApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscApplicationStage != null) {
			clearCache(jadscApplicationStage);
		}

		return jadscApplicationStage;
	}

	@Override
	public JadscApplicationStage updateImpl(
		JadscApplicationStage jadscApplicationStage) {

		boolean isNew = jadscApplicationStage.isNew();

		if (!(jadscApplicationStage instanceof
				JadscApplicationStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscApplicationStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscApplicationStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscApplicationStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JadscApplicationStage implementation " +
					jadscApplicationStage.getClass());
		}

		JadscApplicationStageModelImpl jadscApplicationStageModelImpl =
			(JadscApplicationStageModelImpl)jadscApplicationStage;

		if (Validator.isNull(jadscApplicationStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jadscApplicationStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscApplicationStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscApplicationStage.setCreateDate(date);
			}
			else {
				jadscApplicationStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscApplicationStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscApplicationStage.setModifiedDate(date);
			}
			else {
				jadscApplicationStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscApplicationStage);
			}
			else {
				jadscApplicationStage = (JadscApplicationStage)session.merge(
					jadscApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JadscApplicationStageImpl.class, jadscApplicationStageModelImpl,
			false, true);

		cacheUniqueFindersCache(jadscApplicationStageModelImpl);

		if (isNew) {
			jadscApplicationStage.setNew(false);
		}

		jadscApplicationStage.resetOriginalValues();

		return jadscApplicationStage;
	}

	/**
	 * Returns the jadsc application stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc application stage
	 * @return the jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	@Override
	public JadscApplicationStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJadscApplicationStageException {

		JadscApplicationStage jadscApplicationStage = fetchByPrimaryKey(
			primaryKey);

		if (jadscApplicationStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJadscApplicationStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscApplicationStage;
	}

	/**
	 * Returns the jadsc application stage with the primary key or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	@Override
	public JadscApplicationStage findByPrimaryKey(long jadscAppStageId)
		throws NoSuchJadscApplicationStageException {

		return findByPrimaryKey((Serializable)jadscAppStageId);
	}

	/**
	 * Returns the jadsc application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage, or <code>null</code> if a jadsc application stage with the primary key could not be found
	 */
	@Override
	public JadscApplicationStage fetchByPrimaryKey(long jadscAppStageId) {
		return fetchByPrimaryKey((Serializable)jadscAppStageId);
	}

	/**
	 * Returns all the jadsc application stages.
	 *
	 * @return the jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc application stages
	 */
	@Override
	public List<JadscApplicationStage> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator,
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

		List<JadscApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<JadscApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCAPPLICATIONSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCAPPLICATIONSTAGE;

				sql = sql.concat(JadscApplicationStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JadscApplicationStage>)QueryUtil.list(
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
	 * Removes all the jadsc application stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JadscApplicationStage jadscApplicationStage : findAll()) {
			remove(jadscApplicationStage);
		}
	}

	/**
	 * Returns the number of jadsc application stages.
	 *
	 * @return the number of jadsc application stages
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
					_SQL_COUNT_JADSCAPPLICATIONSTAGE);

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
		return "jadscAppStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCAPPLICATIONSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JadscApplicationStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc application stage persistence.
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

		_finderPathFetchBygetJadsc_By_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJadsc_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, true);

		_finderPathCountBygetJadsc_By_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, false);

		_finderPathFetchBygetJadsc_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJadsc_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetJadsc_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJadsc_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetJadsc_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJadsc_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetJadsc_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJadsc_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetJadsc_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJadsc_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetJadsc_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJadsc_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetJadsc_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJadsc_By_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetJadsc_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetJadsc_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetJadsc_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJadsc_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchBygetJadsc_ByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJadsc_ByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJadsc_ByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJadsc_ByCaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetJadsc_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetJadsc_By_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetJadsc_By_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetJadsc_By_StageName",
				new String[] {String.class.getName()},
				new String[] {"stageName"}, true);

		_finderPathCountBygetJadsc_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJadsc_By_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		JadscApplicationStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JadscApplicationStageUtil.setPersistence(null);

		entityCache.removeCache(JadscApplicationStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = JADSC_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JADSC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JADSC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JADSCAPPLICATIONSTAGE =
		"SELECT jadscApplicationStage FROM JadscApplicationStage jadscApplicationStage";

	private static final String _SQL_SELECT_JADSCAPPLICATIONSTAGE_WHERE =
		"SELECT jadscApplicationStage FROM JadscApplicationStage jadscApplicationStage WHERE ";

	private static final String _SQL_COUNT_JADSCAPPLICATIONSTAGE =
		"SELECT COUNT(jadscApplicationStage) FROM JadscApplicationStage jadscApplicationStage";

	private static final String _SQL_COUNT_JADSCAPPLICATIONSTAGE_WHERE =
		"SELECT COUNT(jadscApplicationStage) FROM JadscApplicationStage jadscApplicationStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscApplicationStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JadscApplicationStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JadscApplicationStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JadscApplicationStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}