/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchMedicalPractitionerAddException;
import com.nbp.hsra.application.service.model.MedicalPractitionerAdd;
import com.nbp.hsra.application.service.model.MedicalPractitionerAddTable;
import com.nbp.hsra.application.service.model.impl.MedicalPractitionerAddImpl;
import com.nbp.hsra.application.service.model.impl.MedicalPractitionerAddModelImpl;
import com.nbp.hsra.application.service.service.persistence.MedicalPractitionerAddPersistence;
import com.nbp.hsra.application.service.service.persistence.MedicalPractitionerAddUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the medical practitioner add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalPractitionerAddPersistence.class)
public class MedicalPractitionerAddPersistenceImpl
	extends BasePersistenceImpl<MedicalPractitionerAdd>
	implements MedicalPractitionerAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalPractitionerAddUtil</code> to access the medical practitioner add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalPractitionerAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetHsraById;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns all the medical practitioner adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching medical practitioner adds
	 */
	@Override
	public List<MedicalPractitionerAdd> findBygetHsraById(
		long hsraApplicationId) {

		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical practitioner adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @return the range of matching medical practitioner adds
	 */
	@Override
	public List<MedicalPractitionerAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical practitioner adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical practitioner adds
	 */
	@Override
	public List<MedicalPractitionerAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical practitioner adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical practitioner adds
	 */
	@Override
	public List<MedicalPractitionerAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsraById;
				finderArgs = new Object[] {hsraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraById;
			finderArgs = new Object[] {
				hsraApplicationId, start, end, orderByComparator
			};
		}

		List<MedicalPractitionerAdd> list = null;

		if (useFinderCache) {
			list = (List<MedicalPractitionerAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalPractitionerAdd medicalPractitionerAdd : list) {
					if (hsraApplicationId !=
							medicalPractitionerAdd.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_MEDICALPRACTITIONERADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalPractitionerAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<MedicalPractitionerAdd>)QueryUtil.list(
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
	 * Returns the first medical practitioner add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical practitioner add
	 * @throws NoSuchMedicalPractitionerAddException if a matching medical practitioner add could not be found
	 */
	@Override
	public MedicalPractitionerAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<MedicalPractitionerAdd> orderByComparator)
		throws NoSuchMedicalPractitionerAddException {

		MedicalPractitionerAdd medicalPractitionerAdd =
			fetchBygetHsraById_First(hsraApplicationId, orderByComparator);

		if (medicalPractitionerAdd != null) {
			return medicalPractitionerAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchMedicalPractitionerAddException(sb.toString());
	}

	/**
	 * Returns the first medical practitioner add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical practitioner add, or <code>null</code> if a matching medical practitioner add could not be found
	 */
	@Override
	public MedicalPractitionerAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator) {

		List<MedicalPractitionerAdd> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical practitioner add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical practitioner add
	 * @throws NoSuchMedicalPractitionerAddException if a matching medical practitioner add could not be found
	 */
	@Override
	public MedicalPractitionerAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<MedicalPractitionerAdd> orderByComparator)
		throws NoSuchMedicalPractitionerAddException {

		MedicalPractitionerAdd medicalPractitionerAdd = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (medicalPractitionerAdd != null) {
			return medicalPractitionerAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchMedicalPractitionerAddException(sb.toString());
	}

	/**
	 * Returns the last medical practitioner add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical practitioner add, or <code>null</code> if a matching medical practitioner add could not be found
	 */
	@Override
	public MedicalPractitionerAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<MedicalPractitionerAdd> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical practitioner adds before and after the current medical practitioner add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param medicalPractitionerAddId the primary key of the current medical practitioner add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical practitioner add
	 * @throws NoSuchMedicalPractitionerAddException if a medical practitioner add with the primary key could not be found
	 */
	@Override
	public MedicalPractitionerAdd[] findBygetHsraById_PrevAndNext(
			long medicalPractitionerAddId, long hsraApplicationId,
			OrderByComparator<MedicalPractitionerAdd> orderByComparator)
		throws NoSuchMedicalPractitionerAddException {

		MedicalPractitionerAdd medicalPractitionerAdd = findByPrimaryKey(
			medicalPractitionerAddId);

		Session session = null;

		try {
			session = openSession();

			MedicalPractitionerAdd[] array = new MedicalPractitionerAddImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, medicalPractitionerAdd, hsraApplicationId,
				orderByComparator, true);

			array[1] = medicalPractitionerAdd;

			array[2] = getBygetHsraById_PrevAndNext(
				session, medicalPractitionerAdd, hsraApplicationId,
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

	protected MedicalPractitionerAdd getBygetHsraById_PrevAndNext(
		Session session, MedicalPractitionerAdd medicalPractitionerAdd,
		long hsraApplicationId,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALPRACTITIONERADD_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

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
			sb.append(MedicalPractitionerAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(hsraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalPractitionerAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalPractitionerAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical practitioner adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (MedicalPractitionerAdd medicalPractitionerAdd :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalPractitionerAdd);
		}
	}

	/**
	 * Returns the number of medical practitioner adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching medical practitioner adds
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALPRACTITIONERADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"medicalPractitionerAdd.hsraApplicationId = ?";

	public MedicalPractitionerAddPersistenceImpl() {
		setModelClass(MedicalPractitionerAdd.class);

		setModelImplClass(MedicalPractitionerAddImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalPractitionerAddTable.INSTANCE);
	}

	/**
	 * Caches the medical practitioner add in the entity cache if it is enabled.
	 *
	 * @param medicalPractitionerAdd the medical practitioner add
	 */
	@Override
	public void cacheResult(MedicalPractitionerAdd medicalPractitionerAdd) {
		entityCache.putResult(
			MedicalPractitionerAddImpl.class,
			medicalPractitionerAdd.getPrimaryKey(), medicalPractitionerAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical practitioner adds in the entity cache if it is enabled.
	 *
	 * @param medicalPractitionerAdds the medical practitioner adds
	 */
	@Override
	public void cacheResult(
		List<MedicalPractitionerAdd> medicalPractitionerAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalPractitionerAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalPractitionerAdd medicalPractitionerAdd :
				medicalPractitionerAdds) {

			if (entityCache.getResult(
					MedicalPractitionerAddImpl.class,
					medicalPractitionerAdd.getPrimaryKey()) == null) {

				cacheResult(medicalPractitionerAdd);
			}
		}
	}

	/**
	 * Clears the cache for all medical practitioner adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalPractitionerAddImpl.class);

		finderCache.clearCache(MedicalPractitionerAddImpl.class);
	}

	/**
	 * Clears the cache for the medical practitioner add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MedicalPractitionerAdd medicalPractitionerAdd) {
		entityCache.removeResult(
			MedicalPractitionerAddImpl.class, medicalPractitionerAdd);
	}

	@Override
	public void clearCache(
		List<MedicalPractitionerAdd> medicalPractitionerAdds) {

		for (MedicalPractitionerAdd medicalPractitionerAdd :
				medicalPractitionerAdds) {

			entityCache.removeResult(
				MedicalPractitionerAddImpl.class, medicalPractitionerAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalPractitionerAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalPractitionerAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new medical practitioner add with the primary key. Does not add the medical practitioner add to the database.
	 *
	 * @param medicalPractitionerAddId the primary key for the new medical practitioner add
	 * @return the new medical practitioner add
	 */
	@Override
	public MedicalPractitionerAdd create(long medicalPractitionerAddId) {
		MedicalPractitionerAdd medicalPractitionerAdd =
			new MedicalPractitionerAddImpl();

		medicalPractitionerAdd.setNew(true);
		medicalPractitionerAdd.setPrimaryKey(medicalPractitionerAddId);

		medicalPractitionerAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return medicalPractitionerAdd;
	}

	/**
	 * Removes the medical practitioner add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalPractitionerAddId the primary key of the medical practitioner add
	 * @return the medical practitioner add that was removed
	 * @throws NoSuchMedicalPractitionerAddException if a medical practitioner add with the primary key could not be found
	 */
	@Override
	public MedicalPractitionerAdd remove(long medicalPractitionerAddId)
		throws NoSuchMedicalPractitionerAddException {

		return remove((Serializable)medicalPractitionerAddId);
	}

	/**
	 * Removes the medical practitioner add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical practitioner add
	 * @return the medical practitioner add that was removed
	 * @throws NoSuchMedicalPractitionerAddException if a medical practitioner add with the primary key could not be found
	 */
	@Override
	public MedicalPractitionerAdd remove(Serializable primaryKey)
		throws NoSuchMedicalPractitionerAddException {

		Session session = null;

		try {
			session = openSession();

			MedicalPractitionerAdd medicalPractitionerAdd =
				(MedicalPractitionerAdd)session.get(
					MedicalPractitionerAddImpl.class, primaryKey);

			if (medicalPractitionerAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalPractitionerAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalPractitionerAdd);
		}
		catch (NoSuchMedicalPractitionerAddException noSuchEntityException) {
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
	protected MedicalPractitionerAdd removeImpl(
		MedicalPractitionerAdd medicalPractitionerAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalPractitionerAdd)) {
				medicalPractitionerAdd = (MedicalPractitionerAdd)session.get(
					MedicalPractitionerAddImpl.class,
					medicalPractitionerAdd.getPrimaryKeyObj());
			}

			if (medicalPractitionerAdd != null) {
				session.delete(medicalPractitionerAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalPractitionerAdd != null) {
			clearCache(medicalPractitionerAdd);
		}

		return medicalPractitionerAdd;
	}

	@Override
	public MedicalPractitionerAdd updateImpl(
		MedicalPractitionerAdd medicalPractitionerAdd) {

		boolean isNew = medicalPractitionerAdd.isNew();

		if (!(medicalPractitionerAdd instanceof
				MedicalPractitionerAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalPractitionerAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalPractitionerAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalPractitionerAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalPractitionerAdd implementation " +
					medicalPractitionerAdd.getClass());
		}

		MedicalPractitionerAddModelImpl medicalPractitionerAddModelImpl =
			(MedicalPractitionerAddModelImpl)medicalPractitionerAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalPractitionerAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalPractitionerAdd.setCreateDate(date);
			}
			else {
				medicalPractitionerAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalPractitionerAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalPractitionerAdd.setModifiedDate(date);
			}
			else {
				medicalPractitionerAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalPractitionerAdd);
			}
			else {
				medicalPractitionerAdd = (MedicalPractitionerAdd)session.merge(
					medicalPractitionerAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalPractitionerAddImpl.class, medicalPractitionerAddModelImpl,
			false, true);

		if (isNew) {
			medicalPractitionerAdd.setNew(false);
		}

		medicalPractitionerAdd.resetOriginalValues();

		return medicalPractitionerAdd;
	}

	/**
	 * Returns the medical practitioner add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical practitioner add
	 * @return the medical practitioner add
	 * @throws NoSuchMedicalPractitionerAddException if a medical practitioner add with the primary key could not be found
	 */
	@Override
	public MedicalPractitionerAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalPractitionerAddException {

		MedicalPractitionerAdd medicalPractitionerAdd = fetchByPrimaryKey(
			primaryKey);

		if (medicalPractitionerAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalPractitionerAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalPractitionerAdd;
	}

	/**
	 * Returns the medical practitioner add with the primary key or throws a <code>NoSuchMedicalPractitionerAddException</code> if it could not be found.
	 *
	 * @param medicalPractitionerAddId the primary key of the medical practitioner add
	 * @return the medical practitioner add
	 * @throws NoSuchMedicalPractitionerAddException if a medical practitioner add with the primary key could not be found
	 */
	@Override
	public MedicalPractitionerAdd findByPrimaryKey(
			long medicalPractitionerAddId)
		throws NoSuchMedicalPractitionerAddException {

		return findByPrimaryKey((Serializable)medicalPractitionerAddId);
	}

	/**
	 * Returns the medical practitioner add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalPractitionerAddId the primary key of the medical practitioner add
	 * @return the medical practitioner add, or <code>null</code> if a medical practitioner add with the primary key could not be found
	 */
	@Override
	public MedicalPractitionerAdd fetchByPrimaryKey(
		long medicalPractitionerAddId) {

		return fetchByPrimaryKey((Serializable)medicalPractitionerAddId);
	}

	/**
	 * Returns all the medical practitioner adds.
	 *
	 * @return the medical practitioner adds
	 */
	@Override
	public List<MedicalPractitionerAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical practitioner adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @return the range of medical practitioner adds
	 */
	@Override
	public List<MedicalPractitionerAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical practitioner adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical practitioner adds
	 */
	@Override
	public List<MedicalPractitionerAdd> findAll(
		int start, int end,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical practitioner adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical practitioner adds
	 */
	@Override
	public List<MedicalPractitionerAdd> findAll(
		int start, int end,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator,
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

		List<MedicalPractitionerAdd> list = null;

		if (useFinderCache) {
			list = (List<MedicalPractitionerAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALPRACTITIONERADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALPRACTITIONERADD;

				sql = sql.concat(MedicalPractitionerAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalPractitionerAdd>)QueryUtil.list(
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
	 * Removes all the medical practitioner adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalPractitionerAdd medicalPractitionerAdd : findAll()) {
			remove(medicalPractitionerAdd);
		}
	}

	/**
	 * Returns the number of medical practitioner adds.
	 *
	 * @return the number of medical practitioner adds
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
					_SQL_COUNT_MEDICALPRACTITIONERADD);

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
		return "medicalPractitionerAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALPRACTITIONERADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalPractitionerAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical practitioner add persistence.
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

		_finderPathWithPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"hsraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		MedicalPractitionerAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalPractitionerAddUtil.setPersistence(null);

		entityCache.removeCache(MedicalPractitionerAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MEDICALPRACTITIONERADD =
		"SELECT medicalPractitionerAdd FROM MedicalPractitionerAdd medicalPractitionerAdd";

	private static final String _SQL_SELECT_MEDICALPRACTITIONERADD_WHERE =
		"SELECT medicalPractitionerAdd FROM MedicalPractitionerAdd medicalPractitionerAdd WHERE ";

	private static final String _SQL_COUNT_MEDICALPRACTITIONERADD =
		"SELECT COUNT(medicalPractitionerAdd) FROM MedicalPractitionerAdd medicalPractitionerAdd";

	private static final String _SQL_COUNT_MEDICALPRACTITIONERADD_WHERE =
		"SELECT COUNT(medicalPractitionerAdd) FROM MedicalPractitionerAdd medicalPractitionerAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalPractitionerAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalPractitionerAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalPractitionerAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalPractitionerAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}