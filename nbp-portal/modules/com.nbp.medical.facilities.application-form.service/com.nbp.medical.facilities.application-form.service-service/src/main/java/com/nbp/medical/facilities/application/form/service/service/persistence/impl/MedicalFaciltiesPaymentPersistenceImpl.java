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
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFaciltiesPaymentException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFaciltiesPayment;
import com.nbp.medical.facilities.application.form.service.model.MedicalFaciltiesPaymentTable;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFaciltiesPaymentImpl;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFaciltiesPaymentModelImpl;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFaciltiesPaymentPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFaciltiesPaymentUtil;
import com.nbp.medical.facilities.application.form.service.service.persistence.impl.constants.MEDICAL_FACILITIESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the medical facilties payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalFaciltiesPaymentPersistence.class)
public class MedicalFaciltiesPaymentPersistenceImpl
	extends BasePersistenceImpl<MedicalFaciltiesPayment>
	implements MedicalFaciltiesPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalFaciltiesPaymentUtil</code> to access the medical facilties payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalFaciltiesPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMedicalAppById;
	private FinderPath _finderPathCountBygetMedicalAppById;

	/**
	 * Returns the medical facilties payment where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFaciltiesPaymentException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilties payment
	 * @throws NoSuchMedicalFaciltiesPaymentException if a matching medical facilties payment could not be found
	 */
	@Override
	public MedicalFaciltiesPayment findBygetMedicalAppById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFaciltiesPaymentException {

		MedicalFaciltiesPayment medicalFaciltiesPayment =
			fetchBygetMedicalAppById(medicalFacilitiesAppId);

		if (medicalFaciltiesPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("medicalFacilitiesAppId=");
			sb.append(medicalFacilitiesAppId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFaciltiesPaymentException(sb.toString());
		}

		return medicalFaciltiesPayment;
	}

	/**
	 * Returns the medical facilties payment where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilties payment, or <code>null</code> if a matching medical facilties payment could not be found
	 */
	@Override
	public MedicalFaciltiesPayment fetchBygetMedicalAppById(
		long medicalFacilitiesAppId) {

		return fetchBygetMedicalAppById(medicalFacilitiesAppId, true);
	}

	/**
	 * Returns the medical facilties payment where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilties payment, or <code>null</code> if a matching medical facilties payment could not be found
	 */
	@Override
	public MedicalFaciltiesPayment fetchBygetMedicalAppById(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {medicalFacilitiesAppId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedicalAppById, finderArgs, this);
		}

		if (result instanceof MedicalFaciltiesPayment) {
			MedicalFaciltiesPayment medicalFaciltiesPayment =
				(MedicalFaciltiesPayment)result;

			if (medicalFacilitiesAppId !=
					medicalFaciltiesPayment.getMedicalFacilitiesAppId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALFACILTIESPAYMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALAPPBYID_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				List<MedicalFaciltiesPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedicalAppById, finderArgs,
							list);
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
								"MedicalFaciltiesPaymentPersistenceImpl.fetchBygetMedicalAppById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalFaciltiesPayment medicalFaciltiesPayment = list.get(
						0);

					result = medicalFaciltiesPayment;

					cacheResult(medicalFaciltiesPayment);
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
			return (MedicalFaciltiesPayment)result;
		}
	}

	/**
	 * Removes the medical facilties payment where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilties payment that was removed
	 */
	@Override
	public MedicalFaciltiesPayment removeBygetMedicalAppById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFaciltiesPaymentException {

		MedicalFaciltiesPayment medicalFaciltiesPayment =
			findBygetMedicalAppById(medicalFacilitiesAppId);

		return remove(medicalFaciltiesPayment);
	}

	/**
	 * Returns the number of medical facilties payments where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilties payments
	 */
	@Override
	public int countBygetMedicalAppById(long medicalFacilitiesAppId) {
		FinderPath finderPath = _finderPathCountBygetMedicalAppById;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILTIESPAYMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALAPPBYID_MEDICALFACILITIESAPPID_2);

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
		_FINDER_COLUMN_GETMEDICALAPPBYID_MEDICALFACILITIESAPPID_2 =
			"medicalFaciltiesPayment.medicalFacilitiesAppId = ?";

	public MedicalFaciltiesPaymentPersistenceImpl() {
		setModelClass(MedicalFaciltiesPayment.class);

		setModelImplClass(MedicalFaciltiesPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalFaciltiesPaymentTable.INSTANCE);
	}

	/**
	 * Caches the medical facilties payment in the entity cache if it is enabled.
	 *
	 * @param medicalFaciltiesPayment the medical facilties payment
	 */
	@Override
	public void cacheResult(MedicalFaciltiesPayment medicalFaciltiesPayment) {
		entityCache.putResult(
			MedicalFaciltiesPaymentImpl.class,
			medicalFaciltiesPayment.getPrimaryKey(), medicalFaciltiesPayment);

		finderCache.putResult(
			_finderPathFetchBygetMedicalAppById,
			new Object[] {medicalFaciltiesPayment.getMedicalFacilitiesAppId()},
			medicalFaciltiesPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical facilties payments in the entity cache if it is enabled.
	 *
	 * @param medicalFaciltiesPayments the medical facilties payments
	 */
	@Override
	public void cacheResult(
		List<MedicalFaciltiesPayment> medicalFaciltiesPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalFaciltiesPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalFaciltiesPayment medicalFaciltiesPayment :
				medicalFaciltiesPayments) {

			if (entityCache.getResult(
					MedicalFaciltiesPaymentImpl.class,
					medicalFaciltiesPayment.getPrimaryKey()) == null) {

				cacheResult(medicalFaciltiesPayment);
			}
		}
	}

	/**
	 * Clears the cache for all medical facilties payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalFaciltiesPaymentImpl.class);

		finderCache.clearCache(MedicalFaciltiesPaymentImpl.class);
	}

	/**
	 * Clears the cache for the medical facilties payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MedicalFaciltiesPayment medicalFaciltiesPayment) {
		entityCache.removeResult(
			MedicalFaciltiesPaymentImpl.class, medicalFaciltiesPayment);
	}

	@Override
	public void clearCache(
		List<MedicalFaciltiesPayment> medicalFaciltiesPayments) {

		for (MedicalFaciltiesPayment medicalFaciltiesPayment :
				medicalFaciltiesPayments) {

			entityCache.removeResult(
				MedicalFaciltiesPaymentImpl.class, medicalFaciltiesPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalFaciltiesPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalFaciltiesPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalFaciltiesPaymentModelImpl medicalFaciltiesPaymentModelImpl) {

		Object[] args = new Object[] {
			medicalFaciltiesPaymentModelImpl.getMedicalFacilitiesAppId()
		};

		finderCache.putResult(
			_finderPathCountBygetMedicalAppById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedicalAppById, args,
			medicalFaciltiesPaymentModelImpl);
	}

	/**
	 * Creates a new medical facilties payment with the primary key. Does not add the medical facilties payment to the database.
	 *
	 * @param medicalFaciltiesPaymentId the primary key for the new medical facilties payment
	 * @return the new medical facilties payment
	 */
	@Override
	public MedicalFaciltiesPayment create(long medicalFaciltiesPaymentId) {
		MedicalFaciltiesPayment medicalFaciltiesPayment =
			new MedicalFaciltiesPaymentImpl();

		medicalFaciltiesPayment.setNew(true);
		medicalFaciltiesPayment.setPrimaryKey(medicalFaciltiesPaymentId);

		medicalFaciltiesPayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return medicalFaciltiesPayment;
	}

	/**
	 * Removes the medical facilties payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment that was removed
	 * @throws NoSuchMedicalFaciltiesPaymentException if a medical facilties payment with the primary key could not be found
	 */
	@Override
	public MedicalFaciltiesPayment remove(long medicalFaciltiesPaymentId)
		throws NoSuchMedicalFaciltiesPaymentException {

		return remove((Serializable)medicalFaciltiesPaymentId);
	}

	/**
	 * Removes the medical facilties payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical facilties payment
	 * @return the medical facilties payment that was removed
	 * @throws NoSuchMedicalFaciltiesPaymentException if a medical facilties payment with the primary key could not be found
	 */
	@Override
	public MedicalFaciltiesPayment remove(Serializable primaryKey)
		throws NoSuchMedicalFaciltiesPaymentException {

		Session session = null;

		try {
			session = openSession();

			MedicalFaciltiesPayment medicalFaciltiesPayment =
				(MedicalFaciltiesPayment)session.get(
					MedicalFaciltiesPaymentImpl.class, primaryKey);

			if (medicalFaciltiesPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalFaciltiesPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalFaciltiesPayment);
		}
		catch (NoSuchMedicalFaciltiesPaymentException noSuchEntityException) {
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
	protected MedicalFaciltiesPayment removeImpl(
		MedicalFaciltiesPayment medicalFaciltiesPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalFaciltiesPayment)) {
				medicalFaciltiesPayment = (MedicalFaciltiesPayment)session.get(
					MedicalFaciltiesPaymentImpl.class,
					medicalFaciltiesPayment.getPrimaryKeyObj());
			}

			if (medicalFaciltiesPayment != null) {
				session.delete(medicalFaciltiesPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalFaciltiesPayment != null) {
			clearCache(medicalFaciltiesPayment);
		}

		return medicalFaciltiesPayment;
	}

	@Override
	public MedicalFaciltiesPayment updateImpl(
		MedicalFaciltiesPayment medicalFaciltiesPayment) {

		boolean isNew = medicalFaciltiesPayment.isNew();

		if (!(medicalFaciltiesPayment instanceof
				MedicalFaciltiesPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalFaciltiesPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalFaciltiesPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalFaciltiesPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalFaciltiesPayment implementation " +
					medicalFaciltiesPayment.getClass());
		}

		MedicalFaciltiesPaymentModelImpl medicalFaciltiesPaymentModelImpl =
			(MedicalFaciltiesPaymentModelImpl)medicalFaciltiesPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalFaciltiesPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalFaciltiesPayment.setCreateDate(date);
			}
			else {
				medicalFaciltiesPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalFaciltiesPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalFaciltiesPayment.setModifiedDate(date);
			}
			else {
				medicalFaciltiesPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalFaciltiesPayment);
			}
			else {
				medicalFaciltiesPayment =
					(MedicalFaciltiesPayment)session.merge(
						medicalFaciltiesPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalFaciltiesPaymentImpl.class, medicalFaciltiesPaymentModelImpl,
			false, true);

		cacheUniqueFindersCache(medicalFaciltiesPaymentModelImpl);

		if (isNew) {
			medicalFaciltiesPayment.setNew(false);
		}

		medicalFaciltiesPayment.resetOriginalValues();

		return medicalFaciltiesPayment;
	}

	/**
	 * Returns the medical facilties payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical facilties payment
	 * @return the medical facilties payment
	 * @throws NoSuchMedicalFaciltiesPaymentException if a medical facilties payment with the primary key could not be found
	 */
	@Override
	public MedicalFaciltiesPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalFaciltiesPaymentException {

		MedicalFaciltiesPayment medicalFaciltiesPayment = fetchByPrimaryKey(
			primaryKey);

		if (medicalFaciltiesPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalFaciltiesPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalFaciltiesPayment;
	}

	/**
	 * Returns the medical facilties payment with the primary key or throws a <code>NoSuchMedicalFaciltiesPaymentException</code> if it could not be found.
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment
	 * @throws NoSuchMedicalFaciltiesPaymentException if a medical facilties payment with the primary key could not be found
	 */
	@Override
	public MedicalFaciltiesPayment findByPrimaryKey(
			long medicalFaciltiesPaymentId)
		throws NoSuchMedicalFaciltiesPaymentException {

		return findByPrimaryKey((Serializable)medicalFaciltiesPaymentId);
	}

	/**
	 * Returns the medical facilties payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment, or <code>null</code> if a medical facilties payment with the primary key could not be found
	 */
	@Override
	public MedicalFaciltiesPayment fetchByPrimaryKey(
		long medicalFaciltiesPaymentId) {

		return fetchByPrimaryKey((Serializable)medicalFaciltiesPaymentId);
	}

	/**
	 * Returns all the medical facilties payments.
	 *
	 * @return the medical facilties payments
	 */
	@Override
	public List<MedicalFaciltiesPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilties payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFaciltiesPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilties payments
	 * @param end the upper bound of the range of medical facilties payments (not inclusive)
	 * @return the range of medical facilties payments
	 */
	@Override
	public List<MedicalFaciltiesPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilties payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFaciltiesPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilties payments
	 * @param end the upper bound of the range of medical facilties payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilties payments
	 */
	@Override
	public List<MedicalFaciltiesPayment> findAll(
		int start, int end,
		OrderByComparator<MedicalFaciltiesPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilties payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFaciltiesPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilties payments
	 * @param end the upper bound of the range of medical facilties payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilties payments
	 */
	@Override
	public List<MedicalFaciltiesPayment> findAll(
		int start, int end,
		OrderByComparator<MedicalFaciltiesPayment> orderByComparator,
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

		List<MedicalFaciltiesPayment> list = null;

		if (useFinderCache) {
			list = (List<MedicalFaciltiesPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALFACILTIESPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALFACILTIESPAYMENT;

				sql = sql.concat(
					MedicalFaciltiesPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalFaciltiesPayment>)QueryUtil.list(
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
	 * Removes all the medical facilties payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalFaciltiesPayment medicalFaciltiesPayment : findAll()) {
			remove(medicalFaciltiesPayment);
		}
	}

	/**
	 * Returns the number of medical facilties payments.
	 *
	 * @return the number of medical facilties payments
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
					_SQL_COUNT_MEDICALFACILTIESPAYMENT);

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
		return "medicalFaciltiesPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALFACILTIESPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalFaciltiesPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical facilties payment persistence.
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

		_finderPathFetchBygetMedicalAppById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedicalAppById",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathCountBygetMedicalAppById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalAppById", new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, false);

		MedicalFaciltiesPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalFaciltiesPaymentUtil.setPersistence(null);

		entityCache.removeCache(MedicalFaciltiesPaymentImpl.class.getName());
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

	private static final String _SQL_SELECT_MEDICALFACILTIESPAYMENT =
		"SELECT medicalFaciltiesPayment FROM MedicalFaciltiesPayment medicalFaciltiesPayment";

	private static final String _SQL_SELECT_MEDICALFACILTIESPAYMENT_WHERE =
		"SELECT medicalFaciltiesPayment FROM MedicalFaciltiesPayment medicalFaciltiesPayment WHERE ";

	private static final String _SQL_COUNT_MEDICALFACILTIESPAYMENT =
		"SELECT COUNT(medicalFaciltiesPayment) FROM MedicalFaciltiesPayment medicalFaciltiesPayment";

	private static final String _SQL_COUNT_MEDICALFACILTIESPAYMENT_WHERE =
		"SELECT COUNT(medicalFaciltiesPayment) FROM MedicalFaciltiesPayment medicalFaciltiesPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalFaciltiesPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalFaciltiesPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalFaciltiesPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalFaciltiesPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}