/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisSupportingDocumentsMasterException;
import com.nbp.cannabis.application.form.services.model.CannabisSupportingDocumentsMaster;
import com.nbp.cannabis.application.form.services.model.CannabisSupportingDocumentsMasterTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisSupportingDocumentsMasterImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisSupportingDocumentsMasterModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisSupportingDocumentsMasterPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisSupportingDocumentsMasterUtil;
import com.nbp.cannabis.application.form.services.service.persistence.impl.constants.CANNABISPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the cannabis supporting documents master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisSupportingDocumentsMasterPersistence.class)
public class CannabisSupportingDocumentsMasterPersistenceImpl
	extends BasePersistenceImpl<CannabisSupportingDocumentsMaster>
	implements CannabisSupportingDocumentsMasterPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisSupportingDocumentsMasterUtil</code> to access the cannabis supporting documents master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisSupportingDocumentsMasterImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetSupportingDocProperty;
	private FinderPath
		_finderPathWithoutPaginationFindBygetSupportingDocProperty;
	private FinderPath _finderPathCountBygetSupportingDocProperty;

	/**
	 * Returns all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @return the matching cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType) {

		return findBygetSupportingDocProperty(
			documentTye, userType, applicationType, landType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @return the range of matching cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType, int start, int end) {

		return findBygetSupportingDocProperty(
			documentTye, userType, applicationType, landType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType, int start, int end,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		return findBygetSupportingDocProperty(
			documentTye, userType, applicationType, landType, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType, int start, int end,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator,
			boolean useFinderCache) {

		documentTye = Objects.toString(documentTye, "");
		userType = Objects.toString(userType, "");
		applicationType = Objects.toString(applicationType, "");
		landType = Objects.toString(landType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSupportingDocProperty;
				finderArgs = new Object[] {
					documentTye, userType, applicationType, landType
				};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetSupportingDocProperty;
			finderArgs = new Object[] {
				documentTye, userType, applicationType, landType, start, end,
				orderByComparator
			};
		}

		List<CannabisSupportingDocumentsMaster> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisSupportingDocumentsMaster>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisSupportingDocumentsMaster
						cannabisSupportingDocumentsMaster : list) {

					if (!documentTye.equals(
							cannabisSupportingDocumentsMaster.
								getDocumentTye()) ||
						!userType.equals(
							cannabisSupportingDocumentsMaster.getUserType()) ||
						!applicationType.equals(
							cannabisSupportingDocumentsMaster.
								getApplicationType()) ||
						!landType.equals(
							cannabisSupportingDocumentsMaster.getLandType())) {

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
					6 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(6);
			}

			sb.append(_SQL_SELECT_CANNABISSUPPORTINGDOCUMENTSMASTER_WHERE);

			boolean bindDocumentTye = false;

			if (documentTye.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_DOCUMENTTYE_3);
			}
			else {
				bindDocumentTye = true;

				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_DOCUMENTTYE_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_USERTYPE_2);
			}

			boolean bindApplicationType = false;

			if (applicationType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_APPLICATIONTYPE_3);
			}
			else {
				bindApplicationType = true;

				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_APPLICATIONTYPE_2);
			}

			boolean bindLandType = false;

			if (landType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_LANDTYPE_3);
			}
			else {
				bindLandType = true;

				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_LANDTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisSupportingDocumentsMasterModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDocumentTye) {
					queryPos.add(documentTye);
				}

				if (bindUserType) {
					queryPos.add(userType);
				}

				if (bindApplicationType) {
					queryPos.add(applicationType);
				}

				if (bindLandType) {
					queryPos.add(landType);
				}

				list = (List<CannabisSupportingDocumentsMaster>)QueryUtil.list(
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
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster
			findBygetSupportingDocProperty_First(
				String documentTye, String userType, String applicationType,
				String landType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException {

		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster =
			fetchBygetSupportingDocProperty_First(
				documentTye, userType, applicationType, landType,
				orderByComparator);

		if (cannabisSupportingDocumentsMaster != null) {
			return cannabisSupportingDocumentsMaster;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("documentTye=");
		sb.append(documentTye);

		sb.append(", userType=");
		sb.append(userType);

		sb.append(", applicationType=");
		sb.append(applicationType);

		sb.append(", landType=");
		sb.append(landType);

		sb.append("}");

		throw new NoSuchCannabisSupportingDocumentsMasterException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocProperty_First(
			String documentTye, String userType, String applicationType,
			String landType,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		List<CannabisSupportingDocumentsMaster> list =
			findBygetSupportingDocProperty(
				documentTye, userType, applicationType, landType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster
			findBygetSupportingDocProperty_Last(
				String documentTye, String userType, String applicationType,
				String landType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException {

		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster =
			fetchBygetSupportingDocProperty_Last(
				documentTye, userType, applicationType, landType,
				orderByComparator);

		if (cannabisSupportingDocumentsMaster != null) {
			return cannabisSupportingDocumentsMaster;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("documentTye=");
		sb.append(documentTye);

		sb.append(", userType=");
		sb.append(userType);

		sb.append(", applicationType=");
		sb.append(applicationType);

		sb.append(", landType=");
		sb.append(landType);

		sb.append("}");

		throw new NoSuchCannabisSupportingDocumentsMasterException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocProperty_Last(
			String documentTye, String userType, String applicationType,
			String landType,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		int count = countBygetSupportingDocProperty(
			documentTye, userType, applicationType, landType);

		if (count == 0) {
			return null;
		}

		List<CannabisSupportingDocumentsMaster> list =
			findBygetSupportingDocProperty(
				documentTye, userType, applicationType, landType, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis supporting documents masters before and after the current cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the current cannabis supporting documents master
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster[]
			findBygetSupportingDocProperty_PrevAndNext(
				long cannabisSupportingDocMasterId, String documentTye,
				String userType, String applicationType, String landType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException {

		documentTye = Objects.toString(documentTye, "");
		userType = Objects.toString(userType, "");
		applicationType = Objects.toString(applicationType, "");
		landType = Objects.toString(landType, "");

		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster =
			findByPrimaryKey(cannabisSupportingDocMasterId);

		Session session = null;

		try {
			session = openSession();

			CannabisSupportingDocumentsMaster[] array =
				new CannabisSupportingDocumentsMasterImpl[3];

			array[0] = getBygetSupportingDocProperty_PrevAndNext(
				session, cannabisSupportingDocumentsMaster, documentTye,
				userType, applicationType, landType, orderByComparator, true);

			array[1] = cannabisSupportingDocumentsMaster;

			array[2] = getBygetSupportingDocProperty_PrevAndNext(
				session, cannabisSupportingDocumentsMaster, documentTye,
				userType, applicationType, landType, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisSupportingDocumentsMaster
		getBygetSupportingDocProperty_PrevAndNext(
			Session session,
			CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster,
			String documentTye, String userType, String applicationType,
			String landType,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				7 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(6);
		}

		sb.append(_SQL_SELECT_CANNABISSUPPORTINGDOCUMENTSMASTER_WHERE);

		boolean bindDocumentTye = false;

		if (documentTye.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_DOCUMENTTYE_3);
		}
		else {
			bindDocumentTye = true;

			sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_DOCUMENTTYE_2);
		}

		boolean bindUserType = false;

		if (userType.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_USERTYPE_3);
		}
		else {
			bindUserType = true;

			sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_USERTYPE_2);
		}

		boolean bindApplicationType = false;

		if (applicationType.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_APPLICATIONTYPE_3);
		}
		else {
			bindApplicationType = true;

			sb.append(
				_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_APPLICATIONTYPE_2);
		}

		boolean bindLandType = false;

		if (landType.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_LANDTYPE_3);
		}
		else {
			bindLandType = true;

			sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_LANDTYPE_2);
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
			sb.append(CannabisSupportingDocumentsMasterModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindDocumentTye) {
			queryPos.add(documentTye);
		}

		if (bindUserType) {
			queryPos.add(userType);
		}

		if (bindApplicationType) {
			queryPos.add(applicationType);
		}

		if (bindLandType) {
			queryPos.add(landType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisSupportingDocumentsMaster)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisSupportingDocumentsMaster> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63; from the database.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 */
	@Override
	public void removeBygetSupportingDocProperty(
		String documentTye, String userType, String applicationType,
		String landType) {

		for (CannabisSupportingDocumentsMaster
				cannabisSupportingDocumentsMaster :
					findBygetSupportingDocProperty(
						documentTye, userType, applicationType, landType,
						QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisSupportingDocumentsMaster);
		}
	}

	/**
	 * Returns the number of cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @return the number of matching cannabis supporting documents masters
	 */
	@Override
	public int countBygetSupportingDocProperty(
		String documentTye, String userType, String applicationType,
		String landType) {

		documentTye = Objects.toString(documentTye, "");
		userType = Objects.toString(userType, "");
		applicationType = Objects.toString(applicationType, "");
		landType = Objects.toString(landType, "");

		FinderPath finderPath = _finderPathCountBygetSupportingDocProperty;

		Object[] finderArgs = new Object[] {
			documentTye, userType, applicationType, landType
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_COUNT_CANNABISSUPPORTINGDOCUMENTSMASTER_WHERE);

			boolean bindDocumentTye = false;

			if (documentTye.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_DOCUMENTTYE_3);
			}
			else {
				bindDocumentTye = true;

				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_DOCUMENTTYE_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_USERTYPE_2);
			}

			boolean bindApplicationType = false;

			if (applicationType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_APPLICATIONTYPE_3);
			}
			else {
				bindApplicationType = true;

				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_APPLICATIONTYPE_2);
			}

			boolean bindLandType = false;

			if (landType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_LANDTYPE_3);
			}
			else {
				bindLandType = true;

				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_LANDTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDocumentTye) {
					queryPos.add(documentTye);
				}

				if (bindUserType) {
					queryPos.add(userType);
				}

				if (bindApplicationType) {
					queryPos.add(applicationType);
				}

				if (bindLandType) {
					queryPos.add(landType);
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
		_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_DOCUMENTTYE_2 =
			"cannabisSupportingDocumentsMaster.documentTye = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_DOCUMENTTYE_3 =
			"(cannabisSupportingDocumentsMaster.documentTye IS NULL OR cannabisSupportingDocumentsMaster.documentTye = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_USERTYPE_2 =
			"cannabisSupportingDocumentsMaster.userType = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_USERTYPE_3 =
			"(cannabisSupportingDocumentsMaster.userType IS NULL OR cannabisSupportingDocumentsMaster.userType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_APPLICATIONTYPE_2 =
			"cannabisSupportingDocumentsMaster.applicationType = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_APPLICATIONTYPE_3 =
			"(cannabisSupportingDocumentsMaster.applicationType IS NULL OR cannabisSupportingDocumentsMaster.applicationType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_LANDTYPE_2 =
			"cannabisSupportingDocumentsMaster.landType = ?";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCPROPERTY_LANDTYPE_3 =
			"(cannabisSupportingDocumentsMaster.landType IS NULL OR cannabisSupportingDocumentsMaster.landType = '')";

	private FinderPath _finderPathWithPaginationFindBygetSupportingDocApplicant;
	private FinderPath
		_finderPathWithoutPaginationFindBygetSupportingDocApplicant;
	private FinderPath _finderPathCountBygetSupportingDocApplicant;

	/**
	 * Returns all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @return the matching cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType) {

		return findBygetSupportingDocApplicant(
			documentTye, userType, applicationType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @return the range of matching cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType,
			int start, int end) {

		return findBygetSupportingDocApplicant(
			documentTye, userType, applicationType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType,
			int start, int end,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		return findBygetSupportingDocApplicant(
			documentTye, userType, applicationType, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType,
			int start, int end,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator,
			boolean useFinderCache) {

		documentTye = Objects.toString(documentTye, "");
		userType = Objects.toString(userType, "");
		applicationType = Objects.toString(applicationType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSupportingDocApplicant;
				finderArgs = new Object[] {
					documentTye, userType, applicationType
				};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetSupportingDocApplicant;
			finderArgs = new Object[] {
				documentTye, userType, applicationType, start, end,
				orderByComparator
			};
		}

		List<CannabisSupportingDocumentsMaster> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisSupportingDocumentsMaster>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisSupportingDocumentsMaster
						cannabisSupportingDocumentsMaster : list) {

					if (!documentTye.equals(
							cannabisSupportingDocumentsMaster.
								getDocumentTye()) ||
						!userType.equals(
							cannabisSupportingDocumentsMaster.getUserType()) ||
						!applicationType.equals(
							cannabisSupportingDocumentsMaster.
								getApplicationType())) {

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
					5 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(5);
			}

			sb.append(_SQL_SELECT_CANNABISSUPPORTINGDOCUMENTSMASTER_WHERE);

			boolean bindDocumentTye = false;

			if (documentTye.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_DOCUMENTTYE_3);
			}
			else {
				bindDocumentTye = true;

				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_DOCUMENTTYE_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_USERTYPE_2);
			}

			boolean bindApplicationType = false;

			if (applicationType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_APPLICATIONTYPE_3);
			}
			else {
				bindApplicationType = true;

				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_APPLICATIONTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisSupportingDocumentsMasterModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDocumentTye) {
					queryPos.add(documentTye);
				}

				if (bindUserType) {
					queryPos.add(userType);
				}

				if (bindApplicationType) {
					queryPos.add(applicationType);
				}

				list = (List<CannabisSupportingDocumentsMaster>)QueryUtil.list(
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
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster
			findBygetSupportingDocApplicant_First(
				String documentTye, String userType, String applicationType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException {

		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster =
			fetchBygetSupportingDocApplicant_First(
				documentTye, userType, applicationType, orderByComparator);

		if (cannabisSupportingDocumentsMaster != null) {
			return cannabisSupportingDocumentsMaster;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("documentTye=");
		sb.append(documentTye);

		sb.append(", userType=");
		sb.append(userType);

		sb.append(", applicationType=");
		sb.append(applicationType);

		sb.append("}");

		throw new NoSuchCannabisSupportingDocumentsMasterException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocApplicant_First(
			String documentTye, String userType, String applicationType,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		List<CannabisSupportingDocumentsMaster> list =
			findBygetSupportingDocApplicant(
				documentTye, userType, applicationType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster
			findBygetSupportingDocApplicant_Last(
				String documentTye, String userType, String applicationType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException {

		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster =
			fetchBygetSupportingDocApplicant_Last(
				documentTye, userType, applicationType, orderByComparator);

		if (cannabisSupportingDocumentsMaster != null) {
			return cannabisSupportingDocumentsMaster;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("documentTye=");
		sb.append(documentTye);

		sb.append(", userType=");
		sb.append(userType);

		sb.append(", applicationType=");
		sb.append(applicationType);

		sb.append("}");

		throw new NoSuchCannabisSupportingDocumentsMasterException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocApplicant_Last(
			String documentTye, String userType, String applicationType,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		int count = countBygetSupportingDocApplicant(
			documentTye, userType, applicationType);

		if (count == 0) {
			return null;
		}

		List<CannabisSupportingDocumentsMaster> list =
			findBygetSupportingDocApplicant(
				documentTye, userType, applicationType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis supporting documents masters before and after the current cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the current cannabis supporting documents master
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster[]
			findBygetSupportingDocApplicant_PrevAndNext(
				long cannabisSupportingDocMasterId, String documentTye,
				String userType, String applicationType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException {

		documentTye = Objects.toString(documentTye, "");
		userType = Objects.toString(userType, "");
		applicationType = Objects.toString(applicationType, "");

		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster =
			findByPrimaryKey(cannabisSupportingDocMasterId);

		Session session = null;

		try {
			session = openSession();

			CannabisSupportingDocumentsMaster[] array =
				new CannabisSupportingDocumentsMasterImpl[3];

			array[0] = getBygetSupportingDocApplicant_PrevAndNext(
				session, cannabisSupportingDocumentsMaster, documentTye,
				userType, applicationType, orderByComparator, true);

			array[1] = cannabisSupportingDocumentsMaster;

			array[2] = getBygetSupportingDocApplicant_PrevAndNext(
				session, cannabisSupportingDocumentsMaster, documentTye,
				userType, applicationType, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisSupportingDocumentsMaster
		getBygetSupportingDocApplicant_PrevAndNext(
			Session session,
			CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster,
			String documentTye, String userType, String applicationType,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				6 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(5);
		}

		sb.append(_SQL_SELECT_CANNABISSUPPORTINGDOCUMENTSMASTER_WHERE);

		boolean bindDocumentTye = false;

		if (documentTye.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_DOCUMENTTYE_3);
		}
		else {
			bindDocumentTye = true;

			sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_DOCUMENTTYE_2);
		}

		boolean bindUserType = false;

		if (userType.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_USERTYPE_3);
		}
		else {
			bindUserType = true;

			sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_USERTYPE_2);
		}

		boolean bindApplicationType = false;

		if (applicationType.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_APPLICATIONTYPE_3);
		}
		else {
			bindApplicationType = true;

			sb.append(
				_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_APPLICATIONTYPE_2);
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
			sb.append(CannabisSupportingDocumentsMasterModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindDocumentTye) {
			queryPos.add(documentTye);
		}

		if (bindUserType) {
			queryPos.add(userType);
		}

		if (bindApplicationType) {
			queryPos.add(applicationType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisSupportingDocumentsMaster)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisSupportingDocumentsMaster> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; from the database.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 */
	@Override
	public void removeBygetSupportingDocApplicant(
		String documentTye, String userType, String applicationType) {

		for (CannabisSupportingDocumentsMaster
				cannabisSupportingDocumentsMaster :
					findBygetSupportingDocApplicant(
						documentTye, userType, applicationType,
						QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisSupportingDocumentsMaster);
		}
	}

	/**
	 * Returns the number of cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @return the number of matching cannabis supporting documents masters
	 */
	@Override
	public int countBygetSupportingDocApplicant(
		String documentTye, String userType, String applicationType) {

		documentTye = Objects.toString(documentTye, "");
		userType = Objects.toString(userType, "");
		applicationType = Objects.toString(applicationType, "");

		FinderPath finderPath = _finderPathCountBygetSupportingDocApplicant;

		Object[] finderArgs = new Object[] {
			documentTye, userType, applicationType
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_CANNABISSUPPORTINGDOCUMENTSMASTER_WHERE);

			boolean bindDocumentTye = false;

			if (documentTye.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_DOCUMENTTYE_3);
			}
			else {
				bindDocumentTye = true;

				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_DOCUMENTTYE_2);
			}

			boolean bindUserType = false;

			if (userType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_USERTYPE_3);
			}
			else {
				bindUserType = true;

				sb.append(_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_USERTYPE_2);
			}

			boolean bindApplicationType = false;

			if (applicationType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_APPLICATIONTYPE_3);
			}
			else {
				bindApplicationType = true;

				sb.append(
					_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_APPLICATIONTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDocumentTye) {
					queryPos.add(documentTye);
				}

				if (bindUserType) {
					queryPos.add(userType);
				}

				if (bindApplicationType) {
					queryPos.add(applicationType);
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
		_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_DOCUMENTTYE_2 =
			"cannabisSupportingDocumentsMaster.documentTye = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_DOCUMENTTYE_3 =
			"(cannabisSupportingDocumentsMaster.documentTye IS NULL OR cannabisSupportingDocumentsMaster.documentTye = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_USERTYPE_2 =
			"cannabisSupportingDocumentsMaster.userType = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_USERTYPE_3 =
			"(cannabisSupportingDocumentsMaster.userType IS NULL OR cannabisSupportingDocumentsMaster.userType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_APPLICATIONTYPE_2 =
			"cannabisSupportingDocumentsMaster.applicationType = ?";

	private static final String
		_FINDER_COLUMN_GETSUPPORTINGDOCAPPLICANT_APPLICATIONTYPE_3 =
			"(cannabisSupportingDocumentsMaster.applicationType IS NULL OR cannabisSupportingDocumentsMaster.applicationType = '')";

	public CannabisSupportingDocumentsMasterPersistenceImpl() {
		setModelClass(CannabisSupportingDocumentsMaster.class);

		setModelImplClass(CannabisSupportingDocumentsMasterImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisSupportingDocumentsMasterTable.INSTANCE);
	}

	/**
	 * Caches the cannabis supporting documents master in the entity cache if it is enabled.
	 *
	 * @param cannabisSupportingDocumentsMaster the cannabis supporting documents master
	 */
	@Override
	public void cacheResult(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster) {

		entityCache.putResult(
			CannabisSupportingDocumentsMasterImpl.class,
			cannabisSupportingDocumentsMaster.getPrimaryKey(),
			cannabisSupportingDocumentsMaster);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis supporting documents masters in the entity cache if it is enabled.
	 *
	 * @param cannabisSupportingDocumentsMasters the cannabis supporting documents masters
	 */
	@Override
	public void cacheResult(
		List<CannabisSupportingDocumentsMaster>
			cannabisSupportingDocumentsMasters) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisSupportingDocumentsMasters.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisSupportingDocumentsMaster
				cannabisSupportingDocumentsMaster :
					cannabisSupportingDocumentsMasters) {

			if (entityCache.getResult(
					CannabisSupportingDocumentsMasterImpl.class,
					cannabisSupportingDocumentsMaster.getPrimaryKey()) ==
						null) {

				cacheResult(cannabisSupportingDocumentsMaster);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis supporting documents masters.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisSupportingDocumentsMasterImpl.class);

		finderCache.clearCache(CannabisSupportingDocumentsMasterImpl.class);
	}

	/**
	 * Clears the cache for the cannabis supporting documents master.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster) {

		entityCache.removeResult(
			CannabisSupportingDocumentsMasterImpl.class,
			cannabisSupportingDocumentsMaster);
	}

	@Override
	public void clearCache(
		List<CannabisSupportingDocumentsMaster>
			cannabisSupportingDocumentsMasters) {

		for (CannabisSupportingDocumentsMaster
				cannabisSupportingDocumentsMaster :
					cannabisSupportingDocumentsMasters) {

			entityCache.removeResult(
				CannabisSupportingDocumentsMasterImpl.class,
				cannabisSupportingDocumentsMaster);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisSupportingDocumentsMasterImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisSupportingDocumentsMasterImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new cannabis supporting documents master with the primary key. Does not add the cannabis supporting documents master to the database.
	 *
	 * @param cannabisSupportingDocMasterId the primary key for the new cannabis supporting documents master
	 * @return the new cannabis supporting documents master
	 */
	@Override
	public CannabisSupportingDocumentsMaster create(
		long cannabisSupportingDocMasterId) {

		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster =
			new CannabisSupportingDocumentsMasterImpl();

		cannabisSupportingDocumentsMaster.setNew(true);
		cannabisSupportingDocumentsMaster.setPrimaryKey(
			cannabisSupportingDocMasterId);

		return cannabisSupportingDocumentsMaster;
	}

	/**
	 * Removes the cannabis supporting documents master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master that was removed
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster remove(
			long cannabisSupportingDocMasterId)
		throws NoSuchCannabisSupportingDocumentsMasterException {

		return remove((Serializable)cannabisSupportingDocMasterId);
	}

	/**
	 * Removes the cannabis supporting documents master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master that was removed
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster remove(Serializable primaryKey)
		throws NoSuchCannabisSupportingDocumentsMasterException {

		Session session = null;

		try {
			session = openSession();

			CannabisSupportingDocumentsMaster
				cannabisSupportingDocumentsMaster =
					(CannabisSupportingDocumentsMaster)session.get(
						CannabisSupportingDocumentsMasterImpl.class,
						primaryKey);

			if (cannabisSupportingDocumentsMaster == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisSupportingDocumentsMasterException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisSupportingDocumentsMaster);
		}
		catch (NoSuchCannabisSupportingDocumentsMasterException
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
	protected CannabisSupportingDocumentsMaster removeImpl(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisSupportingDocumentsMaster)) {
				cannabisSupportingDocumentsMaster =
					(CannabisSupportingDocumentsMaster)session.get(
						CannabisSupportingDocumentsMasterImpl.class,
						cannabisSupportingDocumentsMaster.getPrimaryKeyObj());
			}

			if (cannabisSupportingDocumentsMaster != null) {
				session.delete(cannabisSupportingDocumentsMaster);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisSupportingDocumentsMaster != null) {
			clearCache(cannabisSupportingDocumentsMaster);
		}

		return cannabisSupportingDocumentsMaster;
	}

	@Override
	public CannabisSupportingDocumentsMaster updateImpl(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster) {

		boolean isNew = cannabisSupportingDocumentsMaster.isNew();

		if (!(cannabisSupportingDocumentsMaster instanceof
				CannabisSupportingDocumentsMasterModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisSupportingDocumentsMaster.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisSupportingDocumentsMaster);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisSupportingDocumentsMaster proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisSupportingDocumentsMaster implementation " +
					cannabisSupportingDocumentsMaster.getClass());
		}

		CannabisSupportingDocumentsMasterModelImpl
			cannabisSupportingDocumentsMasterModelImpl =
				(CannabisSupportingDocumentsMasterModelImpl)
					cannabisSupportingDocumentsMaster;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisSupportingDocumentsMaster);
			}
			else {
				cannabisSupportingDocumentsMaster =
					(CannabisSupportingDocumentsMaster)session.merge(
						cannabisSupportingDocumentsMaster);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisSupportingDocumentsMasterImpl.class,
			cannabisSupportingDocumentsMasterModelImpl, false, true);

		if (isNew) {
			cannabisSupportingDocumentsMaster.setNew(false);
		}

		cannabisSupportingDocumentsMaster.resetOriginalValues();

		return cannabisSupportingDocumentsMaster;
	}

	/**
	 * Returns the cannabis supporting documents master with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCannabisSupportingDocumentsMasterException {

		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster =
			fetchByPrimaryKey(primaryKey);

		if (cannabisSupportingDocumentsMaster == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisSupportingDocumentsMasterException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisSupportingDocumentsMaster;
	}

	/**
	 * Returns the cannabis supporting documents master with the primary key or throws a <code>NoSuchCannabisSupportingDocumentsMasterException</code> if it could not be found.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster findByPrimaryKey(
			long cannabisSupportingDocMasterId)
		throws NoSuchCannabisSupportingDocumentsMasterException {

		return findByPrimaryKey((Serializable)cannabisSupportingDocMasterId);
	}

	/**
	 * Returns the cannabis supporting documents master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master, or <code>null</code> if a cannabis supporting documents master with the primary key could not be found
	 */
	@Override
	public CannabisSupportingDocumentsMaster fetchByPrimaryKey(
		long cannabisSupportingDocMasterId) {

		return fetchByPrimaryKey((Serializable)cannabisSupportingDocMasterId);
	}

	/**
	 * Returns all the cannabis supporting documents masters.
	 *
	 * @return the cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis supporting documents masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @return the range of cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster> findAll(
		int start, int end,
		OrderByComparator<CannabisSupportingDocumentsMaster>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis supporting documents masters
	 */
	@Override
	public List<CannabisSupportingDocumentsMaster> findAll(
		int start, int end,
		OrderByComparator<CannabisSupportingDocumentsMaster> orderByComparator,
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

		List<CannabisSupportingDocumentsMaster> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisSupportingDocumentsMaster>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISSUPPORTINGDOCUMENTSMASTER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISSUPPORTINGDOCUMENTSMASTER;

				sql = sql.concat(
					CannabisSupportingDocumentsMasterModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisSupportingDocumentsMaster>)QueryUtil.list(
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
	 * Removes all the cannabis supporting documents masters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisSupportingDocumentsMaster
				cannabisSupportingDocumentsMaster : findAll()) {

			remove(cannabisSupportingDocumentsMaster);
		}
	}

	/**
	 * Returns the number of cannabis supporting documents masters.
	 *
	 * @return the number of cannabis supporting documents masters
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
					_SQL_COUNT_CANNABISSUPPORTINGDOCUMENTSMASTER);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "cannabisSupportingDocMasterId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISSUPPORTINGDOCUMENTSMASTER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisSupportingDocumentsMasterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis supporting documents master persistence.
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

		_finderPathWithPaginationFindBygetSupportingDocProperty =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetSupportingDocProperty",
				new String[] {
					String.class.getName(), String.class.getName(),
					String.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {
					"documentTye", "userType", "applicationType", "landType"
				},
				true);

		_finderPathWithoutPaginationFindBygetSupportingDocProperty =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetSupportingDocProperty",
				new String[] {
					String.class.getName(), String.class.getName(),
					String.class.getName(), String.class.getName()
				},
				new String[] {
					"documentTye", "userType", "applicationType", "landType"
				},
				true);

		_finderPathCountBygetSupportingDocProperty = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSupportingDocProperty",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			new String[] {
				"documentTye", "userType", "applicationType", "landType"
			},
			false);

		_finderPathWithPaginationFindBygetSupportingDocApplicant =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetSupportingDocApplicant",
				new String[] {
					String.class.getName(), String.class.getName(),
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"documentTye", "userType", "applicationType"},
				true);

		_finderPathWithoutPaginationFindBygetSupportingDocApplicant =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetSupportingDocApplicant",
				new String[] {
					String.class.getName(), String.class.getName(),
					String.class.getName()
				},
				new String[] {"documentTye", "userType", "applicationType"},
				true);

		_finderPathCountBygetSupportingDocApplicant = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSupportingDocApplicant",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"documentTye", "userType", "applicationType"}, false);

		CannabisSupportingDocumentsMasterUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisSupportingDocumentsMasterUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisSupportingDocumentsMasterImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISSUPPORTINGDOCUMENTSMASTER =
		"SELECT cannabisSupportingDocumentsMaster FROM CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster";

	private static final String
		_SQL_SELECT_CANNABISSUPPORTINGDOCUMENTSMASTER_WHERE =
			"SELECT cannabisSupportingDocumentsMaster FROM CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster WHERE ";

	private static final String _SQL_COUNT_CANNABISSUPPORTINGDOCUMENTSMASTER =
		"SELECT COUNT(cannabisSupportingDocumentsMaster) FROM CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster";

	private static final String
		_SQL_COUNT_CANNABISSUPPORTINGDOCUMENTSMASTER_WHERE =
			"SELECT COUNT(cannabisSupportingDocumentsMaster) FROM CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisSupportingDocumentsMaster.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisSupportingDocumentsMaster exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisSupportingDocumentsMaster exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisSupportingDocumentsMasterPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}