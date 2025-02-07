/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence.impl;

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

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCCurrentStageException;
import com.nbp.jadsc.application.form.service.model.JADSCCurrentStage;
import com.nbp.jadsc.application.form.service.model.JADSCCurrentStageTable;
import com.nbp.jadsc.application.form.service.model.impl.JADSCCurrentStageImpl;
import com.nbp.jadsc.application.form.service.model.impl.JADSCCurrentStageModelImpl;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCurrentStagePersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCurrentStageUtil;
import com.nbp.jadsc.application.form.service.service.persistence.impl.constants.JADSC_FORMPersistenceConstants;

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
 * The persistence implementation for the jadsc current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JADSCCurrentStagePersistence.class)
public class JADSCCurrentStagePersistenceImpl
	extends BasePersistenceImpl<JADSCCurrentStage>
	implements JADSCCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JADSCCurrentStageUtil</code> to access the jadsc current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JADSCCurrentStageImpl.class.getName();

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
	 * Returns all the jadsc current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @return the range of matching jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator,
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

		List<JADSCCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<JADSCCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCCurrentStage jadscCurrentStage : list) {
					if (!uuid.equals(jadscCurrentStage.getUuid())) {
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

			sb.append(_SQL_SELECT_JADSCCURRENTSTAGE_WHERE);

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
				sb.append(JADSCCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCCurrentStage>)QueryUtil.list(
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
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage findByUuid_First(
			String uuid, OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws NoSuchJADSCCurrentStageException {

		JADSCCurrentStage jadscCurrentStage = fetchByUuid_First(
			uuid, orderByComparator);

		if (jadscCurrentStage != null) {
			return jadscCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage fetchByUuid_First(
		String uuid, OrderByComparator<JADSCCurrentStage> orderByComparator) {

		List<JADSCCurrentStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage findByUuid_Last(
			String uuid, OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws NoSuchJADSCCurrentStageException {

		JADSCCurrentStage jadscCurrentStage = fetchByUuid_Last(
			uuid, orderByComparator);

		if (jadscCurrentStage != null) {
			return jadscCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage fetchByUuid_Last(
		String uuid, OrderByComparator<JADSCCurrentStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JADSCCurrentStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc current stages before and after the current jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCurrentStageId the primary key of the current jadsc current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	@Override
	public JADSCCurrentStage[] findByUuid_PrevAndNext(
			long jadscCurrentStageId, String uuid,
			OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws NoSuchJADSCCurrentStageException {

		uuid = Objects.toString(uuid, "");

		JADSCCurrentStage jadscCurrentStage = findByPrimaryKey(
			jadscCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			JADSCCurrentStage[] array = new JADSCCurrentStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jadscCurrentStage, uuid, orderByComparator, true);

			array[1] = jadscCurrentStage;

			array[2] = getByUuid_PrevAndNext(
				session, jadscCurrentStage, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JADSCCurrentStage getByUuid_PrevAndNext(
		Session session, JADSCCurrentStage jadscCurrentStage, String uuid,
		OrderByComparator<JADSCCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCURRENTSTAGE_WHERE);

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
			sb.append(JADSCCurrentStageModelImpl.ORDER_BY_JPQL);
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
						jadscCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JADSCCurrentStage jadscCurrentStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscCurrentStage);
		}
	}

	/**
	 * Returns the number of jadsc current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc current stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCCURRENTSTAGE_WHERE);

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
		"jadscCurrentStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jadscCurrentStage.uuid IS NULL OR jadscCurrentStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jadsc current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCurrentStageException {

		JADSCCurrentStage jadscCurrentStage = fetchByUUID_G(uuid, groupId);

		if (jadscCurrentStage == null) {
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

			throw new NoSuchJADSCCurrentStageException(sb.toString());
		}

		return jadscCurrentStage;
	}

	/**
	 * Returns the jadsc current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jadsc current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage fetchByUUID_G(
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

		if (result instanceof JADSCCurrentStage) {
			JADSCCurrentStage jadscCurrentStage = (JADSCCurrentStage)result;

			if (!Objects.equals(uuid, jadscCurrentStage.getUuid()) ||
				(groupId != jadscCurrentStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCCURRENTSTAGE_WHERE);

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

				List<JADSCCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JADSCCurrentStage jadscCurrentStage = list.get(0);

					result = jadscCurrentStage;

					cacheResult(jadscCurrentStage);
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
			return (JADSCCurrentStage)result;
		}
	}

	/**
	 * Removes the jadsc current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc current stage that was removed
	 */
	@Override
	public JADSCCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCurrentStageException {

		JADSCCurrentStage jadscCurrentStage = findByUUID_G(uuid, groupId);

		return remove(jadscCurrentStage);
	}

	/**
	 * Returns the number of jadsc current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc current stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCCURRENTSTAGE_WHERE);

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
		"jadscCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jadscCurrentStage.uuid IS NULL OR jadscCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jadscCurrentStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @return the range of matching jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator,
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

		List<JADSCCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<JADSCCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCCurrentStage jadscCurrentStage : list) {
					if (!uuid.equals(jadscCurrentStage.getUuid()) ||
						(companyId != jadscCurrentStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JADSCCURRENTSTAGE_WHERE);

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
				sb.append(JADSCCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCCurrentStage>)QueryUtil.list(
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
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws NoSuchJADSCCurrentStageException {

		JADSCCurrentStage jadscCurrentStage = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (jadscCurrentStage != null) {
			return jadscCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCCurrentStage> orderByComparator) {

		List<JADSCCurrentStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws NoSuchJADSCCurrentStageException {

		JADSCCurrentStage jadscCurrentStage = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (jadscCurrentStage != null) {
			return jadscCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCCurrentStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JADSCCurrentStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc current stages before and after the current jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCurrentStageId the primary key of the current jadsc current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	@Override
	public JADSCCurrentStage[] findByUuid_C_PrevAndNext(
			long jadscCurrentStageId, String uuid, long companyId,
			OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws NoSuchJADSCCurrentStageException {

		uuid = Objects.toString(uuid, "");

		JADSCCurrentStage jadscCurrentStage = findByPrimaryKey(
			jadscCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			JADSCCurrentStage[] array = new JADSCCurrentStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jadscCurrentStage, uuid, companyId, orderByComparator,
				true);

			array[1] = jadscCurrentStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, jadscCurrentStage, uuid, companyId, orderByComparator,
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

	protected JADSCCurrentStage getByUuid_C_PrevAndNext(
		Session session, JADSCCurrentStage jadscCurrentStage, String uuid,
		long companyId, OrderByComparator<JADSCCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCURRENTSTAGE_WHERE);

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
			sb.append(JADSCCurrentStageModelImpl.ORDER_BY_JPQL);
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
						jadscCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JADSCCurrentStage jadscCurrentStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscCurrentStage);
		}
	}

	/**
	 * Returns the number of jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc current stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCCURRENTSTAGE_WHERE);

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
		"jadscCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jadscCurrentStage.uuid IS NULL OR jadscCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jadscCurrentStage.companyId = ?";

	private FinderPath _finderPathFetchBygetByJadsc_Stage;
	private FinderPath _finderPathCountBygetByJadsc_Stage;

	/**
	 * Returns the jadsc current stage where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCCurrentStageException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage findBygetByJadsc_Stage(long jadscApplicationId)
		throws NoSuchJADSCCurrentStageException {

		JADSCCurrentStage jadscCurrentStage = fetchBygetByJadsc_Stage(
			jadscApplicationId);

		if (jadscCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jadscApplicationId=");
			sb.append(jadscApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJADSCCurrentStageException(sb.toString());
		}

		return jadscCurrentStage;
	}

	/**
	 * Returns the jadsc current stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage fetchBygetByJadsc_Stage(long jadscApplicationId) {
		return fetchBygetByJadsc_Stage(jadscApplicationId, true);
	}

	/**
	 * Returns the jadsc current stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	@Override
	public JADSCCurrentStage fetchBygetByJadsc_Stage(
		long jadscApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jadscApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetByJadsc_Stage, finderArgs, this);
		}

		if (result instanceof JADSCCurrentStage) {
			JADSCCurrentStage jadscCurrentStage = (JADSCCurrentStage)result;

			if (jadscApplicationId !=
					jadscCurrentStage.getJadscApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYJADSC_STAGE_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

				List<JADSCCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetByJadsc_Stage, finderArgs,
							list);
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
								"JADSCCurrentStagePersistenceImpl.fetchBygetByJadsc_Stage(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JADSCCurrentStage jadscCurrentStage = list.get(0);

					result = jadscCurrentStage;

					cacheResult(jadscCurrentStage);
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
			return (JADSCCurrentStage)result;
		}
	}

	/**
	 * Removes the jadsc current stage where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc current stage that was removed
	 */
	@Override
	public JADSCCurrentStage removeBygetByJadsc_Stage(long jadscApplicationId)
		throws NoSuchJADSCCurrentStageException {

		JADSCCurrentStage jadscCurrentStage = findBygetByJadsc_Stage(
			jadscApplicationId);

		return remove(jadscCurrentStage);
	}

	/**
	 * Returns the number of jadsc current stages where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc current stages
	 */
	@Override
	public int countBygetByJadsc_Stage(long jadscApplicationId) {
		FinderPath finderPath = _finderPathCountBygetByJadsc_Stage;

		Object[] finderArgs = new Object[] {jadscApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYJADSC_STAGE_JADSCAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETBYJADSC_STAGE_JADSCAPPLICATIONID_2 =
			"jadscCurrentStage.jadscApplicationId = ?";

	public JADSCCurrentStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JADSCCurrentStage.class);

		setModelImplClass(JADSCCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(JADSCCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the jadsc current stage in the entity cache if it is enabled.
	 *
	 * @param jadscCurrentStage the jadsc current stage
	 */
	@Override
	public void cacheResult(JADSCCurrentStage jadscCurrentStage) {
		entityCache.putResult(
			JADSCCurrentStageImpl.class, jadscCurrentStage.getPrimaryKey(),
			jadscCurrentStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jadscCurrentStage.getUuid(), jadscCurrentStage.getGroupId()
			},
			jadscCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetByJadsc_Stage,
			new Object[] {jadscCurrentStage.getJadscApplicationId()},
			jadscCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc current stages in the entity cache if it is enabled.
	 *
	 * @param jadscCurrentStages the jadsc current stages
	 */
	@Override
	public void cacheResult(List<JADSCCurrentStage> jadscCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JADSCCurrentStage jadscCurrentStage : jadscCurrentStages) {
			if (entityCache.getResult(
					JADSCCurrentStageImpl.class,
					jadscCurrentStage.getPrimaryKey()) == null) {

				cacheResult(jadscCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JADSCCurrentStageImpl.class);

		finderCache.clearCache(JADSCCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the jadsc current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JADSCCurrentStage jadscCurrentStage) {
		entityCache.removeResult(
			JADSCCurrentStageImpl.class, jadscCurrentStage);
	}

	@Override
	public void clearCache(List<JADSCCurrentStage> jadscCurrentStages) {
		for (JADSCCurrentStage jadscCurrentStage : jadscCurrentStages) {
			entityCache.removeResult(
				JADSCCurrentStageImpl.class, jadscCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JADSCCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JADSCCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JADSCCurrentStageModelImpl jadscCurrentStageModelImpl) {

		Object[] args = new Object[] {
			jadscCurrentStageModelImpl.getUuid(),
			jadscCurrentStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, jadscCurrentStageModelImpl);

		args = new Object[] {
			jadscCurrentStageModelImpl.getJadscApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetByJadsc_Stage, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetByJadsc_Stage, args,
			jadscCurrentStageModelImpl);
	}

	/**
	 * Creates a new jadsc current stage with the primary key. Does not add the jadsc current stage to the database.
	 *
	 * @param jadscCurrentStageId the primary key for the new jadsc current stage
	 * @return the new jadsc current stage
	 */
	@Override
	public JADSCCurrentStage create(long jadscCurrentStageId) {
		JADSCCurrentStage jadscCurrentStage = new JADSCCurrentStageImpl();

		jadscCurrentStage.setNew(true);
		jadscCurrentStage.setPrimaryKey(jadscCurrentStageId);

		String uuid = PortalUUIDUtil.generate();

		jadscCurrentStage.setUuid(uuid);

		jadscCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jadscCurrentStage;
	}

	/**
	 * Removes the jadsc current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage that was removed
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	@Override
	public JADSCCurrentStage remove(long jadscCurrentStageId)
		throws NoSuchJADSCCurrentStageException {

		return remove((Serializable)jadscCurrentStageId);
	}

	/**
	 * Removes the jadsc current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc current stage
	 * @return the jadsc current stage that was removed
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	@Override
	public JADSCCurrentStage remove(Serializable primaryKey)
		throws NoSuchJADSCCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			JADSCCurrentStage jadscCurrentStage =
				(JADSCCurrentStage)session.get(
					JADSCCurrentStageImpl.class, primaryKey);

			if (jadscCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJADSCCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscCurrentStage);
		}
		catch (NoSuchJADSCCurrentStageException noSuchEntityException) {
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
	protected JADSCCurrentStage removeImpl(
		JADSCCurrentStage jadscCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscCurrentStage)) {
				jadscCurrentStage = (JADSCCurrentStage)session.get(
					JADSCCurrentStageImpl.class,
					jadscCurrentStage.getPrimaryKeyObj());
			}

			if (jadscCurrentStage != null) {
				session.delete(jadscCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscCurrentStage != null) {
			clearCache(jadscCurrentStage);
		}

		return jadscCurrentStage;
	}

	@Override
	public JADSCCurrentStage updateImpl(JADSCCurrentStage jadscCurrentStage) {
		boolean isNew = jadscCurrentStage.isNew();

		if (!(jadscCurrentStage instanceof JADSCCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JADSCCurrentStage implementation " +
					jadscCurrentStage.getClass());
		}

		JADSCCurrentStageModelImpl jadscCurrentStageModelImpl =
			(JADSCCurrentStageModelImpl)jadscCurrentStage;

		if (Validator.isNull(jadscCurrentStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jadscCurrentStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscCurrentStage.setCreateDate(date);
			}
			else {
				jadscCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscCurrentStage.setModifiedDate(date);
			}
			else {
				jadscCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscCurrentStage);
			}
			else {
				jadscCurrentStage = (JADSCCurrentStage)session.merge(
					jadscCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JADSCCurrentStageImpl.class, jadscCurrentStageModelImpl, false,
			true);

		cacheUniqueFindersCache(jadscCurrentStageModelImpl);

		if (isNew) {
			jadscCurrentStage.setNew(false);
		}

		jadscCurrentStage.resetOriginalValues();

		return jadscCurrentStage;
	}

	/**
	 * Returns the jadsc current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc current stage
	 * @return the jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	@Override
	public JADSCCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJADSCCurrentStageException {

		JADSCCurrentStage jadscCurrentStage = fetchByPrimaryKey(primaryKey);

		if (jadscCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJADSCCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscCurrentStage;
	}

	/**
	 * Returns the jadsc current stage with the primary key or throws a <code>NoSuchJADSCCurrentStageException</code> if it could not be found.
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	@Override
	public JADSCCurrentStage findByPrimaryKey(long jadscCurrentStageId)
		throws NoSuchJADSCCurrentStageException {

		return findByPrimaryKey((Serializable)jadscCurrentStageId);
	}

	/**
	 * Returns the jadsc current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage, or <code>null</code> if a jadsc current stage with the primary key could not be found
	 */
	@Override
	public JADSCCurrentStage fetchByPrimaryKey(long jadscCurrentStageId) {
		return fetchByPrimaryKey((Serializable)jadscCurrentStageId);
	}

	/**
	 * Returns all the jadsc current stages.
	 *
	 * @return the jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @return the range of jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findAll(
		int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc current stages
	 */
	@Override
	public List<JADSCCurrentStage> findAll(
		int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator,
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

		List<JADSCCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<JADSCCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCCURRENTSTAGE;

				sql = sql.concat(JADSCCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JADSCCurrentStage>)QueryUtil.list(
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
	 * Removes all the jadsc current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JADSCCurrentStage jadscCurrentStage : findAll()) {
			remove(jadscCurrentStage);
		}
	}

	/**
	 * Returns the number of jadsc current stages.
	 *
	 * @return the number of jadsc current stages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JADSCCURRENTSTAGE);

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
		return "jadscCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JADSCCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc current stage persistence.
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

		_finderPathFetchBygetByJadsc_Stage = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetByJadsc_Stage",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, true);

		_finderPathCountBygetByJadsc_Stage = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetByJadsc_Stage", new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, false);

		JADSCCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JADSCCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(JADSCCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JADSCCURRENTSTAGE =
		"SELECT jadscCurrentStage FROM JADSCCurrentStage jadscCurrentStage";

	private static final String _SQL_SELECT_JADSCCURRENTSTAGE_WHERE =
		"SELECT jadscCurrentStage FROM JADSCCurrentStage jadscCurrentStage WHERE ";

	private static final String _SQL_COUNT_JADSCCURRENTSTAGE =
		"SELECT COUNT(jadscCurrentStage) FROM JADSCCurrentStage jadscCurrentStage";

	private static final String _SQL_COUNT_JADSCCURRENTSTAGE_WHERE =
		"SELECT COUNT(jadscCurrentStage) FROM JADSCCurrentStage jadscCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "jadscCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JADSCCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JADSCCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JADSCCurrentStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}