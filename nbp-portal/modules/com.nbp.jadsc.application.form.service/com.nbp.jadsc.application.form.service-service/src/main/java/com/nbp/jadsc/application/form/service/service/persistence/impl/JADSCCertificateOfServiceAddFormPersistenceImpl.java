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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCCertificateOfServiceAddFormException;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceAddForm;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceAddFormTable;
import com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceAddFormImpl;
import com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceAddFormModelImpl;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfServiceAddFormPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfServiceAddFormUtil;
import com.nbp.jadsc.application.form.service.service.persistence.impl.constants.JADSC_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the jadsc certificate of service add form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JADSCCertificateOfServiceAddFormPersistence.class)
public class JADSCCertificateOfServiceAddFormPersistenceImpl
	extends BasePersistenceImpl<JADSCCertificateOfServiceAddForm>
	implements JADSCCertificateOfServiceAddFormPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JADSCCertificateOfServiceAddFormUtil</code> to access the jadsc certificate of service add form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JADSCCertificateOfServiceAddFormImpl.class.getName();

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
	 * Returns all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator,
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

		List<JADSCCertificateOfServiceAddForm> list = null;

		if (useFinderCache) {
			list =
				(List<JADSCCertificateOfServiceAddForm>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCCertificateOfServiceAddForm
						jadscCertificateOfServiceAddForm : list) {

					if (!uuid.equals(
							jadscCertificateOfServiceAddForm.getUuid())) {

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

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE);

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
					JADSCCertificateOfServiceAddFormModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCCertificateOfServiceAddForm>)QueryUtil.list(
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
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm findByUuid_First(
			String uuid,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			fetchByUuid_First(uuid, orderByComparator);

		if (jadscCertificateOfServiceAddForm != null) {
			return jadscCertificateOfServiceAddForm;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfServiceAddFormException(
			sb.toString());
	}

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm fetchByUuid_First(
		String uuid,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		List<JADSCCertificateOfServiceAddForm> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm findByUuid_Last(
			String uuid,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			fetchByUuid_Last(uuid, orderByComparator);

		if (jadscCertificateOfServiceAddForm != null) {
			return jadscCertificateOfServiceAddForm;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfServiceAddFormException(
			sb.toString());
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm fetchByUuid_Last(
		String uuid,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JADSCCertificateOfServiceAddForm> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc certificate of service add forms before and after the current jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service add form
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm[] findByUuid_PrevAndNext(
			long jadscCOSId, String uuid,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		uuid = Objects.toString(uuid, "");

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			findByPrimaryKey(jadscCOSId);

		Session session = null;

		try {
			session = openSession();

			JADSCCertificateOfServiceAddForm[] array =
				new JADSCCertificateOfServiceAddFormImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jadscCertificateOfServiceAddForm, uuid,
				orderByComparator, true);

			array[1] = jadscCertificateOfServiceAddForm;

			array[2] = getByUuid_PrevAndNext(
				session, jadscCertificateOfServiceAddForm, uuid,
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

	protected JADSCCertificateOfServiceAddForm getByUuid_PrevAndNext(
		Session session,
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm,
		String uuid,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE);

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
			sb.append(JADSCCertificateOfServiceAddFormModelImpl.ORDER_BY_JPQL);
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
						jadscCertificateOfServiceAddForm)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCCertificateOfServiceAddForm> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc certificate of service add forms where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscCertificateOfServiceAddForm);
		}
	}

	/**
	 * Returns the number of jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc certificate of service add forms
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE);

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
		"jadscCertificateOfServiceAddForm.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jadscCertificateOfServiceAddForm.uuid IS NULL OR jadscCertificateOfServiceAddForm.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCertificateOfServiceAddFormException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm findByUUID_G(
			String uuid, long groupId)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			fetchByUUID_G(uuid, groupId);

		if (jadscCertificateOfServiceAddForm == null) {
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

			throw new NoSuchJADSCCertificateOfServiceAddFormException(
				sb.toString());
		}

		return jadscCertificateOfServiceAddForm;
	}

	/**
	 * Returns the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm fetchByUUID_G(
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

		if (result instanceof JADSCCertificateOfServiceAddForm) {
			JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
				(JADSCCertificateOfServiceAddForm)result;

			if (!Objects.equals(
					uuid, jadscCertificateOfServiceAddForm.getUuid()) ||
				(groupId != jadscCertificateOfServiceAddForm.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE);

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

				List<JADSCCertificateOfServiceAddForm> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JADSCCertificateOfServiceAddForm
						jadscCertificateOfServiceAddForm = list.get(0);

					result = jadscCertificateOfServiceAddForm;

					cacheResult(jadscCertificateOfServiceAddForm);
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
			return (JADSCCertificateOfServiceAddForm)result;
		}
	}

	/**
	 * Removes the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc certificate of service add form that was removed
	 */
	@Override
	public JADSCCertificateOfServiceAddForm removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			findByUUID_G(uuid, groupId);

		return remove(jadscCertificateOfServiceAddForm);
	}

	/**
	 * Returns the number of jadsc certificate of service add forms where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc certificate of service add forms
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE);

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
		"jadscCertificateOfServiceAddForm.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jadscCertificateOfServiceAddForm.uuid IS NULL OR jadscCertificateOfServiceAddForm.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jadscCertificateOfServiceAddForm.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator,
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

		List<JADSCCertificateOfServiceAddForm> list = null;

		if (useFinderCache) {
			list =
				(List<JADSCCertificateOfServiceAddForm>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCCertificateOfServiceAddForm
						jadscCertificateOfServiceAddForm : list) {

					if (!uuid.equals(
							jadscCertificateOfServiceAddForm.getUuid()) ||
						(companyId !=
							jadscCertificateOfServiceAddForm.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE);

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
					JADSCCertificateOfServiceAddFormModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCCertificateOfServiceAddForm>)QueryUtil.list(
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
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (jadscCertificateOfServiceAddForm != null) {
			return jadscCertificateOfServiceAddForm;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfServiceAddFormException(
			sb.toString());
	}

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		List<JADSCCertificateOfServiceAddForm> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (jadscCertificateOfServiceAddForm != null) {
			return jadscCertificateOfServiceAddForm;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfServiceAddFormException(
			sb.toString());
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JADSCCertificateOfServiceAddForm> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc certificate of service add forms before and after the current jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service add form
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm[] findByUuid_C_PrevAndNext(
			long jadscCOSId, String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		uuid = Objects.toString(uuid, "");

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			findByPrimaryKey(jadscCOSId);

		Session session = null;

		try {
			session = openSession();

			JADSCCertificateOfServiceAddForm[] array =
				new JADSCCertificateOfServiceAddFormImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jadscCertificateOfServiceAddForm, uuid, companyId,
				orderByComparator, true);

			array[1] = jadscCertificateOfServiceAddForm;

			array[2] = getByUuid_C_PrevAndNext(
				session, jadscCertificateOfServiceAddForm, uuid, companyId,
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

	protected JADSCCertificateOfServiceAddForm getByUuid_C_PrevAndNext(
		Session session,
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm,
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE);

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
			sb.append(JADSCCertificateOfServiceAddFormModelImpl.ORDER_BY_JPQL);
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
						jadscCertificateOfServiceAddForm)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCCertificateOfServiceAddForm> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscCertificateOfServiceAddForm);
		}
	}

	/**
	 * Returns the number of jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc certificate of service add forms
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE);

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
		"jadscCertificateOfServiceAddForm.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jadscCertificateOfServiceAddForm.uuid IS NULL OR jadscCertificateOfServiceAddForm.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jadscCertificateOfServiceAddForm.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetJADSCById;
	private FinderPath _finderPathWithoutPaginationFindBygetJADSCById;
	private FinderPath _finderPathCountBygetJADSCById;

	/**
	 * Returns all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId) {

		return findBygetJADSCById(
			jadscApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId, int start, int end) {

		return findBygetJADSCById(jadscApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return findBygetJADSCById(
			jadscApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJADSCById;
				finderArgs = new Object[] {jadscApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJADSCById;
			finderArgs = new Object[] {
				jadscApplicationId, start, end, orderByComparator
			};
		}

		List<JADSCCertificateOfServiceAddForm> list = null;

		if (useFinderCache) {
			list =
				(List<JADSCCertificateOfServiceAddForm>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCCertificateOfServiceAddForm
						jadscCertificateOfServiceAddForm : list) {

					if (jadscApplicationId !=
							jadscCertificateOfServiceAddForm.
								getJadscApplicationId()) {

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

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					JADSCCertificateOfServiceAddFormModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

				list = (List<JADSCCertificateOfServiceAddForm>)QueryUtil.list(
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
	 * Returns the first jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm findBygetJADSCById_First(
			long jadscApplicationId,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			fetchBygetJADSCById_First(jadscApplicationId, orderByComparator);

		if (jadscCertificateOfServiceAddForm != null) {
			return jadscCertificateOfServiceAddForm;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jadscApplicationId=");
		sb.append(jadscApplicationId);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfServiceAddFormException(
			sb.toString());
	}

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm fetchBygetJADSCById_First(
		long jadscApplicationId,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		List<JADSCCertificateOfServiceAddForm> list = findBygetJADSCById(
			jadscApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm findBygetJADSCById_Last(
			long jadscApplicationId,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			fetchBygetJADSCById_Last(jadscApplicationId, orderByComparator);

		if (jadscCertificateOfServiceAddForm != null) {
			return jadscCertificateOfServiceAddForm;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jadscApplicationId=");
		sb.append(jadscApplicationId);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfServiceAddFormException(
			sb.toString());
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm fetchBygetJADSCById_Last(
		long jadscApplicationId,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		int count = countBygetJADSCById(jadscApplicationId);

		if (count == 0) {
			return null;
		}

		List<JADSCCertificateOfServiceAddForm> list = findBygetJADSCById(
			jadscApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc certificate of service add forms before and after the current jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service add form
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm[] findBygetJADSCById_PrevAndNext(
			long jadscCOSId, long jadscApplicationId,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			findByPrimaryKey(jadscCOSId);

		Session session = null;

		try {
			session = openSession();

			JADSCCertificateOfServiceAddForm[] array =
				new JADSCCertificateOfServiceAddFormImpl[3];

			array[0] = getBygetJADSCById_PrevAndNext(
				session, jadscCertificateOfServiceAddForm, jadscApplicationId,
				orderByComparator, true);

			array[1] = jadscCertificateOfServiceAddForm;

			array[2] = getBygetJADSCById_PrevAndNext(
				session, jadscCertificateOfServiceAddForm, jadscApplicationId,
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

	protected JADSCCertificateOfServiceAddForm getBygetJADSCById_PrevAndNext(
		Session session,
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm,
		long jadscApplicationId,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE);

		sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

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
			sb.append(JADSCCertificateOfServiceAddFormModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(jadscApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jadscCertificateOfServiceAddForm)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCCertificateOfServiceAddForm> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc certificate of service add forms where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 */
	@Override
	public void removeBygetJADSCById(long jadscApplicationId) {
		for (JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm :
				findBygetJADSCById(
					jadscApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscCertificateOfServiceAddForm);
		}
	}

	/**
	 * Returns the number of jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc certificate of service add forms
	 */
	@Override
	public int countBygetJADSCById(long jadscApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJADSCById;

		Object[] finderArgs = new Object[] {jadscApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2 =
			"jadscCertificateOfServiceAddForm.jadscApplicationId = ?";

	public JADSCCertificateOfServiceAddFormPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JADSCCertificateOfServiceAddForm.class);

		setModelImplClass(JADSCCertificateOfServiceAddFormImpl.class);
		setModelPKClass(long.class);

		setTable(JADSCCertificateOfServiceAddFormTable.INSTANCE);
	}

	/**
	 * Caches the jadsc certificate of service add form in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfServiceAddForm the jadsc certificate of service add form
	 */
	@Override
	public void cacheResult(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		entityCache.putResult(
			JADSCCertificateOfServiceAddFormImpl.class,
			jadscCertificateOfServiceAddForm.getPrimaryKey(),
			jadscCertificateOfServiceAddForm);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jadscCertificateOfServiceAddForm.getUuid(),
				jadscCertificateOfServiceAddForm.getGroupId()
			},
			jadscCertificateOfServiceAddForm);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc certificate of service add forms in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfServiceAddForms the jadsc certificate of service add forms
	 */
	@Override
	public void cacheResult(
		List<JADSCCertificateOfServiceAddForm>
			jadscCertificateOfServiceAddForms) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscCertificateOfServiceAddForms.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm :
				jadscCertificateOfServiceAddForms) {

			if (entityCache.getResult(
					JADSCCertificateOfServiceAddFormImpl.class,
					jadscCertificateOfServiceAddForm.getPrimaryKey()) == null) {

				cacheResult(jadscCertificateOfServiceAddForm);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc certificate of service add forms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JADSCCertificateOfServiceAddFormImpl.class);

		finderCache.clearCache(JADSCCertificateOfServiceAddFormImpl.class);
	}

	/**
	 * Clears the cache for the jadsc certificate of service add form.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		entityCache.removeResult(
			JADSCCertificateOfServiceAddFormImpl.class,
			jadscCertificateOfServiceAddForm);
	}

	@Override
	public void clearCache(
		List<JADSCCertificateOfServiceAddForm>
			jadscCertificateOfServiceAddForms) {

		for (JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm :
				jadscCertificateOfServiceAddForms) {

			entityCache.removeResult(
				JADSCCertificateOfServiceAddFormImpl.class,
				jadscCertificateOfServiceAddForm);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JADSCCertificateOfServiceAddFormImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JADSCCertificateOfServiceAddFormImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JADSCCertificateOfServiceAddFormModelImpl
			jadscCertificateOfServiceAddFormModelImpl) {

		Object[] args = new Object[] {
			jadscCertificateOfServiceAddFormModelImpl.getUuid(),
			jadscCertificateOfServiceAddFormModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			jadscCertificateOfServiceAddFormModelImpl);
	}

	/**
	 * Creates a new jadsc certificate of service add form with the primary key. Does not add the jadsc certificate of service add form to the database.
	 *
	 * @param jadscCOSId the primary key for the new jadsc certificate of service add form
	 * @return the new jadsc certificate of service add form
	 */
	@Override
	public JADSCCertificateOfServiceAddForm create(long jadscCOSId) {
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			new JADSCCertificateOfServiceAddFormImpl();

		jadscCertificateOfServiceAddForm.setNew(true);
		jadscCertificateOfServiceAddForm.setPrimaryKey(jadscCOSId);

		String uuid = PortalUUIDUtil.generate();

		jadscCertificateOfServiceAddForm.setUuid(uuid);

		jadscCertificateOfServiceAddForm.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return jadscCertificateOfServiceAddForm;
	}

	/**
	 * Removes the jadsc certificate of service add form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was removed
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm remove(long jadscCOSId)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		return remove((Serializable)jadscCOSId);
	}

	/**
	 * Removes the jadsc certificate of service add form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was removed
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm remove(Serializable primaryKey)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		Session session = null;

		try {
			session = openSession();

			JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
				(JADSCCertificateOfServiceAddForm)session.get(
					JADSCCertificateOfServiceAddFormImpl.class, primaryKey);

			if (jadscCertificateOfServiceAddForm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJADSCCertificateOfServiceAddFormException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscCertificateOfServiceAddForm);
		}
		catch (NoSuchJADSCCertificateOfServiceAddFormException
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
	protected JADSCCertificateOfServiceAddForm removeImpl(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscCertificateOfServiceAddForm)) {
				jadscCertificateOfServiceAddForm =
					(JADSCCertificateOfServiceAddForm)session.get(
						JADSCCertificateOfServiceAddFormImpl.class,
						jadscCertificateOfServiceAddForm.getPrimaryKeyObj());
			}

			if (jadscCertificateOfServiceAddForm != null) {
				session.delete(jadscCertificateOfServiceAddForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscCertificateOfServiceAddForm != null) {
			clearCache(jadscCertificateOfServiceAddForm);
		}

		return jadscCertificateOfServiceAddForm;
	}

	@Override
	public JADSCCertificateOfServiceAddForm updateImpl(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		boolean isNew = jadscCertificateOfServiceAddForm.isNew();

		if (!(jadscCertificateOfServiceAddForm instanceof
				JADSCCertificateOfServiceAddFormModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					jadscCertificateOfServiceAddForm.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscCertificateOfServiceAddForm);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscCertificateOfServiceAddForm proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JADSCCertificateOfServiceAddForm implementation " +
					jadscCertificateOfServiceAddForm.getClass());
		}

		JADSCCertificateOfServiceAddFormModelImpl
			jadscCertificateOfServiceAddFormModelImpl =
				(JADSCCertificateOfServiceAddFormModelImpl)
					jadscCertificateOfServiceAddForm;

		if (Validator.isNull(jadscCertificateOfServiceAddForm.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jadscCertificateOfServiceAddForm.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(jadscCertificateOfServiceAddForm.getCreateDate() == null)) {

			if (serviceContext == null) {
				jadscCertificateOfServiceAddForm.setCreateDate(date);
			}
			else {
				jadscCertificateOfServiceAddForm.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscCertificateOfServiceAddFormModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscCertificateOfServiceAddForm.setModifiedDate(date);
			}
			else {
				jadscCertificateOfServiceAddForm.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscCertificateOfServiceAddForm);
			}
			else {
				jadscCertificateOfServiceAddForm =
					(JADSCCertificateOfServiceAddForm)session.merge(
						jadscCertificateOfServiceAddForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JADSCCertificateOfServiceAddFormImpl.class,
			jadscCertificateOfServiceAddFormModelImpl, false, true);

		cacheUniqueFindersCache(jadscCertificateOfServiceAddFormModelImpl);

		if (isNew) {
			jadscCertificateOfServiceAddForm.setNew(false);
		}

		jadscCertificateOfServiceAddForm.resetOriginalValues();

		return jadscCertificateOfServiceAddForm;
	}

	/**
	 * Returns the jadsc certificate of service add form with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm =
			fetchByPrimaryKey(primaryKey);

		if (jadscCertificateOfServiceAddForm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJADSCCertificateOfServiceAddFormException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscCertificateOfServiceAddForm;
	}

	/**
	 * Returns the jadsc certificate of service add form with the primary key or throws a <code>NoSuchJADSCCertificateOfServiceAddFormException</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm findByPrimaryKey(long jadscCOSId)
		throws NoSuchJADSCCertificateOfServiceAddFormException {

		return findByPrimaryKey((Serializable)jadscCOSId);
	}

	/**
	 * Returns the jadsc certificate of service add form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form, or <code>null</code> if a jadsc certificate of service add form with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfServiceAddForm fetchByPrimaryKey(long jadscCOSId) {
		return fetchByPrimaryKey((Serializable)jadscCOSId);
	}

	/**
	 * Returns all the jadsc certificate of service add forms.
	 *
	 * @return the jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc certificate of service add forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc certificate of service add forms
	 */
	@Override
	public List<JADSCCertificateOfServiceAddForm> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator,
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

		List<JADSCCertificateOfServiceAddForm> list = null;

		if (useFinderCache) {
			list =
				(List<JADSCCertificateOfServiceAddForm>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM;

				sql = sql.concat(
					JADSCCertificateOfServiceAddFormModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JADSCCertificateOfServiceAddForm>)QueryUtil.list(
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
	 * Removes all the jadsc certificate of service add forms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm :
				findAll()) {

			remove(jadscCertificateOfServiceAddForm);
		}
	}

	/**
	 * Returns the number of jadsc certificate of service add forms.
	 *
	 * @return the number of jadsc certificate of service add forms
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
					_SQL_COUNT_JADSCCERTIFICATEOFSERVICEADDFORM);

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
		return "jadscCOSId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JADSCCertificateOfServiceAddFormModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc certificate of service add form persistence.
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

		_finderPathWithPaginationFindBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJADSCById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"jadscApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJADSCById",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, true);

		_finderPathCountBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJADSCById",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, false);

		JADSCCertificateOfServiceAddFormUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JADSCCertificateOfServiceAddFormUtil.setPersistence(null);

		entityCache.removeCache(
			JADSCCertificateOfServiceAddFormImpl.class.getName());
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

	private static final String _SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM =
		"SELECT jadscCertificateOfServiceAddForm FROM JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm";

	private static final String
		_SQL_SELECT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE =
			"SELECT jadscCertificateOfServiceAddForm FROM JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm WHERE ";

	private static final String _SQL_COUNT_JADSCCERTIFICATEOFSERVICEADDFORM =
		"SELECT COUNT(jadscCertificateOfServiceAddForm) FROM JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm";

	private static final String
		_SQL_COUNT_JADSCCERTIFICATEOFSERVICEADDFORM_WHERE =
			"SELECT COUNT(jadscCertificateOfServiceAddForm) FROM JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscCertificateOfServiceAddForm.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JADSCCertificateOfServiceAddForm exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JADSCCertificateOfServiceAddForm exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JADSCCertificateOfServiceAddFormPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}