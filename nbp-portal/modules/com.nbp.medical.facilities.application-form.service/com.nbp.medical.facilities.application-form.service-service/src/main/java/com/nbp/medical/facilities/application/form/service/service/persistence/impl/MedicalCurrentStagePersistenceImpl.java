/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence.impl;

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

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalCurrentStageException;
import com.nbp.medical.facilities.application.form.service.model.MedicalCurrentStage;
import com.nbp.medical.facilities.application.form.service.model.MedicalCurrentStageTable;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalCurrentStageImpl;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalCurrentStageModelImpl;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalCurrentStagePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalCurrentStageUtil;
import com.nbp.medical.facilities.application.form.service.service.persistence.impl.constants.MEDICAL_FACILITIESPersistenceConstants;

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
 * The persistence implementation for the medical current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalCurrentStagePersistence.class)
public class MedicalCurrentStagePersistenceImpl
	extends BasePersistenceImpl<MedicalCurrentStage>
	implements MedicalCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalCurrentStageUtil</code> to access the medical current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalCurrentStageImpl.class.getName();

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
	 * Returns all the medical current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @return the range of matching medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator,
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

		List<MedicalCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<MedicalCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalCurrentStage medicalCurrentStage : list) {
					if (!uuid.equals(medicalCurrentStage.getUuid())) {
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

			sb.append(_SQL_SELECT_MEDICALCURRENTSTAGE_WHERE);

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
				sb.append(MedicalCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalCurrentStage>)QueryUtil.list(
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
	 * Returns the first medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException {

		MedicalCurrentStage medicalCurrentStage = fetchByUuid_First(
			uuid, orderByComparator);

		if (medicalCurrentStage != null) {
			return medicalCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage fetchByUuid_First(
		String uuid, OrderByComparator<MedicalCurrentStage> orderByComparator) {

		List<MedicalCurrentStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException {

		MedicalCurrentStage medicalCurrentStage = fetchByUuid_Last(
			uuid, orderByComparator);

		if (medicalCurrentStage != null) {
			return medicalCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage fetchByUuid_Last(
		String uuid, OrderByComparator<MedicalCurrentStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MedicalCurrentStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical current stages before and after the current medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param medicalCurrentStageId the primary key of the current medical current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	@Override
	public MedicalCurrentStage[] findByUuid_PrevAndNext(
			long medicalCurrentStageId, String uuid,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException {

		uuid = Objects.toString(uuid, "");

		MedicalCurrentStage medicalCurrentStage = findByPrimaryKey(
			medicalCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			MedicalCurrentStage[] array = new MedicalCurrentStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, medicalCurrentStage, uuid, orderByComparator, true);

			array[1] = medicalCurrentStage;

			array[2] = getByUuid_PrevAndNext(
				session, medicalCurrentStage, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalCurrentStage getByUuid_PrevAndNext(
		Session session, MedicalCurrentStage medicalCurrentStage, String uuid,
		OrderByComparator<MedicalCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALCURRENTSTAGE_WHERE);

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
			sb.append(MedicalCurrentStageModelImpl.ORDER_BY_JPQL);
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
						medicalCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MedicalCurrentStage medicalCurrentStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalCurrentStage);
		}
	}

	/**
	 * Returns the number of medical current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical current stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALCURRENTSTAGE_WHERE);

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
		"medicalCurrentStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(medicalCurrentStage.uuid IS NULL OR medicalCurrentStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the medical current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalCurrentStageException {

		MedicalCurrentStage medicalCurrentStage = fetchByUUID_G(uuid, groupId);

		if (medicalCurrentStage == null) {
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

			throw new NoSuchMedicalCurrentStageException(sb.toString());
		}

		return medicalCurrentStage;
	}

	/**
	 * Returns the medical current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the medical current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage fetchByUUID_G(
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

		if (result instanceof MedicalCurrentStage) {
			MedicalCurrentStage medicalCurrentStage =
				(MedicalCurrentStage)result;

			if (!Objects.equals(uuid, medicalCurrentStage.getUuid()) ||
				(groupId != medicalCurrentStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALCURRENTSTAGE_WHERE);

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

				List<MedicalCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MedicalCurrentStage medicalCurrentStage = list.get(0);

					result = medicalCurrentStage;

					cacheResult(medicalCurrentStage);
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
			return (MedicalCurrentStage)result;
		}
	}

	/**
	 * Removes the medical current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical current stage that was removed
	 */
	@Override
	public MedicalCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalCurrentStageException {

		MedicalCurrentStage medicalCurrentStage = findByUUID_G(uuid, groupId);

		return remove(medicalCurrentStage);
	}

	/**
	 * Returns the number of medical current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical current stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALCURRENTSTAGE_WHERE);

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
		"medicalCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(medicalCurrentStage.uuid IS NULL OR medicalCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"medicalCurrentStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @return the range of matching medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator,
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

		List<MedicalCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<MedicalCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalCurrentStage medicalCurrentStage : list) {
					if (!uuid.equals(medicalCurrentStage.getUuid()) ||
						(companyId != medicalCurrentStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MEDICALCURRENTSTAGE_WHERE);

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
				sb.append(MedicalCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalCurrentStage>)QueryUtil.list(
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
	 * Returns the first medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException {

		MedicalCurrentStage medicalCurrentStage = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (medicalCurrentStage != null) {
			return medicalCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalCurrentStage> orderByComparator) {

		List<MedicalCurrentStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException {

		MedicalCurrentStage medicalCurrentStage = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (medicalCurrentStage != null) {
			return medicalCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalCurrentStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MedicalCurrentStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical current stages before and after the current medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalCurrentStageId the primary key of the current medical current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	@Override
	public MedicalCurrentStage[] findByUuid_C_PrevAndNext(
			long medicalCurrentStageId, String uuid, long companyId,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException {

		uuid = Objects.toString(uuid, "");

		MedicalCurrentStage medicalCurrentStage = findByPrimaryKey(
			medicalCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			MedicalCurrentStage[] array = new MedicalCurrentStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, medicalCurrentStage, uuid, companyId,
				orderByComparator, true);

			array[1] = medicalCurrentStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, medicalCurrentStage, uuid, companyId,
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

	protected MedicalCurrentStage getByUuid_C_PrevAndNext(
		Session session, MedicalCurrentStage medicalCurrentStage, String uuid,
		long companyId,
		OrderByComparator<MedicalCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALCURRENTSTAGE_WHERE);

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
			sb.append(MedicalCurrentStageModelImpl.ORDER_BY_JPQL);
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
						medicalCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MedicalCurrentStage medicalCurrentStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalCurrentStage);
		}
	}

	/**
	 * Returns the number of medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical current stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALCURRENTSTAGE_WHERE);

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
		"medicalCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(medicalCurrentStage.uuid IS NULL OR medicalCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"medicalCurrentStage.companyId = ?";

	private FinderPath _finderPathFetchBygetByMED_Stage;
	private FinderPath _finderPathCountBygetByMED_Stage;

	/**
	 * Returns the medical current stage where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalCurrentStageException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage findBygetByMED_Stage(long medicalFacilitiesAppId)
		throws NoSuchMedicalCurrentStageException {

		MedicalCurrentStage medicalCurrentStage = fetchBygetByMED_Stage(
			medicalFacilitiesAppId);

		if (medicalCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("medicalFacilitiesAppId=");
			sb.append(medicalFacilitiesAppId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalCurrentStageException(sb.toString());
		}

		return medicalCurrentStage;
	}

	/**
	 * Returns the medical current stage where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage fetchBygetByMED_Stage(
		long medicalFacilitiesAppId) {

		return fetchBygetByMED_Stage(medicalFacilitiesAppId, true);
	}

	/**
	 * Returns the medical current stage where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	@Override
	public MedicalCurrentStage fetchBygetByMED_Stage(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {medicalFacilitiesAppId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetByMED_Stage, finderArgs, this);
		}

		if (result instanceof MedicalCurrentStage) {
			MedicalCurrentStage medicalCurrentStage =
				(MedicalCurrentStage)result;

			if (medicalFacilitiesAppId !=
					medicalCurrentStage.getMedicalFacilitiesAppId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYMED_STAGE_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				List<MedicalCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetByMED_Stage, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									medicalFacilitiesAppId
								};
							}

							_log.warn(
								"MedicalCurrentStagePersistenceImpl.fetchBygetByMED_Stage(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalCurrentStage medicalCurrentStage = list.get(0);

					result = medicalCurrentStage;

					cacheResult(medicalCurrentStage);
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
			return (MedicalCurrentStage)result;
		}
	}

	/**
	 * Removes the medical current stage where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical current stage that was removed
	 */
	@Override
	public MedicalCurrentStage removeBygetByMED_Stage(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalCurrentStageException {

		MedicalCurrentStage medicalCurrentStage = findBygetByMED_Stage(
			medicalFacilitiesAppId);

		return remove(medicalCurrentStage);
	}

	/**
	 * Returns the number of medical current stages where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical current stages
	 */
	@Override
	public int countBygetByMED_Stage(long medicalFacilitiesAppId) {
		FinderPath finderPath = _finderPathCountBygetByMED_Stage;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETBYMED_STAGE_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

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
		_FINDER_COLUMN_GETBYMED_STAGE_MEDICALFACILITIESAPPID_2 =
			"medicalCurrentStage.medicalFacilitiesAppId = ?";

	public MedicalCurrentStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MedicalCurrentStage.class);

		setModelImplClass(MedicalCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the medical current stage in the entity cache if it is enabled.
	 *
	 * @param medicalCurrentStage the medical current stage
	 */
	@Override
	public void cacheResult(MedicalCurrentStage medicalCurrentStage) {
		entityCache.putResult(
			MedicalCurrentStageImpl.class, medicalCurrentStage.getPrimaryKey(),
			medicalCurrentStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				medicalCurrentStage.getUuid(), medicalCurrentStage.getGroupId()
			},
			medicalCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetByMED_Stage,
			new Object[] {medicalCurrentStage.getMedicalFacilitiesAppId()},
			medicalCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical current stages in the entity cache if it is enabled.
	 *
	 * @param medicalCurrentStages the medical current stages
	 */
	@Override
	public void cacheResult(List<MedicalCurrentStage> medicalCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalCurrentStage medicalCurrentStage : medicalCurrentStages) {
			if (entityCache.getResult(
					MedicalCurrentStageImpl.class,
					medicalCurrentStage.getPrimaryKey()) == null) {

				cacheResult(medicalCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all medical current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalCurrentStageImpl.class);

		finderCache.clearCache(MedicalCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the medical current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MedicalCurrentStage medicalCurrentStage) {
		entityCache.removeResult(
			MedicalCurrentStageImpl.class, medicalCurrentStage);
	}

	@Override
	public void clearCache(List<MedicalCurrentStage> medicalCurrentStages) {
		for (MedicalCurrentStage medicalCurrentStage : medicalCurrentStages) {
			entityCache.removeResult(
				MedicalCurrentStageImpl.class, medicalCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(MedicalCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalCurrentStageModelImpl medicalCurrentStageModelImpl) {

		Object[] args = new Object[] {
			medicalCurrentStageModelImpl.getUuid(),
			medicalCurrentStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, medicalCurrentStageModelImpl);

		args = new Object[] {
			medicalCurrentStageModelImpl.getMedicalFacilitiesAppId()
		};

		finderCache.putResult(
			_finderPathCountBygetByMED_Stage, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetByMED_Stage, args,
			medicalCurrentStageModelImpl);
	}

	/**
	 * Creates a new medical current stage with the primary key. Does not add the medical current stage to the database.
	 *
	 * @param medicalCurrentStageId the primary key for the new medical current stage
	 * @return the new medical current stage
	 */
	@Override
	public MedicalCurrentStage create(long medicalCurrentStageId) {
		MedicalCurrentStage medicalCurrentStage = new MedicalCurrentStageImpl();

		medicalCurrentStage.setNew(true);
		medicalCurrentStage.setPrimaryKey(medicalCurrentStageId);

		String uuid = PortalUUIDUtil.generate();

		medicalCurrentStage.setUuid(uuid);

		medicalCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return medicalCurrentStage;
	}

	/**
	 * Removes the medical current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalCurrentStageId the primary key of the medical current stage
	 * @return the medical current stage that was removed
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	@Override
	public MedicalCurrentStage remove(long medicalCurrentStageId)
		throws NoSuchMedicalCurrentStageException {

		return remove((Serializable)medicalCurrentStageId);
	}

	/**
	 * Removes the medical current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical current stage
	 * @return the medical current stage that was removed
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	@Override
	public MedicalCurrentStage remove(Serializable primaryKey)
		throws NoSuchMedicalCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			MedicalCurrentStage medicalCurrentStage =
				(MedicalCurrentStage)session.get(
					MedicalCurrentStageImpl.class, primaryKey);

			if (medicalCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalCurrentStage);
		}
		catch (NoSuchMedicalCurrentStageException noSuchEntityException) {
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
	protected MedicalCurrentStage removeImpl(
		MedicalCurrentStage medicalCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalCurrentStage)) {
				medicalCurrentStage = (MedicalCurrentStage)session.get(
					MedicalCurrentStageImpl.class,
					medicalCurrentStage.getPrimaryKeyObj());
			}

			if (medicalCurrentStage != null) {
				session.delete(medicalCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalCurrentStage != null) {
			clearCache(medicalCurrentStage);
		}

		return medicalCurrentStage;
	}

	@Override
	public MedicalCurrentStage updateImpl(
		MedicalCurrentStage medicalCurrentStage) {

		boolean isNew = medicalCurrentStage.isNew();

		if (!(medicalCurrentStage instanceof MedicalCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalCurrentStage implementation " +
					medicalCurrentStage.getClass());
		}

		MedicalCurrentStageModelImpl medicalCurrentStageModelImpl =
			(MedicalCurrentStageModelImpl)medicalCurrentStage;

		if (Validator.isNull(medicalCurrentStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			medicalCurrentStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalCurrentStage.setCreateDate(date);
			}
			else {
				medicalCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalCurrentStage.setModifiedDate(date);
			}
			else {
				medicalCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalCurrentStage);
			}
			else {
				medicalCurrentStage = (MedicalCurrentStage)session.merge(
					medicalCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalCurrentStageImpl.class, medicalCurrentStageModelImpl, false,
			true);

		cacheUniqueFindersCache(medicalCurrentStageModelImpl);

		if (isNew) {
			medicalCurrentStage.setNew(false);
		}

		medicalCurrentStage.resetOriginalValues();

		return medicalCurrentStage;
	}

	/**
	 * Returns the medical current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical current stage
	 * @return the medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	@Override
	public MedicalCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalCurrentStageException {

		MedicalCurrentStage medicalCurrentStage = fetchByPrimaryKey(primaryKey);

		if (medicalCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalCurrentStage;
	}

	/**
	 * Returns the medical current stage with the primary key or throws a <code>NoSuchMedicalCurrentStageException</code> if it could not be found.
	 *
	 * @param medicalCurrentStageId the primary key of the medical current stage
	 * @return the medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	@Override
	public MedicalCurrentStage findByPrimaryKey(long medicalCurrentStageId)
		throws NoSuchMedicalCurrentStageException {

		return findByPrimaryKey((Serializable)medicalCurrentStageId);
	}

	/**
	 * Returns the medical current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalCurrentStageId the primary key of the medical current stage
	 * @return the medical current stage, or <code>null</code> if a medical current stage with the primary key could not be found
	 */
	@Override
	public MedicalCurrentStage fetchByPrimaryKey(long medicalCurrentStageId) {
		return fetchByPrimaryKey((Serializable)medicalCurrentStageId);
	}

	/**
	 * Returns all the medical current stages.
	 *
	 * @return the medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @return the range of medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findAll(
		int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical current stages
	 */
	@Override
	public List<MedicalCurrentStage> findAll(
		int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator,
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

		List<MedicalCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<MedicalCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALCURRENTSTAGE;

				sql = sql.concat(MedicalCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalCurrentStage>)QueryUtil.list(
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
	 * Removes all the medical current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalCurrentStage medicalCurrentStage : findAll()) {
			remove(medicalCurrentStage);
		}
	}

	/**
	 * Returns the number of medical current stages.
	 *
	 * @return the number of medical current stages
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
					_SQL_COUNT_MEDICALCURRENTSTAGE);

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
		return "medicalCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical current stage persistence.
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

		_finderPathFetchBygetByMED_Stage = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetByMED_Stage",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathCountBygetByMED_Stage = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetByMED_Stage",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, false);

		MedicalCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(MedicalCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MEDICALCURRENTSTAGE =
		"SELECT medicalCurrentStage FROM MedicalCurrentStage medicalCurrentStage";

	private static final String _SQL_SELECT_MEDICALCURRENTSTAGE_WHERE =
		"SELECT medicalCurrentStage FROM MedicalCurrentStage medicalCurrentStage WHERE ";

	private static final String _SQL_COUNT_MEDICALCURRENTSTAGE =
		"SELECT COUNT(medicalCurrentStage) FROM MedicalCurrentStage medicalCurrentStage";

	private static final String _SQL_COUNT_MEDICALCURRENTSTAGE_WHERE =
		"SELECT COUNT(medicalCurrentStage) FROM MedicalCurrentStage medicalCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "medicalCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalCurrentStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}